<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>(教师)审核外文译文和原件</title>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/AuditWWYWHYJ.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">
</head>
<body>
<c:if test="${not empty requestScope.GDInfo}">
<span class="HeadTitle">(教师)审核外文译文和原件</span>
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
	<!-- 如果用户没有上传外文译文和原件信息则显示相关的表单 -->	
	<c:if test="${not empty requestScope.wwywhyjinfo}">
		<input type="hidden" name="graduationdesignid" id="gdidhidden" value="${requestScope.GDInfo.graduationdesignid}">
	<table style="border:0">	
	<tr>
		<td>
			<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>
			<span class="title2" id="wwywnrTitle">外文译文内容 </span>
			<br>
			<span class="title3">请按照学校的要求提交外文译文，若无内容请填“无”</span>
			 <!-- 共输入 <span id="wwywnrzs" class="zs"></span>个字符 -->
			<textarea rows="10" cols="80" id="wwywnr" name="wwywnr" class="has-error" style="resize: none;" class="form-control textinline" readonly disabled>${requestScope.wwywhyjinfo.wwywnr}</textarea>
	        <span class="help-block" style="display:inline"></span>					
		</td>	    
		<td>
			<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>
			<span class="title2" id="ywnrTitle">原文内容 </span>
			<br>
			<span class="title3">请按照学校的要求提交原文内容，若无内容请填“无”</span>
			 <!-- 共输入 <span id="ywnrzs" class="zs"></span>个字符 -->
			<textarea rows="10" cols="80" id="ywnr" name="ywnr" class="has-error" style="resize: none;" class="form-control textinline" readonly disabled>${requestScope.wwywhyjinfo.ywnr}</textarea>
	        <span class="help-block" style="display:inline"></span>							
		</td>		
	</tr>
	<tr>
		<td>
			<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>
			<span>附件：</span>
			<span>${requestScope.wwywhyjinfo.wwfjname}</span><span><a href="${requestScope.wwywhyjinfo.wwfjpath}">下载文件</a></span>
		</td>
		<td>
			<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>
			<span>附件：</span>
			<span>${requestScope.wwywhyjinfo.ywfjname}</span><span><a href="${requestScope.wwywhyjinfo.ywfjpath}">下载文件</a></span>
		</td>		
	</tr>	
	</table>
<c:if test="${empty requestScope.GDResultInfo.wwywhyjinstructoropinion}">
<!-- 外文译文和原件审核情况 -->
<li>
	<span class="start"></span><strong class="text">外文译文和原件审核情况</strong>
</li>
<li>
	<form id="AuditWWYWHYJForm">
<table border="1" id="SHQK">
	<tr>
	<td>
	<span>指导教师外文译文和原件审核意见：</span>
	</td>
	<td>
		<select id="wwywhyjinstructoropinion" name="wwywhyjinstructoropinion">
		<option value="请选择">请选择</option>
		<option value="同意">同意</option>
		<option value="不同意">不同意</option>
		</select>	
		<span class="help-block" style="display:inline"></span>
	</td>
	<tr>
	<td>	
		<span>指导教师外文译文和原件审核详细意见：<br>已输入<span id="wwywhyjinstructordetailopinionzs" class="zs"></span>个字符</span>
	</td>
	<td>				
		<textarea rows="5" cols="80"  id="wwywhyjinstructordetailopinion" name="wwywhyjinstructordetailopinion" style="resize: none;"></textarea>
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
	</c:if>	
    </c:if>
	</ul>
	</c:if>	
</body>
</html>