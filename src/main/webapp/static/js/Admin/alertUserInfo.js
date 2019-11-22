//清空表单样式及内容
function reset_form(ele){
	//重置表单样式
	$(ele).find("*").removeClass("has-error has-success");
	$(ele).find(".help-block").text("");	
}


//设置toastr提示框的参数
toastr.options = {  
        closeButton: false,  
        debug: false,  
        progressBar: true,  
        positionClass: "toast-center-center",  
        onclick: null,  
        showDuration: "0",  
        hideDuration: "500",  
        timeOut: "500",  
        extendedTimeOut: "1000",  
        showEasing: "swing",  
        hideEasing: "linear",  
        showMethod: "fadeIn",  
        hideMethod: "fadeOut"  
    };  

//点击修改用户信息按钮触发的函数
$(function(){
$("#alertUserInfobtn").click(function(){
	//重置样式
	reset_form("#alertUserInfoDiv form");
		//获取用户输入的数据
		var Phone = $("#inputPhone").val();
		var Email = $("#inputEmail").val();	
		//console.log(Phone + "$" + Email);
		$.ajax({
			type:"POST",
			url:"alertAdminUserInfo",			
			data:{"phone":Phone,"email":Email},
			dataType:"JSON",
			success:function(result){
				//如果修改成功则提示修改成功的信息，100代码表示操作成功
				if(result.code == 100)
					toastr.success("用户信息修改成功!");  
				else{
					//修改失败则显示相关提示信息
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#inputPhone","error",result.extend.error_Msg[0]);
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#inputEmail","error",result.extend.error_Msg[1]);
					}
				}
			}
		});
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