$(function(){
	//点击导入按钮所触发的函数
	$("#importBtn").click(function(){
		var formData = new FormData(document.getElementById("importInfoForm"));
		console.log(formData);
		$.ajax({
			url:'ImportTeacherInfo',
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 	
			success:function(result){
					if(result.code == 100){
						alert("导入成功");
						window.location.href="JumpManageTeacherInfoPage";						
					}
			}
			});
	})	
	
//点击导出按钮所触发的函数
	$("#exportBtn").click(function(){
	if(confirm("是否要将教师信息以Excel表格的形式导出到桌面？")){
		$.ajax({
			url:'ExportTeacherInfo',
			type:"POST",
			success:function(result){
					if(result.code == 100){
						alert("导出成功");		
					}
			}
			});
		}
	})		
	
	//获取是否专业负责人对应的专业列表
	$('#pLeaderidSign').change(function(){
		//清空负责专业下拉列表中的数据
		$('#fzzybh').empty();
		
		$.ajax({
			url:"getxllb",
			type:"POST",
			async:false,
			success:function(result){
				//获取学院名称下拉列表
				/*console.log($('#pLeaderidSign').val());*/
				if($('#pLeaderidSign').val() == "0"){
					var all1 = $("<option></option>").append("无").attr("value",0);
					all1.appendTo("#fzzybh");
				}else{
					$.each(result.extend.majorlist,function(){
							var optionMajor = $("<option></option>").append(this.majorname).attr("value",this.majorid);
							optionMajor.appendTo("#fzzybh");
					});					
				}				
			}
		});		
		
	});
	
	$('#pLeaderidSign2').change(function(){
		//清空负责专业下拉列表中的数据
		$('#fzzybh2').empty();
		
		$.ajax({
			url:"getxllb",
			type:"POST",
			async:false,
			success:function(result){
				//获取学院名称下拉列表
				/*console.log($('#pLeaderidSign2').val());*/
				if($('#pLeaderidSign2').val() == "0"){
					var all1 = $("<option></option>").append("无").attr("value",0);
					all1.appendTo("#fzzybh2");
				}else{
					$.each(result.extend.majorlist,function(){
							var optionMajor = $("<option></option>").append(this.majorname).attr("value",this.majorid);
							optionMajor.appendTo("#fzzybh2");
					});					
				}				
			}
		});		
		
	});	
	
	
	
	$(".deletebtn").click(function(){
	  if(confirm("真的要删除编号为[ " + $(this).attr("name") + " ]学生的信息吗?")){		
		$.ajax({
			url:'DeleteTeacherInfoById',
			data:{"teacherid":$(this).attr("name")},
			type:"POST",
			success:function(result){
					window.location.href="JumpManageTeacherInfoPage?"+ $("#pn").val();
			}
			});
		}
	})
	
	//修改按钮触发的函数	
	$(".alertbtn").click(function(){
		getteacherInfo($(this).attr("name"));
		$('#alertModel').modal({
			backdrop:"static"				
		});		
	});
	
	//增加按钮触发的函数
	$("#addBtn").click(function(){
		getxllb("#departmentid","#majorid","#classid","#fzzybh");
		$('#addModel').modal({
			backdrop:"static"
		});		
	});		
	
	
	//点击添加按钮所触发的时间
	$("#addTeacherBtn").click(function(){
		reset_form("#teacherForm");
			$.ajax({
				url:"addTeacher",
				data:$("#teacherForm").serialize(),
				type:"POST",
				success:function(result){
					if(result.code == 100){
						window.location.href="JumpManageTeacherInfoPage?pn"+$("#pn").val();
					}else{
						if(result.extend.error_Msg[0] != null){
							show_validate_msg("#teacherid","error",result.extend.error_Msg[0]);
						}else if(result.extend.error_Msg[1] != null){
							show_validate_msg("#name","error",result.extend.error_Msg[1]);
						}else if(result.extend.error_Msg[2] != null){
							show_validate_msg("#password","error",result.extend.error_Msg[2]);
						}else if(result.extend.error_Msg[3] != null){
							show_validate_msg("#departmentid","error",result.extend.error_Msg[3]);
						}else if(result.extend.error_Msg[4] != null){
							show_validate_msg("#phone","error",result.extend.error_Msg[4]);
						}else if(result.extend.error_Msg[5] != null){
							show_validate_msg("#email","error",result.extend.error_Msg[5]);
						}else if(result.extend.error_Msg[6] != null){
							show_validate_msg("#gender","error",result.extend.error_Msg[6]);
						}else if(result.extend.error_Msg[7] != null){
							show_validate_msg("#positionaltitle","error",result.extend.error_Msg[7]);
						}
					}
				}
				});
	})
	
//点击修改按钮所触发的时间
$("#AlertTeacherBtn").click(function(){
	reset_form("#alertteacherForm");
		$.ajax({
			url:"alertTeacher",
			data:$("#alertteacherForm").serialize(),
			type:"POST",
			success:function(result){
				if(result.code == 100){
					window.location.href="JumpManageTeacherInfoPage?pn"+$("#pn").val();
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#name2","error",result.extend.error_Msg[0]);
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#password2","error",result.extend.error_Msg[1]);
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#departmentid2","error",result.extend.error_Msg[2]);
					}else if(result.extend.error_Msg[3] != null){
						show_validate_msg("#phone2","error",result.extend.error_Msg[3]);
					}else if(result.extend.error_Msg[4] != null){
						show_validate_msg("#email2","error",result.extend.error_Msg[4]);
					}else if(result.extend.error_Msg[5] != null){
						show_validate_msg("#gender2","error",result.extend.error_Msg[5]);
					}else if(result.extend.error_Msg[6] != null){
						show_validate_msg("#positionaltitle2","error",result.extend.error_Msg[6]);
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

			//获取所负责专业的下拉列表
			var all4 = $("<option></option>").append("无").attr("value",0);
			all4.appendTo(ele4);
		}
	});	
}

/**
 * 通过编号获取某个教师信息
 * @param teacherid
 * @returns
 */
function getteacherInfo(teacherid){
	reset_form("#alertstuForm");
	
	$.ajax({
		url:'GetOneTeacherInfo',
		data:{"teacherid":teacherid},
		type:"POST",
		success:function(result){
			//console.log(result.extend.teacher);
			var teacher = result.extend.teacher;
			$("#teacherid2").text(teacher.teacherid);
			$("#teacherid3").val(teacher.teacherid);			
			$("#name2").val(teacher.name);
			$("#password2").val(teacher.password);
			$("#phone2").val(teacher.phone);
			$("#email2").val(teacher.email);
			$.ajax({
				url:"getxllb",
				type:"POST",
				async:false,
				success:function(result){
					//清空下拉列表中的数据
					$("#departmentid2").empty();
					//获取学院名称下拉列表
					//console.log(result);
					var all1 = $("<option></option>").append("请选择").attr("value",0);
					all1.appendTo("#departmentid2");
					$.each(result.extend.departmentlist,function(){
						if(teacher.departmentid == this.departmentid){
							var optionDepartment = $("<option></option>").append(this.departmentname).attr({"value":this.departmentid,"selected":"selected"});
						}else{
							var optionDepartment = $("<option></option>").append(this.departmentname).attr("value",this.departmentid);
						}		
						optionDepartment.appendTo("#departmentid2");
					});
					
					
					$("#pLeaderidSign2").empty();
					if(teacher.pLeaderidSign == false){
							var pl1 = $("<option></option>").append("否").attr("value",0).attr("selected","selected");
							var pl2 = $("<option></option>").append("是").attr("value",1);
							pl1.appendTo("#pLeaderidSign2");
							pl2.appendTo("#pLeaderidSign2");
					}else{
						var pl1 = $("<option></option>").append("否").attr("value",0);
						var pl2 = $("<option></option>").append("是").attr("value",1).attr("selected","selected");
						pl1.appendTo("#pLeaderidSign2");
						pl2.appendTo("#pLeaderidSign2");						
					}									
								
	
					$("#gender2").empty();
					if(teacher.gender == "男"){
							var gender1 = $("<option></option>").append("男").attr("value","男").attr("selected","selected");
							var gender2 = $("<option></option>").append("女").attr("value","女");
							gender1.appendTo("#gender2");
							gender2.appendTo("#gender2");
					}else{
						var gender1 = $("<option></option>").append("男").attr("value","男");
						var gender2 = $("<option></option>").append("女").attr("value","女").attr("selected","selected");
						gender1.appendTo("#gender2");
						gender2.appendTo("#gender2");						
					}														
					
					
					$("#positionaltitle2").empty();
					if(teacher.positionaltitle == "无"){
							var positionaltitle = $("<option></option>").append("无").attr("value","无").attr("selected","selected");
							var positionaltitle2 = $("<option></option>").append("讲师").attr("value","讲师");
							var positionaltitle3 = $("<option></option>").append("副教授").attr("value","副教授");
							var positionaltitle4 = $("<option></option>").append("教授").attr("value","教授");
							positionaltitle.appendTo("#positionaltitle2");
							positionaltitle2.appendTo("#positionaltitle2");
							positionaltitle3.appendTo("#positionaltitle2");
							positionaltitle4.appendTo("#positionaltitle2");
					}else if(teacher.positionaltitle == "讲师"){
						var positionaltitle = $("<option></option>").append("无").attr("value","无");
						var positionaltitle2 = $("<option></option>").append("讲师").attr("value","讲师").attr("selected","selected");
						var positionaltitle3 = $("<option></option>").append("副教授").attr("value","副教授");
						var positionaltitle4 = $("<option></option>").append("教授").attr("value","教授");
						positionaltitle.appendTo("#positionaltitle2");
						positionaltitle2.appendTo("#positionaltitle2");
						positionaltitle3.appendTo("#positionaltitle2");
						positionaltitle4.appendTo("#positionaltitle2");
					}else if(teacher.positionaltitle == "副教授"){
						var positionaltitle = $("<option></option>").append("无").attr("value","无");
						var positionaltitle2 = $("<option></option>").append("讲师").attr("value","讲师");
						var positionaltitle3 = $("<option></option>").append("副教授").attr("value","副教授").attr("selected","selected");
						var positionaltitle4 = $("<option></option>").append("教授").attr("value","教授");
						positionaltitle.appendTo("#positionaltitle2");
						positionaltitle2.appendTo("#positionaltitle2");
						positionaltitle3.appendTo("#positionaltitle2");
						positionaltitle4.appendTo("#positionaltitle2");
					}else if(teacher.positionaltitle == "教授"){
						var positionaltitle = $("<option></option>").append("无").attr("value","无");
						var positionaltitle2 = $("<option></option>").append("讲师").attr("value","讲师");
						var positionaltitle3 = $("<option></option>").append("副教授").attr("value","副教授");
						var positionaltitle4 = $("<option></option>").append("教授").attr("value","教授").attr("selected","selected");
						positionaltitle.appendTo("#positionaltitle2");
						positionaltitle2.appendTo("#positionaltitle2");
						positionaltitle3.appendTo("#positionaltitle2");
						positionaltitle4.appendTo("#positionaltitle2");
					}				
					
					
					$("#fzzybh2").empty();
					if(teacher.fzzybh == 0){
						var all2 = $("<option></option>").append("无").attr("value",0);
						all2.appendTo("#fzzybh2");
					}else{
						$.each(result.extend.majorlist,function(){
							if(teacher.fzzybh == this.majorid){
								var optionMajor = $("<option></option>").append(this.majorname).attr({"value":this.majorid,"selected":"selected"});
							}else{
								var optionMajor = $("<option></option>").append(this.majorname).attr("value",this.majorid);
							}		
							optionMajor.appendTo("#fzzybh2");
						});						
					}									
				}
			});
			}
	});
}