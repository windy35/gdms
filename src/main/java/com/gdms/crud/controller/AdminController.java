package com.gdms.crud.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gdms.crud.bean.Admin;
import com.gdms.crud.bean.Ktbginfo;
import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Notice;
import com.gdms.crud.bean.Password;
import com.gdms.crud.bean.Student;
import com.gdms.crud.service.AdminService;
import com.gdms.crud.service.NoticeService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	@Autowired
	NoticeService noticeService;
	/**
	 * 修改管理员用户密码时调用
	 * @return
	 */
	@RequestMapping(value="alertAdminPW",method=RequestMethod.POST)  
    @ResponseBody  
    public Msg alertAdminPW(HttpSession httpSession,@ModelAttribute Password pw) {
		//获取session中的用户信息
		Admin admin = (Admin)httpSession.getAttribute("user");
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
        else if(admin.getPassword().equals(pw.getComfirmPassword()))
        	error_Msg[2] = "再次输入新用户密码与原密码一样"; 
        else if(!pw.getOldPassword().matches(regx)) 
        	error_Msg[0] = "请输入6~16数字或字母的原密码";
        else if(!pw.getNewPassword().matches(regx)) 
            error_Msg[1] = "请输入6~16数字或字母的新密码";
        else if(!pw.getComfirmPassword().matches(regx)) 
            error_Msg[2] = "请输入6~16数字或字母的确认密码";
        else if(!adminService.CheckPassword(admin.getAdminid(), pw.getOldPassword())) 
            error_Msg[0] = "输入的用户原密码有误";        
        else {
            admin.setPassword(pw.getComfirmPassword());
            adminService.update(admin);
            httpSession.setAttribute("user",admin);
    		return Msg.success();	
        }
        
       	return Msg.fail().add("error_Msg", error_Msg);
	}
	
	/**
	 * 修改管理员用户信息时调用
	 * @return
	 */
	@RequestMapping(value="alertAdminUserInfo",method=RequestMethod.POST)  
    @ResponseBody  	
	 public Msg AlertUserInfo(HttpSession httpSession,@ModelAttribute Admin temp) {
			//获取session中的用户信息
	    	Admin admin = (Admin)httpSession.getAttribute("user");			
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
	            admin.setPhone(temp.getPhone());
	            admin.setEmail(temp.getEmail());
	            adminService.update(admin);
	            httpSession.setAttribute("user",admin);
	    		return Msg.success();	
	        }
	        
	       	return Msg.fail().add("error_Msg", error_Msg);
		}	
	
	/**
	 * 发布通知
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping(value="submitNotice",method=RequestMethod.POST)  
    @ResponseBody  	
	 public Msg submitNotice(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,Notice notice) throws IllegalStateException, IOException {
    	//用于存储错误信息
		Admin admin = (Admin)session.getAttribute("user");
    	String[] error_Msg = new String[2];
    	if(notice.getNoticetitle().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(notice.getNoticecontent().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else {  
    		if(files.getSize() != 0) {
    			//设置附件名称
    			notice.setFjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
                SimpleDateFormat filenamesdf = new SimpleDateFormat("yyyyMMddHHmmss",Locale.CHINA);

            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\Notice\\" + admin.getAdminid() + filenamesdf.format(new Date()) + "Notice" + Filehzm;
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		System.out.println(path);
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		System.out.println(path);
            		notice.setFjpath(path);
    		}
    		//设置发布者姓名
    		notice.setNotifier(admin.getAdminname());
			//设置上传时间    		
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm",Locale.CHINA);
			notice.setDeclaretime(sdf.format(new Date()));
			noticeService.setNotice(notice);
    		return Msg.success();	
    	}
		return Msg.fail().add("error_Msg", error_Msg);
	}
	
}
