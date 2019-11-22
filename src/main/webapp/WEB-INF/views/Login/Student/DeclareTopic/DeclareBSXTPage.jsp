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
<script type="text/javascript" src="${APP_PATH}/static/js/Student/DeclareBSXTPage.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>（学生）申报毕设选题</title>
</head>
<body>
<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<span class="HeadTitle">（学生）申报毕设选题</span>
			</div>
		</div>
		
		<div class="border">
						<span>选题题目：</span>
						 <input type="text" class="" id="xttm"  placeholder="" />				
						<span>题目类型：</span>
						<select id="tmlx"></select>
						<span>题目来源：</span>
						<select id="tmly"></select>
						<br>											
<!-- 												
						<span>审核状态：</span>
						<select id="shzt">
						</select>		 -->									
						<button class="btn btn-primary" id="gd_select_model_btn">查询</button>
									<button class="btn btn-primary" id="DeclareGDBtn" onclick="JumpDeclareGD();">申报题目</button>					
		</div>
		</div>
		
		<span class="HeadTitle">（学生）毕设题目审核情况</span>
<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">				
				<table class="table table-hover" id="GDTable">
					<thead>
					<tr>
						<th>毕设结果编号</th>						
						<th>毕设编号</th>					
						<th>毕设题目</th>
						<th>题目类型</th>
						<th>题目来源</th>
						<th>审核状态</th>												
						<th>申报时间</th>
						<th>操作</th>
					</tr>	
					</thead>
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
</body>
</html>