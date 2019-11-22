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
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/AuditKTBG.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/js/KTBGDetailInfo.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">
<title>审核开题报告</title>
</head>
<body>
<span class="HeadTitle">（教师）审核开题报告</span>
<ul>
<li>
<span class="start"></span><strong class="text">课题基本信息</strong>
</li>
<li>
<ul>
	<li style="width:100%">	
	<span class="text_left"> 选题题目：</span>
	<span class="text_right" style="width:600px;" title="${requestScope.GDInfo.title}">${requestScope.GDInfo.title}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 可选专业：</span>
	<span class="text_right" title="${requestScope.GDInfo.optionalprofessional}">${requestScope.GDInfo.optionalprofessional}</span>
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
	<span class="text_right" title="${requestScope.GDInfo.topicselectionmode}">${requestScope.GDInfo.topicselectionmode}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 课题所属专业：</span>
	<span class="text_right" title="${requestScope.GDInfo.subjectaffiliation}">${requestScope.GDInfo.subjectaffiliation}</span>
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
<li>
<span class="start"></span>
<strong class="text">开题申请（包括选题的意义与目的、文献综述、研究现状、创新思路、论文提纲、进度安排、参考文献等）</strong>
</li>
<li>
	    	<input type="hidden" value="${requestScope.ktbgInfo.ktbgdetail}" id="ktbgdetailhidden"/>
	        <div id="ktbgdetail">
	        </div>	  
</li>
<c:if test="${not empty requestScope.ktbgInfo.ktbgfjname}">
<!-- 附件 -->
<li>
	<span class="start"></span><strong class="text">附件</strong>
</li>
<li>
		<span>${requestScope.ktbgInfo.ktbgfjname}</span>
		<input type="hidden" id="ktbgpath" value="${requestScope.ktbgInfo.ktbgpath}"/>
		<input type="hidden" id="ktbgname" value="${requestScope.ktbgInfo.ktbgfjname}"/>	      
		<span><a href = "javascript:void(0);" onclick ="DownloadktbgFile()">点击下载</a></span>
</c:if>      
<form id="AuditKTBGForm">
<table border="1" id="SHQK">
	<tr>
	<td>
	<span>指导教师开题报告审核意见：</span>
	</td>
	<td>
		<select id="ktbginstructoropinion" name="ktbginstructoropinion">
		<option value="请选择">请选择</option>
		<option value="同意">同意</option>
		<option value="不同意">不同意</option>
		</select>	
		<span class="help-block" style="display:inline"></span>
	</td>
	<tr>
	<td>	
		<span>指导教师开题报告审核详细意见：<br>已输入<span id="ktbginstructordetailopinionzs" class="zs"></span>个字符</span>
	</td>
	<td>				
		<textarea rows="5" cols="80"  id="ktbginstructordetailopinion" name="ktbginstructordetailopinion" style="resize: none;"></textarea>
		<span class="help-block" style="display:inline"></span>
	</td>
	</tr>
	</table>
		<input type="hidden" value="${requestScope.gdresultID}" id="graduationdesignresultid" name="graduationdesignresultid">
		<input type="hidden" value="${requestScope.GDInfo.graduationdesignid}" id="graduationdesignid" name="graduationdesignid">
		<input class="btn btn-primary" id="AuditGDBtn" type="button" value="提交"/>
		<input type="button" value="返回" class="btn btn-primary" id="ReturnBtn">
	</form>			
<li>
</li>
</ul>
</body>
</html>