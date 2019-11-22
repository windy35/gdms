<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/Admin/ManageTeacherInfo.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>教师信息管理</title>
</head>
<body>
<span class="HeadTitle">教师信息管理</span>
<span style="float:right">
<input type="button" value="新增教师" class="btn btn-primary" id="addBtn">
</span>

<!-- 导入信息 -->
<div style="display:block">
<form id="importInfoForm" enctype="multipart/form-data">
<span class="glyphicon glyphicon-play"></span>
<span class="title2">请选择你需要导入的教师信息文件：</span>
<span class="title3">仅支持导入xlsx格式的Excel文件</span>
 <input type="file" name="files" accept=".xls,.xlsx" id="files">
<input type="button" value="导入"  class="btn btn-primary" id="importBtn">
<input type="button" value="导出所有教师信息"  class="btn btn-primary" id="exportBtn">
</form>
<a href="download?path=D:%2FJava%2FeclipseProject%2F.metadata%2F.plugins%2Forg.eclipse.wst.server.core%2Ftmp0%2Fwtpwebapps%2Fssm_gdms%2Fstatic%2Ffile%2FTemplate%2Fstudent_info.xlsx&fileName=导入教师信息模板.xls">下载教师信息模板</a>
</div>

<div class="panel panel-default">
<c:forEach items="${pageInfo.list}" var="list">
		<div class="panel-heading">		
				<span style="float:right">
				<input type="hidden" value="${list.teacherid}" class="Teacherid">
				<button class="glyphicon glyphicon-pencil hover alertbtn" name="${list.teacherid}"></button>
				<button class="glyphicon glyphicon-trash hover deletebtn" name="${list.teacherid}"></button>
				</span>				
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" 
				   href='#${list.teacherid}'>
					教师编号：${list.teacherid}
				</a>
				姓名：${list.name}				
			</h4>			
		</div>
		<div id="${list.teacherid}" class="panel-collapse collapse in">
			<div class="panel-body">
				学院：${list.department.departmentname}
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;				
				手机号码：${list.phone}
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
				邮箱：${list.email}
				<br>
				是否专业负责人：
				<c:if test="${list.pLeaderidSign == false}">否</c:if>
				<c:if test="${list.pLeaderidSign == true}">是</c:if>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;				
				所负责专业：${list.fzzy.majorname}	
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;			
				性别：${list.gender}
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;			
				职称：${list.positionaltitle}				
			</div>
		</div>
</c:forEach>	
</div>
<input type="hidden" value="${pageInfo.pageNum + 1}" id="pn"/>
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6">
				当前页码：${pageInfo.pageNum}页，总 ${pageInfo.pages}页，共${pageInfo.total}条数据
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				  <ul class="pagination">
				  	<li><a href="${APP_PATH}/JumpManageTeacherInfoPage?pn=1">首页</a></li>
				    <li>
				    <!-- 上一页 -->
				    <c:if test="${pageInfo.hasPreviousPage == true }">
				      	<a href="${APP_PATH}/JumpManageTeacherInfoPage?pn=${pageInfo.pageNum-1}" aria-label="Previous">
				      		<span aria-hidden="true">&laquo;</span>
				      	</a>
				      </c:if>				        
				    </li>
				    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
				    <!-- 如果遍历到的页码为当前页面，则高亮显示 -->
				    	<c:if test="${page_Num == pageInfo.pageNum}">
				    		<li class="active"><a href="${APP_PATH}/JumpManageTeacherInfoPage?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    	<c:if test="${page_Num != pageInfo.pageNum}">
				    		<li><a href="${APP_PATH}/JumpManageTeacherInfoPage?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    </c:forEach>				    
				    <li>
				     <c:if test="${pageInfo.hasNextPage == true }">
				      <a href="${APP_PATH}/JumpManageTeacherInfoPage?pn=${pageInfo.pageNum+1}" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				      </c:if>
				    </li>
				    <li><a href="${APP_PATH}/JumpManageTeacherInfoPage?pn=${pageInfo.pages}">尾页</a></li>
				  </ul>
				</nav>				
			</div>	
		</div>	
		
	<!-- 新增模态框 -->
