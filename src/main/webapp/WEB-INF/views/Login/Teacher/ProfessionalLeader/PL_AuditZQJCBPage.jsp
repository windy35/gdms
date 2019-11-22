<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>（专业负责人）审核中期检查表</title>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/PL_AuditZQJCB.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/js/ZQJCBDetailInfo.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">
</head>
<body>
<c:if test="${not empty requestScope.GDInfo}">
<span class="HeadTitle">（专业负责人）审核中期检查表</span>
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
	<!-- 如果用户没有上传中期检查表信息则显示相关的表单 -->	
	<c:if test="${not empty requestScope.zqjcbinfo}">
	<ul>	
	<li>    	    
	    <input type="hidden" name="graduationdesignid" id="graduationdesignid" value="${requestScope.GDInfo.graduationdesignid}">
	    <input type="hidden" name="zqjcinfoid" id="zqjcinfoid" value="${requestScope.zqjcbinfo.zqjcinfoid}">	   	    
	     <span class="start"></span><strong class="text">中期检查</strong>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="qzrqTitle">毕业设计（论文）起止日期 共输入 <span id="qzrqzs" class="zs"></span>个字符</span>
	</li>
	<li>
		<input type="text" name="qzrq" id="qzrq" value="${requestScope.zqjcbinfo.qzrq}" style="width:800px" class="form-control textinline" readonly/>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="xtbhDivTitle">选题是否有变化</span>
	</li>
	<li>
		<div id="xtbhDiv" class="textinline">		
		<input type="hidden" value="${requestScope.zqjcbinfo.xtbh}" id="xtbh"/>
		<input type="radio" name="xtbh" value="是"/>是
		<input type="radio" name="xtbh" value="否"/>否
		</div>
		<span class="help-block" style="display:inline"></span>		
	</li>	
	<li>
		<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>	
		<span class="title2" id="xtbhyyTitle">如选题有变化，请填写原因 共输入 <span id="xtbhyyzs" class="zs"></span>个字符</span>
	</li>	
	<li>
	        <textarea rows="10" cols="80" id="xtbhyy" name="xtbhyy" class="has-error" style="resize: none;" class="form-control textinline" readonly>${requestScope.zqjcbinfo.xtbhyy}</textarea>
	        <span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="sfyrytDivTitle">是否一人一题</span>
	</li>
	<li>
		<div id="sfyrytDiv" class="textinline">
		<input type="hidden" value="${requestScope.zqjcbinfo.sfyryt}" id="sfyryt"/>		
		<input type="radio" name="sfyryt" value="是"/>是
		<input type="radio" name="sfyryt" value="否"/>否		
		</div>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="sfktbgDivTitle">是否有开题报告</span>
	</li>
	<li>
		<div id="sfktbgDiv" class="textinline">
		<input type="hidden" value="${requestScope.zqjcbinfo.sfktbg}" id="sfktbg"/>					
		<input type="radio" name="sfktbg" value="是"/>是
		<input type="radio" name="sfktbg" value="否"/>否
		</div>
		<span class="help-block" style="display:inline"></span>		
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="sfwxzsDivTitle">是否有文献综述</span>
	</li>		
	<li>
		<div id="sfwxzsDiv" class="textinline">
		<input type="hidden" value="${requestScope.zqjcbinfo.sfwxzs}" id="sfwxzs"/>		
		<input type="radio" name="sfwxzs" value="是"/>是
		<input type="radio" name="sfwxzs" value="否"/>否
		</div>
		<span class="help-block" style="display:inline"></span>		
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="jdqkDivTitle">毕业设计（论文）进度情况</span>
	</li>		
	<li>
		<div id="jdqkDiv" class="textinline">
		<input type="hidden" value="${requestScope.zqjcbinfo.jdqk}" id="jdqk"/>		
		<input type="radio" name="jdqk" value="提前完成"/>提前完成
		<input type="radio" name="jdqk" value="正常进行"/>正常进行
		<input type="radio" name="jdqk" value="延期滞后"/>延期滞后
		</div>
		<span class="help-block" style="display:inline"></span>		
	</li>
	<li>
		<span class="glyphicon glyphicon-play" style="padding-left:10px"></span>	
		<span class="title2" id="jdzhyyTitle">若选择“延期滞后”，请填写原因 共输入  <span id="jdzhyyzs" class="zs"></span>个字符</span>
	</li>	
	<li>
	        <textarea rows="10" cols="80" id="jdzhyy" name="jdzhyy" class="has-error" style="resize: none;" readonly>${requestScope.zqjcbinfo.jdzhyy}</textarea>
	        <span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="gzztqkDivTitle">工作态度情况（学生对毕业设计（论文）的认真程度、纪律及出勤情况）</span>
	</li>		
	<li>
		<div id="gzztqkDiv" class="textinline">
		<input type="hidden" value="${requestScope.zqjcbinfo.gzztqk}" id="gzztqk"/>			
		<input type="radio" name="gzztqk" value="认真"/>认真
		<input type="radio" name="gzztqk" value="较认真"/>较认真
		<input type="radio" name="gzztqk" value="一般"/>一般
		<input type="radio" name="gzztqk" value="不认真"/>不认真		
		</div>
		<span class="help-block" style="display:inline"></span>		
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="cywxzlnlDivTitle">查阅文献资料的能力</span>
	</li>		
	<li>
		<div id="cywxzlnlDiv" class="textinline">
		<input type="hidden" value="${requestScope.zqjcbinfo.cywxzlnl}" id="cywxzlnl"/>				
		<input type="radio" name="cywxzlnl" value="强"/>强
		<input type="radio" name="cywxzlnl" value="较强"/>较强
		<input type="radio" name="cywxzlnl" value="一般"/>一般
		<input type="radio" name="cywxzlnl" value="差"/>差		
		</div>
		<span class="help-block" style="display:inline"></span>		
	</li>	
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="zqzlpjDivTitle">中期质量评价（学生已完成部分的工作质量情况）</span>
	</li>		
	<li>
		<div id="zqzlpjDiv" class="textinline">		
		<input type="hidden" value="${requestScope.zqjcbinfo.zqzlpj}" id="zqzlpj"/>		
		<input type="radio" name="zqzlpj" value="好"/>好
		<input type="radio" name="zqzlpj" value="中"/>中
		<input type="radio" name="zqzlpj" value="差"/>差		
		</div>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="bylwnrtzDivTitle">毕业设计（论文）的内容有无调整</span>
	</li>		
	<li>
		<div id="bylwnrtzDiv" class="textinline">
		<input type="hidden" value="${requestScope.zqjcbinfo.bylwnrtz}" id="bylwnrtz"/>				
		<input type="radio" name="bylwnrtz" value="有"/>有
		<input type="radio" name="bylwnrtz" value="无"/>无	
		</div>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="zdcsTitle">指导教师对学生的指导次数 共输入   <span id="zdcszs" class="zs"></span>个字符</span>
	</li>	
	<li>
			<input type="text" class="has-error" id="zdcs" name="zdcs" value="${requestScope.zqjcbinfo.zdcs}" readonly>
	        <span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="aqwcDivTitle">对能否按期完成毕业设计（论文）的评估</span>
	</li>		
	<li>
		<div id="aqwcDiv" class="textinline">		
		<input type="hidden" value="${requestScope.zqjcbinfo.aqwc}" id="aqwc"/>
		<input type="radio" name="aqwc" value="能"/>能
		<input type="radio" name="aqwc" value="否"/>否
		</div>
		<span class="help-block" style="display:inline"></span>
	</li>		
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="ysclDivTitle">对能否按期完成毕业设计（论文）的评估</span>
	</li>		
	<li>
		<div id="ysclDiv" class="textinline">		
		<input type="hidden" value="${requestScope.zqjcbinfo.yscl}" id="yscl"/>		
		<input type="radio" name="yscl" value="是"/>是
		<input type="radio" name="yscl" value="否"/>否		
		</div>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>	
		<span class="title2" id="qtTitle">其他 共输入   <span id="qtzs" class="zs"></span>个字符</span><span class="title3">  如果没有其他内容，请填写“无”</span>
	</li>	
	<li>
	        <textarea rows="10" cols="80" id="qt" name="qt" class="has-error" style="resize: none;" readonly>${requestScope.zqjcbinfo.qt}</textarea>
	        <span class="help-block" style="display:inline"></span>
	</li>				
	<c:if test="${not empty requestScope.zqjcbinfo.fjname}">											
	<li>				
			<span class="glyphicon glyphicon-play"></span>	
	        <span class="title2">附件：</span>
	</li>													
	<li>	  	        
	        <span>${requestScope.zqjcbinfo.fjname}</span>
	        <span><a href="">下载文件</a></span>
	</li>
	</c:if>
	<c:if test="${empty requestScope.GDResultInfo.zqjcbinstructoropinion}">
		<li>
			<span class="start"></span><strong class="text">中期检查表审核情况</strong>		
		</li>
		<li>
