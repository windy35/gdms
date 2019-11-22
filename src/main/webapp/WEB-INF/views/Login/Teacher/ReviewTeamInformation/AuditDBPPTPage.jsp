<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>(教师)审核答辩PPT</title>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/AuditDBPPT.js"></script>
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
<span class="HeadTitle">(教师)审核答辩PPT</span>
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
	<!-- 如果用户没有上传答辩PPT信息则显示相关的表单 -->	
	<c:if test="${not empty requestScope.dbpptinfo}">
	<ul>	
	<li>    	    
	    <input type="hidden" name="graduationdesignid" id="graduationdesignid" value="${requestScope.GDInfo.graduationdesignid}">	   	    
	     <span class="start"></span><strong class="text">答辩PPT</strong>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="titleTitle">答辩PPT题目</span>
	</li>
	<li>
		<input type="text" name="title" id="title" style="width:800px" class="form-control textinline" value="${requestScope.dbpptinfo.title}" readonly disabled/>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="nrzyTitle">内容摘要 </span>
		<!-- 共输入 <span id="nrzyzs" class="zs"></span>个字符</span><span class="title3">请在下方的输入框内填写创新点内容，若无内容请填写“无” -->
	</li>
	<li>
		<textarea rows="5" cols="100" id="nrzy" name="nrzy" class="has-error" style="resize: none;" class="form-control textinline" readonly disabled>${requestScope.dbpptinfo.nrzy}</textarea>
		<span class="help-block" style="display:inline"></span>
	</li>	
	<li>				
			<span class="glyphicon glyphicon-play"></span>	
	        <span class="title2">附件：</span>
	</li>													
	<li>	     
	        <span></span>${requestScope.dbpptinfo.fjname}<span><a href="${requestScope.dbpptinfo.fjpath}">下载文件</a></span>
	</li>			
	<!-- 答辩PPT审核情况 -->
	<li>
		<span class="start"></span><strong class="text">答辩PPT审核情况</strong>
	</li>
	<li>
<form id="AuditDbpptForm">
<table border="1" id="SHQK">
	<tr>
	<td>
	<span>指导教师答辩PPT审核意见：</span>
	</td>
	<td>
		<select id="dbpptinstructoropinion" name="dbpptinstructoropinion">
		<option value="请选择">请选择</option>
		<option value="同意">同意</option>
		<option value="不同意">不同意</option>
		</select>	
		<span class="help-block" style="display:inline"></span>
	</td>
	<tr>
	<td>	
		<span>指导教师答辩PPT审核详细意见：<br>已输入<span id="dbpptinstructordetailopinionzs" class="zs"></span>个字符</span>
	</td>
	<td>				
		<textarea rows="5" cols="80"  id="dbpptinstructordetailopinion" name="dbpptinstructordetailopinion" style="resize: none;"></textarea>
		<span class="help-block" style="display:inline"></span>
	</td>
	</tr>
	</table>
		<input type="hidden" value="${requestScope.gdresultID}" id="graduationdesignresultid" name="graduationdesignresultid">
		<input type="hidden" value="${requestScope.GDInfo.graduationdesignid}" id="graduationdesignid" name="graduationdesignid">
		<input class="btn btn-primary" id="AuditGDBtn" type="button" value="提交"/>
		<input type="button" value="返回" class="btn btn-primary" id="ReturnBtn">
	</form>			
	</li>	        
</ul>	        
    </c:if>
	</ul>
	</c:if>	
</body>
</html>