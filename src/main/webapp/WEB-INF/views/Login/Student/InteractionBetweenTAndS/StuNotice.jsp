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
<%-- <script type="text/javascript" src="${APP_PATH}/static/js/Admin/ManageNotice.js"></script> --%>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>学生查看教师通知页面</title>
</head>
<body>
<span class="HeadTitle">学生查看教师通知页面</span>
<div class="row">
	<div class="col-md-12">		
	<table class="table table-hover" id="Table">
					<tbody>		
					<c:forEach  items="${pageInfo.list}" var="notice">
						<tr>
							<td>
								<input type="hidden" id="Noticeid" value="${notice.noticeid}">
								<a href="JumpTeacherNoticeDetail?noticeid=${notice.noticeid}" target="_self">${notice.noticetitle}</a>
								<c:if test="${notice.readornot == false}">
								<sup style="color:red;font-weight: bold;">新</sup>
								</c:if>
								发布者：${notice.notifier}
								<span style="float:right">${notice.declaretime}</span>
							</td>
						</tr>					
					</c:forEach>						
					</tbody>		
				</table>
			</div>
		</div>		
		
	<input type="hidden" value="${pageInfo.pageNum + 1}" id="pn"/>
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
				  	<li><a href="${APP_PATH}/StuJumpNoticePage?pn=1">首页</a></li>
				    <li>
				    <!-- 上一页 -->
				    <c:if test="${pageInfo.hasPreviousPage == true }">
				      	<a href="${APP_PATH}/StuJumpNoticePage?pn=${pageInfo.pageNum-1}" aria-label="Previous">
				      		<span aria-hidden="true">&laquo;</span>
				      	</a>
				      </c:if>				        
				    </li>
				    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
				    <!-- 如果遍历到的页码为当前页面，则高亮显示 -->
				    	<c:if test="${page_Num == pageInfo.pageNum}">
				    		<li class="active"><a href="${APP_PATH}/StuJumpNoticePage?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    	<c:if test="${page_Num != pageInfo.pageNum}">
				    		<li><a href="${APP_PATH}/StuJumpNoticePage?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    </c:forEach>				    
				    <li>
				     <c:if test="${pageInfo.hasNextPage == true }">
				      <a href="${APP_PATH}/StuJumpNoticePage?pn=${pageInfo.pageNum+1}" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				      </c:if>
				    </li>
				    <li><a href="${APP_PATH}/StuJumpNoticePage?pn=${pageInfo.pages}">尾页</a></li>
				  </ul>
				</nav>				
			</div>	
		</div>	
</body>
</html>