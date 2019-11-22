$(function(){
	$(".studiv").click(function(){
		//获取学生编号		
		if($("#jszbh").val() == ""){
			$("#jszbh").val($(this).find(".stuid").text());
		}
		else{
			$("#jszbh").val($("#jszbh").val() + ";" + $(this).find(".stuid").text());
		}
		//获取手机号码
		if($("#tssjhm").val() == ""){
			$("#tssjhm").val($(this).find(".stuphone").text());
		}
		else{
			$("#tssjhm").val($("#tssjhm").val() + ";" + $(this).find(".stuphone").text());
		}		
	});
	//获取字数
	if(document.getElementById("noticecontent") != null){
		var noticecontentZs = document.getElementById("noticecontent").value.length;
		$("#noticecontentzs").append(noticecontentZs);
	$('#noticecontent').bind('input',function(){  
		noticecontentZs = document.getElementById("noticecontent").value.length;
		$("#noticecontentzs").empty();
		$("#noticecontentzs").append(noticecontentZs);
		});		
	}
	//点击推送按钮触发的事件
	$("#submitBtn").click(function(){
		reset_form("#tztsForm");
		if(document.getElementById("noticetitle").value == ""){
			show_validate_msg("#noticetitle","error","请输入");
			window.location.href="#noticetitleTitle"
		}else if(document.getElementById("jszbh").value == ""){
			show_validate_msg("#jszbh","error","请选择");
			window.location.href="#jszbhTitle"
		}else if(document.getElementById("noticecontent").value == ""){
			show_validate_msg("#noticecontent","error","请输入");
			window.location.href="#noticecontentTitle"
		}else{
			//学生编号列表
			var stuNolist = document.getElementById("jszbh").value;
			stuNolist = stuNolist.split(";");
			var i;
			var formData = new FormData(document.getElementById("tztsForm"));
			
				$.ajax({ 
					url:"SetTeacherNotice",
					data:formData,
					type:"POST",
					async: false, 
					cache: false, 
					contentType: false, 
					processData: false, 	
					success:function(result){
					}
				});		
			
				
				alert("已向【 " + stuNolist + " 】"+"这些编号的学生推送了通知。");
				//勾选了同时发送通知的复选框
				 if($('#dxtz').is(':checked')){
						var phoneNumlist = document.getElementById("tssjhm").value;
						alert("已向【 " + phoneNumlist + " 】"+"这些手机号码推送了短信。");
						
						if(phoneNumlist.indexOf(";") > 0 ){
							phoneNumlist = phoneNumlist.split(";");
							for(i=0;i<phoneNumlist.length;i++){
								var mobilenum = phoneNumlist[i];
								console.log("第 " + i + " 个号码为：" + mobilenum);								
								$.ajax({
									url:"http://v.juhe.cn/sms/send",
									data:{"mobile":mobilenum,"tpl_id":"72656","tpl_value":"","key":"bc7297a41b0b49e836061260c0f30401"},
									type:"GET",
									dataType:"JSON",
									success:function(result){
										console.log(mobilenum + "成功");
									},
									error:function(result){
										console.log(mobilenum + "失败");
									},
									complete:function(result){
										console.log(mobilenum + "完成");
									}
								});		
							}											
						}else{
							$.ajax({
								url:"http://v.juhe.cn/sms/send",
								data:{"mobile":phoneNumlist,"tpl_id":"72656","tpl_value":"","key":"bc7297a41b0b49e836061260c0f30401"},
								type:"GET",
								dataType:"JSON",
								success:function(result){
									console.log(phoneNumlist+"成功");
								},
								error:function(result){
									console.log(phoneNumlist+"失败");
								},
								complete:function(result){
									console.log(phoneNumlist+"完成");
								}
							});		
						}
				 }						
				 //重置表单样式
				 $(':input','#tztsForm')

			       .not(':button,:submit,:reset,:hidden')   //将myform表单中input元素type为button、submit、reset、hidden排除

			       .val('')  //将input元素的value设为空值

			       .removeAttr('checked')

			       .removeAttr('checked') // 如果任何radio/checkbox/select inputs有checked or selected 属性，将其移除				 
		}
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