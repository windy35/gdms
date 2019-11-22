//倒计时所用到的变量
var t = 6;	

//打开忘记密码的模态框
function show_forgetPw_div(){
		$('#forgetPwModel').modal({
			backdrop:"static"
		});
}

//自动触发的函数
$(function(){
	//轮播图
	if("#myCarousel" != null){
		$('#myCarousel').on('slide.bs.carousel', function () {
		});	
	}

	$.ajax({
		type:"POST",
		url:"getNoticelist",	
		data:{"pn":1,"noticetitle":""},
		dataType:"JSON",
		success:function(result){
			var noticelist = result.extend.pageInfo.list;
			$.each(noticelist,function(index,item){
				var notice = $("<li></li>").addClass("Noticeli").append($("<a></a>").addClass("left noticetitle").attr("target","_self").attr("href","JumpNoticeDetail?noticeid="+item.noticeid).attr("title",item.noticetitle).append(item.noticetitle)).append($("<span></span>").addClass("right").append(item.declaretime.substr(0,10)));
				notice.appendTo("#notice_ul");
			});
		}				
	});	
	
	
$("#loginBtn").click(function(){
	//重置样式
	reset_form("#LoginDiv form");
	
	//先对用户输入的登录数据进行格式判断
	if(!validate_login_form()){
		return false;
	}			
		//获取用户输入的数据
		var Username = $("#inputUsername").val();
		var Password = $("#inputPassword").val();
		var VCCode = $("#inputvcCode").val();
		var Role = $(":radio:checked").val();			
	    var oUser = document.getElementById('inputUsername');
	    var oPswd = document.getElementById('inputPassword');
		//console.log(Username + "$" + Password + "$" + Role + "$" + VCCode);
	    var remember = document.getElementById('remember');
		$.ajax({
			type:"POST",
			url:"userlogin",			
			data:{"Username":Username,"Password":Password,"Role":Role,"VCCode":VCCode},
			dataType:"JSON",
			success:function(result){
				//如果登录成功则进行页面跳转，100代码表示操作成功
				if(result.code == 100){
				      if(remember.checked){ 
				    	 console.log("设置cookie");
				        setCookie('user',oUser.value,7); //保存帐号到cookie，有效期7天
				        setCookie('pswd',oPswd.value,7); //保存密码到cookie，有效期7天
				      }
						window.location.href = "loginJump?Role="+Role;
				}
				else{
					 console.log("设置cookie2");
					//登录失败则显示相关提示信息
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#inputUsername","error",result.extend.error_Msg[0]);
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#inputPassword","error",result.extend.error_Msg[1]);
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#inputvcCode","error",result.extend.error_Msg[2]);
					}
				}
			},
			error:function(result){
				
			}
		});
	});
});

//改变验证码
function change_checkCode(){
	var img=document.getElementById("checkCodeImg");  
	img.src= "Generate_vcCode?"+new Date().getTime(); //加时间戳防止缓存*/	
}

//清空表单样式及内容
function reset_form(ele){
	//重置表单样式
	$(ele).find("*").removeClass("has-error has-success");
	$(ele).find(".help-block").text("");	
}


//检验用户输入的登录数据
function validate_login_form(){
	//1、拿到需要校验的数据
	var UserName = $("#inputUsername").val();
	var Password = $("#inputPassword").val();
	var VCCode = $("#inputvcCode").val();
	if(UserName == ""){
		show_validate_msg("#inputUsername","error","请输入用户名");
		return false;
	}		
	if(Password == ""){
		show_validate_msg("#inputPassword","error","请输入密码");
		return false;
	}		
	if(VCCode == ""){
		show_validate_msg("#inputvcCode","error","请输入验证码");
		return false;
	}		
	return true;
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

//未进行登录进行用户操作，则进行倒计时返回登录界面	
function showTime_noLogin(){
//获取当前网址，如： http://localhost:8080/GDMS/login.jsp
var curWwwPath=window.document.location.href;
//获取主机地址之后的目录，如： GDMS/login.jsp
var pathName=window.document.location.pathname;
var pos=curWwwPath.indexOf(pathName);
//获取主机地址，如： http://localhost:8080
var localhostPaht=curWwwPath.substring(0,pos);
//获取带"/"的项目名，如：/GDMS
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
//得到了 http://localhost:8080/GDMS
var realPath=localhostPaht+projectName;		
    t -= 1;
    document.getElementById("countdown_div").innerHTML= t +"秒后将自动跳转到登录页面。";
    if(t==0){
        window.location.href= "JumpLoginPage";
    }
    //每秒执行一次,showTime()
    setTimeout("showTime_noLogin()",1000);
}	


window.onload = function(){
    var oForm = document.getElementById('loginForm');
    var oUser = document.getElementById('inputUsername');
    var oPswd = document.getElementById('inputPassword');
    var oRemember = document.getElementById('remember');
    //页面初始化时，如果帐号密码cookie存在则填充
    if(oRemember != null){
    	if(getCookie('user') && getCookie('pswd')){
    		/*    console.log("设置cookie" +  getCookie('user') + getCookie('pswd'));*/
    		    	$("#inputUsername").val(getCookie('user'));
    		    	$("#inputPassword").val(getCookie('pswd'));
    		      oRemember.checked = true;
    		    }
        //复选框勾选状态发生改变时，如果未勾选则清除cookie
        oRemember.onchange = function(){
          if(!this.checked){
            delCookie('user');
            delCookie('pswd');
          }
        };
        //表单提交事件触发时，如果复选框是勾选状态则保存cookie
        oForm.onsubmit = function(){
          if(remember.checked){ 
        	  console.log("设置cookie");
            setCookie('user',oUser.value,7); //保存帐号到cookie，有效期7天
            setCookie('pswd',oPswd.value,7); //保存密码到cookie，有效期7天
          }
        };    	
    }
    
  };
  //设置cookie
  function setCookie(name,value,day){
    var date = new Date();
    date.setDate(date.getDate() + day);
    document.cookie = name + '=' + value + ';expires='+ date;
  };
  //获取cookie
  function getCookie(name){
    var reg = RegExp(name+'=([^;]+)');
    var arr = document.cookie.match(reg);
    if(arr){
      return arr[1];
    }else{
      return '';
    }
  };
  //删除cookie
  function delCookie(name){
    setCookie(name,null,-1);
  };