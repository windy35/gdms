var totalRecord;		//总记录数
var current_pageNum;	//当前页面

//获取字数
$(function(){	
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
});

$(function(){
	//转到第一页
	to_page(1);
});


function build_zqjcb_table(result){	
	//清空table表格中的数据
	$("#Table tbody").empty();
	var gds = result.extend.pageInfo.list;
	if(gds != null)
	$.each(gds,function(index,item){
		var graduationdesignidTd = $("<td></td>").append(item.graduationdesignid);
		var titleTd = $("<td></td>").append(item.graduationdesign.title);
		var typenameTd = $("<td></td>").append(item.graduationdesign.designtype.typename);
		var titlesourcenameTd = $("<td></td>").append(item.graduationdesign.titlesource.titlesourcename);
		if(item.zqjcbinfo != null)
		var uploadtimeTd = $("<td></td>").append(item.zqjcbinfo.uploadtime);
		if(item.zqjcbauditstatus != null)
		var zqjcbauditstatusnameTd = $("<td></td>").append(item.zqjcbauditstatus.auditstatusname);
		//为编辑按钮添加一个自定义的属性，来表示当前毕设的编号
		var checkBtn = $("<button></button>").addClass("btn btn-primary check_btn").append($("<span></span>").addClass("glyphicon glyphicon-search")).append("查看");
		checkBtn.attr("checkid",item.graduationdesignid);
		var updateBtn = $("<button></button>").addClass("btn btn-danger update_btn").append($("<span></span>").addClass("glyphicon glyphicon-tags")).append("修改");
		//为修改按钮添加一个自定义的属性来表示当前毕设的编号
		updateBtn.attr("updateid",item.graduationdesignid);
		
		//隐藏的毕设结果编号和开题报告信息编号
		var gdResultIdHidden = $("<td></td>").append($("<input></input>").attr("type","hidden").attr("value",item.graduationdesignresultid).attr("id","gdResultIdHidden"));
		var zqjcbinfoHidden =  $("<td></td>").append($("<input></input>").attr("type","hidden").attr("value",item.zqjcbinfoid).attr("id","zqjcbinfoHidden"));
		
		//append方法执行完成以后还是返回原来的元素
		$("<tr></tr>").append(graduationdesignidTd)
		.append(titleTd)
		.append(typenameTd)
		.append(titlesourcenameTd)
		.append(zqjcbauditstatusnameTd)
		.append(uploadtimeTd)
		.append(checkBtn)
		.append(updateBtn)
		.append(gdResultIdHidden)
		.append(zqjcbinfoHidden)
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
				build_zqjcb_table(result);
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
		var zqjcbinfoid = $("#zqjcbinfoHidden").val();
		var gdResultID = $("#gdResultIdHidden").val();
		window.location.href = "JumpZQJCBDetailPages?gdID="+gdID+"&gdResultID=" + gdResultID+"&zqjcbinfoid=" + zqjcbinfoid;
});
});

//是在按钮创建之前就绑定了click，因此要使用on()方法让创建按钮前绑定的事件生效
//点击修改按钮触发的函数
$(function(){
	$(document).on("click",".update_btn",function(){
		var zqjcinfoid = $("#zqjcbinfoHidden").val();
		window.location.href="JumpAlertZQJCBPage?zqjcinfoid=" + zqjcinfoid;
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
		reset_form("#zqjcbForm");
		var formData = new FormData(document.getElementById("zqjcbForm")); 
		$.ajax({
			url:"STUuploadZQJCB",
			data:formData,
			type:"POST",
			async: false, 
			cache: false, 
			contentType: false, 
			processData: false, 			
			success:function(result){
				if(result.code == 100){
					alert("提交成功！");
					window.location.href="JumpUploadZQJCBPage";
				}else{
					if(result.extend.error_Msg[0] != null){
						show_validate_msg("#qzrq","error",result.extend.error_Msg[0]);
						window.location.href="#qzrqTitle"
					}else if(result.extend.error_Msg[1] != null){
						show_validate_msg("#xtbhDiv","error",result.extend.error_Msg[1]);
						window.location.href="#xtbhDivTitle"
					}else if(result.extend.error_Msg[2] != null){
						show_validate_msg("#xtbhyy","error",result.extend.error_Msg[2]);
						window.location.href="#xtbhyyTitle"
					}else if(result.extend.error_Msg[3] != null){
						show_validate_msg("#sfyrytDiv","error",result.extend.error_Msg[3]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[4] != null){
						show_validate_msg("#sfktbgDiv","error",result.extend.error_Msg[4]);
						window.location.href="#sfktbgDivTitle"
					}else if(result.extend.error_Msg[5] != null){
						show_validate_msg("#sfwxzsDiv","error",result.extend.error_Msg[5]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[6] != null){
						show_validate_msg("#jdqkDiv","error",result.extend.error_Msg[6]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[7] != null){
						show_validate_msg("#jdzhyy","error",result.extend.error_Msg[7]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[8] != null){
						show_validate_msg("#gzztqkDiv","error",result.extend.error_Msg[8]);
						window.location.href="#sfyrytDivTitle"
					}else if(result.extend.error_Msg[9] != null){
						show_validate_msg("#cywxzlnlDiv","error",result.extend.error_Msg[9]);
						window.location.href="#cywxzlnlDivTitle"
					}else if(result.extend.error_Msg[10] != null){
						show_validate_msg("#zqzlpjDiv","error",result.extend.error_Msg[10]);
						window.location.href="#zqzlpjDivTitle"
					}else if(result.extend.error_Msg[11] != null){
						show_validate_msg("#bylwnrtzDiv","error",result.extend.error_Msg[11]);
						window.location.href="#bylwnrtzDivTitle"
					}else if(result.extend.error_Msg[12] != null){
						show_validate_msg("#zdcs","error",result.extend.error_Msg[12]);
						window.location.href="#zdcsTitle"
					}else if(result.extend.error_Msg[13] != null){
						show_validate_msg("#aqwcDiv","error",result.extend.error_Msg[13]);
						window.location.href="#aqwcDivTitle"
					}else if(result.extend.error_Msg[14] != null){
						show_validate_msg("#ysclDiv","error",result.extend.error_Msg[14]);
						window.location.href="#ysclDivTitle"
					}else if(result.extend.error_Msg[15] != null){
						show_validate_msg("#qt","error",result.extend.error_Msg[15]);
						window.location.href="#qtTitle"
					}
				}
			}
			});
	});
});