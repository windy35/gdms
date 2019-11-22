<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提示</title>
  	<%pageContext.setAttribute("APP_PATH",request.getContextPath());//获取根目录%>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">
<!-- 自定义css样式文件 -->    	
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/login.css">
<!-- 自定义js文件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/login.js"></script>   		
</head>
  <body onload="showTime_noLogin();">
<div class="cover">
		<div class="main2">  
  <div id="countdown_div" class="countdown_div">
  </div>
  <div id="countdown_div2" class="countdown_div2">
  			用户尚未登录，<br>所以无法执行您所做的操作，请先<a href="JumpLoginPage">登录</a>!
  	</div>
  		</div>
</div>
  </body>
</html>