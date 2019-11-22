//获取审核毕设选题意见的字数
$(function(){	
	var bsxtxxyjZS = document.getElementById("bsxtxxyj").value.length;
	$("#zdjsbsxtxxyjzs").append(bsxtxxyjZS);
$('#bsxtxxyj').bind('input',function(){  
	bsxtxxyjZS = document.getElementById("bsxtxxyj").value.length;
	$("#zdjsbsxtxxyjzs").empty();
	$("#zdjsbsxtxxyjzs").append(bsxtxxyjZS);
	});
	$('#ReturnBtn').click(function(){
		window.history.back();
	})
	

	var ktnr = $("#ktnrhidden").val();

	//替换所有的换行符
	ktnr = ktnr.replace(/\r\n/g,"<br>")
	ktnr = ktnr.replace(/\n/g,"<br>");
	 
	//替换所有的空格（中文空格、英文空格都会被替换）
	ktnr = ktnr.replace(/\s/g,"&nbsp;");

	$("#ktnr").append(ktnr);	

	var rwyq = $("#rwyqhidden").val();
	//替换所有的换行符
	rwyq = rwyq.replace(/\r\n/g,"<br>")
	rwyq = rwyq.replace(/\n/g,"<br>");

	//替换所有的空格（中文空格、英文空格都会被替换）
	rwyq = rwyq.replace(/\s/g,"&nbsp;");

	$("#rwyq").append(rwyq);	
	
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
		reset_form("#AuditBSXTForm");		
		//获取用户输入的数据
		var bsxtinstructoropinion = $("#bsxtyj").val();
		var bsxtinstructordetailopinion = $("#bsxtxxyj").val();
		var graduationdesignresultid = $("#graduationdesignresultid").val();
		//console.log("$"+bsxtinstructoropinion+"$"+bsxtinstructordetailopinion+"$"+graduationdesignresultid+"$");
		$.ajax({
			url:"AuditBSXT",
			type:"POST",
			data:$('#AuditBSXTForm').serialize(),
			success:function(result){
				//console.log(result);
				if(result.code == 100){
					//alert("$"+title+"$"+typeid+"$"+titlesourceid+"$"+instructorid+"$"+gdintroduction+"$"+gdtask+"$"+workload+"$"+complexity+"$"+requirestudentcount);
					alert("审核成功");
					window.location.href="JumpAduitTeamInfo";
				}else{
					//审核失败则显示相关提示信息
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#bsxtyj","error",result.extend.error_Msg[0]);
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#bsxtxxyj","error",result.extend.error_Msg[1]);
					}
				}
			}
	});	
});
});

//获取工作量以及选题难度的单选按钮信息
$(function(){
	var Workload = $("#Workloadhidden").val();
	var Complexity = $("#Complexityhidden").val();
	//console.log(Workload + Complexity);
	var WorkloadRadio1 = $("<input></input>").attr("type","radio").attr("name","gzl").attr("value","大").attr("disabled","disabled");
	var WorkloadRadio2 = $("<input></input>").attr("type","radio").attr("name","gzl").attr("value","适中").attr("disabled","disabled");
	var WorkloadRadio3 = $("<input></input>").attr("type","radio").attr("name","gzl").attr("value","小").attr("disabled","disabled");
	if(Workload == "难"){
		WorkloadRadio1.attr("checked","checked");
	}else if(Workload == "适中"){
		WorkloadRadio2.attr("checked","checked");
	}else{
		WorkloadRadio3.attr("checked","checked");
	}	
	$("#gzl").append(WorkloadRadio1).append("大").append(WorkloadRadio2).append("适中").append(WorkloadRadio3).append("小");
	
	var ComplexityRadio1 = $("<input></input>").attr("type","radio").attr("name","nd").attr("value","难").attr("disabled","disabled");
	var ComplexityRadio2 = $("<input></input>").attr("type","radio").attr("name","nd").attr("value","一般").attr("disabled","disabled");
	var ComplexityRadio3 = $("<input></input>").attr("type","radio").attr("name","nd").attr("value","容易").attr("disabled","disabled");
	if(Complexity == "难"){
		ComplexityRadio1.attr("checked","checked");
	}else if(Complexity == "一般"){
		ComplexityRadio2.attr("checked","checked");
	}else{
		ComplexityRadio3.attr("checked","checked");
	}	
	$("#nd").append(ComplexityRadio1).append("难").append(ComplexityRadio2).append("一般").append(ComplexityRadio3).append("易");	
});