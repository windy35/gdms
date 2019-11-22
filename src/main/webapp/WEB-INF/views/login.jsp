<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>
<!DOCTYPE html>
<html>
  <head>    
    <title>登录界面</title>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/jquery.liMarquee.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/liMarquee.css" rel="stylesheet">
<!-- 自定义css样式文件 -->    	
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/login.css">
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/form.css">
<!-- 自定义js文件 --> 
	<script type="text/javascript" src="${APP_PATH}/static/js/login.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/notice_Marquee.js"></script>
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">
  </head>
  
  <body>	  
  <!-- 通知公告Div -->
   <div class="cover">
		<div class="main">
				<div class="notice_div" id="notice">				
				<span class="noticetitle">通知公告</span><a href="JumpNoticeMore" class="more">More>></a>
					<div class="notice_listDiv notice_Marquee" id="noticelistDiv">						
							<ul id="notice_ul">				
							</ul>
					</div>
				</div>
<div id="myCarousel" class="carousel slide CarouselDiv">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" 
			class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>   
	<!-- 轮播（Carousel）项目 -->
	<div class="carousel-inner">
		<div class="item active">
			<a href="http://www.bigan.net/" target="_blank"><img src="${APP_PATH}/static/images/bigan.png" alt="First slide"></a>
		</div>
		<div class="item">
			<a href="http://vpcs.cqvip.com/?from=baidupingzhuan" target="_blank"><img src="${APP_PATH}/static/images/weipu.png" alt="Third slide"></a>
		</div>
		<div class="item">
			<a href="http://www.paperok.com/" target="_blank"><img src="${APP_PATH}/static/images/pagerOK.png" alt="Third slide"></a>
		</div>
	</div>
	<!-- 轮播（Carousel）导航 -->
	<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev" style="width:20px">
	    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
	    <span class="sr-only">Previous</span>
	</a>
	<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next" style="width:20px">
	    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
	    <span class="sr-only">Next</span>
	</a>
</div> 
				<div class="login_div" id="LoginDiv">
					<form id="loginForm" action="userlogin" method="post">
						<ul>
							<li class="li_font">
								  <span class="glyphicon glyphicon-user"></span>
								  <input type="text" class="input_text form-control" id="inputUsername" name="Username" placeholder="请输入用户编号">
								  <span class="help-block" style="display:inline"></span>					
							</li>
							<li class="li_font">
								  <span class="glyphicon glyphicon-lock"></span>
								  <input type="password" class="input_text form-control" id="inputPassword" name="Password" placeholder="请输入密码">
								  <span class="help-block" style="display:inline"></span>
							</li>	
							<li class="li_font">
								  <span class="glyphicon glyphicon-picture"></span>
								  <input type="text" class="input_text form-control" id="inputvcCode" name="VCCode" placeholder="请输入验证码" maxlength="4" value="">								
								  <span class="help-block" style="display:inline"></span>								
							</li>								
							<li>
								<img id="checkCodeImg" src="Generate_vcCode" alt="验证码" onclick="change_checkCode()"title="点击更换验证码" class="checkcode">
								<a href="javascript:void(0)"><label onclick="change_checkCode()">看不清，换一张</label></a>								  								
							</li>
							<li class="li_font">
								<div class="rolediv">
								<input type="radio" name="Role" value="学生" checked/>学生  
								<input type="radio" name="Role" value="教师"/>教师
								<input type="radio" name="Role" value="管理员"/>管理员 	 							
			          			<input type="checkbox" id="remember">记住密码
			          			</div>
							</li>																
						</ul>
							<span class="loginbtn_div">							
			    			  <button type="button" class="btn btn-primary" id="loginBtn">登录</button>
						      <button type="reset" class="btn btn-primary" onclick="reset_form(this.form)">重置</button>
							</span>																					
					</form>
				</div>
		</div>
			<div class="help">
				<a href="javascript:void(0)" onclick="show_forgetPw_div();" class="link">忘记密码</a>
			</div>		
  </div> 
  
  <!-- 底部信息div -->
			<div class="footer">
				<div>
					<span style="color:grey; font:arial;">图片来源于网络 Copyright © 2018 - 20XX 广东技术师范学院 , All Rights Reserved</span>
					<br> 
					<span style="color:grey; font:arial;">广东技术师范学院 版权所有</span>
				</div>
			</div>	
			
<!-- 忘记密码的模态框 -->
<div class="modal fade" id="forgetPwModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">忘记密码</h4>
      </div>
      <div class="modal-body">
			<table style="width:475 border:0 cellpadding:0 cellspacing:1 font-size: 14px;">
				<tr>
					<td style="text-align:left width:20%">忘记密码说明：</td>
				</tr>
				<tr><td style="text-align:left">1：请尝试输入用户编号作为登录密码。</td></tr>
				<tr><td style="text-align:left">2：如忘记密码可以联系网络中心X老师进行修改，QQ:XXXXXXXXXX，电话:XXXXXXXXXXX。</td></tr>
				<tr><td style="text-align:left">注：请忘记密码的用户，填写好修改密码申请表再联系老师进行修改。
				<a href="${APP_PATH}/download_forget_pw_file">点击此处下载</a>
				</td>
				</tr>
			</table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
      </div>
    </div>
  </div>
</div>				
  </body>
</html>