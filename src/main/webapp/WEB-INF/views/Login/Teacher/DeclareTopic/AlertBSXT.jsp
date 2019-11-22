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
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/AlertBSXT.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>（教师）修改毕设选题</title>
</head>
<body>
<span class="HeadTitle">（教师）修改毕设选题</span>
				<ul>
				<li>
						<!-- 毕设编号,用于进行修改操作 -->
						<input type="hidden" value="${requestScope.GDInfo.graduationdesignid}" id="gdidhide">
						<!-- 毕设结果编号,用于进行修改操作 -->
						<input type="hidden" value="${requestScope.GDResultInfo.graduationdesignresultid}" id="gdresultidhide">						
						<span>毕设题目：</span>
						 ${requestScope.GDInfo.title}
				</li>						 
				<li>											 
						<span>所属院系：</span>	
						<span>${requestScope.GDInfo.department.departmentname}</span>
				</li>						 
				<li>						
						<span>所属专业：</span>
						<span>${requestScope.GDInfo.subjectaffiliation}</span>						 
				</li>						 
				<li>				
						<span>题目类型：</span>
						<input type="hidden" value="${requestScope.GDInfo.typeid}" id="tmlxhide"/>
						<select id="tmlx">
						</select>
						<span class="help-block" style="display:inline"></span>
				</li>						 
				<li>					
						<span>题目来源：</span>
						<input type="hidden" value="${requestScope.GDInfo.titlesourceid}" id="tmlyhide"/>
						<select id="tmly"></select>
						<span class="help-block" style="display:inline"></span>
				</li>						 
				<li>										
						<span>导师编号及姓名：</span>
						(${requestScope.GDInfo.instructor.teacherid})${requestScope.GDInfo.instructor.name}									
				</li>						 
				<li>													
						<span>课题内容介绍：已输入<span id="ktnrzs" class="zs"></span>个字符</span>
				</li>						 
				<li>						
						<textarea rows="5" cols="80" id="ktnr" style="resize: none;">${requestScope.GDInfo.gdintroduction}</textarea>
						<span class="help-block" style="display:inline"></span>		
				</li>						 
				<li>									
						<span>毕业设计(论文)任务要求（包括应具备的条件）：已输入<span id="rwyqzs" class="zs"></span>个字符</span>
				</li>						 
				<li>						
						<textarea rows="5" cols="80"  id="rwyq" style="resize: none">${requestScope.GDInfo.gdtask}</textarea>
						<span class="help-block" style="display:inline"></span>
				</li>						 
				<li>									
						<input type="hidden" value="${requestScope.GDInfo.workload}" id="gzlhide"/>			
						<div id="gzldiv">							
						<span>选题预计工作量大小：</span>
						<input type="radio" name="gzl" value="大">大
						<input type="radio" name="gzl" value="适中">适中
						<input type="radio" name="gzl" value="小">小
						</div>
				</li>						 
				<li>		
						<div id="nddiv">								
						<input type="hidden" value="${requestScope.GDInfo.complexity}" id="ndhide"/>
						<span>选题预计难易程度：</span>
						<input type="radio" name="nd" value="难">难
						<input type="radio" name="nd" value="一般">一般
						<input type="radio" name="nd" value="易">易
						</div>				
				</li>						 
				<li>										
						<span>预计完成工作量所需学生数：</span>
						<input type="hidden" value="${requestScope.GDInfo.requirestudentcount}" id="xsshide"/>
<!-- 						<select id="xss">
						</select>		 -->
						${requestScope.GDInfo.requirestudentcount}		
						<span class="help-block" style="display:inline"></span>		
				</li>						 
				</ul>
	<button class="btn btn-primary" id="AlertGDBtn">修改选题</button>
	<input type="button" value="返回" class="btn btn-primary" id="returnBtn">
</body>
</html>