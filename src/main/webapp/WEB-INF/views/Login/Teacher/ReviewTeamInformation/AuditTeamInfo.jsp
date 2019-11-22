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
<%-- <script type="text/javascript" src="${APP_PATH}/static/js/Teacher/AuditBSXT.js"></script> --%>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>审核团队信息</title>
</head>
<body>
<span class="HeadTitle">审核团队信息</span>
<div class="panel panel-default">
<c:forEach items="${pageInfo.list}" var="list">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" 
				   href='#${list.studentid}'>
					毕设选题：${list.graduationdesign.title}
				</a>
				<span style="float:right">学号：${list.studentid}&nbsp;&nbsp;&nbsp;&nbsp;姓名：${list.name}</span>
				<%-- <span style="float:right"><a href="JumpCommentPage?titleid=${list.lyhdtitleinfoid}">查看评论>></a></span> --%>
			</h4>
		</div>
		<div id="${list.studentid}" class="panel-collapse collapse">
			<div class="panel-body">
				<c:if test="${empty list.graduationdesign.bsxtauditstatus}">
				毕设选题审核状态：未提交
				<hr class="hr0" />				
				</c:if>					
				<c:if test="${list.graduationdesign.bsxtauditstatus.auditstatusname != '等待指导老师审核' and not empty list.graduationdesign.bsxtauditstatus}">
				毕设选题审核状态：${list.graduationdesign.bsxtauditstatus.auditstatusname}
				<span style="float:right">
				已进行审核操作
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="JumpBSXTDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}">查看详情</a>			
				</span>				
				<hr class="hr0" />
				</c:if>
				<c:if test="${list.graduationdesign.bsxtauditstatus.auditstatusname == '等待指导老师审核'}">
				毕设选题审核状态：${list.graduationdesign.bsxtauditstatus.auditstatusname}
				<span style="float:right">
				<a href="JumpAuditBSXTPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}">审核</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="JumpBSXTDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}">查看详情</a>			
				</span>
				<hr class="hr0" />
				</c:if>		
				
				<c:if test="${empty list.graduationdesignresult.ktbgauditstatus}">
				开题报告审核状态：未提交
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.ktbgauditstatus.auditstatusname != '等待指导老师审核'  and not empty list.graduationdesignresult.ktbgauditstatus}">
				开题报告审核状态：${list.graduationdesignresult.ktbgauditstatus.auditstatusname}
				<span style="float:right">
				已进行审核操作
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpKTBGDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&ktbginfoid=${list.ktbgid}&studentid=${list.studentid}">查看详情</a>
				</span>
				<hr class="hr0" />				
				</c:if>								
				<c:if test="${list.graduationdesignresult.ktbgauditstatus.auditstatusname == '等待指导老师审核'}">
				开题报告审核状态：${list.graduationdesignresult.ktbgauditstatus.auditstatusname}
				<span style="float:right">
				<a href="TeacherJumpAuditKTBGPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&ktbginfoid=${list.ktbgid}">审核</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpKTBGDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&ktbginfoid=${list.ktbgid}&studentid=${list.studentid}">查看详情</a>
				</span>
				<hr class="hr0" />				
				</c:if>
				
				<c:if test="${empty list.graduationdesignresult.zqjcbauditstatus}">
				中期检查表审核状态：未提交
				<hr class="hr0" />				
				</c:if>				
				<c:if test="${list.graduationdesignresult.zqjcbauditstatus.auditstatusname == '等待指导老师审核'}">
				中期检查表审核状态：${list.graduationdesignresult.zqjcbauditstatus.auditstatusname}
				<span style="float:right">
				<a href="TeacherJumpAuditZQJCBPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&zqjcbinfoid=${list.zqjcbid}">审核</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpZQJCBDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&zqjcbinfoid=${list.zqjcbid}&studentid=${list.studentid}">查看详情</a>
				</span>
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.zqjcbauditstatus.auditstatusname != '等待指导老师审核'  and not empty list.graduationdesignresult.zqjcbauditstatus}">
				中期检查表审核状态：${list.graduationdesignresult.zqjcbauditstatus.auditstatusname}
				<span style="float:right">
				已进行审核操作
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpZQJCBDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&zqjcbinfoid=${list.zqjcbid}&studentid=${list.studentid}">查看详情</a>
				</span>
				<hr class="hr0" />				
				</c:if>

				<c:if test="${empty list.graduationdesignresult.wwywhyjauditstatus}">
				外文译文和原件审核状态：未提交
				<hr class="hr0" />				
				</c:if>				
				<c:if test="${list.graduationdesignresult.wwywhyjauditstatus.auditstatusname == '等待指导老师审核'}">
				外文译文和原件审核状态：${list.graduationdesignresult.wwywhyjauditstatus.auditstatusname}
				<span style="float:right">
				<a href="TeacherJumpAuditWWYWHYJPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&wwywhyjinfoid=${list.wwywhyjid}">审核</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpWWYWHYJDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&wwywhyjinfoid=${list.wwywhyjid}&studentid=${list.studentid}">查看详情</a>				
				</span>
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.wwywhyjauditstatus.auditstatusname != '等待指导老师审核' and not empty list.graduationdesignresult.wwywhyjauditstatus}">
				外文译文和原件审核状态：${list.graduationdesignresult.wwywhyjauditstatus.auditstatusname}
				<span style="float:right">
				已进行审核操作
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpWWYWHYJDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&wwywhyjinfoid=${list.wwywhyjid}&studentid=${list.studentid}">查看详情</a>				
				</span>
				<hr class="hr0" />				
				</c:if>

				<c:if test="${empty list.graduationdesignresult.zdjlauditstatus}">
				指导记录审核状态：未提交
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.zdjlauditstatus.auditstatusname == '等待指导老师审核'}">
				指导记录审核状态：${list.graduationdesignresult.zdjlauditstatus.auditstatusname}
				<span style="float:right">
				<a href="TeacherJumpAuditZDJLPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&zdjlinfoid=${list.zdjlid}">审核</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpZDJLDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&zdjlinfoid=${list.zdjlid}&studentid=${list.studentid}">查看详情</a>
				</span>
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.zdjlauditstatus.auditstatusname != '等待指导老师审核' and not empty list.graduationdesignresult.zdjlauditstatus}">
				指导记录审核状态：${list.graduationdesignresult.zdjlauditstatus.auditstatusname}
				<span style="float:right">
				已进行审核操作
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpZDJLDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&zdjlinfoid=${list.zdjlid}&studentid=${list.studentid}">查看详情</a>
				</span>
				<hr class="hr0" />				
				</c:if>
				
				<c:if test="${empty list.graduationdesignresult.bylwauditstatus}">
				毕业论文审核状态：未提交
				<hr class="hr0" />				
				</c:if>				
				<c:if test="${list.graduationdesignresult.bylwauditstatus.auditstatusname == '等待指导老师审核'}">
				毕业论文审核状态：${list.graduationdesignresult.bylwauditstatus.auditstatusname}
				<span style="float:right">
				<a href="TeacherJumpAuditBYLWPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&bylwinfoid=${list.bylwid}">审核</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpBYLWDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&bylwinfoid=${list.bylwid}&studentid=${list.studentid}">查看详情</a>
				</span>
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.bylwauditstatus.auditstatusname != '等待指导老师审核' and not empty list.graduationdesignresult.bylwauditstatus}">
				毕业论文审核状态：${list.graduationdesignresult.bylwauditstatus.auditstatusname}
				<span style="float:right">
				已进行审核操作
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpBYLWDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&bylwinfoid=${list.bylwid}&studentid=${list.studentid}">查看详情</a>				
				</span>
				<hr class="hr0" />				
				</c:if>		

				<c:if test="${empty list.graduationdesignresult.dbpptauditstatus}">
				答辩PPT审核状态：未提交
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.dbpptauditstatus.auditstatusname == '等待指导老师审核'}">
				答辩PPT审核状态：${list.graduationdesignresult.dbpptauditstatus.auditstatusname}
				<span style="float:right">
				<a href="TeacherJumpAuditDBPPTPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&dbpptinfoid=${list.dbpptid}">审核</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpDBPPTDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&dbpptinfoid=${list.dbpptid}&studentid=${list.studentid}">查看详情</a>				
				</span>
				<hr class="hr0" />				
				</c:if>
				<c:if test="${list.graduationdesignresult.dbpptauditstatus.auditstatusname != '等待指导老师审核' and not empty list.graduationdesignresult.dbpptauditstatus}">
				答辩PPT审核状态：${list.graduationdesignresult.dbpptauditstatus.auditstatusname}
				<span style="float:right">
				已进行审核操作
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="TeacherJumpDBPPTDetailPages?gdResultID=${list.graduationdesignresultid}&gdID=${list.graduationdesignid}&dbpptinfoid=${list.dbpptid}&studentid=${list.studentid}">查看详情</a>				
				</span>
				<hr class="hr0" />				
				</c:if>
				
			</div>
		</div>
