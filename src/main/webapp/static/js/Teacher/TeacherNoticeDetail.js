$(function(){
//点击返回更多通知按钮触发的函数
$("#returnMoreDetailBtn").click(function(){
	window.location.href="StuJumpNoticePage";
})	
	var noticecontent = $("#noticecontentHidden").val();
	//替换所有的换行符
	noticecontent = noticecontent.replace(/\r\n/g,"<br>")
	noticecontent = noticecontent.replace(/\n/g,"<br>");
	 
	//替换所有的空格（中文空格、英文空格都会被替换）
	noticecontent = noticecontent.replace(/\s/g,"&nbsp;");
	
	$("#noticecontent").append(noticecontent);	
});