/**
 * 跳转到填写毕设选题页面 
 */
function JumpDeclareGD(){
	$.ajax({
		url:"JumpDeclareBSXT",
		type:"GET",		
		success:function(result){
			//console.log(result);
			if(result.code == 100){
				window.location.href="JumpDeclareBSXTSuccess";
			}else{
				alert("无法重复申报毕设选题");
			}
		},		
	});
}

//1、页面加载完成以后，直接发送一个ajax请求，要到分页数据
$(function(){
	//获取查询的题目类型和题目来源的下拉列表
	getxllb($("#tmlx"),$("#tmly"),$("#shzt"));
	//转到第一页
	to_page(1);
});

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
			var all = $("<option></option>").append("全部").attr("value",0);
			all.appendTo(ele1);
			$.each(result.extend.designtypelist,function(){
				var optionDesignType = $("<option></option>").append(this.typename).attr("value",this.typeid);
				optionDesignType.appendTo(ele1);
			});
			var all2 = $("<option></option>").append("全部").attr("value",0);
			all2.appendTo(ele2);
			//获取题目来源下拉列表			
			$.each(result.extend.titlesourcelist,function(){
				var optionTitleSource = $("<option></option>").append(this.titlesourcename).attr("value",this.titlesourceid);
				optionTitleSource.appendTo(ele2);
			});	
			var all3 = $("<option></option>").append("全部").attr("value",0);
			all3.appendTo(ele3);
			//获取题目来源下拉列表			
			$.each(result.extend.auditstatustypelist,function(){
				var optionTitleSource = $("<option></option>").append(this.auditstatusname).attr("value",this.auditstatusid);
				optionTitleSource.appendTo(ele3);
			});				
		}
	});	
}


function build_GD_table(result){
	//清空table表格中的数据
	$("#GDTable tbody").empty();
	var gds = result.extend.pageInfo.list;
	$.each(gds,function(index,item){
		var graduationdesignresultidTd = $("<td></td>").append(item.graduationdesignresultid);
		var graduationdesignidTd = $("<td></td>").append(item.graduationdesignid);
		var titleTd = $("<td></td>").append(item.graduationdesign.title);
		var typenameTd = $("<td></td>").append(item.graduationdesign.designtype.typename);
		var titlesourcenameTd = $("<td></td>").append(item.graduationdesign.titlesource.titlesourcename);
		var auditstatusTd = $("<td></td>").append(item.graduationdesign.bsxtauditstatus.auditstatusname);
		var declaretimeTd = $("<td></td>").append(item.choosetime);
		//为编辑按钮添加一个自定义的属性，来表示当前毕设的编号
		var checkBtn = $("<button></button>").addClass("btn btn-primary check_btn").append($("<span></span>").addClass("glyphicon glyphicon-search")).append("查看");
		checkBtn.attr("checkid",item.graduationdesignid);
		var alertBtn = $("<button></button>").addClass("btn btn-danger alert_btn").append($("<span></span>").addClass("glyphicon glyphicon-tags")).append("修改");
		//为修改按钮添加一个自定义的属性来表示当前毕设的编号
		alertBtn.attr("alertid",item.graduationdesignid);
		
		//append方法执行完成以后还是返回原来的元素
		$("<tr></tr>").append(graduationdesignresultidTd)
		.append(graduationdesignidTd)
		.append(titleTd)
		.append(typenameTd)
		.append(titlesourcenameTd)
		.append(auditstatusTd)
		.append(declaretimeTd)
		.append(checkBtn)
		.append(alertBtn)
		.appendTo("#GDTable tbody");
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
		//获取查询条件
		var xttm = 	$("#xttm").val();//选题题目
		var tmlx = 	$("#tmlx").val();//题目类型
		var tmly = 	$("#tmly").val();//题目来源
		var shzt = 	$("#shzt").val();//审核状态
		
		//console.log(xttm + tmlx + tmly + shzt + pn);		
		$.ajax({
			url:"QueryStudentGDResultlist",
			data:{"xttm":xttm,"tmlx":tmlx,"tmly":tmly,"shzt":shzt,"pn":pn,"type":"bsxt"},
			type:"POST",
			success:function(result){
				//console.log(result);
				//1、解析并显示用户数据
				build_GD_table(result);
				//2、解析并显示分页信息
				build_page_info(result);
				//3、解析并显示分页条
				build_page_nav(result);
				//清空查询内容
				resetQueryCondition();
			}
		});			
}	

//清空输入框的查询内容
function resetQueryCondition(){
	$("#bstm").val("");
	$("#tmlx").val(0);
	$("#tmly").val(0);
	$("#shzt").val(0);
}

//是在按钮创建之前就绑定了click，因此要使用on()方法让创建按钮前绑定的事件生效
//点击查看按钮，跳转到毕设的详细信息
$(function(){
	$(document).on("click",".check_btn",function(){
		var gdResultID = $(this).parents("tr").find("td:eq(0)").text();
		var gdID = $(this).parents("tr").find("td:eq(1)").text();
		window.location.href = "JumpBSXTDetailPages?gdResultID="+ gdResultID + "&gdID=" + gdID;	
});
});

//是在按钮创建之前就绑定了click，因此要使用on()方法让创建按钮前绑定的事件生效
//点击修改按钮触发的函数
$(function(){
	$(document).on("click",".alert_btn",function(){
	var gdResultID = $(this).parents("tr").find("td:eq(0)").text();
	var gdID = $(this).parents("tr").find("td:eq(1)").text();
	window.location.href = "StuJumpAlertGDPages?gdID="+gdID+"&gdResultID=" + gdResultID;				
});
});

//查询按钮触发的函数
$(function(){
$("#gd_select_model_btn").click(function(){
		to_page(1);
	});
});

