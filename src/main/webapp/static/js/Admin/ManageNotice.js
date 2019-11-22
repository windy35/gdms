$(function(){
	
	$(".deletebtn").click(function(){
	if(confirm("真的要删除编号为[ " + $(this).attr("name") + " ]的通知信息吗?")){				
		$.ajax({
			url:"DeleteNoticeInfoById",
			data:{"noticeid":$(this).attr("name")},
			type:"POST",
			success:function(result){
				window.location.href="JumpManageNotice";
			}
			});
	}
	})
})
