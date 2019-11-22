package com.gdms.crud.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Notice;
import com.gdms.crud.service.NoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 处理通知相关的功能
 * @author 周汶锋
 *
 */
@Controller
public class NoticeController {
	@Autowired
	NoticeService noticeService; 
	
    @RequestMapping(value="getNoticelist",method=RequestMethod.POST)
    @ResponseBody
	public Msg getAllNotice(@RequestParam(value="pageNum",defaultValue="10")Integer pageNum,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model,Notice notice){
	PageHelper.startPage(pn,pageNum);		
	List<Notice> noticelist = noticeService.getNoticeBytitle(notice);
	/*List<Notice> noticelist = noticeService.getAllNotice();*/
	//使用PageInfo包装查询后的结果
	//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
	//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
	@SuppressWarnings({ "rawtypes", "unchecked" })
	PageInfo page = new PageInfo(noticelist,5);
	model.addAttribute("pageInfo",page);
	return Msg.success().add("pageInfo",page);
	}
    
	/**
	 * 删除某个通知信息
	 * @return
	 */
	@RequestMapping(value="DeleteNoticeInfoById",method=RequestMethod.POST)  
    @ResponseBody
	 public void DeleteNoticeInfoById(@RequestParam("noticeid")Integer noticeid,HttpSession httpSession) {
		noticeService.DeleteNoticeInfoById(noticeid);
	}    
}