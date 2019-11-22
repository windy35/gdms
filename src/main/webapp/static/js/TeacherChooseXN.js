$(function(){
	//获取学年下拉列表
	getxllb($("#xn"));
	//选择按钮所触发的时间
	$("#chooseBtn").click(function(){
		if($("#xn").val() == 0){
			alert("请选择学年");
		}else{
			window.location.href="JumpTeacherMain?xnbh="+$("#xn").val();
		}
	})
});

//获取查询的题目类型和题目来源的下拉列表
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
			$.each(result.extend.gradelist,function(){
				var optionGrade = $("<option></option>").append(this.gradename).attr("value",this.gradeid);
				optionGrade.appendTo(ele1);
			});
		}
	});	
}