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
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/DeclareBSXT.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">

<title>（教师）修改毕设信息</title>
</head>
<body>
<span class="HeadTitle">（教师）申报毕设选题</span>
				<ul>
					<li>
						<span class="glyphicon glyphicon-play"></span>
						<span id="bsxtTitle">毕设题目：已输入<span id="bstmzs" class="zs"></span>个字符</span>
					</li>
					<li>
						 <input type="text" id="bstm"  style="width:500px;"/>
						 <span class="help-block" style="display:inline"></span>
					</li>
					<li>
						<span class="glyphicon glyphicon-play"></span>											 
						<span>所属院系：</span>	
						<span>${sessionScope.user.department.departmentname}</span>
					</li>
					<li>
						<span class="glyphicon glyphicon-play"></span>											
						<span id="sszyTitle">所属专业：</span>
						<select id="sszy"></select>
						<span class="help-block" style="display:inline"></span>												 
					</li>
					<li>
						<span class="glyphicon glyphicon-play"></span>									
						<span id="tmlxTitle">题目类型：</span>
						<select id="tmlx"></select>
						<span class="help-block" style="display:inline"></span>
					</li>
					<li>		
						<span class="glyphicon glyphicon-play"></span>										
						<span id="tmlyTitle">题目来源：</span>
						<select id="tmly"></select>
						<span class="help-block" style="display:inline"></span>
					</li>
					<li>		
						<span class="glyphicon glyphicon-play"></span>													
						<span>导师编号及姓名：</span>
						(${sessionScope.user.teacherid})${sessionScope.user.name}
						<span class="help-block" style="display:inline"></span>							
					</li>
					<li>
						<span class="glyphicon glyphicon-play"></span>					
						<span id="ktnrTitle">课题内容介绍：已输入<span id="ktnrzs" class="zs"></span>个字符</span>
					</li>
					<li>											
						<textarea rows="5" cols="80" id="ktnr" style="resize: none"></textarea>
						<span class="help-block" style="display:inline"></span>
					</li>
					<li>		
						<span class="glyphicon glyphicon-play"></span>											
						<span id="rwyqTitle">毕业设计(论文)任务要求（包括应具备的条件）：已输入<span id="rwyqzs" class="zs"></span>个字符</span>
					</li>
					<li>						
						<textarea rows="5" cols="80"  id="rwyq" style="resize: none"></textarea>
						<span class="help-block" style="display:inline"></span>
					</li>
					<li>
						<div id="gzldiv">
						<span class="glyphicon glyphicon-play"></span>													
						<span>选题预计工作量大小：</span>
						<input type="radio" name="gzl" value="大">大
						<input type="radio" name="gzl" value="适中">适中
						<input type="radio" name="gzl" value="小" checked>小
						</div>
					</li>
					<li>
						<div id="nddiv">
						<span class="glyphicon glyphicon-play"></span>						
						<span>选题预计难易程度：</span>
						<input type="radio" name="nd" value="难">难
						<input type="radio" name="nd" value="一般">一般
						<input type="radio" name="nd" value="易" checked>易
						</div>
					</li>
					<li>						
						<span class="glyphicon glyphicon-play"></span>					
						<span id="xssTitle">预计完成工作量所需学生数：</span>
						<select id="xss">
							<option value="0">请选择</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
						</select>							
						<span class="help-block" style="display:inline"></span>
					</li>			
</ul>				
	<div class="returndiv">
	<button class="btn btn-primary" id="DeclareGDBtn">申报选题</button>
	<input type="button" value="返回" class="btn btn-primary" id="returnBtn">
	</div>	
</body>
</html>