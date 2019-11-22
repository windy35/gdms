//改变文本框的内容触发的函数
$(function(){	
	if(document.getElementById("ktbginstructordetailopinion") != null){
		var ktbginstructordetailopinionZs = document.getElementById("ktbginstructordetailopinion").value.length;
		$("#ktbginstructordetailopinionzs").append(ktbginstructordetailopinionZs);
	$('#ktbginstructordetailopinion').bind('input',function(){  
		ktbginstructordetailopinionZs = document.getElementById("ktbginstructordetailopinion").value.length;
		$("#ktbginstructordetailopinionzs").empty();
		$("#ktbginstructordetailopinionzs").append(ktbginstructordetailopinionZs);
		});		
	}
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

//点击提交按钮触发的函数
$(function(){	
	$("#AuditGDBtn").click(function(){
		//重置样式
		reset_form("#GDInfo");		
		//获取用户输入的数据
		console.log($("#AuditKTBGForm").serialize());
		$.ajax({
			url:"AuditKTBG",
			type:"POST",
			data:$("#AuditKTBGForm").serialize(),
			success:function(result){
				//console.log(result);
				if(result.code == 100){
					//alert("$"+title+"$"+typeid+"$"+titlesourceid+"$"+instructorid+"$"+gdintroduction+"$"+gdtask+"$"+workload+"$"+complexity+"$"+requirestudentcount);
					alert("审核成功");
					window.location.href="JumpAduitTeamInfo";
				}else{
					//审核失败则显示相关提示信息
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#ktbginstructoropinion","error",result.extend.error_Msg[0]);
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#ktbginstructordetailopinion","error",result.extend.error_Msg[1]);
					}
				}
			}
	});	
});
});

$(function(){
	$("#ReturnBtn").click(function(){
		window.history.back();
	});	
})