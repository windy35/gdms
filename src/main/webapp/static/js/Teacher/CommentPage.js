$(function(){
	//获取字数
	if(document.getElementById("plnr") != null){
		var plnrZs = document.getElementById("plnr").value.length;
		$("#plnrzs").append(plnrZs);
	$('#plnr').bind('input',function(){  
		plnrZs = document.getElementById("plnr").value.length;
		$("#plnrzs").empty();
		$("#plnrzs").append(plnrZs);
		});		
	}	
	//返回按钮
	$("#returnBtn").click(function(){
		window.location.href="JumpMessageInteractionPage";
	})
})

$(document).ready(function(){

		$('body').on("click",'.heart',function(){
			
			var commentid = $(this).next().val();
			var likeCount=parseInt($("#"+commentid).html());
			$(this).css("background-position","")
			var Status=$(this).attr("rel");
		   
			//点赞触发的事件
			if(Status === 'like') {      
				$.ajax({
					url:"TeacherZanComment",
					async:false,
					data:{"commentid":commentid},
					type:"POST",
					success:function(result){
						}
					});
				$("#"+commentid).html(likeCount+1);
				$(this).addClass("heartAnimation").attr("rel","unlike");
			}
			//取消赞触发的事件
			else{
				$.ajax({
					url:"TeacherCancelZanComment",
					async:false,
					data:{"commentid":commentid},
					type:"POST",
					success:function(result){				
							}
					});
				$("#"+commentid).html(likeCount-1);
				$(this).removeClass("heartAnimation").attr("rel","like");
				$(this).css("background-position","left");				
			}
		});

	});		

//点击评论按钮所触发的函数
$(function(){
	$("#submitBtn").click(function(){
		reset_form("#plForm");
		var plnr = document.getElementById("plnr").value; 
		var pn = document.getElementById("pn").value;
		var titleid = document.getElementById("titleid").value;
		$.ajax({
			url:"submitComment",
			data:{"plnr":plnr,"titleid":titleid},
			type:"POST",
			success:function(result){
				if(result.code == 100){
					alert("评论成功！");
					window.location.href="JumpCommentPage?titleid="+ titleid + "&pn=" + pn;
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#plnr","error",result.extend.error_Msg[0]);
						window.location.href="#plnrTitle"
					}
				}
			}
			});
	});
});

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
