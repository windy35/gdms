var dbinfoid;
$(function(){
	$(".pf_btn").click(function(){
		dbinfoid = $(this).attr("name");
		var cj = $(this).parents("tr").find("td:eq(6)").text();
		reset_form("#pfModel");
		$('#pfModel').modal({
			backdrop:"static"
		});		
			/*if(cj == ""){}else{
			alert("你已经对该毕设进行评分");
		}*/
 	})
 	$("#submitBtn").click(function(){
 		reset_form("#pfModel");
 		$.ajax({
			url:"SetDbcj",
			data:{"dbcj":$("#dbcj").val(),"dbinfoid":dbinfoid},
			type:"POST",
			success:function(result){
				if(result.code == 100){
					$("#myModal").modal('hide');
					window.location.href="TeacherJumpDbCJ"	
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#dbcj","error",result.extend.error_Msg[0]);
					}
				}
			}
		});			
 	})	
})


//清空表单样式及内容
function reset_form(ele){
	//重置表单样式
	$(ele).find("*").removeClass("has-error has-success");
	$(ele).find(".help-block").text("");	
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