$(function(){
	//获取字数信息
	if(document.getElementById("qzrq") != null){
		var qzrqZs = document.getElementById("qzrq").value.length;
		$("#qzrqzs").append(qzrqZs);
	$('#qzrq').bind('input',function(){  
		qzrqZs = document.getElementById("qzrq").value.length;
		$("#qzrqzs").empty();
		$("#qzrqzs").append(qzrqZs);
		});		
	}
	if(document.getElementById("xtbhyy") != null){
		var xtbhyyZs = document.getElementById("xtbhyy").value.length;
		$("#xtbhyyzs").append(xtbhyyZs);
	$('#xtbhyy').bind('input',function(){  
		xtbhyyZs = document.getElementById("xtbhyy").value.length;
		$("#xtbhyyzs").empty();
		$("#xtbhyyzs").append(xtbhyyZs);
		});		
	}
	if(document.getElementById("jdzhyy") != null){
		var jdzhyyZs = document.getElementById("jdzhyy").value.length;
		$("#jdzhyyzs").append(jdzhyyZs);
	$('#jdzhyy').bind('input',function(){  
		jdzhyyZs = document.getElementById("jdzhyy").value.length;
		$("#jdzhyyzs").empty();
		$("#jdzhyyzs").append(jdzhyyZs);
		});		
	}	
	if(document.getElementById("zdcs") != null){
		var zdcsZs = document.getElementById("zdcs").value.length;
		$("#zdcszs").append(zdcsZs);
	$('#zdcs').bind('input',function(){  
		zdcsZs = document.getElementById("zdcs").value.length;
		$("#zdcszs").empty();
		$("#zdcszs").append(zdcsZs);
		});		
	}	
	if(document.getElementById("qt") != null){
		var qtZs = document.getElementById("qt").value.length;
		$("#qtzs").append(qtZs);
	$('#qt').bind('input',function(){  
		qtZs = document.getElementById("qt").value.length;
		$("#qtzs").empty();
		$("#qtzs").append(qtZs);
		});		
	}
    
	//获取单选按钮初始状态
	$("input[name=xtbh]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("xtbh").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=sfyryt]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("sfyryt").value){
			$(this).attr("checked","checked"); 
		}
	});	
	$("input[name=sfktbg]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("sfktbg").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=sfwxzs]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("sfwxzs").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=sfwxzs]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("sfwxzs").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=jdqk]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("jdqk").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=gzztqk]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("gzztqk").value){
			$(this).attr("checked","checked"); 
		}
	});
	$("input[name=cywxzlnl]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("cywxzlnl").value){
			$(this).attr("checked","checked"); 
		}
	});	
	$("input[name=zqzlpj]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("zqzlpj").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=bylwnrtz]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("bylwnrtz").value){
			$(this).attr("checked","checked"); 
		}
	});	
	$("input[name=aqwc]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("aqwc").value){
			$(this).attr("checked","checked"); 
		}
	});		
	$("input[name=yscl]").each(function () {
		$(this).attr("disabled","disabled");
		if(this.value == document.getElementById("yscl").value){
			$(this).attr("checked","checked"); 
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

//点击返回按钮所触发的函数
$(function(){
	$("#returnBtn").click(function(){
		window.history.back();
	});
});