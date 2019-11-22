<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
      <p class="text_left"><span id="user_name">${sessionScope.user.name}(${sessionScope.user.teacherid})</span>, &nbsp;欢迎使用系统</p>
     <p>权限：<span class="role_name">教师</span><span id="deptName" class="text_right" title="学院：sessionScope.user.department.departmentname">&nbsp; / &nbsp;学院：${sessionScope.user.department.departmentname}</span></p>
      <p class="btn">
          <span class="glyphicon glyphicon-refresh"></span><a id="role_change" href="JumpChooseXN">切换</a>          
          <span class="glyphicon glyphicon-exclamation-sign"></span><a id="help" href="#">帮助</a>
          <span class="glyphicon glyphicon-off"></span><a id="quit" href="loginOut">退出</a>
      </p>
</div>
</div>        
    <div class="nav">
        <ul>
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>选题操作</span><i class="my-icon nav-more"></i></a>
                <ul>                    
                    <li><a href="JumpTeacherDeclareBSXTPage" target="mainFrame"><span>申报题目</span></a></li>
                </ul>
            </li>
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>团队管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                	<li><a href="JumpAduitTeamInfo" target="mainFrame"><span>审核团队信息</span></a></li>
                </ul>
            </li>            
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>师生互动管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="JumpPushNotificationPage" target="mainFrame"><span>推送通知</span></a></li>
                    <li><a href="JumpMessageInteractionPage" target="mainFrame"><span>留言互动</span></a></li>
                </ul>
            </li> 
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>答辩安排与答辩成绩管理</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="TeacherJumpDbAP" target="mainFrame"><span>查看答辩安排</span></a></li>
                    <li><a href="TeacherJumpDbCJ" target="mainFrame"><span>评定答辩成绩</span></a></li>
                </ul>
            </li>                          
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>用户设置</span><i class="my-icon nav-more"></i></a>
                <ul>
                    <li><a href="JumpTeacherInfoPage" target="mainFrame"><span>用户信息</span></a></li>
                    <li><a href="JumpAlertTeacherPwPage" target="mainFrame"><span>修改密码</span></a></li>
                </ul>
            </li>        
            <c:if test="${sessionScope.user.pLeaderidSign == true}">            
            <li class="nav-item">
                <a href="javascript:;"><i class="glyphicon glyphicon-home"></i><span>专业负责人模块</span><i class="my-icon nav-more"></i></a>
                <ul>
                	<li><a href="ZYFZRJumpAduitTeamInfo" target="mainFrame"><span>审核负责专业毕设信息</span></a></li>
                	<li><a href="JumpSetDbInfo" target="mainFrame"><span>设置答辩信息</span></a></li>
                </ul>
            </li>
            </c:if>            
        </ul>                
    </div>	 
		    <div  class="frameDiv">
		    	<!-- scrolling="no" -->
		    	<iframe src="JumpTeacherDeclareBSXTPage" name="mainFrame" class="frame" id="mainFrame" >
		    	</iframe>
		    </div>       
</body>
</html>