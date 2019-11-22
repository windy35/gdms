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
});

$(function(){
	//转到第一页
	to_page(1);
});


function build_bylw_table(result){	
	//清空table表格中的数据
	$("#Table tbody").empty();
	var gds = result.extend.pageInfo.list;
	if(gds != null)
	$.each(gds,function(index,item){
		var graduationdesignidTd = $("<td></td>").append(item.graduationdesignid);
		var titleTd = $("<td></td>").append(item.graduationdesign.title);
		var typenameTd = $("<td></td>").append(item.graduationdesign.designtype.typename);
		var titlesourcenameTd = $("<td></td>").append(item.graduationdesign.titlesource.titlesourcename);
		if(item.bylwinfo != null)
		var uploadtimeTd = $("<td></td>").append(item.bylwinfo.uploadtime);
		if(item.bylwauditstatus != null)
		var bylwauditstatusnameTd = $("<td></td>").append(item.bylwauditstatus.auditstatusname);
		//为编辑按钮添加一个自定义的属性，来表示当前毕设的编号
		var checkBtn = $("<button></button>").addClass("btn btn-primary check_btn").append($("<span></span>").addClass("glyphicon glyphicon-search")).append("查看");
		checkBtn.attr("checkid",item.graduationdesignid);
		var updateBtn = $("<button></button>").addClass("btn btn-danger update_btn").append($("<span></span>").addClass("glyphicon glyphicon-tags")).append("修改");
		//为修改按钮添加一个自定义的属性来表示当前毕设的编号
		updateBtn.attr("updateid",item.graduationdesignid);
		
		//隐藏的毕设结果编号和开题报告信息编号
		var gdResultIdHidden = $("<td></td>").append($("<input></input>").attr("type","hidden").attr("value",item.graduationdesignresultid).attr("id","gdResultIdHidden"));
		var bylwinfoHidden =  $("<td></td>").append($("<input></input>").attr("type","hidden").attr("value",item.bylwinfoid).attr("id","bylwinfoHidden"));
		
		//append方法执行完成以后还是返回原来的元素
		$("<tr></tr>").append(graduationdesignidTd)
		.append(titleTd)
		.append(typenameTd)
		.append(titlesourcenameTd)
		.append(bylwauditstatusnameTd)
		.append(uploadtimeTd)
		.append(checkBtn)
		.append(updateBtn)
		.append(gdResultIdHidden)
		.append(bylwinfoHidden)
		.appendTo("#Table tbody");
	});			
}

function build_page_info(result){
	//清空页面信息中的数据
	$("#page_info_area").empty();
	$("#page_info_area").append("当前页码："+ result.extend.pageInfo.pageNum +"页，总" + result.extend.pageInfo.pages+" 页，共" + result.extend.pageInfo.total + "条数据");
	totalRecord = result.extend.pageInfo.total;
	current_pageNum = result.extend.pageInfo.pageNum;
}

