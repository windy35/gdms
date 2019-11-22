<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通知推送</title>
  	<%pageContext.setAttribute("APP_PATH",request.getContextPath());//获取根目录%>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		    
<!-- 自定义css样式文件 -->    	
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/form.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/PushNotification.css">				
<!-- 自定义js文件 -->
    <script type="text/javascript" src="${APP_PATH}/static/js/nav.js"></script>    
    <script type="text/javascript" src="${APP_PATH}/static/js/Teacher/PushNotification.js"></script>
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">	
</head>
<body>
<span class="HeadTitle">通知推送</span>
<div class="tzts">
	<form enctype="multipart/form-data" id="tztsForm">
<ul>
<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="noticetitleTitle">通知标题</span>
</li>
<li>
		<input type="text" name="noticetitle" id="noticetitle" style="width:600px" class="form-control textinline" />
		<span class="help-block" style="display:inline"></span>
</li>
<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="jszbhTitle">请选择需要进行推送的学生编号</span>
</li>
<li>
		<input type="text" name="jszbh" id="jszbh" style="width:600px" class="form-control textinline" />
		<span class="help-block" style="display:inline"></span>
</li>
<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="jszbhTitle">请选择需要推送的手机号码</span>
</li>
<li>
		<input type="text" name="tssjhm" id="tssjhm" style="width:600px" class="form-control textinline" />
		<span class="help-block" style="display:inline"></span>
</li>
<li>
		<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>	
		<span class="title2" id="noticecontentTitle">推送内容 共输入 <span id="noticecontentzs" class="zs"></span>个字符</span>
</li>	
<li>
        <textarea rows="10" cols="80" id="noticecontent" name="noticecontent" class="has-error" style="resize: none;" class="form-control textinline"></textarea>
        <span class="help-block" style="display:inline"></span>
</li>
<li>				
		<span class="glyphicon glyphicon-play"></span>	
        <span class="title2">添加附件：</span><span class="title3">请选择你需要上传的附件 支持任意格式</span>
</li>													
<li>	  	        
        <input type="file" name="files" accept=".*" id="files">
</li>
<li>
	        <input type="checkbox" id="dxtz">同时发送短信通知提醒
</li>	
<li>
     <input type="button" value="推送" class="btn btn-primary" id="submitBtn">
     <input type="reset" value="重置" class="btn btn-primary" id="resetBtn">
</li>
</ul>
</form>
</div>
<div class="xslb">
<center><span class="HeadTitle">被指导学生编号列表</span></center>
<c:forEach items="${stulist}" var="stu">
<div style="border:1px solid orange;">
<div class="studiv"><center><div class="stuname">${stu.name}</div>(<div class="stuid">${stu.studentid}</div>)<div class="stuphone">${stu.phone}</div></center></div>
</div>
</c:forEach>
</div>
</body>
</html>