var totalRecord;		//总记录数
var current_pageNum;	//当前页面

//获取字数
$(function(){	
	if(document.getElementById("zygz") != null){
		var zygzZs = document.getElementById("zygz").value.length;
		$("#zygzzs").append(zygzZs);
	$('#zygz').bind('input',function(){  
		zygzZs = document.getElementById("zygz").value.length;
		$("#zygzzs").empty();
		$("#zygzzs").append(zygzZs);
		});		
	}
	$("#returnBtn").click(function(){
		window.location.href="JumpUploadZDJLPage";
	})
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

//点击上传文件按钮所触发的函数
$(function(){
	$("#submitBtn").click(function(){
		reset_form("#zdjlForm");
		var formData = new FormData(document.getElementById("zdjlForm")); 
		$.ajax({
			url:"STUalertZDJL",
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 			
			success:function(result){
				if(result.code == 100){
					alert("修改成功！");
					window.location.href="JumpUploadZDJLPage";
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#title","error",result.extend.error_Msg[0]);
						window.location.href="#titleTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#zdsj","error",result.extend.error_Msg[1]);
						window.location.href="#zdsjTitle"
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#zygz","error",result.extend.error_Msg[2]);
						window.location.href="#zygzTitle"
					}
				}
			}
			});
	});
});