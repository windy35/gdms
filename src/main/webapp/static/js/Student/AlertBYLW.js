var totalRecord;		//总记录数
var current_pageNum;	//当前页面

//获取字数
$(function(){	
	if(document.getElementById("gjc") != null){
		var gjcZs = document.getElementById("gjc").value.length;
		$("#gjczs").append(gjcZs);
	$('#gjc').bind('input',function(){  
		gjcZs = document.getElementById("gjc").value.length;
		$("#gjczs").empty();
		$("#gjczs").append(gjcZs);
		});		
	}
	if(document.getElementById("cxd") != null){
		var cxdZs = document.getElementById("cxd").value.length;
		$("#cxdzs").append(cxdZs);
	$('#cxd').bind('input',function(){  
		cxdZs = document.getElementById("cxd").value.length;
		$("#cxdzs").empty();
		$("#cxdzs").append(cxdZs);
		});		
	}
	if(document.getElementById("zwzy") != null){
		var zwzyZs = document.getElementById("zwzy").value.length;
		$("#zwzyzs").append(zwzyZs);
	$('#zwzy').bind('input',function(){  
		zwzyZs = document.getElementById("zwzy").value.length;
		$("#zwzyzs").empty();
		$("#zwzyzs").append(zwzyZs);
		});		
	}		
	if(document.getElementById("ywzy") != null){
		var ywzyZs = document.getElementById("ywzy").value.length;
		$("#ywzyzs").append(ywzyZs);
	$('#ywzy').bind('input',function(){  
		ywzyZs = document.getElementById("ywzy").value.length;
		$("#ywzyzs").empty();
		$("#ywzyzs").append(ywzyZs);
		});		
	}	
	if(document.getElementById("qt") != null){
		var qtZs = document.getElementById("qt").value.length;
		$("#qtzs").append(qtZs);
	$('#qt').bind('input',function(){  
		qtZs = document.getElementById("qt").value.length;
		$("#qtzs").empty();
		$("#qtzs").append(qtZs);
		});		
	}	
	//返回按钮
	$("#returnBtn").click(function(){
		window.location.href="JumpUploadBYLWPage"
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

//点击上传文件按钮所触发的函数
$(function(){
	$("#submitBtn").click(function(){
		reset_form("#bylwForm");
		var formData = new FormData(document.getElementById("setNoticeForm")); 
		$.ajax({
			url:"STUalertBYLW",
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 			
			success:function(result){
				if(result.code == 100){
					alert("修改成功！");
					window.location.href="JumpUploadBYLWPage";					
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#gjc","error",result.extend.error_Msg[0]);
						window.location.href="#gjcTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#cxd","error",result.extend.error_Msg[1]);
						window.location.href="#cxdTitle"
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#zwzy","error",result.extend.error_Msg[2]);
						window.location.href="#zwzyTitle"
					}else if(result.extend.error_Msg[3] != null){
						show_validate_msg("#ywzy","error",result.extend.error_Msg[3]);
						window.location.href="#ywzyTitle"
					}else if(result.extend.error_Msg[4] != null){
						show_validate_msg("#qt","error",result.extend.error_Msg[4]);
						window.location.href="#qtTitle"
					}
				}
			}
			});
	});
});