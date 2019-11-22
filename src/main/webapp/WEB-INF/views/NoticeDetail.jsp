<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
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
	<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/NoticeDetail.css">
		<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/form.css">
<!-- 自定义js文件 -->
	<%-- <script type="text/javascript" src="${APP_PATH}/static/js/login.js"></script> --%>
	<script type="text/javascript" src="${APP_PATH}/static/js/NoticeDetail.js"></script>    
<!--网页小图标-->
	<link rel="shortcut icon" href="${APP_PATH}/static/images/logo.png" type="image/x-icon">
</head>
<body>
<div class="panel panel-info">
    <div class="panel-heading">
        <h3 class="panel-title">标题：${requestScope.Noticeinfo.noticetitle}<span style="float:right">发布时间：${requestScope.Noticeinfo.declaretime}</span></h3>
    </div>
    <div class="panel-body">
    <input type="hidden" value="${requestScope.Noticeinfo.noticecontent}" id="noticecontentHidden">
	<span id="noticecontent"></span>
<br>
<c:if test="${not empty requestScope.Noticeinfo.fjname}">
<br>
<!-- 附件 -->
<div class="FJ">
	<div class="title">
	<span class="start"></span><strong class="text">附件</strong>
	</div>  
	<div class="FJcontext" id="">
		<span style="float:left">${requestScope.Noticeinfo.fjname}</span>
		<input type="hidden" id="path" value="${requestScope.Noticeinfo.fjpath}"/>
		<input type="hidden" id="fileName" value="${requestScope.Noticeinfo.fjname}"/>	      
		<a href = "download?path=${requestScope.Noticeinfo.fjpath}&fileName=${requestScope.Noticeinfo.fjname}" >点击下载</a>        
    </div>
</div>	     
</c:if>	
    </div>
</div>  
<div>
<br>
上一条：
<c:if test="${not empty requestScope.hasPreview}">
<a href="JumpNoticeDetail?noticeid=${requestScope.PreviewDetail.noticeid}">${requestScope.PreviewDetail.noticetitle}</a>
</c:if>
<c:if test="${empty requestScope.hasPreview}">
没有上一条数据
</c:if>
</div>
<div>
下一条：
<c:if test="${not empty requestScope.hasNext}">
<a href="JumpNoticeDetail?noticeid=${requestScope.NextDetail.noticeid}">${requestScope.NextDetail.noticetitle}</a>
</c:if>
<c:if test="${empty requestScope.hasNext}">
没有下一条数据
</c:if>
</div>
<br>
<div>
	<input type="button" value="返回首页" class="btn btn-primary" id="returnBtn">
	<input type="button" value="返回更多通知" class="btn btn-primary" id="returnMoreDetailBtn">	
</div>
</body>
</html>