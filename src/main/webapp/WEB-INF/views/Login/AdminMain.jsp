<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>毕业设计管理系统</title>
  	<%pageContext.setAttribute("APP_PATH",request.getContextPath());//获取根目录%>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		    
<!-- 自定义css样式文件 -->    	
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/nav.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/iconfont.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/banner.css">		
<!-- 自定义js文件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/nav.js"></script>    
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">
</head>
<body>
<div class="top">
<div class="banner">
</div>
<div class="bannerLeft">
      <img id="school_logo" class="schoolLogo" src="${APP_PATH}/static/images/crest.png" alt="">
      <p class="title">
         	广东技术师范学院
      </p>
      <p class="title2" id="R_xtmc" style="">毕业设计管理系统</p>
</div>  
<div class="bannerRight">
      <p class="text_left"><span id="user_name">(管理员)${sessionScope.user.adminname}(${sessionScope.user.adminid})</span>, &nbsp;欢迎使用系统</p>
      <p class="btn">
          <span class="glyphicon glyphicon-refresh"></span><a id="role_change" href="">切换</a>          
          <span class="glyphicon glyphicon-exclamation-sign"></span><a id="help" href="#">帮助</a>
          <span class="glyphicon glyphicon-off"></span><a id="quit" href="loginOut">退出</a>
      </p>
</div>
</div>        
    <div class="nav">
        <ul>
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>信息管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="JumpManageStuInfoPage" target="mainFrame"><span>学生信息管理</span></a></li>
                    <li><a href="JumpManageTeacherInfoPage" target="mainFrame"><span>教师信息管理</span></a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>通知管理功能</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="SetNotice" target="mainFrame"><span>发布通知信息</span></a></li>
                    <li><a href="JumpManageNotice" target="mainFrame"><span>管理通知信息</span></a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>用户设置</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="AdminJumpUserInfoPage" target="mainFrame"><span>用户信息</span></a></li>
                    <li><a href="AdminJumpAlertPwPage" target="mainFrame"><span>修改密码</span></a></li>
                </ul>
            </li>        
        </ul>                
    </div>	 
		    <div  class="frameDiv">
		    	<!-- scrolling="no" -->
		    	<iframe src="JumpManageStuInfoPage" name="mainFrame" class="frame" id="mainFrame" >
		    	</iframe>
		    </div>       
</body>
</html>