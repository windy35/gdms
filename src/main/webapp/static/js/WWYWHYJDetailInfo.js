//获取字数
$(function(){	
	if(document.getElementById("wwywnr") != null){
		var wwywnrZs = document.getElementById("wwywnr").value.length;
		$("#wwywnrzs").append(wwywnrZs);
	$('#wwywnr').bind('input',function(){  
		wwywnrZs = document.getElementById("wwywnr").value.length;
		$("#wwywnrzs").empty();
		$("#wwywnrzs").append(wwywnrZs);
		});		
	}
	if(document.getElementById("ywnr") != null){
		var ywnrZs = document.getElementById("ywnr").value.length;
		$("#ywnrzs").append(ywnrZs);
	$('#ywnr').bind('input',function(){  
		ywnrZs = document.getElementById("ywnr").value.length;
		$("#ywnrzs").empty();
		$("#ywnrzs").append(ywnrZs);
		});		
	}	
	$('#returnBtn').click(function(){
		window.history.back();
	});
});
