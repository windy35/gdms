package com.gdms.crud.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Student;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.service.CommentService;


@Controller
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	/**
	 * 学生给评论点赞
	 * @return
	 */
	@RequestMapping(value="StuZanComment",method=RequestMethod.POST)  
    @ResponseBody  
    public Msg StuZanComment(HttpSession httpSession,Integer commentid) {
		Student stu = (Student)httpSession.getAttribute("user");
		commentService.ZanComment(commentid,stu.getStudentid());
		return Msg.success();
	}
	
	/**
	 * 学生取消评论的赞
	 * @return
	 */
	@RequestMapping(value="StuCancelZanComment",method=RequestMethod.POST)  
    @ResponseBody  
    public Msg StuCancelZanComment(HttpSession httpSession,Integer commentid) {
		Student stu = (Student)httpSession.getAttribute("user");
		commentService.CannelZanComment(commentid,stu.getStudentid());
		return Msg.success();
	}	
	
	/**
	 * 教师给评论点赞
	 * @return
	 */
	@RequestMapping(value="TeacherZanComment",method=RequestMethod.POST)  
    @ResponseBody  
    public Msg TeacherZanComment(HttpSession httpSession,Integer commentid) {
		Teacher teacher = (Teacher)httpSession.getAttribute("user");
		commentService.ZanComment(commentid,teacher.getTeacherid());
		return Msg.success();
	}
	
	/**
	 * 教师取消评论的赞
	 * @return
	 */
	@RequestMapping(value="TeacherCancelZanComment",method=RequestMethod.POST)  
    @ResponseBody  
    public Msg TeacherCancelZanComment(HttpSession httpSession,Integer commentid) {
		Teacher teacher = (Teacher)httpSession.getAttribute("user");
		commentService.CannelZanComment(commentid,teacher.getTeacherid());
		return Msg.success();
	}		
}
