var totalRecord;		//总记录数
var current_pageNum;	//当前页面

//获取字数
$(function(){	
	if(document.getElementById("title") != null){
		var titleZs = document.getElementById("title").value.length;
		$("#titlezs").append(titleZs);
	$('#title').bind('input',function(){  
		titleZs = document.getElementById("title").value.length;
		$("#titlezs").empty();
		$("#titlezs").append(titleZs);
		});		
	}
	if(document.getElementById("nrzy") != null){
		var nrzyZs = document.getElementById("nrzy").value.length;
		$("#nrzyzs").append(nrzyZs);
	$('#nrzy').bind('input',function(){  
		nrzyZs = document.getElementById("nrzy").value.length;
		$("#nrzyzs").empty();
		$("#nrzyzs").append(nrzyZs);
		});		
	}
	$("#returnBtn").click(function(){
		window.history.back();
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
		reset_form("#dbpptForm");
		var formData = new FormData(document.getElementById("dbpptForm")); 
		$.ajax({
			url:"STUalertDBPPT",
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 			
			success:function(result){
				if(result.code == 100){
					alert("修改成功！");
					window.location.href="JumpUploadDBPPTPage";
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#title","error",result.extend.error_Msg[0]);
						window.location.href="#titleTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#nrzy","error",result.extend.error_Msg[1]);
						window.location.href="#nrzyTitle"
					}
				}
			}
			});
	});
});