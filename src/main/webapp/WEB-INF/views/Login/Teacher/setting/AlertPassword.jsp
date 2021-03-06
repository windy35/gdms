<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户密码</title>
  	<%pageContext.setAttribute("APP_PATH",request.getContextPath());//获取根目录%>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<!-- 引入toasstr -->
	<link rel="stylesheet" href="${APP_PATH}/static/css/toastr.min.css">
	<script src="${APP_PATH}/static/js/toastr.min.js"></script>		  
		    
<!-- 自定义css样式文件 -->    	
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/login.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/nav.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/iconfont.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/form.css">		
<!-- 自定义js文件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/login.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/nav.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/Teacher/alertPassword.js"></script> 
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">
</head>
<body>
<span class="HeadTitle">修改密码</span>
<div id="alertPWDiv">
	<form>
			<ul>
				<li class="li_font">
					  <span>请输入当前用户密码：</span>
					  <input type="text" class="input_text" id="inputOldPassword" placeholder="请输入当前用户密码">
					  <span class="help-block" style="display:inline"></span>					
				</li>
				<li class="li_font">
					  <span>请输入新用户密码：</span>
					  <input type="password" class="input_text" id="inputNewPassword" placeholder="请输入新的用户密码">
					  <span class="help-block" style="display:inline"></span>
				</li>	
				<li class="li_font">
					  <span>请再次确认新用户密码：</span>
					  <input type="password" class="input_text" id="inputComfirmPassword" placeholder="请再次输入新密码">								
					  <span class="help-block" style="display:inline"></span>								
				</li>																					
			</ul>
				<span class="alertPWbtn_div">							
    			  <button type="button" class="btn btn-primary" id="alertPWbtn">修改</button>
			      <button type="reset" class="btn btn-primary" onclick="reset_form(this.form)">重置</button>
				</span>																					
	</form>
</div>	
</body>
</html>