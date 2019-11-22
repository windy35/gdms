<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<script type="text/javascript" src="${APP_PATH}/static/js/Admin/SetNotice.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>发布通知页面</title>
</head>
<body>
<span class="HeadTitle">发布通知页面</span>
<form id="setNoticeForm">
<ul>
<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="noticetitleTitle">通知标题</span>
</li>
<li>
		<input type="text" name="noticetitle" id="noticetitle" style="width:600px" class="form-control textinline"/>
		<span class="help-block" style="display:inline"></span>
</li>
<li>
		<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>	
		<span class="title2" id="noticecontentTitle">通知内容 共输入 <span id="noticecontentzs" class="zs"></span>个字符</span>
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
     <input type="button" value="发布" class="btn btn-primary" id="submitBtn">
</li>
</ul>
</form>
</body>
</html>