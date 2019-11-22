<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>留言互动</title>
  	<%pageContext.setAttribute("APP_PATH",request.getContextPath());//获取根目录%>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		    
<!-- 自定义css样式文件 -->    	
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/form.css">				
<!-- 自定义js文件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/nav.js"></script>    
    <script type="text/javascript" src="${APP_PATH}/static/js/Student/MessageInteraction.js"></script>
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">	
</head>
<body>
<span class="HeadTitle">留言互动</span>
<div class="panel panel-default">
<c:forEach items="${pageInfo.list}" var="list">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" 
				   href='#${list.lyhdtitleinfoid}'>
					${list.title}
				</a>
				<span>提问时间：${list.submittime}</span>
				<span>提问者：${list.student.name}</span>
				<span style="float:right"><a href="StuJumpCommentPage?titleid=${list.lyhdtitleinfoid}">查看评论>></a></span>
			</h4>
		</div>
		<div id="${list.lyhdtitleinfoid}" class="panel-collapse collapse in">
			<div class="panel-body">
				${list.context}
			</div>
		</div>
</c:forEach>	
</div>
<c:if test="${not empty pageInfo.list}">
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6">
				当前页码：${pageInfo.pageNum}页，总 ${pageInfo.pages}页，共${pageInfo.total}条数据
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				  <ul class="pagination">
				  	<li><a href="${APP_PATH}/StuJumpMessageInteractionPage?pn=1">首页</a></li>
				    <li>
				    <!-- 上一页 -->
				    <c:if test="${pageInfo.hasPreviousPage == true }">
				      	<a href="${APP_PATH}/StuJumpMessageInteractionPage?pn=${pageInfo.pageNum-1}" aria-label="Previous">
				      		<span aria-hidden="true">&laquo;</span>
				      	</a>
				      </c:if>				        
				    </li>
				    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
				    <!-- 如果遍历到的页码为当前页面，则高亮显示 -->
				    	<c:if test="${page_Num == pageInfo.pageNum}">
				    		<li class="active"><a href="${APP_PATH}/StuJumpMessageInteractionPage?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    	<c:if test="${page_Num != pageInfo.pageNum}">
				    		<li><a href="${APP_PATH}/StuJumpMessageInteractionPage?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    </c:forEach>				    
				    <li>
				     <c:if test="${pageInfo.hasNextPage == true }">
				      <a href="${APP_PATH}/StuJumpMessageInteractionPage?pn=${pageInfo.pageNum+1}" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				      </c:if>
				    </li>
				    <li><a href="${APP_PATH}/StuJumpMessageInteractionPage?pn=${pageInfo.pages}">尾页</a></li>
				  </ul>
				</nav>				
			</div>	
		</div>	
</c:if>
<hr style="height:1px;border:none;border-top:1px dashed #0066CC;">
		<input id="pn" value="${pageInfo.pages+1}" type="hidden"/>
		<form id="twForm">		
		<ul>
			<li>
				<input value="${lyhdtitleinfo.lyhdtitleinfoid}" id="titleid" type="hidden">
				<input value="${pageInfo.pages + 1}" id="pn" type="hidden">
				<span class="glyphicon glyphicon-play"></span>
				<span class="title2">提问</span>
			</li>
			<li>
				<span class="title2" id="wtlxTitle">请选择问题的类型：</span>
				<select id="wtlx" name="typeid"></select>					
				<span class="help-block" style="display:inline"></span>
			</li>
			<li>
				<span class="glyphicon glyphicon-play"></span>			
				<span class="title2" id="titleTitle">问题题目 共输入 <span id="titlezs" class="zs"></span>个字符</span>
			</li>
			<li>
				<input id="title" name="title" type="text" style="width:600px">
				<span class="help-block" style="display:inline"></span>
			</li>			
			<li>
				<span class="glyphicon glyphicon-play"></span>			
				<span class="title2" id="contextTitle">问题内容 共输入 <span id="contextzs" class="zs"></span>个字符</span>
			</li>
			<li>
				<textarea rows="10" cols="100" id="context" name="context" class="has-error" style="resize: none;" class="form-control textinline"></textarea>
				<span class="help-block" style="display:inline"></span>
			</li>
		</ul>
		<input type="button" value="提问" class="btn btn-primary" id="submitBtn">
		</form>			
</body>
</html>