<form id="AuditZQJCBForm">
	<table class="tablestyle" border="1" id="SHQK">
		<tr>
			<td rowspan="2" width="10%">
			指导教师审核意见
			</td>
			<td>
			<p class="txt_left_top">审核状态：${requestScope.gdresult.zqjcbinstructoropinion}</p>
			</td>			
		</tr>
		<tr>
			<td>
			<p class="txt_left_top">审核意见：${requestScope.gdresult.zqjcbinstructordetailopinion}</p>
			<p class="txt_right_bottom">审核人：${requestScope.gdresult.zqjcbinstructorshr}&nbsp;&nbsp;&nbsp;&nbsp;审核时间：${requestScope.gdresult.zqjcbinstructordeclaretime}</p>
			</td>		
		</tr>		
	<tr>
	<td rowspan="2" width="10%">
			专业负责人审核意见：
	</td>
	<td>
			中期检查表审核意见：
			<select id="zqjcbexpertopinion" name="zqjcbexpertopinion">
			<option value="请选择">请选择</option>
			<option value="同意">同意</option>
			<option value="不同意">不同意</option>
			</select>
			<span class="help-block" style="display:inline"></span>						
	</td>
	</tr>
	<tr>
	<td>
			<span>专业负责人中期检查表审核详细意见：已输入<span id="zqjcbexpertdetailopinionzs" class="zs"></span>个字符</span>
			<br>
			<textarea rows="5" cols="80"  id="zqjcbexpertdetailopinion" style="resize: none;" name="zqjcbexpertdetailopinion"></textarea>
			<span class="help-block" style="display:inline"></span>		
	</td>	
	</tr>
	<tr>
	<td colspan="2">
		<input type="hidden" value="${requestScope.gdresultID}" id="graduationdesignresultid" name="graduationdesignresultid">
		<input type="hidden" value="${requestScope.GDInfo.graduationdesignid}" id="graduationdesignid" name="graduationdesignid">
		<input class="btn btn-primary" id="AuditGDBtn" type="button" value="提交"/>
		<input type="button" value="返回" class="btn btn-primary" id="ReturnBtn">	
	</td>
	</tr>	
	</table>
	</form>				
		</li>		
	</c:if>	
</ul>	        
    </c:if>

	</ul>
	</c:if>	
</body>
</html>