function build_page_nav(result){
	//清空分页条中的数据
	$("#page_nav_area").empty();
	//$("#page_nav_area").
	var ul = $("<ul></ul>").addClass("pagination");
		
	var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
	var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));

	//如果没有前一页，首页和前一页设置为不可用
	if(result.extend.pageInfo.hasPreviousPage == false){
		firstPageLi.addClass("disabled");
		prePageLi.addClass("disabled");
	}else{
		//为元素添加点击翻页事件
		firstPageLi.click(function(){
			to_page(1);
		});			
		
		prePageLi.click(function(){
			//如果不是第一页，则跳转到前一页
			//if(result.extend.pageInfo.pageNum > 1)
				to_page(result.extend.pageInfo.pageNum - 1);
		});					
	}
	
	var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
	var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页").attr("href","#"));									
	
	
	//如果没有下一页，尾页和下一页设置为不可用
	if(result.extend.pageInfo.hasNextPage == false){
		nextPageLi.addClass("disabled");
		lastPageLi.addClass("disabled");
	}else{
		//为元素添加点击翻页事件
		nextPageLi.click(function(){
			//如果不是最后一页，则跳转到前一页
			//if(result.extend.pageInfo.pageNum < result.extend.pageInfo.pages)
				to_page(result.extend.pageInfo.pageNum + 1);
		});			
		
		lastPageLi.click(function(){
			to_page(result.extend.pageInfo.pages);
		});				
	}			
	
	//添加首页和前一页的提示
	ul.append(firstPageLi).append(prePageLi);
	
	//遍历页码号
	$.each(result.extend.pageInfo.navigatepageNums,function(index,item){				
		var numLi = $("<li></li>").append($("<a></a>").append(item));
		//如果当前页码等于正在遍历的页码
		if(result.extend.pageInfo.pageNum == item){
			numLi.addClass("active");
		}
		//绑定对应的点击事件跳转到对应的页码
		numLi.click(function(){
			to_page(item);
		});				
		//给ul添加页码提示
		ul.append(numLi);
	});
	
	//添加下一页和尾页的提示
	ul.append(nextPageLi).append(lastPageLi);
	
	//把ul加入到nav中
	var navEle = $("<nav></nav>").append(ul);
	
	navEle.appendTo("#page_nav_area");
}	

//跳转到某一页
function to_page(pn){	
		$.ajax({
			url:"QueryStudentGDResultlist",
			data:{"pn":pn},
			type:"POST",
			success:function(result){
				//console.log(result)
				//1、解析并显示用户数据
				build_bylw_table(result);
				//2、解析并显示分页信息
				build_page_info(result);
				//3、解析并显示分页条
				build_page_nav(result);
			}
		});			
}	


//是在按钮创建之前就绑定了click，因此要使用on()方法让创建按钮前绑定的事件生效
//点击查看按钮，跳转到毕设的详细信息
$(function(){
	$(document).on("click",".check_btn",function(){		
		var gdID = $(this).parents("tr").find("td:eq(0)").text();
		var bylwinfoid = $("#bylwinfoHidden").val();
		var gdResultID = $("#gdResultIdHidden").val();
		window.location.href = "JumpBYLWDetailPages?gdID="+gdID+"&gdResultID=" + gdResultID+"&bylwinfoid=" + bylwinfoid;
});
});

//是在按钮创建之前就绑定了click，因此要使用on()方法让创建按钮前绑定的事件生效
//点击修改按钮触发的函数
$(function(){
	$(document).on("click",".update_btn",function(){
		var bylwinfoid = $("#bylwinfoHidden").val();
		window.location.href="JumpAlertBYLWPage?bylwinfoid=" + bylwinfoid;
});
});

//查询按钮触发的函数
$(function(){
$("#gd_select_model_btn").click(function(){
		to_page(1);
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

//点击上传文件按钮所触发的函数
$(function(){
	$("#submitBtn").click(function(){
		reset_form("#bylwForm");
		var formData = new FormData(document.getElementById("bylwForm")); 
		$.ajax({
			url:"STUuploadBYLW",
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 			
			success:function(result){
				if(result.code == 100){
					alert("提交成功！");
					window.location.href="JumpUploadBYLWPage";
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#gjc","error",result.extend.error_Msg[0]);
						window.location.href="#gjcTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#cxd","error",result.extend.error_Msg[1]);
						window.location.href="#cxdTitle"
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#zwzy","error",result.extend.error_Msg[2]);
						window.location.href="#zwzyTitle"
					}else if(result.extend.error_Msg[3] != null){
						show_validate_msg("#ywzy","error",result.extend.error_Msg[3]);
						window.location.href="#ywzyTitle"
					}else if(result.extend.error_Msg[4] != null){
						show_validate_msg("#qt","error",result.extend.error_Msg[4]);
						window.location.href="#qtTitle"
					}
				}
			}
			});
	});
});