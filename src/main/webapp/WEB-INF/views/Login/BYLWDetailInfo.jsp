<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>毕业论文详细信息</title>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/BYLWDetailInfo.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">
</head>
<body>
<c:if test="${empty requestScope.GDInfo}">
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title">提示</h3>
    </div>
    <div class="panel-body">
	用户还没有选择毕设题目或毕设题目未通过审核。
    </div>
</div>
</c:if>
<c:if test="${not empty requestScope.GDInfo}">
<span class="HeadTitle">毕业论文详细信息</span>
<ul>
<li>
<span class="start"></span><strong class="text">选题基本信息</strong>
</li>
<li>
<ul>
	<li style="width:100%">	
	<span class="text_left"> 选题题目：</span>
	<span class="text_right" style="width:600px;" title="${requestScope.GDInfo.title}">${requestScope.GDInfo.title}</span>
	</li>
	<li class="li_width">
	<span class="text_left"> 可选专业：</span>
	<span class="text_right" title="">${requestScope.GDInfo.optionalprofessional}</span>
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
	<span class="text_right" title="">${requestScope.GDInfo.topicselectionmode}</span>
	</li>	
	<li class="li_width">
	<span class="text_left"> 课题所属专业：</span>
	<span class="text_right" title="">${requestScope.GDInfo.subjectaffiliation}</span>
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
	<!-- 如果用户没有上传毕业论文信息则显示相关的表单 -->	
	<c:if test="${not empty requestScope.bylwinfo}">
	<form enctype="multipart/form-data" id="bylwForm">
	<ul>	
	<li>    	    
	    <input type="hidden" name="graduationdesignid" id="graduationdesignid" value="${requestScope.GDInfo.graduationdesignid}">
	    <input type="hidden" name="bylwinfoid" id="bylwinfoid" value="${requestScope.bylwinfo.bylwinfoid}">	   	    
	     <span class="start"></span><strong class="text">毕业论文</strong>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="gjcTitle">关键词 共输入 <span id="gjczs" class="zs"></span>个字符</span><span class="title3">多个关键词用分号（；）隔开</span>
	</li>
	<li>
		<input type="text" name="gjc" id="gjc" style="width:800px" class="form-control textinline" value="${requestScope.bylwinfo.gjc}" readonly disabled/>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="cxdTitle">创新点 共输入 <span id="cxdzs" class="zs"></span>个字符</span><span class="title3">请在下方的输入框内填写创新点内容，若无内容请填写“无”</span>
	</li>
	<li>
		<textarea rows="5" cols="100" id="cxd" name="cxd" class="has-error" style="resize: none;" class="form-control textinline" readonly disabled>${requestScope.bylwinfo.gjc}</textarea>
		<span class="help-block" style="display:inline"></span>
	</li>	
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="zwzyTitle">中文摘要 共输入 <span id="zwzyzs" class="zs"></span>个字符</span><span class="title3">请在下方的输入框内填写中文摘要内容，若无内容请填写“无”</span>
	</li>
	<li>
		<textarea rows="5" cols="100" id="zwzy" name="zwzy" class="has-error" style="resize: none;" class="form-control textinline"  readonly disabled>${requestScope.bylwinfo.zwzy}</textarea>
		<span class="help-block" style="display:inline"></span>
	</li>	
		<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="ywzyTitle">英文摘要 共输入 <span id="ywzyzs" class="zs"></span>个字符</span><span class="title3">请在下方的输入框内填写中文摘要内容，若无内容请填写“无”</span>
	</li>
	<li>
		<textarea rows="5" cols="100" id="ywzy" name="ywzy" class="has-error" style="resize: none;" class="form-control textinline"  readonly disabled>${requestScope.bylwinfo.ywzy}</textarea>	    
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="qtTitle">其他 共输入   <span id="qtzs" class="zs"></span>个字符</span><span class="title3">  如果没有其他内容，请填写“无”</span>
	</li>	
	<li>
	        <textarea rows="3" cols="100" id="qt" name="qt" class="has-error" style="resize: none;" readonly disabled>${requestScope.bylwinfo.qt}</textarea>	        
	        <span class="help-block" style="display:inline"></span>
	</li>													
	<li>				
			<span class="glyphicon glyphicon-play"></span>	
	        <span class="title2">毕业论文附件：</span>
	        <span>${requestScope.bylwinfo.bylwfjname}</span>
	        <span><a href="download?path=${requestScope.bylwinfo.bylwfjpath}&fileName=${requestScope.bylwinfo.bylwfjname}">下载文件</a></span>
	</li>													
	<li>				
			<span class="glyphicon glyphicon-play"></span>	
	        <span class="title2">除毕业论文外其他附件：</span>
	        <span>${requestScope.bylwinfo.qtfjname}</span>
	        <span><a href="download?path=${requestScope.bylwinfo.qtfjpath}&fileName=${requestScope.bylwinfo.qtfjname}">下载文件</a></span>
	</li>		
	<c:if test="${not empty requestScope.GDResultInfo.bylwinstructoropinion}">
	<!-- 毕业论文审核情况 -->
	<li>
		<span class="start"></span><strong class="text">毕业论文审核情况</strong>
	</li>
	<li>
		<table class="tablestyle" border="1">
		<c:if test="${not empty requestScope.GDResultInfo.bylwinstructoropinion}">
			<tr>
				<td rowspan="2" width="10%">
				指导教师审核意见
				</td>
				<td>
				<p class="txt_left_top">审核状态：${requestScope.GDResultInfo.bylwinstructoropinion}</p>
				</td>			
			</tr>
			<tr>
				<td>
				<p class="txt_left_top">审核意见：${requestScope.GDResultInfo.bylwinstructordetailopinion}</p>
				<p class="txt_right_bottom">审核人：${requestScope.GDResultInfo.bylwinstructorshr}&nbsp;&nbsp;&nbsp;&nbsp;审核时间：${requestScope.GDResultInfo.bylwinstructordeclaretime}</p>
				</td>		
			</tr>		
		</c:if>	
		<c:if test="${not empty requestScope.GDResultInfo.bylwexpertopinion}">	
		<tr>
				<td rowspan="2" width="10%">
				专业负责人审核意见
				</td>
				<td>
				<p class="txt_left_top">审核状态：${requestScope.GDResultInfo.bylwexpertopinion}</p>
				</td>			
			</tr>
			<tr>
				<td>
				<p class="txt_left_top">审核意见：${requestScope.GDResultInfo.bylwexpertdetailopinion}</p>
				<p class="txt_right_bottom">审核人：${requestScope.GDResultInfo.bylwexpertshr}&nbsp;&nbsp;&nbsp;&nbsp;审核时间：${requestScope.GDResultInfo.bylwexpertdeclaretime}</p>
				</td>		
			</tr>	
			</c:if>			
		</table>
		</li>
	</c:if>												
	<li>	        
			<input type="hidden" value="${requestScope.bylwinfo.bylwinfoid}" name="bylwinfoid"> 
	        <input type="button" value="返回" class="btn btn-primary" id="returnBtn">
	</li>	        
</ul>	        
    	</form>
    </c:if>
	</ul>
	</c:if>	
</body>
</html>