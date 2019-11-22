//点击返回按钮触发的函数
$(function(){
	$("#returnBtn").click(function(){
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
//获取工作量以及选题难度的单选按钮信息
$(function(){
	var Workload = $("#Workloadhidden").val();
	var Complexity = $("#Complexityhidden").val();
	//console.log(Workload + Complexity);
	var WorkloadRadio1 = $("<input></input>").attr("type","radio").attr("name","gzl").attr("value","大").attr("disabled","disabled");
	var WorkloadRadio2 = $("<input></input>").attr("type","radio").attr("name","gzl").attr("value","适中").attr("disabled","disabled");
	var WorkloadRadio3 = $("<input></input>").attr("type","radio").attr("name","gzl").attr("value","小").attr("disabled","disabled");
	if(Workload == "大"){
		WorkloadRadio1.attr("checked","checked");
	}else if(Workload == "中"){
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
