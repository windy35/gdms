$(function(){
	//获取字数
	if(document.getElementById("title") != null){
		var titleZs = document.getElementById("title").value.length;
		$("#titlezs").append(titleZs);
	$('#title').bind('input',function(){  
		titleZs = document.getElementById("title").value.length;
		$("#titlezs").empty();
		$("#titlezs").append(titleZs);
		});		
	}		
	if(document.getElementById("context") != null){
		var contextZs = document.getElementById("context").value.length;
		$("#contextzs").append(contextZs);
	$('#context').bind('input',function(){  
		contextZs = document.getElementById("context").value.length;
		$("#contextzs").empty();
		$("#contextzs").append(contextZs);
		});		
	}
	getxllb($("#wtlx"));

	
	$("#submitBtn").click(function(){
		var pn = document.getElementById("pn").value;
		reset_form("#twForm");
		$.ajax({
			url:"StusubmitQuestion",
			data:$("#twForm").serialize(),
			type:"POST",
			success:function(result){
				if(result.code == 100){
					alert("提问成功");
					window.location.href="StuJumpMessageInteractionPage?pn="+pn;
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#wtlx","error",result.extend.error_Msg[0]);
						window.location.href="#wtlxTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#title","error",result.extend.error_Msg[1]);
						window.location.href="#titleTitle"
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#context","error",result.extend.error_Msg[2]);
						window.location.href="#contextTitle"
					}
				}
				}
			});
	})	
})

	//获取查询的题目类型的下拉列表
	function getxllb(ele1){
		$.ajax({
			url:"getxllb",
			type:"POST",
			async:false,
			success:function(result){
				//清空下拉列表中的数据
				$(ele1).empty();
				//获取题目类型下拉列表
				//console.log(result);
				var all = $("<option></option>").append("请选择").attr("value",0);
				all.appendTo(ele1);
				$.each(result.extend.designtypelist,function(){
					var optionDesignType = $("<option></option>").append(this.typename).attr("value",this.typeid);
					optionDesignType.appendTo(ele1);
				});
			}
		});	
	}	

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