//获取字数
$(function(){	
	if(document.getElementById("dbpptinstructordetailopinion") != null){
		var dbpptinstructordetailopinionZs = document.getElementById("dbpptinstructordetailopinion").value.length;
		$("#dbpptinstructordetailopinionzs").append(dbpptinstructordetailopinionZs);
	$('#dbpptinstructordetailopinion').bind('input',function(){  
		dbpptinstructordetailopinionZs = document.getElementById("dbpptinstructordetailopinion").value.length;
		$("#dbpptinstructordetailopinionzs").empty();
		$("#dbpptinstructordetailopinionzs").append(dbpptinstructordetailopinionZs);
		});		
	}
	//返回按钮
	$("#ReturnBtn").click(function(){
		window.history.back();
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


$(function(){	
$("#AuditGDBtn").click(function(){
	//重置样式
	reset_form("#AuditDbpptForm");		
	//获取用户输入的数据
	$.ajax({
		url:"AuditDBPPT",
		type:"POST",
		data:$("#AuditDbpptForm").serialize(),
		success:function(result){
			//console.log(result);
			if(result.code == 100){
				//alert("$"+title+"$"+typeid+"$"+titlesourceid+"$"+instructorid+"$"+gdintroduction+"$"+gdtask+"$"+workload+"$"+complexity+"$"+requirestudentcount);
				alert("审核成功");
				window.location.href="JumpAduitTeamInfo";
			}else{
				//审核失败则显示相关提示信息
				if(result.extend.error_Msg[0] != null){
					show_validate_msg("#dbpptinstructoropinion","error",result.extend.error_Msg[0]);
				}else if(result.extend.error_Msg[1] != null){
					show_validate_msg("#dbpptinstructordetailopinion","error",result.extend.error_Msg[1]);
				}
			}
		}
});	
});
});