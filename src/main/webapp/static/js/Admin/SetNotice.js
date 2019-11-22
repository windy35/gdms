$(function(){
	//获取字数
	if(document.getElementById("noticecontent") != null){
		var noticecontentZs = document.getElementById("noticecontent").value.length;
		$("#noticecontentzs").append(noticecontentZs);
	$('#noticecontent').bind('input',function(){  
		noticecontentZs = document.getElementById("noticecontent").value.length;
		$("#noticecontentzs").empty();
		$("#noticecontentzs").append(noticecontentZs);
		});		
	}	
	
	$("#submitBtn").click(function(){
		reset_form("#setNoticeForm");
		var formData = new FormData(document.getElementById("setNoticeForm")); 
		$.ajax({
			url:"submitNotice",
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 			
			success:function(result){
				if(result.code == 100){
					alert("发布成功！");
					window.location.href="SetNotice";
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#noticetitle","error",result.extend.error_Msg[0]);
						window.location.href="#noticetitleTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#noticecontent","error",result.extend.error_Msg[1]);
						window.location.href="#noticecontentTitle"
					}
				}
			}
			});
	})
})

//用于显示控件的提示信息
//ele控件元素，status控件检验用户输入的状态，msg需要显示的提示信息
function show_validate_msg(ele,status,msg){
	//清楚元素校验状态
	$(ele).parent().removeClass("has-success has-error");
	$(ele).next("span").text("");
	
	if("success" == status){
		$(ele).parent().addClass("has-success");
		$(ele).next("span").text(msg);
	}else if("error" == status){
		$(ele).parent().addClass("has-error");
		$(ele).next("span").text(msg);
	}
}

//清空表单样式及内容
function reset_form(ele){
	//重置表单样式
	$(ele).find("*").removeClass("has-error has-success");
	$(ele).find(".help-block").text("");	
}