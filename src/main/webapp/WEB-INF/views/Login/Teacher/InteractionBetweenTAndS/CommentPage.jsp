<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>评论信息页面</title>
  	<%pageContext.setAttribute("APP_PATH",request.getContextPath());//获取根目录%>
<!-- 引入JQuery -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>    
<!-- 引入bootstrap -->
	<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		    
<!-- 自定义css样式文件 -->    	
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/form.css">
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/dianzan.css">    				
<!-- 自定义js文件 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/nav.js"></script>    
    <script type="text/javascript" src="${APP_PATH}/static/js/Teacher/CommentPage.js"></script>
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">	
</head>
<body>
<span class="HeadTitle">评论信息页面</span>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title">题目：${lyhdtitleinfo.title}</h3>
        <span class="panel-title">提问者：${lyhdtitleinfo.student.name}</span>
        <span class="panel-title" style="float:right">提问时间：${lyhdtitleinfo.submittime}</span>
    </div>
    <div class="panel-body">
	${lyhdtitleinfo.context}
    </div>
</div>
<table class="table table-hover">
<c:forEach items="${pageInfo.list}" var="list">
<tr>
	<td>
		${list.context}
		<br>
		<span style="float:left">回答者编号：${list.reviewerid}&nbsp;&nbsp;身份：${list.reviewersf}</span>
		<span style="float:right">回答时间：${list.commenttime}&nbsp;&nbsp;
		<c:if test="${fn:contains(list.dianzanzheno, sessionScope.user.teacherid) == false}">
			<span class="heart" rel="like" style="background-position: left center;"></span>
		</c:if>
		<c:if test="${fn:contains(list.dianzanzheno,sessionScope.user.teacherid)}">
			<span class="heart heartAnimation" rel="unlike"></span>
		</c:if>
		<input type="hidden" value="${list.commentid}">
		<span class="likeCount" id="${list.commentid}">${list.agreenum}</span>
		</span>
	</td>
</tr>
</c:forEach>	
</table>
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
				  	<li><a href="${APP_PATH}/JumpCommentPage?titleid=${lyhdtitleinfo.lyhdtitleinfoid}&pn=1">首页</a></li>
				    <li>
				    <!-- 上一页 -->
				    <c:if test="${pageInfo.hasPreviousPage == true }">
				      	<a href="${APP_PATH}/JumpCommentPage?titleid=${lyhdtitleinfo.lyhdtitleinfoid}&pn=${pageInfo.pageNum-1}" aria-label="Previous">
				      		<span aria-hidden="true">&laquo;</span>
				      	</a>
				      </c:if>				        
				    </li>
				    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
				    <!-- 如果遍历到的页码为当前页面，则高亮显示 -->
				    	<c:if test="${page_Num == pageInfo.pageNum}">
				    		<li class="active"><a href="${APP_PATH}/JumpCommentPage?titleid=${lyhdtitleinfo.lyhdtitleinfoid}&pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    	<c:if test="${page_Num != pageInfo.pageNum}">
				    		<li><a href="${APP_PATH}/JumpCommentPage?titleid=${lyhdtitleinfo.lyhdtitleinfoid}&pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    </c:forEach>				    
				    <li>
				     <c:if test="${pageInfo.hasNextPage == true }">
				      <a href="${APP_PATH}/JumpCommentPage?titleid=${lyhdtitleinfo.lyhdtitleinfoid}&pn=${pageInfo.pageNum+1}" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				      </c:if>
				    </li>
				    <li><a href="${APP_PATH}/JumpCommentPage?titleid=${lyhdtitleinfo.lyhdtitleinfoid}&pn=${pageInfo.pages}">尾页</a></li>
				  </ul>
				</nav>				
			</div>	
		</div>
</c:if>	
<hr style="height:1px;border:none;border-top:1px dashed #0066CC;">
		<form id="plForm">
		<ul>
			<li>
				<input value="${lyhdtitleinfo.lyhdtitleinfoid}" id="titleid" type="hidden">
				<input value="${pageInfo.pages + 1}" id="pn" type="hidden">
				<span class="glyphicon glyphicon-play"></span>
				<span class="title2" id="plnrTitle">评论内容 共输入 <span id="plnrzs" class="zs"></span>个字符</span>
			</li>
			<li>
				<textarea rows="10" cols="100" id="plnr" name="plnr" class="has-error" style="resize: none;" class="form-control textinline"></textarea>
				<span class="help-block" style="display:inline"></span>
			</li>
		</ul>
		<input type="button" value="评论" class="btn btn-primary" id="submitBtn">
		<input type="button" value="返回" class="btn btn-primary" id="returnBtn">
		</form>	
</body>
</html>