<div class="modal fade" id="addModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">新增教师信息</h4>
      </div>
      <div class="modal-body">
      	<form id="teacherForm">	      	
      		<ul>	
      		<li>
			<span>请输入教师编号：</span>
			<input type="text" id="teacherid" name="teacherid" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>
      		<li>
			<span>请输入教师姓名：</span>
			<input type="text" id="name" name="name" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>		
      		<li>
			<span>请输入教师密码：</span>
			<input type="text" id="password" name="password" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>					
      		<li>
			<span>请选择学院：</span>
			<select id="departmentid" name="departmentid">
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>			
      		<li>
			<span>请输入手机号码：</span>
			<input type="text" id="phone" name="phone" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>				
      		<li>
			<span>请输入电子邮箱：</span>
			<input type="text" id="email" name="email" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>		
      		<li>
			<span>请选择是否为专业负责人：</span>
			<select id="pLeaderidSign" name="pLeaderidSign">
			<option value="0">否</option>
			<option value="1">是</option>
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>	
      		<li>
			<span>请选择所负责专业：</span>
			<select id="fzzybh" name="fzzybh">
			</select>
			</li>
      		<li>
			<span>请选择性别：</span>
			<select id="gender" name="gender">
			<option value="请选择">请选择</option>
			<option value="男">男</option>
			<option value="女">女</option>
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>						
			<li>
			<span>请选择职称：</span>
			<select id="positionaltitle" name="positionaltitle">
			<option value="请选择">请选择</option>
			<option value="无">无</option>
			<option value="讲师">讲师</option>
			<option value="副教授">副教授</option>
			<option value="教授">教授</option>
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>																										
			</ul>
		</form>			
      </div>
      <div class="modal-footer">
        <!-- <button type="button" class="btn btn-primary" data-dismiss="modal" id="submitBtn">确定</button> -->
        <button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
        <button type="button" class="btn btn-primary" id="addTeacherBtn">添加</button>
      </div>
    </div>
  </div>
</div>		

	<!-- 修改模态框 -->
<div class="modal fade" id="alertModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">修改教师信息</h4>
      </div>
      <div class="modal-body">      		
			<form id="alertteacherForm">	      	
      		<ul>	
      		<li>
			<span>教师编号：</span>
			<span id="teacherid2"></span>
			<input type="hidden" id="teacherid3" name="teacherid" width="300px"/>
			<!-- <span class="help-block" style="display:inline"></span> -->
			</li>
      		<li>
			<span>请输入教师姓名：</span>
			<input type="text" id="name2" name="name" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>		
      		<li>
			<span>请输入教师密码：</span>
			<input type="text" id="password2" name="password" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>					
      		<li>
			<span>请选择学院：</span>
			<select id="departmentid2" name="departmentid">
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>			
      		<li>
			<span>请输入手机号码：</span>
			<input type="text" id="phone2" name="phone" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>				
      		<li>
			<span>请输入电子邮箱：</span>
			<input type="text" id="email2" name="email" width="300px"/>
			<span class="help-block" style="display:inline"></span>
			</li>
      		<li>
			<span>请选择是否为专业负责人：</span>
			<select id="pLeaderidSign2" name="pLeaderidSign">
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>	
      		<li>
			<span>请选择所负责专业：</span>
			<select id="fzzybh2" name="fzzybh">
			</select>
			</li>
      		<li>
			<span>请选择性别：</span>
			<select id="gender2" name="gender">
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>		
			<li>
			<span>请选择职称：</span>
			<select id="positionaltitle2" name="positionaltitle">
			</select>
			<span class="help-block" style="display:inline"></span>
			</li>																		
			</ul>
		</form>			
      </div>
      <div class="modal-footer">
        <!-- <button type="button" class="btn btn-primary" data-dismiss="modal" id="submitBtn">确定</button> -->
        <button type="button" class="btn btn-default" data-dismiss="modal">返回</button>        
        <button type="button" class="btn btn-primary" id="AlertTeacherBtn">修改</button>
      </div>
    </div>
  </div>
</div>	
</body>
</html>