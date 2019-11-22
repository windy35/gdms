//点击返回按钮触发的函数
$(function(){
	$("#returnBtn").click(function(){
		window.location.href="JumpLoginPage";
	})
});

var totalRecord;		//总记录数
var current_pageNum;	//当前页面

//1、页面加载完成以后，直接发送一个ajax请求，要到分页数据
$(function(){
	//转到第一页
	to_page(1);
	
	$("#querybtn").click(function(){
		to_page(1);
	});	
});

function build_table(result){
	//清空table表格中的数据
	$("#Table tbody").empty();
	var noticelist = result.extend.pageInfo.list;
	//console.log(noticelist);
	$.each(noticelist,function(index,item){
		var NoticeIdTd = $("<input></input>").attr("type","hidden").attr("id","Noticeid").attr("value",item.noticeid);
		var ContextTd = $("<td></td>").append($("<a></a>").attr("target","_self").attr("href","JumpNoticeDetail?noticeid="+item.noticeid).attr("title",item.noticetitle).append(item.noticetitle)).append($("<span></span>").addClass("right").append(item.declaretime.substr(0,10)));
		
		//append方法执行完成以后还是返回原来的元素
		$("<tr></tr>").append(NoticeIdTd)
		.append(ContextTd)
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
			url:"getNoticelist",
			data:{"pn":pn,"noticetitle":$("#noticetitle").val()},
/*			url:"getNoticelist",
			data:{"pn":pn},*/
			type:"POST",
			success:function(result){
				//1、解析并显示用户数据
				build_table(result);
				//2、解析并显示分页信息
				build_page_info(result);
				//3、解析并显示分页条
				build_page_nav(result);
			}
		});			
}	