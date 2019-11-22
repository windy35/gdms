//改变文本框的内容触发的函数
$(function(){
	var bstmZS = document.getElementById("bstm").value.length;
	var ktnrZS = document.getElementById("ktnr").value.length;
	var rwyqZS = document.getElementById("rwyq").value.length;
	$("#bstmzs").append(bstmZS);
	$("#ktnrzs").append(ktnrZS);
	$("#rwyqzs").append(rwyqZS);
$('#bstm').bind('input',function(){  
	bstmZS = document.getElementById("bstm").value.length;
	$("#bstmzs").empty();
	$("#bstmzs").append(bstmZS);
});
$('#ktnr').bind('input',function(){  
	ktnrZS = document.getElementById("ktnr").value.length;
	$("#ktnrzs").empty();
	$("#ktnrzs").append(ktnrZS);
});
$('#rwyq').bind('input',function(){  
	rwyqZS = document.getElementById("rwyq").value.length;
	$("#rwyqzs").empty();
	$("#rwyqzs").append(rwyqZS);
});
});

//点击返回按钮触发的函数
$(function(){
	$("#returnBtn").click(function(){
		window.history.back();
	})
});
//1、页面加载完成以后，直接发送一个ajax请求，要到分页数据
$(function(){
	//获取查询的题目类型、题目来源、教师信息的下拉列表
	getxllb($("#tmlx"),$("#tmly"),$("#sszy"));	
});

//获取查询的题目类型和题目来源的下拉列表
function getxllb(ele1,ele2,ele3){
	$.ajax({
		url:"getxllb",
		type:"POST",
		async:false,
		success:function(result){
			//清空下拉列表中的数据
			$(ele1).empty();
			$(ele2).empty();
			$(ele3).empty();
			//获取题目类型下拉列表
			//console.log(result);
			var all = $("<option></option>").append("请选择").attr("value",0);
			all.appendTo(ele1);
			$.each(result.extend.designtypelist,function(){
				var optionDesignType = $("<option></option>").append(this.typename).attr("value",this.typeid);
				optionDesignType.appendTo(ele1);
			});
			var all2 = $("<option></option>").append("请选择").attr("value",0);
			all2.appendTo(ele2);
			//获取题目来源下拉列表			
			$.each(result.extend.titlesourcelist,function(){
				var optionTitleSource = $("<option></option>").append(this.titlesourcename).attr("value",this.titlesourceid);
				optionTitleSource.appendTo(ele2);
			});
			var all3 = $("<option></option>").append("请选择").attr("value","请选择");
			all3.appendTo(ele3);			
			//获取学院名称的下拉列表			
			$.each(result.extend.departmentlist,function(){
				var optionDepartmentname = $("<option></option>").append(this.departmentname).attr("value",this.departmentname);
				optionDepartmentname.appendTo(ele3);
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

//点击申报题目触发的函数
$(function(){
	$("#DeclareGDBtn").click(function(){
		//重置样式
		reset_form("#GDInfo");		
		//获取用户输入的数据
		var title = $("#bstm").val();
		var subjectaffiliation = $("#sszy").val();
		var typeid = $("#tmlx").val();		
		var titlesourceid = $("#tmly").val();
		var gdintroduction = $("#ktnr").val();
		var gdtask = $("#rwyq").val();
		var workload = $('#gzldiv input[name="gzl"]:checked ').val();
		var complexity = $('#nddiv input[name="nd"]:checked ').val();
		var requirestudentcount = $("#xss").val();
		//console.log("$"+title+"$"+subjectaffiliation+"$"+typeid+"$"+titlesourceid+"$"+gdintroduction+"$"+gdtask+"$"+workload+"$"+complexity+"$"+requirestudentcount);
		$.ajax({
			url:"TeacherDeclareBSXT",
			type:"POST",
			data:{"title":title,"subjectaffiliation":subjectaffiliation,"typeid":typeid,"titlesourceid":titlesourceid,"gdintroduction":gdintroduction,"gdtask":gdtask,"workload":workload,"complexity":complexity,"requirestudentcount":requirestudentcount},
			success:function(result){
				//console.log(result);
				if(result.code == 100){					
					alert("提交成功");
					window.location.href="JumpTeacherDeclareBSXTPage";
				}else{
					//提交选题失败则显示相关提示信息
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#bstm","error",result.extend.error_Msg[0]);
						window.location.href="#bsxtTitle";
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#sszy","error",result.extend.error_Msg[1]);
						window.location.href="#sszyTitle";
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#tmlx","error",result.extend.error_Msg[2]);
						window.location.href="#tmlxTitle";
					}else if(result.extend.error_Msg[3] != null){
						show_validate_msg("#tmly","error",result.extend.error_Msg[3]);
						window.location.href="#tmlyTitle";
					}else if(result.extend.error_Msg[4] != null){
						show_validate_msg("#ktnr","error",result.extend.error_Msg[4]);
						window.location.href="#ktnrTitle";
					}else if(result.extend.error_Msg[5] != null){
						show_validate_msg("#rwyq","error",result.extend.error_Msg[5]);
						window.location.href="#rwyqTitle";
					}else if(result.extend.error_Msg[6] != null){
						show_validate_msg("#xss","error",result.extend.error_Msg[6]);
						window.location.href="#xssTitle";
					}
				}
			}
	});	
});
});