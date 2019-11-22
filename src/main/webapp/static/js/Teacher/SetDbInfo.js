$(function(){
	//获取查询的教师信息的下拉列表
	getxllb($("#pwzzxx"),$("#drpwxx"),$("#msxx"));		
		//设置日期
        $('#datetimepicker').datetimepicker({  
            language: 'zh',  
            weekStart: 1,  
            todayBtn:  1,  
            autoclose: 1,  
            todayHighlight: 1,  
            startView: 2,  
            forceParse: 0,  
            showMeridian: 1  
        }).on('changeDate', function (ev) {  
            $(this).datetimepicker('hide');  
        });  
        //获取学生信息编号
        getXYStuxllb("#studentid");
        
        $("#submitBtn").click(function(){
        	console.log($("#dbForm").serialize());
    		reset_form("#dbForm");    	
        	$.ajax({
        		url:"SetDbInfo",
        		type:"POST",
        		data:$("#dbForm").serialize(),
        		success:function(result){
        			if(result.code == 100){
    					alert("设置成功");
    					window.location.href="JumpSetDbInfo";
    				}else{
    					if(result.extend.error_Msg[0] != null){
    						show_validate_msg("#studentid","error",result.extend.error_Msg[0]);
    						window.location.href="#studentidTitle"
    					}else if(result.extend.error_Msg[1] != null){
    						show_validate_msg("#dbtime","error",result.extend.error_Msg[1]);
    						window.location.href="#dbtimeTitle"
    					}else if(result.extend.error_Msg[2] != null){
    						show_validate_msg("#dbplace","error",result.extend.error_Msg[2]);
    						window.location.href="#dbplaceTitle"
    					}else if(result.extend.error_Msg[3] != null){
    						show_validate_msg("#pwzzxx","error",result.extend.error_Msg[3]);
    						window.location.href="#pwzzxxTitle"
    					}else if(result.extend.error_Msg[4] != null){
    						show_validate_msg("#drpwxx","error",result.extend.error_Msg[4]);
    						window.location.href="#drpwxxTitle"
    					}else if(result.extend.error_Msg[5] != null){
    						show_validate_msg("#msxx","error",result.extend.error_Msg[5]);
    						window.location.href="#msxxTitle"
    					}
    				}
        		}
        	});
        })
    });

function getXYStuxllb(ele1){
	$.ajax({
		url:"getXYStuxllb",
		type:"POST",
		async:false,
		success:function(result){
			//清空下拉列表中的数据
			$(ele1).empty();
			//获取题目类型下拉列表
			//console.log(result);
			var all = $("<option></option>").append("请选择").attr("value",0);
			all.appendTo(ele1);
			$.each(result.extend.stulist,function(){
				var optionStu = $("<option></option>").append(this.name).attr("value",this.studentid);
				optionStu.appendTo(ele1);
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
			$.each(result.extend.teacherInfolist,function(){
				var optionteacherinfo = $("<option></option>").append("(" + this.teacherid + ")" + this.name).attr("value","(" + this.teacherid + ")" + this.name);
				optionteacherinfo.appendTo(ele1);		
			});
			var all2 = $("<option></option>").append("请选择").attr("value",0);
			all2.appendTo(ele2);
			//获取题目来源下拉列表			
			$.each(result.extend.teacherInfolist,function(){
				var optionteacherinfo2 = $("<option></option>").append("(" + this.teacherid + ")" + this.name).attr("value","(" + this.teacherid + ")" + this.name);
				optionteacherinfo2.appendTo(ele2);				
			});
			var all3 = $("<option></option>").append("请选择").attr("value",0);
			all3.appendTo(ele3);			
			//获取教师编号的下拉列表			
			$.each(result.extend.teacherInfolist,function(){
				var optionteacherinfo3 = $("<option></option>").append("(" + this.teacherid + ")" + this.name).attr("value","(" + this.teacherid + ")" + this.name);
				optionteacherinfo3.appendTo(ele3);
			});				
		}
	});	
}