</c:forEach>	
</div>

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
				  	<li><a href="${APP_PATH}/JumpAduitTeamInfo?pn=1">首页</a></li>
				    <li>
				    <!-- 上一页 -->
				    <c:if test="${pageInfo.hasPreviousPage == true }">
				      	<a href="${APP_PATH}/JumpAduitTeamInfo?pn=${pageInfo.pageNum-1}" aria-label="Previous">
				      		<span aria-hidden="true">&laquo;</span>
				      	</a>
				      </c:if>				        
				    </li>
				    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
				    <!-- 如果遍历到的页码为当前页面，则高亮显示 -->
				    	<c:if test="${page_Num == pageInfo.pageNum}">
				    		<li class="active"><a href="${APP_PATH}/JumpAduitTeamInfo?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    	<c:if test="${page_Num != pageInfo.pageNum}">
				    		<li><a href="${APP_PATH}/JumpAduitTeamInfo?pn=${page_Num}">${page_Num}</a></li>
				    	</c:if>
				    </c:forEach>				    
				    <li>
				     <c:if test="${pageInfo.hasNextPage == true }">
				      <a href="${APP_PATH}/JumpAduitTeamInfo?pn=${pageInfo.pageNum+1}" aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				      </c:if>
				    </li>
				    <li><a href="${APP_PATH}/JumpAduitTeamInfo?pn=${pageInfo.pages}">尾页</a></li>
				  </ul>
				</nav>				
			</div>	
		</div>	
</body>
</html>