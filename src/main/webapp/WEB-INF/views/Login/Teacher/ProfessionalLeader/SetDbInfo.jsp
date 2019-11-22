<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%pageContext.setAttribute("APP_PATH",request.getContextPath());%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入JQuery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.9.1.js"></script>
<!-- 引入bootstrap -->
<script type="text/javascript" src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<!-- 引入bootstrap的日期控件 -->
<link href="${APP_PATH}/static/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />  
<script src="${APP_PATH}/static/bootstrap-datetimepicker/js/moment-with-locales.min.js"></script>  
<script src="${APP_PATH}/static/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script> 

<!-- 自定义JS文件 -->
<script type="text/javascript" src="${APP_PATH}/static/js/Teacher/SetDbInfo.js"></script>
<!-- 自定义CSS文件 -->
<link href="${APP_PATH}/static/css/text.css" rel="stylesheet">
<link href="${APP_PATH}/static/css/form.css" rel="stylesheet">
<title>设置答辩安排信息</title>
</head>
<body>
<span class="HeadTitle">设置答辩安排信息</span>
<form id="dbForm">
<ul>
<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="studentidTitle">答辩学生：</span>		
</li>
<li>
	<select id="studentid" name="studentid">
	</select>
	<span class="help-block" style="display:inline"></span>
</li>
<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="dbtimeTitle">答辩时间：</span>		
</li>
<li>
      <!--指定 date标记-->  
      <div class='input-group date' id="datetimepicker">
          <input type="text" name="dbtime" id="dbtime" class="form-control textinline"/>
          <span class="input-group-addon">  
              <span class="glyphicon glyphicon-calendar"></span>  
          </span>  
      </div>  
</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="dbplaceTitle">答辩地点：</span>
	</li>
	<li>
		<input type="text" name="dbplace" id="dbplace" style="width:800px" class="form-control textinline" value="${requestScope.dbpptinfo.title}"/>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="pwzzxxTitle">评委组长信息：</span>
	</li>
	<li>
		<%-- <input type="text" name="pwzzxx" id="pwzzxx" style="width:800px" class="form-control textinline" value="${requestScope.dbpptinfo.title}"/> --%>
		<select id="pwzzxx" name="pwzzxx">
		</select>
		<span class="help-block" style="display:inline"></span>
	</li>
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="drpwxxTitle">第二评委信息：</span>
	</li>
	<li>
		<%-- <input type="text" name="drpwxx" id="drpwxx" style="width:800px" class="form-control textinline" value="${requestScope.dbpptinfo.title}"/> --%>
		<select id="drpwxx" name="drpwxx">
		</select>
		<span class="help-block" style="display:inline"></span>
	</li>	
	<li>
		<span class="glyphicon glyphicon-play"></span>
		<span class="title2" id="msxxTitle">秘书信息：</span>
	</li>
	<li>
		<%-- <input type="text" name="msxx" id="msxx" style="width:800px" class="form-control textinline" value="${requestScope.dbpptinfo.title}"/> --%>
		<select id="msxx" name="msxx">
		</select>
		<span class="help-block" style="display:inline"></span>
	</li>		
	<li>
	        <input type="button" value="设置" class="btn btn-primary" id="submitBtn">
	        <!-- <input type="checkbox" id="dxtx">同时发送短信通知提醒 -->
	</li>	
</ul>
</form>
</body>
</html>