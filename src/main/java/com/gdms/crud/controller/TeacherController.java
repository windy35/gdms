package com.gdms.crud.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Password;
import com.gdms.crud.bean.Student;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.service.CommentService;
import com.gdms.crud.service.TeacherService;

/**
 * 与Teacher对象相关的功能
 * @author 周汶锋
 *
 */
@Controller
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	@Autowired
	CommentService commentService;
	/**
	 * 修改教师用户密码时调用
	 * @return
	 */
	@RequestMapping(value="alertTeacherPW",method=RequestMethod.POST)  
    @ResponseBody  
    public Msg AlertPassword(HttpSession httpSession,@ModelAttribute Password pw) {
		//获取session中的用户信息
    	Teacher teacher = (Teacher)httpSession.getAttribute("user");
		//先判断密码是否为合法的表达式，6~16为数字和字母的正则表达式 String regx = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$";
		//先判断密码是否为合法的表达式，6~16为数字或字母的正则表达式 
		String regx = "^[0-9A-Za-z]{6,16}$";
		//用于存放错误信息
		String[] error_Msg = new String[3];
        if("".equals(pw.getOldPassword()))
        	error_Msg[0] = "请输入当前用户密码";
        else if("".equals(pw.getNewPassword()))
        	error_Msg[1] = "请输入新用户密码"; 
        else if("".equals(pw.getComfirmPassword()))
        	error_Msg[2] = "请输入确认的新用户密码";
        else if(!pw.getNewPassword().equals(pw.getComfirmPassword()))
        	error_Msg[2] = "两次输入的新密码不一致";
        else if(teacher.getPassword().equals(pw.getComfirmPassword()))
        	error_Msg[2] = "再次输入新用户密码与原密码一样"; 
        else if(!pw.getOldPassword().matches(regx)) 
        	error_Msg[0] = "请输入6~16数字或字母的原密码";
        else if(!pw.getNewPassword().matches(regx)) 
            error_Msg[1] = "请输入6~16数字或字母的新密码";
        else if(!pw.getComfirmPassword().matches(regx)) 
            error_Msg[2] = "请输入6~16数字或字母的确认密码";
        else if(!teacherService.CheckPassword(teacher.getTeacherid(), pw.getOldPassword())) 
            error_Msg[0] = "输入的用户原密码有误";        
        else {
        	teacher.setPassword(pw.getComfirmPassword());
            teacherService.update(teacher);
            httpSession.setAttribute("user",teacher);
    		return Msg.success();	
        }
        
       	return Msg.fail().add("error_Msg", error_Msg);
	}
	
	/**
	 * 修改教师用户信息时调用
	 * @return
	 */
	@RequestMapping(value="alertTeacherUserInfo",method=RequestMethod.POST)  
    @ResponseBody  	
	 public Msg AlertUserInfo(HttpSession httpSession,@ModelAttribute Teacher temp) {
			//获取session中的用户信息
	    	Teacher teacher = (Teacher)httpSession.getAttribute("user");			
			//判断手机号码的格式是否合法
			String regx = "^1[358]\\d{9}$";
			//判断邮箱的格式是否合法
			String regx2 = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
			//用于存放错误信息
			String[] error_Msg = new String[2];
	        if("".equals(temp.getPhone()))
	        	error_Msg[0] = "请输入手机号码";
	        else if("".equals(temp.getEmail()))
	        	error_Msg[1] = "请输入电话号码"; 
	        else if(!temp.getPhone().matches(regx)) 
	        	error_Msg[0] = "请输入正确格式的手机号码";
	        else if(!temp.getEmail().matches(regx2)) 
	        	error_Msg[1] = "请输入正确格式的邮箱地址";  
	        else {
	        	teacher.setPhone(temp.getPhone());
	        	teacher.setEmail(temp.getEmail());
	            teacherService.update(teacher);
	            httpSession.setAttribute("user",teacher);
	    		return Msg.success();	
	        }
	        
	       	return Msg.fail().add("error_Msg", error_Msg);
		}	
		
	/**
	 * 教师提交评论内容
	 * @return
	 */
	@RequestMapping(value="submitComment",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg submitComment(@RequestParam("plnr")String plnr,@RequestParam("titleid")Integer titleid,HttpSession httpSession) {
		//获取session中的用户信息
    	Teacher teacher = (Teacher)httpSession.getAttribute("user");	
		//用于存储错误信息
		String error_Msg[] = new String[1];
		if(plnr.trim().equals("")) {
			error_Msg[0]="请输入";			
		}else {
			commentService.TeacherSubmitComment(teacher, plnr,titleid);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}
	
	/**
	 * 通过编号删除教师信息
	 * @return
	 */
	@RequestMapping(value="DeleteTeacherInfoById",method=RequestMethod.POST)  
    @ResponseBody
	 public void DeleteTeacherInfoById(@RequestParam("teacherid")String teacherid,HttpSession httpSession) {
		teacherService.DeleteOneTeacher(teacherid);
	}	
	
	/**
	 * 添加一个教师信息
	 * @return
	 */
	@RequestMapping(value="addTeacher",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg addTeacher(Teacher teacher,HttpSession httpSession) {
		//正则表达式
		String pwregx = "^[0-9A-Za-z]{6,16}$";
		String phoneregx = "^1[358]\\d{9}$";
		String emailregx = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
		//用于存储错误信息
		String error_Msg[] = new String[10];
		if("".equals(teacher.getTeacherid().trim())) {
			error_Msg[0] = "请输入教师编号";
		}else if(teacher.getTeacherid().length() != 8) {
			error_Msg[0] = "请输入8位教师编号";
		}else if(teacherService.checkteacherCF(teacher.getTeacherid())) {
			error_Msg[0] = "输入的教师编号已存在";
		}else if("".equals(teacher.getName().trim())) {
			error_Msg[1] = "请输入教师姓名";
		}else if("".equals(teacher.getPassword())) {
			error_Msg[2] = "请输入密码";
		}else if(!teacher.getPassword().matches(pwregx)) {
			error_Msg[2] = "请输入6~16数字或字母的密码";
		}else if(teacher.getDepartmentid() == 0) {
			error_Msg[3] = "请选择";
		}else if("".equals(teacher.getPhone().trim())) {
			error_Msg[4] = "请输入手机号码";
		}else if("".equals(teacher.getEmail().trim())) {
			error_Msg[5] = "请输入邮箱地址";
		}else if(!teacher.getPhone().matches(phoneregx)) {
			error_Msg[4] = "请输入正确格式的手机号码";
		}else if(!teacher.getEmail().matches(emailregx)) {
			error_Msg[5] = "请输入正确格式的邮箱地址";
		}else if("请选择".equals(teacher.getGender())) {
			error_Msg[6] = "请选择";
		}else if("请选择".equals(teacher.getPositionaltitle())) {
			error_Msg[7] = "请选择";
		}else {
			teacherService.InsertOneTeacher(teacher);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}
	
	/**
	 * 修改一个教师信息
	 * @return
	 */
	@RequestMapping(value="alertTeacher",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg alertTeacher(Teacher teacher,HttpSession httpSession) {
		//正则表达式
		String pwregx = "^[0-9A-Za-z]{6,16}$";
		String phoneregx = "^1[358]\\d{9}$";
		String emailregx = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
		//用于存储错误信息
		String error_Msg[] = new String[9];
		if("".equals(teacher.getName().trim())) {
			error_Msg[0] = "请输入教师姓名";
		}else if("".equals(teacher.getPassword())) {
			error_Msg[1] = "请输入密码";
		}else if(!teacher.getPassword().matches(pwregx)) {
			error_Msg[1] = "请输入6~16数字或字母的密码";
		}else if(teacher.getDepartmentid() == 0) {
			error_Msg[2] = "请选择";
		}else if("".equals(teacher.getPhone().trim())) {
			error_Msg[3] = "请输入手机号码";
		}else if("".equals(teacher.getEmail().trim())) {
			error_Msg[4] = "请输入邮箱地址";
		}else if(!teacher.getPhone().matches(phoneregx)) {
			error_Msg[3] = "请输入正确格式的手机号码";
		}else if(!teacher.getEmail().matches(emailregx)) {
			error_Msg[4] = "请输入正确格式的邮箱地址";
		}else if("请选择".equals(teacher.getGender())) {
			error_Msg[5] = "请选择";
		}else if("请选择".equals(teacher.getPositionaltitle())) {
			error_Msg[6] = "请选择";
		}else {
			teacherService.update(teacher);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}		

	/**
	 * 获取某个教师信息
	 * @param studentid
	 * @param httpSession
	 * @return
	 */
	@RequestMapping(value="GetOneTeacherInfo",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg GetOneTeacherInfo(@RequestParam("teacherid")String teacherid,HttpSession httpSession) {
		Teacher teacher = teacherService.getOneTeacherInfo(teacherid);
		return Msg.success().add("teacher", teacher);
	}	
}
