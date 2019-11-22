<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通知信息</title>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		    
<!-- 自定义css样式文件 -->    	
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/Notice.css">
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/form.css">	
<!-- 自定义js文件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/NoticeMore.js"></script>    
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">
</head>
<body>
	<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">		
			<form id="noticeform">		
				<span class="HeadTitle">通知公告</span>
				<span style="float:right">
				<input type="text" name="noticetitle"  id="noticetitle" value="">
				<input type="button" class="btn btn-primary" id="querybtn" value="按标题查询">
				</span>
			</form>
				<table class="table table-hover" id="Table">
					<tbody>						
					</tbody>		
				</table>
			</div>
		</div>		
		<!-- 显示分页信息 -->	
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area">				
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
			</div>
		</div>
<div>
	<input type="button" value="返回首页" class="btn btn-primary" id="returnBtn">
</div>
</body>
</html>