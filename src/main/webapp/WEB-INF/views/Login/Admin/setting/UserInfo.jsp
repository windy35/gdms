<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息</title>
  	<%pageContext.setAttribute("APP_PATH",request.getContextPath());//获取根目录%>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery.min.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<!-- 引入toasstr -->
	<link rel="stylesheet" href="${APP_PATH}/static/css/toastr.min.css">
	<script src="${APP_PATH}/static/js/toastr.min.js"></script>		  
<!-- 自定义css样式文件 -->    	
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/nav.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/iconfont.css">
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/login.css">    		
<!-- 自定义js文件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/login.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/nav.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/Admin/alertUserInfo.js"></script>    	 
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">
<!-- 自定义CSS -->
<link rel="stylesheet" href="${APP_PATH}/static/css/form.css">
</head>
<body>
<span class="HeadTitle">修改个人信息</span>
<div id="alertUserInfoDiv">
	<form>
			<ul>
				<li class="li_font">
					 <span>姓名：</span>
					 ${sessionScope.user.adminname}					 			
				</li>
				<li class="li_font">
					 <span>编号：</span>
					 ${sessionScope.user.adminid}					  	 				
				</li>
				<li class="li_font">
					  <span>手机号码：</span>
					  <input type="text" id="inputPhone" value="${sessionScope.user.phone}" placeholder="请输入手机号码">
					  <span class="help-block" style="display:inline"></span>
				</li>	
				<li class="li_font">
					  <span>邮箱：</span>
					  <input type="text" id="inputEmail" value="${sessionScope.user.email}" placeholder="请输入邮箱">								
					  <span class="help-block" style="display:inline"></span>								
				</li>																					
			</ul>
				<span class="alertPWbtn_div">							
    			  <button type="button" class="btn btn-primary" id="alertUserInfobtn">修改</button>
			      <button type="reset" class="btn btn-primary" onclick="reset_form(this.form)">重置</button>
				</span>																					
	</form>
</div>	
</body>
</html>