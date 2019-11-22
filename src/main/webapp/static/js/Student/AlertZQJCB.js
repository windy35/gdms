$(function(){
	//返回按钮
	$("#returnBtn").click(function(){
		window.location.href="JumpUploadZQJCBPage";
	})
	//获取字数信息
	if(document.getElementById("qzrq") != null){
		var qzrqZs = document.getElementById("qzrq").value.length;
		$("#qzrqzs").append(qzrqZs);
	$('#qzrq').bind('input',function(){  
		qzrqZs = document.getElementById("qzrq").value.length;
		$("#qzrqzs").empty();
		$("#qzrqzs").append(qzrqZs);
		});		
	}
	if(document.getElementById("xtbhyy") != null){
		var xtbhyyZs = document.getElementById("xtbhyy").value.length;
		$("#xtbhyyzs").append(xtbhyyZs);
	$('#xtbhyy').bind('input',function(){  
		xtbhyyZs = document.getElementById("xtbhyy").value.length;
		$("#xtbhyyzs").empty();
		$("#xtbhyyzs").append(xtbhyyZs);
		});		
	}
	if(document.getElementById("jdzhyy") != null){
		var jdzhyyZs = document.getElementById("jdzhyy").value.length;
		$("#jdzhyyzs").append(jdzhyyZs);
	$('#jdzhyy').bind('input',function(){  
		jdzhyyZs = document.getElementById("jdzhyy").value.length;
		$("#jdzhyyzs").empty();
		$("#jdzhyyzs").append(jdzhyyZs);
		});		
	}	
	if(document.getElementById("zdcs") != null){
		var zdcsZs = document.getElementById("zdcs").value.length;
		$("#zdcszs").append(zdcsZs);
	$('#zdcs').bind('input',function(){  
		zdcsZs = document.getElementById("zdcs").value.length;
		$("#zdcszs").empty();
		$("#zdcszs").append(zdcsZs);
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
    
	//获取单选按钮初始状态
	$("input[name=xtbh]").each(function () {
		if(this.value == document.getElementById("xtbh").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=sfyryt]").each(function () {
		if(this.value == document.getElementById("sfyryt").value){
			$(this).attr("checked","checked"); 
		}
	});	
	$("input[name=sfktbg]").each(function () {
		if(this.value == document.getElementById("sfktbg").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=sfwxzs]").each(function () {
		if(this.value == document.getElementById("sfwxzs").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=sfwxzs]").each(function () {
		if(this.value == document.getElementById("sfwxzs").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=jdqk]").each(function () {
		if(this.value == document.getElementById("jdqk").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=gzztqk]").each(function () {
		if(this.value == document.getElementById("gzztqk").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=cywxzlnl]").each(function () {
		if(this.value == document.getElementById("cywxzlnl").value){
			$(this).attr("checked","checked"); 
		}
	});	
	$("input[name=zqzlpj]").each(function () {
		if(this.value == document.getElementById("zqzlpj").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=bylwnrtz]").each(function () {
		if(this.value == document.getElementById("bylwnrtz").value){
			$(this).attr("checked","checked"); 
		}
	});	
	$("input[name=aqwc]").each(function () {
		if(this.value == document.getElementById("aqwc").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=yscl]").each(function () {
		if(this.value == document.getElementById("yscl").value){
			$(this).attr("checked","checked"); 
		}
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

//点击修改文件按钮所触发的函数
$(function(){
	$("#submitBtn").click(function(){
		reset_form("#zqjcbForm");
		var formData = new FormData(document.getElementById("zqjcbForm")); 
		$.ajax({
			url:"STUalertZQJCB",
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 			
			success:function(result){
				if(result.code == 100){
					alert("修改成功！");
					window.location.href="JumpUploadZQJCBPage";
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#qzrq","error",result.extend.error_Msg[0]);
						window.location.href="#qzrqTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#xtbhDiv","error",result.extend.error_Msg[1]);
						window.location.href="#xtbhDivTitle"
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#xtbhyy","error",result.extend.error_Msg[2]);
						window.location.href="#xtbhyyTitle"
					}else if(result.extend.error_Msg[3] != null){
						show_validate_msg("#sfyrytDiv","error",result.extend.error_Msg[3]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[4] != null){
						show_validate_msg("#sfktbgDiv","error",result.extend.error_Msg[4]);
						window.location.href="#sfktbgDivTitle"
					}else if(result.extend.error_Msg[5] != null){
						show_validate_msg("#sfwxzsDiv","error",result.extend.error_Msg[5]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[6] != null){
						show_validate_msg("#jdqkDiv","error",result.extend.error_Msg[6]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[7] != null){
						show_validate_msg("#jdzhyy","error",result.extend.error_Msg[7]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[8] != null){
						show_validate_msg("#gzztqkDiv","error",result.extend.error_Msg[8]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[9] != null){
						show_validate_msg("#cywxzlnlDiv","error",result.extend.error_Msg[9]);
						window.location.href="#cywxzlnlDivTitle"
					}else if(result.extend.error_Msg[10] != null){
						show_validate_msg("#zqzlpjDiv","error",result.extend.error_Msg[10]);
						window.location.href="#zqzlpjDivTitle"
					}else if(result.extend.error_Msg[11] != null){
						show_validate_msg("#bylwnrtzDiv","error",result.extend.error_Msg[11]);
						window.location.href="#bylwnrtzDivTitle"
					}else if(result.extend.error_Msg[12] != null){
						show_validate_msg("#zdcs","error",result.extend.error_Msg[12]);
						window.location.href="#zdcsTitle"
					}else if(result.extend.error_Msg[13] != null){
						show_validate_msg("#aqwcDiv","error",result.extend.error_Msg[13]);
						window.location.href="#aqwcDivTitle"
					}else if(result.extend.error_Msg[14] != null){
						show_validate_msg("#ysclDiv","error",result.extend.error_Msg[14]);
						window.location.href="#ysclDivTitle"
					}else if(result.extend.error_Msg[15] != null){
						show_validate_msg("#qt","error",result.extend.error_Msg[15]);
						window.location.href="#qtTitle"
					}
				}
			}
			});
	});
});