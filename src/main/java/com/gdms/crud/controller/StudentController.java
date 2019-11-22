package com.gdms.crud.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdms.crud.bean.Lyhdtitleinfo;
import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Password;
import com.gdms.crud.bean.Student;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.service.CommentService;
import com.gdms.crud.service.LyhdtitleinfoService;
import com.gdms.crud.service.StudentService;
import com.gdms.crud.service.TeacherService;

/**
 * 与Student对象相关的功能
 * @author 周汶锋
 *
 */
@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;	
	@Autowired
	CommentService commentService;
	@Autowired
	LyhdtitleinfoService lyhdtitleinfoService;
	/**
	 * 修改学生用户密码时调用
	 * @return
	 */
	@RequestMapping(value="alertStudentPW",method=RequestMethod.POST)  
    @ResponseBody  
    public Msg AlertPassword(HttpSession httpSession,@ModelAttribute Password pw) {
		//获取session中的用户信息
    	Student stu = (Student)httpSession.getAttribute("user");
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
        else if(stu.getPassword().equals(pw.getComfirmPassword()))
        	error_Msg[2] = "再次输入新用户密码与原密码一样"; 
        else if(!pw.getOldPassword().matches(regx)) 
        	error_Msg[0] = "请输入6~16数字或字母的原密码";
        else if(!pw.getNewPassword().matches(regx)) 
            error_Msg[1] = "请输入6~16数字或字母的新密码";
        else if(!pw.getComfirmPassword().matches(regx)) 
            error_Msg[2] = "请输入6~16数字或字母的确认密码";
        else if(!studentService.CheckPassword(stu.getStudentid(), pw.getOldPassword())) 
            error_Msg[0] = "输入的用户原密码有误";        
        else {
            stu.setPassword(pw.getComfirmPassword());
            studentService.update(stu);
            httpSession.setAttribute("user",stu);
    		return Msg.success();	
        }
        
       	return Msg.fail().add("error_Msg", error_Msg);
	}
	
	/**
	 * 修改学生用户信息时调用
	 * @return
	 */
	@RequestMapping(value="alertStudentUserInfo",method=RequestMethod.POST)  
    @ResponseBody  	
	 public Msg AlertUserInfo(HttpSession httpSession,@ModelAttribute Student temp) {
			//获取session中的用户信息
	    	Student stu = (Student)httpSession.getAttribute("user");			
			//判断手机号码的格式是否合法
			String regx = "^1[358]\\d{9}$";
			//判断邮箱的格式是否合法
			String regx2 = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
			//用于存放错误信息
			String[] error_Msg = new String[2];
	        if("".equals(temp.getPhone()))
	        	error_Msg[0] = "请输入手机号码";
	        else if("".equals(temp.getEmail()))
	        	error_Msg[1] = "请输入邮箱地址"; 
	        else if(!temp.getPhone().matches(regx)) 
	        	error_Msg[0] = "请输入正确格式的手机号码";
	        else if(!temp.getEmail().matches(regx2)) 
	        	error_Msg[1] = "请输入正确格式的邮箱地址";  
	        else {
	            stu.setPhone(temp.getPhone());
	            stu.setEmail(temp.getEmail());
	            studentService.update(stu);
	            httpSession.setAttribute("user",stu);
	    		return Msg.success();	
	        }
	        
	       	return Msg.fail().add("error_Msg", error_Msg);
		}	
	
	/**
	 * 学生提交评论内容
	 * @return
	 */
	@RequestMapping(value="StusubmitComment",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg StusubmitComment(@RequestParam("plnr")String plnr,@RequestParam("titleid")Integer titleid,HttpSession httpSession) {
		//获取session中的用户信息
    	Student student = (Student)httpSession.getAttribute("user");	
		//用于存储错误信息
		String error_Msg[] = new String[1];
		if(plnr.trim().equals("")) {
			error_Msg[0]="请输入";			
		}else {
			commentService.StudentSubmitComment(student, plnr, titleid);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}	
	
	/**
	 * 学生提出问题
	 * @return
	 */
	@RequestMapping(value="StusubmitQuestion",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg StusubmitQuestion(Lyhdtitleinfo lyhdtitleinfo,HttpSession httpSession) {
		//获取session中的用户信息
    	Student student = (Student)httpSession.getAttribute("user");	
		//用于存储错误信息
		String error_Msg[] = new String[3];
		if(lyhdtitleinfo.getTypeid() == 0) {
			error_Msg[0]="请选择";			
		}else if(lyhdtitleinfo.getTitle().trim().equals("")){
			error_Msg[1]="请输入";			
		}else if(lyhdtitleinfo.getContext().trim().equals("")){
			error_Msg[2]="请输入";			
		}else {
			//设置学生信息
			lyhdtitleinfo.setStudentid(student.getStudentid());
			lyhdtitleinfo.setStudent(student);
			//设置指导老师编号
			lyhdtitleinfo.setInstructorid(student.getInstrutorid());
			//设置提问时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			lyhdtitleinfo.setSubmittime(sdf.format(new Date()));    
			lyhdtitleinfoService.submitlyhdinfo(lyhdtitleinfo);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}		
	
	/**
	 * 获取某个学生信息
	 * @param studentid
	 * @param httpSession
	 * @return
	 */
	@RequestMapping(value="GetOneStuInfo",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg GetOneStuInfo(@RequestParam("studentid")String studentid,HttpSession httpSession) {
		Student stu = studentService.getOneStuInfo(studentid);
		return Msg.success().add("stu", stu);
	}
	
	/**
	 * 通过编号删除学生信息
	 * @return
	 */
	@RequestMapping(value="DeleteStuInfoById",method=RequestMethod.POST)  
    @ResponseBody
	 public void DeleteStuInfoById(@RequestParam("studentid")String studentid,HttpSession httpSession) {
		studentService.DeleteOneStu(studentid);
	}
	
	/**
	 * 添加一个学生信息
	 * @return
	 */
	@RequestMapping(value="addStudent",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg addStudent(Student student,HttpSession httpSession) {
		//正则表达式
		String pwregx = "^[0-9A-Za-z]{6,16}$";
		String phoneregx = "^1[358]\\d{9}$";
		String emailregx = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
		//用于存储错误信息
		String error_Msg[] = new String[10];
		if("".equals(student.getStudentid().trim())) {
			error_Msg[0] = "请输入学生编号";
		}else if(student.getStudentid().length() != 13) {
			error_Msg[0] = "请输入13位学生编号";
		}else if(studentService.checkStudentCF(student.getStudentid())) {
			error_Msg[0] = "输入的学生编号已存在";
		}else if("".equals(student.getName().trim())) {
			error_Msg[1] = "请输入学生姓名";
		}else if("".equals(student.getPassword())) {
			error_Msg[2] = "请输入密码";
		}else if(!student.getPassword().matches(pwregx)) {
			error_Msg[2] = "请输入6~16数字或字母的原密码";
		}else if(student.getDepartmentid() == 0) {
			error_Msg[3] = "请选择";
		}else if(student.getMajorid() == 0) {
			error_Msg[4] = "请选择";
		}else if(student.getClassid() == 0) {
			error_Msg[5] = "请选择";
		}else if("".equals(student.getPhone().trim())) {
			error_Msg[6] = "请输入手机号码";
		}else if("".equals(student.getEmail().trim())) {
			error_Msg[7] = "请输入邮箱地址";
		}else if(!student.getPhone().matches(phoneregx)) {
			error_Msg[6] = "请输入正确格式的手机号码";
		}else if(!student.getEmail().matches(emailregx)) {
			error_Msg[7] = "请输入正确格式的邮箱地址";
		}else if(student.getGradeid() == 0) {
			error_Msg[8] = "请选择";
		}else if("请选择".equals(student.getGender())) {
			error_Msg[9] = "请选择";
		}else {
			studentService.InsertOneStu(student);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}	
	
	/**
	 * 修改一个学生信息
	 * @return
	 */
	@RequestMapping(value="alertStudent",method=RequestMethod.POST)  
    @ResponseBody
	 public Msg alertStudent(Student student,HttpSession httpSession) {
		//正则表达式
		String pwregx = "^[0-9A-Za-z]{6,16}$";
		String phoneregx = "^1[358]\\d{9}$";
		String emailregx = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
		//用于存储错误信息
		String error_Msg[] = new String[9];
		if("".equals(student.getName().trim())) {
			error_Msg[0] = "请输入学生姓名";
		}else if("".equals(student.getPassword())) {
			error_Msg[1] = "请输入密码";
		}else if(!student.getPassword().matches(pwregx)) {
			error_Msg[1] = "请输入6~16数字或字母的原密码";
		}else if(student.getDepartmentid() == 0) {
			error_Msg[2] = "请选择";
		}else if(student.getMajorid() == 0) {
			error_Msg[3] = "请选择";
		}else if(student.getClassid() == 0) {
			error_Msg[4] = "请选择";
		}else if("".equals(student.getPhone().trim())) {
			error_Msg[5] = "请输入手机号码";
		}else if("".equals(student.getEmail().trim())) {
			error_Msg[6] = "请输入邮箱地址";
		}else if(!student.getPhone().matches(phoneregx)) {
			error_Msg[5] = "请输入正确格式的手机号码";
		}else if(!student.getEmail().matches(emailregx)) {
			error_Msg[6] = "请输入正确格式的邮箱地址";
		}else if(student.getGradeid() == 0) {
			error_Msg[7] = "请选择";
		}else if("请选择".equals(student.getGender())) {
			error_Msg[8] = "请选择";
		}else {
			studentService.update(student);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}		
	
}
