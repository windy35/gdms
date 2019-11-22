var totalRecord;		//总记录数
var current_pageNum;	//当前页面

//获取字数
$(function(){	
	if(document.getElementById("gjc") != null){
		var gjcZs = document.getElementById("gjc").value.length;
		$("#gjczs").append(gjcZs);
	$('#gjc').bind('input',function(){  
		gjcZs = document.getElementById("gjc").value.length;
		$("#gjczs").empty();
		$("#gjczs").append(gjcZs);
		});		
	}
	if(document.getElementById("cxd") != null){
		var cxdZs = document.getElementById("cxd").value.length;
		$("#cxdzs").append(cxdZs);
	$('#cxd').bind('input',function(){  
		cxdZs = document.getElementById("cxd").value.length;
		$("#cxdzs").empty();
		$("#cxdzs").append(cxdZs);
		});		
	}
	if(document.getElementById("zwzy") != null){
		var zwzyZs = document.getElementById("zwzy").value.length;
		$("#zwzyzs").append(zwzyZs);
	$('#zwzy').bind('input',function(){  
		zwzyZs = document.getElementById("zwzy").value.length;
		$("#zwzyzs").empty();
		$("#zwzyzs").append(zwzyZs);
		});		
	}		
	if(document.getElementById("ywzy") != null){
		var ywzyZs = document.getElementById("ywzy").value.length;
		$("#ywzyzs").append(ywzyZs);
	$('#ywzy').bind('input',function(){  
		ywzyZs = document.getElementById("ywzy").value.length;
		$("#ywzyzs").empty();
		$("#ywzyzs").append(ywzyZs);
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
	//返回按钮
	$("#returnBtn").click(function(){
		window.history.back();
	});	
});
