<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/BSXTDetailInfo.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>毕设选题详细信息</title>
</head>
<body>
<span class="HeadTitle">毕设选题信息</span>
<ul>
<li>
<span class="start"></span><strong class="text">课题基本信息</strong>
</li>
<li>
<ul>
	<li style="width:100%">
	<div class="DivStyle">	
	<span class="text_left"> 选题题目：</span>
	<span class="text_right" style="width:600px;" title="${requestScope.GDInfo.title}">${requestScope.GDInfo.title}</span>
	</div>
	</li>
	<li class="li_width">
	<div class="DivStyle">	
	<span class="text_left"> 可选专业：</span>
	<span class="text_right" title="${requestScope.GDInfo.optionalprofessional}">${requestScope.GDInfo.optionalprofessional}</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">	
	<span class="text_left"> 课题申报时间：</span>
	<span class="text_right" title="${requestScope.GDInfo.declaretime}">${requestScope.GDInfo.declaretime}</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">
	<span class="text_left"> 题目类型：</span>
	<span class="text_right" title="${requestScope.GDInfo.designtype.typename}">${requestScope.GDInfo.designtype.typename}</span>
	</div>
	</li>
	<li class="li_width">
	<div class="DivStyle">
	<span class="text_left"> 题目来源：</span>
	<span class="text_right" title="${requestScope.GDInfo.titlesource.titlesourcename}">${requestScope.GDInfo.titlesource.titlesourcename}</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">	
	<span class="text_left"> 选择模式：</span>
	<span class="text_right" title="${requestScope.GDInfo.topicselectionmode}">${requestScope.GDInfo.topicselectionmode}</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">
	<span class="text_left"> 课题所属专业：</span>
	<span class="text_right" title="${requestScope.GDInfo.subjectaffiliation}">${requestScope.GDInfo.subjectaffiliation}</span>
	</div>
	</li>
	<li class="li_width">
	<div class="DivStyle">
	<span class="text_left"> 指导教师：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.name}(${requestScope.GDInfo.instructorid})">${requestScope.GDInfo.instructor.name}(${requestScope.GDInfo.instructorid})</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">
	<span class="text_left"> 教师职称：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.positionaltitle}">${requestScope.GDInfo.instructor.positionaltitle}</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">	
	<span class="text_left"> 导师联系电话：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.phone}">${requestScope.GDInfo.instructor.phone}</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">	
	<span class="text_left"> 导师联系邮箱：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.email}">${requestScope.GDInfo.instructor.email}</span>
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">	
	<span class="text_left"> 学生姓名：</span>
	<c:if test="${not empty requestScope.GDInfo.student}">
		<span class="text_right" title="${requestScope.GDInfo.student.name}">${requestScope.GDInfo.student.name}</span>
	</c:if>	
	</div>
	</li>	
	<li class="li_width">
	<div class="DivStyle">
	<span class="text_left"> 学生院系(专业)：</span>
	<c:if test="${not empty requestScope.GDInfo.student.classes}">
		<span class="text_right" title="${requestScope.GDInfo.student.classes.department.departmentname}(${requestScope.GDInfo.student.classes.major.majorname})">${requestScope.GDInfo.student.classes.department.departmentname}(${requestScope.GDInfo.student.classes.major.majorname})</span>
	</c:if>
	</div>			
	</li>								
</ul>
</li>
<li>
<!-- 课题内容介绍 -->
<span class="start"></span><strong class="text">课题内容介绍 </strong>
</li>
<li>
	<div class="DivStyle">
		<input id="ktnrhidden" value="${requestScope.GDInfo.gdintroduction}" type="hidden">
		<span id="ktnr"></span>
	</div>
</li>
	<!-- 毕业设计(论文)任务要求（包括应具备的条件） -->		
<li>
	<span class="start"></span><strong class="text">毕业设计(论文)任务要求（包括应具备的条件） </strong>
</li>
<li>
	<div class="DivStyle">
		<input id="rwyqhidden" value="${requestScope.GDInfo.gdtask}" type="hidden">
		<span id="rwyq"></span>		
	</div>
</li>
<!-- 课题预计工作量大小 -->
<li>
	<span class="start"></span><strong class="text"> 选题预计工作量大小</strong>
</li>
<li>
	<div class="DivStyle">
	<input type="hidden" value="${requestScope.GDInfo.workload}" id="Workloadhidden">
	<p id="gzl"></p>	
	</div>
</li>
<!-- 课题预计难易程度 -->
<li>
	<span class="start"></span><strong class="text">课题预计难易程度</strong>
</li>
<li>
	<div class="DivStyle">
	<input type="hidden" value="${requestScope.GDInfo.complexity}" id="Complexityhidden">
	<p id="nd"></p>
	</div>	
</li>
<!-- 预计完成工作量所需学生数 -->
<li>
	<span class="start"></span><strong class="text"> 预计完成工作量所需学生数</strong>
</li>
<li>
	<div class="DivStyle">
	<p>${requestScope.GDInfo.requirestudentcount}</p>
	</div>
</li>
	<c:if test="${not empty requestScope.GDInfo.bsxtinstructoropinion}">
		<li>
			<span class="start"></span><strong class="text">毕设选题审核情况</strong>		
		</li>
		<li>
		<div class="DivStyle">
			<table class="tablestyle" border="1">
				<c:if test="${not empty requestScope.GDInfo.bsxtinstructoropinion}">
					<tr>
						<td rowspan="2" width="10%">
						指导教师审核意见
						</td>
						<td>
						<p class="txt_left_top">审核状态：${requestScope.GDInfo.bsxtinstructoropinion}</p>
						</td>			
					</tr>
					<tr>
						<td>
						<p class="txt_left_top">审核意见：${requestScope.GDInfo.bsxtinstructordetailopinion}</p>
						<p class="txt_right_bottom">审核人：${requestScope.GDInfo.bsxtinstructorshr}&nbsp;&nbsp;&nbsp;&nbsp;审核时间：${requestScope.GDInfo.bsxtinstructordeclaretime}</p>
						</td>		
					</tr>		
				</c:if>	
				<c:if test="${not empty requestScope.GDInfo.bsxtexpertopinion}">	
				<tr>
						<td rowspan="2" width="10%">
						专业负责人审核意见
						</td>
						<td>
						<p class="txt_left_top">审核状态：${requestScope.GDInfo.bsxtexpertopinion}</p>
						</td>			
					</tr>
					<tr>
						<td>
						<p class="txt_left_top">审核意见：${requestScope.GDInfo.bsxtexpertdetailopinion}</p>
						<p class="txt_right_bottom">审核人：${requestScope.GDInfo.bsxtexpertshr}&nbsp;&nbsp;&nbsp;&nbsp;审核时间：${requestScope.GDInfo.bsxtexpertdeclaretime}</p>
						</td>		
					</tr>	
					</c:if>			
				</table>		
			</div>
		</li>		
	</c:if>
</ul>
<input type="button" value="返回" class="btn btn-primary" id="returnBtn">
</body>
</html>