package com.gdms.crud.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.bean.Teachernotice;
import com.gdms.crud.bean.Teachernotice;
import com.gdms.crud.service.TeacherNoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 处理教师发送通知相关的功能
 * @author 周汶锋
 *
 */
@Controller
public class TeacherNoticeController {
	@Autowired
	TeacherNoticeService teacherNoticeService; 
	
	/**
	 * 教师发布推送通知
	 * @param teacherNotice
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
    @RequestMapping(value="SetTeacherNotice",method=RequestMethod.POST)
    @ResponseBody
	public Msg SetTeacherNotice(@RequestParam(required = false) MultipartFile files,Teachernotice teacherNotice,HttpSession session,HttpServletRequest request) throws IllegalStateException, IOException{
    	Teacher teacher = (Teacher)session.getAttribute("user");
    	if(files.getSize() != 0) {      
			//设置附件名称
			teacherNotice.setFjname(files.getOriginalFilename());
    		// 文件原始名称
            String originalFileName = files.getOriginalFilename();
            //获取文件的后缀名
            String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
        		//获取当前时间
        		//SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        		//获取文件需要上传到的本地位置
        		//String path = "D:\\Java\\eclipseProject\\ssm_gdms\\src\\main\\webapp\\static\\file\\Notice\\" + teacher.getTeacherid() + "NOTICE" + Filehzm;
        		//获取文件需要上传到的服务器的位置
	    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss",Locale.CHINA);
        		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\Notice\\" + teacher.getTeacherid() + sdf.format(new Date()) + "NOTICE" + Filehzm;
        		//创建需要上传的文件对象
        		File newFile = new File(path);
        		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
        		path = path.replace("\\","%2F");
        		path = path.replace(" ","%20");            		
        		//将需要上传的本地文件写入到需要上传到的位置
        		files.transferTo(newFile);
        		teacherNotice.setFjpath(path);
	}
		//设置上传时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
		teacherNotice.setDeclaretime(sdf.format(new Date()));
		
    	Teachernotice tn = new Teachernotice();
    	tn.setFjname(teacherNotice.getFjname());
    	tn.setFjpath(teacherNotice.getFjpath());
    	tn.setDeclaretime(teacherNotice.getDeclaretime());
    	tn.setNoticetitle(teacherNotice.getNoticetitle());
    	tn.setNoticecontent(teacherNotice.getNoticecontent());
    	tn.setNotifier(teacher.getName());
    	String bhArr[] = teacherNotice.getJszbh().split(";");    	
    	for(String temp:bhArr) {
    		tn.setJszbh(temp);
    		teacherNoticeService.setTeachernotice(tn);
    	}
    	return Msg.success();
    }
}