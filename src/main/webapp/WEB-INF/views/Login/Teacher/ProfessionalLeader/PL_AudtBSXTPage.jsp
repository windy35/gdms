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
<script type="text/javascript" src="${APP_PATH}/static/js/BSXTDetailInfo.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/PL_AuditBSXT.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>（专业负责人）审核毕设选题</title>
</head>
<body>
<span class="HeadTitle">（专业负责人）审核毕设选题信息</span>
<ul>
<li>
<span class="start"></span><strong class="text">课题基本信息</strong>
</li>
<li>
<ul>
	<li style="width:100%">	
	<span class="text_left"> 选题题目：</span>
	<span class="text_right" style="width:600px;" title="${requestScope.GDInfo.title}">${requestScope.GDInfo.title}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 可选专业：</span>
	<span class="text_right" title="${requestScope.GDInfo.optionalprofessional}">${requestScope.GDInfo.optionalprofessional}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 课题申报时间：</span>
	<span class="text_right" title="${requestScope.GDInfo.declaretime}">${requestScope.GDInfo.declaretime}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 题目类型：</span>
	<span class="text_right" title="${requestScope.GDInfo.designtype.typename}">${requestScope.GDInfo.designtype.typename}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 题目来源：</span>
	<span class="text_right" title="${requestScope.GDInfo.titlesource.titlesourcename}">${requestScope.GDInfo.titlesource.titlesourcename}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 选择模式：</span>
	<span class="text_right" title="${requestScope.GDInfo.topicselectionmode}">${requestScope.GDInfo.topicselectionmode}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 课题所属专业：</span>
	<span class="text_right" title="${requestScope.GDInfo.subjectaffiliation}">${requestScope.GDInfo.subjectaffiliation}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 指导教师：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.name}(${requestScope.GDInfo.instructorid})">${requestScope.GDInfo.instructor.name}(${requestScope.GDInfo.instructorid})</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 教师职称：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.positionaltitle}">${requestScope.GDInfo.instructor.positionaltitle}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 导师联系电话：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.phone}">${requestScope.GDInfo.instructor.phone}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 导师联系邮箱：</span>
	<span class="text_right" title="${requestScope.GDInfo.instructor.email}">${requestScope.GDInfo.instructor.email}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 学生姓名：</span>
	<c:if test="${not empty requestScope.GDInfo.student}">
		<span class="text_right" title="${requestScope.GDInfo.student.name}">${requestScope.GDInfo.student.name}</span>
	</c:if>	
	</li>	
	<li class="li_width">
	<span class="text_left"> 学生院系(专业)：</span>
	<c:if test="${not empty requestScope.GDInfo.student.classes}">
		<span class="text_right" title="${requestScope.GDInfo.student.classes.department.departmentname}(${requestScope.GDInfo.student.classes.major.majorname})">${requestScope.GDInfo.student.classes.department.departmentname}(${requestScope.GDInfo.student.classes.major.majorname})</span>
	</c:if>			
	</li>								
</ul>
</li>

<!-- 课题内容介绍 -->
<li>
<span class="start"></span><strong class="text">课题内容介绍 </strong>
</li>
<li>
		<input id="ktnrhidden" value="${requestScope.GDInfo.gdintroduction}" type="hidden">
		<span id="ktnr"></span>	
</li>
<!-- 毕业设计(论文)任务要求（包括应具备的条件） -->
<li>
	<span class="start"></span><strong class="text">毕业设计(论文)任务要求（包括应具备的条件） </strong>
</li>
<li>
		<input id="rwyqhidden" value="${requestScope.GDInfo.gdtask}" type="hidden">
		<span id="rwyq"></span>				
</li>			
<!-- 课题预计工作量大小 -->
<li>
	<span class="start"></span><strong class="text"> 选题预计工作量大小</strong>
	<input type="hidden" value="${requestScope.GDInfo.workload}" id="Workloadhidden">
	<p id="gzl"></p>
</li>		
<!-- 课题预计难易程度 -->
<li>
	<span class="start"></span><strong class="text">课题预计难易程度</strong>
	<input type="hidden" value="${requestScope.GDInfo.complexity}" id="Complexityhidden">
	<p id="nd"></p>
</li>
<!-- 预计完成工作量所需学生数 -->
<li>
	<span class="start"></span><strong class="text"> 预计完成工作量所需学生数</strong>
	<p>${requestScope.GDInfo.requirestudentcount}</p>
</li>

<!-- 毕设选题审核情况 -->
	<li>
	<span class="start"></span><strong class="text">毕设选题审核情况</strong>
	</li>
	<li>
	<form id="bsxtForm">
	<table class="tablestyle" border="1" id="SHQK">
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
	<tr>
	<td rowspan="2" width="10%">
			专业负责人审核意见：
	</td>
	<td>
			毕设选题审核意见：
			<select id="bsxtexpertopinion" name="bsxtexpertopinion">
			<option value="请选择">请选择</option>
			<option value="同意">同意</option>
			<option value="不同意">不同意</option>
			</select>
			<span class="help-block" style="display:inline"></span>						
	</td>
	</tr>
	<tr>
	<td>
			<span>专业负责人毕设选题审核详细意见：已输入<span id="bsxtexpertdetailopinionzs" class="zs"></span>个字符</span>
			<br>
			<textarea rows="5" cols="80"  id="bsxtexpertdetailopinion" style="resize: none;" name="bsxtexpertdetailopinion"></textarea>
			<span class="help-block" style="display:inline"></span>		
	</td>	
	</tr>
	<tr>
	<td colspan="2">
			<input type="hidden" value="${requestScope.GDResultInfo.graduationdesignresultid}" id="graduationdesignresultid" name="graduationdesignresultid">
			<input type="hidden" value="${requestScope.GDInfo.graduationdesignid}" id="graduationdesignid" name="graduationdesignid">
			<input class="btn btn-primary" id="PLAuditBSXTBtn" type="button" value="提交">
			<input type="button" value="返回" class="btn btn-primary" id="ReturnBtn">		
	</td>
	</tr>	
	</table>
	</form>
</li>
</ul>	
</body>
</html>