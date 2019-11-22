$(function(){
	//点击导入按钮所触发的函数
	$("#importBtn").click(function(){
		var formData = new FormData(document.getElementById("importInfoForm"));
		console.log(formData);
		$.ajax({
			url:'ImportStudentInfo',
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 	
			success:function(result){
					if(result.code == 100){
						alert("导入成功");
						window.location.href="JumpManageStuInfoPage";						
					}
			}
			});
	})
	
//点击导出按钮所触发的函数
	$("#exportBtn").click(function(){
	if(confirm("是否要将学生信息以Excel表格的形式导出到桌面？")){
		$.ajax({
			url:'ExportStudentInfo',
			type:"POST",
			success:function(result){
					if(result.code == 100){
						alert("导出成功");		
					}
			}
			});
		}
	})	
	
	$(".deletebtn").click(function(){
	  if(confirm("真的要删除编号为[ " + $(this).attr("name") + " ]学生的信息吗?")){		
		$.ajax({
			url:'DeleteStuInfoById',
			data:{"studentid":$(this).attr("name")},
			type:"POST",
			success:function(result){
					window.location.href="JumpManageStuInfoPage?"+ $("#pn").val();
			}
			});
		}
	})
	
	//修改按钮触发的函数	
	$(".alertbtn").click(function(){
		getstuInfo($(this).attr("name"));
		$('#alertModel').modal({
			backdrop:"static"				
		});		
	});
	
	//增加按钮触发的函数
	$("#addBtn").click(function(){
		getxllb("#departmentid","#majorid","#classid","#gradeid");
		$('#addModel').modal({
			backdrop:"static"
		});		
	});		
	
	//查询按钮触发的函数
	$("#queryBtn").click(function(){
		$('#addModel').modal({
			backdrop:"static"
		});		
	});			
	
	//学院下拉列表值改变时，改变专业下拉列表的值
	$('#departmentid').change(function(){
		$('#majorid').empty();
		$('#classid').empty();
		$.ajax({
			url:"getZDmajorlist",
			type:"POST",
			data:{"departmentid":$(this).children('option:selected').val()},
			async:false,			
			success:function(result){
				if(result.extend.majorlist.length != 0){
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#majorid'));
					var all3 = $("<option></option>").append("请选择").attr("value",0);
					all3.appendTo($('#classid'));										
					$.each(result.extend.majorlist,function(){
						var optionMajor = $("<option></option>").append(this.majorname).attr("value",this.majorid);
						optionMajor.appendTo('#majorid');
					});					
				}else{
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#majorid'));
					var all3 = $("<option></option>").append("请选择").attr("value",0);
					all3.appendTo($('#classid'));					
				}
			}
	});
	});
	
	$('#departmentid2').change(function(){
		$('#majorid2').empty();
		$('#classid2').empty();
		$.ajax({
			url:"getZDmajorlist",
			type:"POST",
			data:{"departmentid":$(this).children('option:selected').val()},
			async:false,			
			success:function(result){
				if(result.extend.majorlist.length != 0){
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#majorid2'));
					var all3 = $("<option></option>").append("请选择").attr("value",0);
					all3.appendTo($('#classid2'));										
					$.each(result.extend.majorlist,function(){
						var optionMajor = $("<option></option>").append(this.majorname).attr("value",this.majorid);
						optionMajor.appendTo('#majorid2');
					});					
				}else{
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#majorid2'));
					var all3 = $("<option></option>").append("请选择").attr("value",0);
					all3.appendTo($('#classid2'));					
				}
			}
	});
	});	
	
	//专业下拉列表值改变时，改变班级下拉列表的值
	$('#majorid').change(function(){
		$('#classid').empty();
		$.ajax({
			url:"getZDclasslist",
			type:"POST",
			data:{"majorid":$(this).children('option:selected').val()},
			async:false,			
			success:function(result){
				if(result.extend.classlist.length != 0){
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#classid'));					
					$.each(result.extend.classlist,function(){
						var optionClass = $("<option></option>").append(this.classname).attr("value",this.classid);
						optionClass.appendTo('#classid');
					});					
				}else{
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#classid'));
				}
			}
	});
	});	
	
	//专业下拉列表值改变时，改变班级下拉列表的值
	$('#majorid2').change(function(){
		$('#classid2').empty();
		$.ajax({
			url:"getZDclasslist",
			type:"POST",
			data:{"majorid":$(this).children('option:selected').val()},
			async:false,			
			success:function(result){
				if(result.extend.classlist.length != 0){
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#classid2'));					
					$.each(result.extend.classlist,function(){
						var optionClass = $("<option></option>").append(this.classname).attr("value",this.classid);
						optionClass.appendTo('#classid2');
					});					
				}else{
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all2.appendTo($('#classid2'));
				}
			}
	});
	});		
	
	//点击添加按钮所触发的时间
	$("#addStuBtn").click(function(){
		reset_form("#stuForm");
			$.ajax({
				url:"addStudent",
				data:$("#stuForm").serialize(),
				type:"POST",
				success:function(result){
					if(result.code == 100){
						window.location.href="JumpManageStuInfoPage?pn"+$("#pn").val();
					}else{
						if(result.extend.error_Msg[0] != null){
							show_validate_msg("#studentid","error",result.extend.error_Msg[0]);
						}else if(result.extend.error_Msg[1] != null){
							show_validate_msg("#name","error",result.extend.error_Msg[1]);
						}else if(result.extend.error_Msg[2] != null){
							show_validate_msg("#password","error",result.extend.error_Msg[2]);
						}else if(result.extend.error_Msg[3] != null){
							show_validate_msg("#departmentid","error",result.extend.error_Msg[3]);
						}else if(result.extend.error_Msg[4] != null){
							show_validate_msg("#majorid","error",result.extend.error_Msg[4]);
						}else if(result.extend.error_Msg[5] != null){
							show_validate_msg("#classid","error",result.extend.error_Msg[5]);
						}else if(result.extend.error_Msg[6] != null){
							show_validate_msg("#phone","error",result.extend.error_Msg[6]);
						}else if(result.extend.error_Msg[7] != null){
							show_validate_msg("#email","error",result.extend.error_Msg[7]);
						}else if(result.extend.error_Msg[8] != null){
							show_validate_msg("#gradeid","error",result.extend.error_Msg[8]);
						}else if(result.extend.error_Msg[9] != null){
							show_validate_msg("#gender","error",result.extend.error_Msg[9]);
						}
					}
				}
				});
	})
	
//点击修改按钮所触发的时间
$("#AlertStuBtn").click(function(){
	reset_form("#alertstuForm");
		$.ajax({
			url:"alertStudent",
			data:$("#alertstuForm").serialize(),
			type:"POST",
			success:function(result){
				if(result.code == 100){
					window.location.href="JumpManageStuInfoPage?pn"+$("#pn").val();
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#name2","error",result.extend.error_Msg[0]);
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#password2","error",result.extend.error_Msg[1]);
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#departmentid2","error",result.extend.error_Msg[2]);
					}else if(result.extend.error_Msg[3] != null){
						show_validate_msg("#majorid2","error",result.extend.error_Msg[3]);
					}else if(result.extend.error_Msg[4] != null){
						show_validate_msg("#classid2","error",result.extend.error_Msg[4]);
					}else if(result.extend.error_Msg[5] != null){
						show_validate_msg("#phone2","error",result.extend.error_Msg[5]);
					}else if(result.extend.error_Msg[6] != null){
						show_validate_msg("#email2","error",result.extend.error_Msg[6]);
					}else if(result.extend.error_Msg[7] != null){
						show_validate_msg("#gradeid2","error",result.extend.error_Msg[7]);
					}else if(result.extend.error_Msg[8] != null){
						show_validate_msg("#gender2","error",result.extend.error_Msg[8]);
					}
				}
			}
			});
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

//获取查询的题目类型和题目来源的下拉列表
function getxllb(ele1,ele2,ele3,ele4){
	reset_form("#stuForm");
	$.ajax({
		url:"getxllb",
		type:"POST",
		async:false,
		success:function(result){
			//清空下拉列表中的数据
			$(ele1).empty();
			$(ele2).empty();
			$(ele3).empty();
			$(ele4).empty();
			//获取学院名称下拉列表
			//console.log(result);
			var all1 = $("<option></option>").append("请选择").attr("value",0);
			all1.appendTo(ele1);
			$.each(result.extend.departmentlist,function(){
				var optionDepartment = $("<option></option>").append(this.departmentname).attr("value",this.departmentid);
				optionDepartment.appendTo(ele1);
			});
			var all2 = $("<option></option>").append("请选择").attr("value",0);
			all2.appendTo(ele2);
			var all3 = $("<option></option>").append("请选择").attr("value",0);
			all3.appendTo(ele3);	
			var all4 = $("<option></option>").append("请选择").attr("value",0);
			all4.appendTo(ele4);
			$.each(result.extend.gradelist,function(){
				var optionGrade = $("<option></option>").append(this.gradename).attr("value",this.gradeid);
				optionGrade.appendTo(ele4);
			});			
		}
	});	
}

/**
 * 通过编号获取某个学生信息
 * @param studentid
 * @returns
 */
function getstuInfo(studentid){
	reset_form("#alertstuForm");
	$.ajax({
		url:'GetOneStuInfo',
		data:{"studentid":studentid},
		type:"POST",
		success:function(result){
			//console.log(result.extend.stu);
			var stu = result.extend.stu;
			$("#studentid2").text(stu.studentid);
			$("#studentid3").val(stu.studentid);			
			$("#name2").val(stu.name);
			$("#password2").val(stu.password);
			$("#phone2").val(stu.phone);
			$("#email2").val(stu.email);
			$("#gender2").val(stu.gender);
			$.ajax({
				url:"getxllb",
				type:"POST",
				async:false,
				success:function(result){
					//清空下拉列表中的数据
					$("#departmentid2").empty();
					$("#majorid2").empty();
					$("#classid2").empty();
					//获取学院名称下拉列表
					//console.log(result);
					var all1 = $("<option></option>").append("请选择").attr("value",0);
					all1.appendTo("#departmentid2");
					$.each(result.extend.departmentlist,function(){
						if(stu.departmentid == this.departmentid){
							var optionDepartment = $("<option></option>").append(this.departmentname).attr({"value":this.departmentid,"selected":"selected"});
						}else{
							var optionDepartment = $("<option></option>").append(this.departmentname).attr("value",this.departmentid);
						}		
						optionDepartment.appendTo("#departmentid2");
					});
					var all2 = $("<option></option>").append("请选择").attr("value",0);
					all1.appendTo("#gradeid2");
					$.each(result.extend.gradelist,function(){
						if(stu.gradeid == this.gradeid){
							var optionGrade = $("<option></option>").append(this.gradename).attr({"value":this.gradeid,"selected":"selected"});
						}else{
							var optionGrade = $("<option></option>").append(this.gradename).attr("value",this.gradeid);
						}		
						optionGrade.appendTo("#gradeid2");
					});					
				}
			});
			//设置专业下拉列表的初始值
			$.ajax({
				url:"getZDmajorlist",
				type:"POST",
				data:{"departmentid":stu.departmentid},
				async:false,			
				success:function(result){
						var all2 = $("<option></option>").append("请选择").attr("value",0);
						all2.appendTo($('#majorid2'));
						var all3 = $("<option></option>").append("请选择").attr("value",0);
						all3.appendTo($('#classid2'));										
						$.each(result.extend.majorlist,function(){			
							if(stu.majorid == this.majorid){
								var optionMajor = $("<option></option>").append(this.majorname).attr({"value":this.majorid,"selected":"selected"});
							}else{
								var optionMajor = $("<option></option>").append(this.majorname).attr("value",this.majorid);
							}									
							optionMajor.appendTo('#majorid2');
						});					
					}
		});			
			//设置班级下拉列表的初始值
			$.ajax({
				url:"getZDclasslist",
				type:"POST",
				data:{"majorid":stu.majorid},
				async:false,			
				success:function(result){
					$.each(result.extend.classlist,function(){
						if(stu.classid == this.classid){
							var optionClass = $("<option></option>").append(this.classname).attr({"value":this.classid,"selected":"selected"});
						}else{
							var optionClass = $("<option></option>").append(this.classname).attr("value",this.classid);
						}							
						optionClass.appendTo($('#classid2'));					
						});			
					}
				});
			}
	});
}