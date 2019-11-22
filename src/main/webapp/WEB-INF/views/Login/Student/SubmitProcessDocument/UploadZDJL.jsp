<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交指导记录</title>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/Student/uploadZDJL.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">
</head>
<body>
<c:if test="${empty requestScope.GDInfo}">
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title">提示</h3>
    </div>
    <div class="panel-body">
	用户还没有选择毕设题目或毕设题目未通过审核。
    </div>
</div>
</c:if>
<c:if test="${not empty requestScope.GDInfo}">
<span class="HeadTitle">提交指导记录</span>
<ul>
<li>
<span class="start"></span><strong class="text">选题基本信息</strong>
</li>
<li>
<ul>
	<li style="width:100%">	
	<span class="text_left"> 选题题目：</span>
	<span class="text_right" style="width:600px;" title="${requestScope.GDInfo.title}">${requestScope.GDInfo.title}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 可选专业：</span>
	<span class="text_right" title="">${requestScope.GDInfo.optionalprofessional}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 课题申报时间：</span>
	<span class="text_right" title="${requestScope.GDInfo.declaretime}">${requestScope.GDInfo.declaretime}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 题目类型：</span>
	<span class="text_right" title="${requestScope.GDInfo.designtype.typename}">${requestScope.GDInfo.designtype.typename}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 题目来源：</span>
	<span class="text_right" title="${requestScope.GDInfo.titlesource.titlesourcename}">${requestScope.GDInfo.titlesource.titlesourcename}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 选择模式：</span>
	<span class="text_right" title="">${requestScope.GDInfo.topicselectionmode}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 课题所属专业：</span>
	<span class="text_right" title="">${requestScope.GDInfo.subjectaffiliation}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 指导教师：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.name}(${requestScope.GDInfo.instructorid})">${requestScope.GDInfo.instructor.name}(${requestScope.GDInfo.instructorid})</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 教师职称：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.positionaltitle}">${requestScope.GDInfo.instructor.positionaltitle}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 导师联系电话：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.phone}">${requestScope.GDInfo.instructor.phone}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 导师联系邮箱：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.email}">${requestScope.GDInfo.instructor.email}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 学生姓名：</span>
	<c:if test="${not empty requestScope.GDInfo.student}">
		<span class="text_right" title="${requestScope.GDInfo.student.name}">${requestScope.GDInfo.student.name}</span>
	</c:if>	
	</li>	
	<li class="li_width">
	<span class="text_left"> 学生院系(专业)：</span>
	<c:if test="${not empty requestScope.GDInfo.student.classes}">
		<span class="text_right" title="${requestScope.GDInfo.student.classes.department.departmentname}(${requestScope.GDInfo.student.classes.major.majorname})">${requestScope.GDInfo.student.classes.department.departmentname}(${requestScope.GDInfo.student.classes.major.majorname})</span>
	</c:if>			
	</li>								
</ul>
</li>
	<!-- 如果用户没有上传指导记录信息则显示相关的表单 -->	
	<c:if test="${empty requestScope.zdjlinfo}">
	<form enctype="multipart/form-data" id="zdjlForm">
	<input type="hidden" name="graduationdesignid" id="gdidhidden" value="${requestScope.GDInfo.graduationdesignid}">	
	<ul>	
	<li>    	    	    	   	    
	     <span class="start"></span><strong class="text">提交指导记录</strong>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="titleTitle">主题</span>
	</li>
	<li>
		<input type="text" name="title" id="title" style="width:600px" class="form-control textinline"/>
		<span class="help-block" style="display:inline"></span>
	</li>
		<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="zdsjTitle">指导时间</span>
	</li>
	<li>
		<input type="text" name="zdsj" id="zdsj" style="width:600px" class="form-control textinline"/>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>	
		<span class="title2" id="zygzTitle">主要工作 共输入 <span id="zygzzs" class="zs"></span>个字符</span>
	</li>	
	<li>
	        <textarea rows="10" cols="80" id="zygz" name="zygz" class="has-error" style="resize: none;" class="form-control textinline"></textarea>
	        <span class="help-block" style="display:inline"></span>
	</li>
	<li>				
			<span class="glyphicon glyphicon-play"></span>	
	        <span class="title2">添加附件：</span><span class="title3">上传有关指导记录的附件，上传的文件将以附件的形式显示。支持附件格式为doc，docx，pdf，wps，rar，zip</span>
	</li>													
	<li>	  	        
	        <input type="file" name="files" accept=".doc" id="files">
	</li>
	<li>	        
	        <input type="button" value="提交" class="btn btn-primary" id="submitBtn">
	</li>	        
</ul>	        
    	</form>
    </c:if>

    <!-- 如果用户上传了相关的指导记录则显示指导记录信息的表格 -->
	<c:if test="${not empty requestScope.zdjlinfo}">
	<li>
		<span class="HeadTitle">指导记录审核情况</span>
	</li>
	<li>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">				
				<table class="table table-hover" id="Table">
					<thead>
					<tr>						
						<th>毕设编号</th>					
						<th>课题题目</th>
						<th>题目类型</th>
						<th>题目来源</th>
						<th>审核状态</th>						
						<th>上传时间</th>
						<th>操作</th>
					</tr>	
					</thead>
					<tbody>						
					</tbody>		
				</table>
			</div>
		</div>				
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area">				
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
			</div>	
		</div>		
		</li>
	</c:if>
	</ul>
	</c:if>	
</body>
</html>