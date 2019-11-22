package com.gdms.crud.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gdms.crud.bean.Admin;
import com.gdms.crud.bean.BylwinfoWithBLOBs;
import com.gdms.crud.bean.Dbpptinfo;
import com.gdms.crud.bean.Graduationdesignresult;
import com.gdms.crud.bean.GraduationdesignresultWithBLOBs;
import com.gdms.crud.bean.Ktbginfo;
import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Student;
import com.gdms.crud.bean.WwywhyjinfoWithBLOBs;
import com.gdms.crud.bean.Zdjlinfo;
import com.gdms.crud.bean.Zqjcinfo;
import com.gdms.crud.bean.ZqjcinfoWithBLOBs;
import com.gdms.crud.excel.SaveStudentData;
import com.gdms.crud.excel.SaveTeacherData;
import com.gdms.crud.service.BylwInfoService;
import com.gdms.crud.service.DbpptInfoService;
import com.gdms.crud.service.GraduationDesignResultService;
import com.gdms.crud.service.KtbgInfoService;
import com.gdms.crud.service.StudentService;
import com.gdms.crud.service.WwywhyjInfoService;
import com.gdms.crud.service.ZdjlInfoService;
import com.gdms.crud.service.ZqjcInfoService;
import com.mchange.v2.sql.filter.SynchronizedFilterCallableStatement;
import com.gdms.crud.excel.*;
/**
 * 处理文件上传下载功能
 * @author 周汶锋
 *
 */
@Controller
public class FileManageController {
	@Autowired
	KtbgInfoService ktbgInfoService;
	@Autowired
	ZqjcInfoService zqjcInfoService;
	@Autowired
	ZdjlInfoService zdjlInfoService;
	@Autowired
	WwywhyjInfoService wwywhyjInfoService;
	@Autowired
	BylwInfoService bylwInfoService;
	@Autowired
	DbpptInfoService dbpptInfoService;
	@Autowired
	GraduationDesignResultService graduationDesignResultService;
	@Autowired
	StudentService studentService;
	private com.gdms.crud.excel.ExportStudentInfo ExportStudentInfo;
	
	/**
	 * 开题报告文件上传功能
	 * @param file
	 * @param request
	 * @param session
	 * @param graduationdesignid
	 * @param ktbgdetail
	 * @return
	 * @throws IOException
	 */
    @RequestMapping(value="STUuploadKTBG",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUuploadKTBG(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,Ktbginfo ktbginfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[1];
    	if(ktbginfo.getKtbgdetail().trim().equals("")) {
    		error_Msg[0] = "请输入开题报告的详情";
    		//return Msg.fail().add("error_Msg", error_Msg);    		
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放开题报告信息  	
    		ktbginfo.setGraduationdesignresultid(gdresult.getGraduationdesignresultid());
    		ktbginfo.setStudentid(stu.getStudentid());
    		ktbginfo.setGraduationdesignid(ktbginfo.getGraduationdesignid());
    		ktbginfo.setKtbgdetail(ktbginfo.getKtbgdetail());    			
    		if(files.getSize() != 0) {      
    			//设置附件名称
    			ktbginfo.setKtbgfjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取当前时间
            		//SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            		//获取文件需要上传到的本地位置
            		//String path = "D:\\Java\\eclipseProject\\ssm_gdms\\src\\main\\webapp\\static\\file\\KTBG\\" + stu.getStudentid() + "KTBG" + Filehzm;
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\KTBG\\" + stu.getStudentid() + "KTBG" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		ktbginfo.setKtbgpath(path);
    	}
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			ktbginfo.setUploadtime(sdf.format(new Date()));    		
    		//执行保存开题报告信息的操作        	
    		ktbgInfoService.saveKTBGInfo(ktbginfo);
    		//设置毕设结果信息中的开题报告信息
    		Ktbginfo temp = ktbgInfoService.selectOneKtbgInfo(ktbginfo.getStudentid(),ktbginfo.getGraduationdesignid());
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		
    		//设置开题报告编号
    		stu.setKtbgid(temp.getKtbginfoid());
    		studentService.update(stu);
    		
    		gdresulttemp.setKtbginfoid(temp.getKtbginfoid());
    		gdresulttemp.setKtbgauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }  
     
	/**
	 * 修改开题报告文件信息功能
	 * @param file
	 * @param request
	 * @param session
	 * @param graduationdesignid
	 * @param ktbgdetail
	 * @return
	 * @throws IOException
	 */
    @RequestMapping(value="STUalertKTBG",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUalertKTBG(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,Ktbginfo ktbginfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[1];
    	if(ktbginfo.getKtbgdetail().trim().equals("")) {
    		error_Msg[0] = "请输入开题报告的详情";
    		//return Msg.fail().add("error_Msg", error_Msg);    		
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放开题报告信息  	
    		ktbginfo.setGraduationdesignresultid(gdresult.getGraduationdesignresultid());
    		ktbginfo.setStudentid(stu.getStudentid());
    		ktbginfo.setGraduationdesignid(ktbginfo.getGraduationdesignid());
    		ktbginfo.setKtbgdetail(ktbginfo.getKtbgdetail());
    		if(files.getSize() != 0) {
    			//设置附件名称
    			ktbginfo.setKtbgfjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取当前时间
            		//SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            		//获取文件需要上传到的本地位置
            		//String path = "D:\\Java\\eclipseProject\\ssm_gdms\\src\\main\\webapp\\static\\file\\KTBG\\" + stu.getStudentid() + "KTBG" + Filehzm;
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\KTBG\\" + stu.getStudentid() + "KTBG" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);            		
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		ktbginfo.setKtbgpath(path);
    	}
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			ktbginfo.setUploadtime(sdf.format(new Date()));    		
    		//执行保存开题报告信息的操作        	
    		ktbgInfoService.updateKTBGInfo(ktbginfo);
    		//设置毕设结果信息中的开题报告信息
    		Ktbginfo temp = ktbgInfoService.selectOneKtbgInfo(ktbginfo.getStudentid(),ktbginfo.getGraduationdesignid());
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		gdresulttemp.setKtbginfoid(temp.getKtbginfoid());
    		gdresulttemp.setKtbgauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }      
    
    /**
     * 中期检查表文件上传功能 
     * @param files
     * @param request
     * @param session
     * @param zqjcbinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUuploadZQJCB",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUuploadZQJCB(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,ZqjcinfoWithBLOBs zqjcbinfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[20];
    	if(zqjcbinfo.getQzrq().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(zqjcbinfo.getXtbh() == null) {
    		error_Msg[1] = "请选择";
    	}else if(zqjcbinfo.getXtbh().trim().equals("是")) {
        	if(zqjcbinfo.getXtbhyy().trim().equals("")) {
        		error_Msg[2] = "请输入";
        	}
    	}else if(zqjcbinfo.getSfyryt() == null) {
    		error_Msg[3] = "请选择";
    	}else if(zqjcbinfo.getSfktbg() == null) {
    		error_Msg[4] = "请选择";
    	}else if(zqjcbinfo.getSfwxzs() == null) {
    		error_Msg[5] = "请选择";
    	}else if(zqjcbinfo.getJdqk() == null) {
    		error_Msg[6] = "请选择";
    	}else if(zqjcbinfo.getJdqk().trim().equals("延期滞后")) {
        	if(zqjcbinfo.getJdzhyy().trim().equals("")) {
        		error_Msg[7] = "请输入";
        	}
    	}else if(zqjcbinfo.getGzztqk() == null) {
    		error_Msg[8] = "请选择";
    	}else if(zqjcbinfo.getCywxzlnl() == null) {
    		error_Msg[9] = "请选择";
    	}else if(zqjcbinfo.getZqzlpj() == null) {
    		error_Msg[10] = "请选择";
    	}else if(zqjcbinfo.getBylwnrtz() == null) {
    		error_Msg[11] = "请选择";
    	}else if(zqjcbinfo.getZdcs().trim().equals("")) {
    		error_Msg[12] = "请输入";
    	}else if(zqjcbinfo.getAqwc() == null) {
    		error_Msg[13] = "请选择";
    	}else if(zqjcbinfo.getYscl() == null) {
    		error_Msg[14] = "请选择";
    	}else if(zqjcbinfo.getQt().trim().equals("")) {
    		error_Msg[15] = "请输入";
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放中期检查信息
    		zqjcbinfo.setStudentid(stu.getStudentid());
    		zqjcbinfo.setStudent(stu);
    		zqjcbinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		zqjcbinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		if(files.getSize() != 0) {        		    		
    			//设置附件名称
        		zqjcbinfo.setFjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\ZQJCB\\" + stu.getStudentid() + "ZQJCB" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		zqjcbinfo.setFjpath(path);
    	}
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			zqjcbinfo.setUploadtime(sdf.format(new Date()));    		
    		//执行保存中期检查表信息的操作        	
			zqjcInfoService.saveZQJCInfo(zqjcbinfo);
    		//设置毕设结果信息中的中期检查信息
			Zqjcinfo temp = zqjcInfoService.selectOneZqjcInfo(zqjcbinfo.getStudentid(),zqjcbinfo.getGraduationdesignid());
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());

    		//设置中期检查表编号
    		stu.setZqjcbid(temp.getZqjcinfoid());
    		studentService.update(stu);
    		
    		gdresulttemp.setZqjcbinfoid(temp.getZqjcinfoid());
    		gdresulttemp.setZqjcbauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }  
    
    
    /**
     * 修改中期检查表功能 
     * @param files
     * @param request
     * @param session
     * @param zqjcbinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUalertZQJCB",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUalertZQJCB(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,ZqjcinfoWithBLOBs zqjcbinfo) throws IOException{
    	Student stu = (Student)session.getAttribute("user");
    	GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    	//用于存储错误信息    	
    	String[] error_Msg = new String[20];
    	if(zqjcbinfo.getQzrq().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(zqjcbinfo.getXtbh() == null) {
    		error_Msg[1] = "请选择";
    	}else if(zqjcbinfo.getXtbh().trim().equals("是")) {
        	if(zqjcbinfo.getXtbhyy().trim().equals("")) {
        		error_Msg[2] = "请输入";
        	}
    	}else if(zqjcbinfo.getSfyryt() == null) {
    		error_Msg[3] = "请选择";
    	}else if(zqjcbinfo.getSfktbg() == null) {
    		error_Msg[4] = "请选择";
    	}else if(zqjcbinfo.getSfwxzs() == null) {
    		error_Msg[5] = "请选择";
    	}else if(zqjcbinfo.getJdqk() == null) {
    		error_Msg[6] = "请选择";
    	}else if(zqjcbinfo.getJdqk().trim().equals("延期滞后")) {
        	if(zqjcbinfo.getJdzhyy().trim().equals("")) {
        		error_Msg[7] = "请输入";
        	}
    	}else if(zqjcbinfo.getGzztqk() == null) {
    		error_Msg[8] = "请选择";
    	}else if(zqjcbinfo.getCywxzlnl() == null) {
    		error_Msg[9] = "请选择";
    	}else if(zqjcbinfo.getZqzlpj() == null) {
    		error_Msg[10] = "请选择";
    	}else if(zqjcbinfo.getBylwnrtz() == null) {
    		error_Msg[11] = "请选择";
    	}else if(zqjcbinfo.getZdcs().trim().equals("")) {
    		error_Msg[12] = "请输入";
    	}else if(zqjcbinfo.getAqwc() == null) {
    		error_Msg[13] = "请选择";
    	}else if(zqjcbinfo.getYscl() == null) {
    		error_Msg[14] = "请选择";
    	}else if(zqjcbinfo.getQt().trim().equals("")) {
    		error_Msg[15] = "请输入";
    	}else {    		
    		if(files.getSize() != 0) {        		    		
    			//设置附件名称
        		zqjcbinfo.setFjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\ZQJCB\\" + stu.getStudentid() + "ZQJCB" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置            		
            		files.transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		zqjcbinfo.setFjpath(path);
    	}
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			zqjcbinfo.setLastalerttime(sdf.format(new Date()));
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		gdresulttemp.setZqjcbauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);		
    		//执行保存中期检查表信息的操作        	
			zqjcInfoService.updateZQJCInfo(zqjcbinfo);
    		//设置毕设结果信息中的中期检查信息
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }  
      
    
    /**
     * 忘记密码文件下载功能  
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/download_forget_pw_file")  
    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{  
        //XXX_更改密码申请书.doc为需要下载的文件  
        String fileName = request.getSession().getServletContext().getRealPath("")+"\\static\\file\\forget_password\\XXX_更改密码申请书.doc";
        //获取输入流  
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));  
        //转码，免得文件名中文乱码  
        //获取完文件后重新设置文件名
        fileName = "XXX_更改密码申请书.doc";
        fileName = URLEncoder.encode(fileName,"UTF-8");  
        //设置文件下载头  
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName);    
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
        response.setContentType("text/html");   
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        bis.close();
        out.close();
    }

    /**
     * 文件下载功能
     * @param request
     * @param response
     * @param session
     * @param path
     * @throws Exception
     */
    @RequestMapping("download")
    public void download(HttpServletRequest request,HttpServletResponse response,HttpSession session,@RequestParam("path")String path,@RequestParam("fileName")String fileName) throws Exception{		
    	//转码，免得文件名中文乱码  
		path = URLEncoder.encode(path,"UTF-8");
		//将空格、斜杠和冒号的字符进行转换
		path = path.replace("%2F","\\");
		path = path.replace("+"," ");
		path = path.replace("%3A",":");	
        //获取输入流  		
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(path)));    
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName);    
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
        response.setContentType("text/html");   
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        bis.close();
        out.close();
    }
    
  
    /**
     * 上传指导记录
     * @param files
     * @param request
     * @param session
     * @param zdjlinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUuploadZDJL",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUuploadZDJL(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,Zdjlinfo zdjlinfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[3];
    	if(zdjlinfo.getTitle().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(zdjlinfo.getZdsj().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else if(zdjlinfo.getZygz().trim().equals("")) {
    		error_Msg[2] = "请选择";
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		zdjlinfo.setStudentid(stu.getStudentid());
    		zdjlinfo.setStudent(stu);
    		zdjlinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		zdjlinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		if(files.getSize() != 0) {        		    		
    			//设置附件名称
    			zdjlinfo.setFjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\ZDJL\\" + stu.getStudentid() + "ZDJL" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		zdjlinfo.setFjpath(path);
    	}
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			zdjlinfo.setUploadtime(sdf.format(new Date()));    		
    		//执行保存指导记录表信息的操作        	
			zdjlInfoService.saveZDJLInfo(zdjlinfo);
    		//设置毕设结果信息中的指导记录信息
			Zdjlinfo temp = zdjlInfoService.selectOneZdjlInfo(zdjlinfo.getStudentid(),zdjlinfo.getGraduationdesignid());
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		
    		//设置指导记录编号
    		stu.setZdjlid(temp.getZdjlinfoid());
    		studentService.update(stu);
    		
    		gdresulttemp.setZdjlinfoid(temp.getZdjlinfoid());
    		gdresulttemp.setZdjlauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }      
    
    /**
     * 修改指导记录
     * @param files
     * @param request
     * @param session
     * @param zdjlinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUalertZDJL",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUalertZDJL(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,Zdjlinfo zdjlinfo) throws IOException{
		Student stu = (Student)session.getAttribute("user");
    	//用于存储错误信息
    	String[] error_Msg = new String[3];
    	if(zdjlinfo.getTitle().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(zdjlinfo.getZdsj().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else if(zdjlinfo.getZygz().trim().equals("")) {
    		error_Msg[2] = "请选择";
    	}else {    		
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		zdjlinfo.setStudentid(stu.getStudentid());
    		zdjlinfo.setStudent(stu);
    		zdjlinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		zdjlinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		if(files.getSize() != 0) {        		    		
    			//设置附件名称
    			zdjlinfo.setFjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\ZDJL\\" + stu.getStudentid() + "ZDJL" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		zdjlinfo.setFjpath(path);
    	}
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			zdjlinfo.setLastalerttime(sdf.format(new Date()));
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		gdresulttemp.setZdjlauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);			
    		//执行修改指导记录表信息的操作        	
			zdjlInfoService.updateZDJLInfo(zdjlinfo);
    		//设置毕设结果信息中的指导记录信息
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }
    
    /**
     * 上传外文译文和原件
     * @param files
     * @param request
     * @param session
     * @param wwywhyjinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUuploadWWYWHYJ",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUuploadWWYWHYJ(@RequestParam(required = false) MultipartFile[] files, HttpServletRequest request,HttpSession session,WwywhyjinfoWithBLOBs wwywhyjinfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[3];
    	if(wwywhyjinfo.getWwywnr().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(wwywhyjinfo.getYwnr().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		wwywhyjinfo.setStudentid(stu.getStudentid());
    		wwywhyjinfo.setStudent(stu);
    		wwywhyjinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		wwywhyjinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		//上传外文译文附件
    		if(files[0].getSize() != 0) {        		    		
    			//设置附件名称
    			wwywhyjinfo.setWwfjname(files[0].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[0].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\WWYWHYJ\\" + stu.getStudentid() + "WWYW" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[0].transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		wwywhyjinfo.setWwfjpath(path);
    	}
    		//上传原文内容附件    		
    		if(files[1].getSize() != 0) {        		    		
    			//设置附件名称
    			wwywhyjinfo.setYwfjname(files[1].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[1].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path2 = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\WWYWHYJ\\" + stu.getStudentid() + "YW" + Filehzm;
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path2= path2.replace("\\","%2F");
            		path2 = path2.replace(" ","%20");
            		//创建需要上传的文件对象
            		File newFile2 = new File(path2);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[1].transferTo(newFile2);
            		wwywhyjinfo.setYwfjpath(path2);
    	}    		
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			wwywhyjinfo.setUploadtime(sdf.format(new Date()));    		
    		//执行保存指导记录表信息的操作        	
			wwywhyjInfoService.saveWWYWHYJInfo(wwywhyjinfo);
    		//设置毕设结果信息中的指导记录信息
			WwywhyjinfoWithBLOBs temp = wwywhyjInfoService.selectOneWwywhyjInfo(wwywhyjinfo.getStudentid(),wwywhyjinfo.getGraduationdesignid());
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		
    		//设置指导记录编号
    		stu.setWwywhyjid(temp.getWwywyyjid());
    		studentService.update(stu);
    		
    		gdresulttemp.setWwywhyjinfoid(temp.getWwywyyjid());
    		gdresulttemp.setWwywhyjauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }      
    
    /**
     * 修改外文译文和原件
     * @param files
     * @param request
     * @param session
     * @param wwywhyjinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUalertWWYWHYJ",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUalertWWYWHYJ(@RequestParam(required = false) MultipartFile[] files, HttpServletRequest request,HttpSession session,WwywhyjinfoWithBLOBs wwywhyjinfo) throws IOException{
		Student stu = (Student)session.getAttribute("user");
    	//用于存储错误信息
    	String[] error_Msg = new String[3];
    	if(wwywhyjinfo.getWwywnr().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(wwywhyjinfo.getYwnr().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else {    		
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		wwywhyjinfo.setStudentid(stu.getStudentid());
    		wwywhyjinfo.setStudent(stu);
    		wwywhyjinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		wwywhyjinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		//上传外文译文附件
    		if(files[0].getSize() != 0) {        		    		
    			//设置附件名称
    			wwywhyjinfo.setWwfjname(files[0].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[0].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\WWYWHYJ\\" + stu.getStudentid() + "WWYW" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[0].transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		wwywhyjinfo.setWwfjpath(path);
    	}
    		//上传原文内容附件    		
    		if(files[1].getSize() != 0) {        		    		
    			//设置附件名称
    			wwywhyjinfo.setYwfjname(files[1].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[1].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path2 = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\WWYWHYJ\\" + stu.getStudentid() + "YW" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile2 = new File(path2);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[1].transferTo(newFile2);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path2= path2.replace("\\","%2F");
            		path2 = path2.replace(" ","%20");            		
            		wwywhyjinfo.setYwfjpath(path2);
    	}    		
			//设置最后上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			wwywhyjinfo.setLastalerttime(sdf.format(new Date()));
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		gdresulttemp.setWwywhyjauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);			
    		//执行更新指导记录表信息的操作        	
			wwywhyjInfoService.updateWWYWHYJInfo(wwywhyjinfo);
    		//设置毕设结果信息中的指导记录信息
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }    

    /**
     * 上传毕业论文
     * @param files
     * @param request
     * @param session
     * @param bylwinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUuploadBYLW",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUuploadBYLW(@RequestParam(required = false) MultipartFile[] files, HttpServletRequest request,HttpSession session,BylwinfoWithBLOBs bylwinfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[5];
    	if(bylwinfo.getGjc().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(bylwinfo.getCxd().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else if(bylwinfo.getZwzy().trim().equals("")) {
    		error_Msg[2] = "请输入";
    	}else if(bylwinfo.getYwzy().trim().equals("")) {
    		error_Msg[3] = "请输入";
    	}else if(bylwinfo.getQt().trim().equals("")) {
    		error_Msg[4] = "请输入";
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		bylwinfo.setStudentid(stu.getStudentid());
    		bylwinfo.setStudent(stu);
    		bylwinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		bylwinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		//上传外文译文附件
    		if(files[0].getSize() != 0) {        		    		
    			//设置附件名称
    			bylwinfo.setBylwfjname(files[0].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[0].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\BYLW\\" + stu.getStudentid() + "BYLW" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[0].transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		bylwinfo.setBylwfjpath(path);
    	}
    		//上传原文内容附件    		
    		if(files[1].getSize() != 0) {        		    		
    			//设置附件名称
    			bylwinfo.setQtfjname(files[1].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[1].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path2 = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\BYLW\\" + stu.getStudentid() + "QT" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile2 = new File(path2);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[1].transferTo(newFile2);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path2= path2.replace("\\","%2F");
            		path2 = path2.replace(" ","%20");            		
            		bylwinfo.setQtfjpath(path2);
    	}    		
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			bylwinfo.setUploadtime(sdf.format(new Date()));    		
    		//执行保存指导记录表信息的操作        	
			bylwInfoService.saveBYLWInfo(bylwinfo);
    		//设置毕设结果信息中的指导记录信息
			BylwinfoWithBLOBs temp = bylwInfoService.selectOneBylwInfo(bylwinfo.getStudentid(),bylwinfo.getGraduationdesignid());
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		
    		//设置毕业论文编号
    		stu.setBylwid(temp.getBylwinfoid());
    		studentService.update(stu);    		
    		
    		gdresulttemp.setBylwinfoid(temp.getBylwinfoid());
    		gdresulttemp.setBylwauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }      
    
    /**
     * 修改毕业论文
     * @param files
     * @param request
     * @param session
     * @param bylwinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUalertBYLW",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUalertBYLW(@RequestParam(required = false) MultipartFile[] files, HttpServletRequest request,HttpSession session,BylwinfoWithBLOBs bylwinfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[5];
    	if(bylwinfo.getGjc().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(bylwinfo.getCxd().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else if(bylwinfo.getZwzy().trim().equals("")) {
    		error_Msg[2] = "请输入";
    	}else if(bylwinfo.getYwzy().trim().equals("")) {
    		error_Msg[3] = "请输入";
    	}else if(bylwinfo.getQt().trim().equals("")) {
    		error_Msg[4] = "请输入";
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		bylwinfo.setStudentid(stu.getStudentid());
    		bylwinfo.setStudent(stu);
    		bylwinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		bylwinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		//上传外文译文附件
    		if(files[0].getSize() != 0) {        		    		
    			//设置附件名称
    			bylwinfo.setBylwfjname(files[0].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[0].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\BYLW\\" + stu.getStudentid() + "BYLW" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[0].transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		bylwinfo.setBylwfjpath(path);
    	}
    		//上传原文内容附件    		
    		if(files[1].getSize() != 0) {        		    		
    			//设置附件名称
    			bylwinfo.setQtfjname(files[1].getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files[1].getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path2 = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\BYLW\\" + stu.getStudentid() + "QT" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile2 = new File(path2);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files[1].transferTo(newFile2);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path2= path2.replace("\\","%2F");
            		path2 = path2.replace(" ","%20");            		
            		bylwinfo.setQtfjpath(path2);
    	}    		
			//设置最后上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			bylwinfo.setLastalerttime(sdf.format(new Date()));
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		gdresulttemp.setBylwauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);			
    		//执行更新指导记录表信息的操作        	
			bylwInfoService.updateBYLWInfo(bylwinfo);
    		//设置毕设结果信息中的指导记录信息
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }        
    
    /**
     * 上传答辩PPT
     * @param files
     * @param request
     * @param session
     * @param dbpptinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUuploadDBPPT",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUuploadDBPPT(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,Dbpptinfo dbpptinfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[2];
    	if(dbpptinfo.getTitle().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(dbpptinfo.getNrzy().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		dbpptinfo.setStudentid(stu.getStudentid());
    		dbpptinfo.setStudent(stu);
    		dbpptinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		dbpptinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		//上传外文译文附件
    		if(files.getSize() != 0) {        		    		
    			//设置附件名称
    			dbpptinfo.setFjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\DBPPT\\" + stu.getStudentid() + "DBPPT" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		dbpptinfo.setFjpath(path);
    	}
			//设置上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			dbpptinfo.setUploadtime(sdf.format(new Date()));    		
    		//执行保存指导记录表信息的操作        	
			dbpptInfoService.saveDBPPTInfo(dbpptinfo);
    		//设置毕设结果信息中的指导记录信息
			Dbpptinfo temp = dbpptInfoService.selectOneDbpptInfo(dbpptinfo.getStudentid(),dbpptinfo.getGraduationdesignid());
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		
    		//设置答辩PPT编号
    		stu.setDbpptid(temp.getDbpptinfoid());
    		studentService.update(stu);    		
    		
    		gdresulttemp.setDbpptinfoid(temp.getDbpptinfoid());
    		gdresulttemp.setDbpptauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }      
    
    /**
     * 修改答辩PPT
     * @param files
     * @param request
     * @param session
     * @param dbpptinfo
     * @return
     * @throws IOException
     */
    @RequestMapping(value="STUalertDBPPT",method=RequestMethod.POST)
    @ResponseBody
    public Msg STUalertDBPPT(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session,Dbpptinfo dbpptinfo) throws IOException{
    	//用于存储错误信息
    	String[] error_Msg = new String[2];
    	if(dbpptinfo.getTitle().trim().equals("")) {
    		error_Msg[0] = "请输入";
    	}else if(dbpptinfo.getNrzy().trim().equals("")) {
    		error_Msg[1] = "请输入";
    	}else {    		
    		Student stu = (Student)session.getAttribute("user");
    		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(stu.getGraduationdesignid(), stu.getStudentid());
    		//用于存放指导记录信息
    		dbpptinfo.setStudentid(stu.getStudentid());
    		dbpptinfo.setStudent(stu);
    		dbpptinfo.setGraduationdesignid(gdresult.getGraduationdesignid());
    		dbpptinfo.setGraduationdesign(gdresult.getGraduationdesign());
    		//上传答辩PPT附件
    		if(files.getSize() != 0) {        		    		
    			//设置附件名称
    			dbpptinfo.setFjname(files.getOriginalFilename());
        		// 文件原始名称
                String originalFileName = files.getOriginalFilename();
                //获取文件的后缀名
                String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
            		//获取文件需要上传到的服务器的位置
            		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\DBPPT\\" + stu.getStudentid() + "DBPPT" + Filehzm;
            		//创建需要上传的文件对象
            		File newFile = new File(path);
            		//将需要上传的本地文件写入到需要上传到的位置
            		files.transferTo(newFile);
            		//将path中的“\”转换为%2F，“ ”转换为%20,不然前端发请求会报错
            		path = path.replace("\\","%2F");
            		path = path.replace(" ","%20");            		
            		dbpptinfo.setFjpath(path);
    	}
			//设置最后上传时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss",Locale.CHINA);
			dbpptinfo.setLastalerttime(sdf.format(new Date()));
    		Graduationdesignresult gdresulttemp = graduationDesignResultService.selectOneGdResult(gdresult.getGraduationdesignresultid());
    		gdresulttemp.setDbpptauditstatusid(3);
    		graduationDesignResultService.updateOnegdResult(gdresulttemp);			
    		//执行更新指导记录表信息的操作        	
			dbpptInfoService.updateDBPPTInfo(dbpptinfo);
    		//设置毕设结果信息中的指导记录信息
    		return Msg.success();
    }     
    	//转发ModelAndView mv = new ModelAndView("forward:/JumpUploadKTBGPage");
    	//重定向    	
		return Msg.fail().add("error_Msg", error_Msg);
   }            
    
    
    /**
     * 导入学生信息
     * @param files
     * @param request
     * @param session
     * @return
     * @throws IOException
     * @throws SQLException
     */
    @RequestMapping(value="ImportStudentInfo",method=RequestMethod.POST)
    @ResponseBody
    public Msg ImportStudentInfo(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session) throws IOException, SQLException{
    	Admin admin = (Admin)session.getAttribute("user");
    	if(files.getSize() != 0) {
    		// 文件原始名称
            String originalFileName = files.getOriginalFilename();
            //获取文件的后缀名
            String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
    		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\Template\\" + files.getOriginalFilename() + admin.getAdminid() + Filehzm;
    		//创建需要上传的文件对象
    		File newFile = new File(path);
    		//将需要上传的本地文件写入到需要上传到的位置
    		files.transferTo(newFile);
    		SaveStudentData saveStudentData = new SaveStudentData();
    		saveStudentData.save(path);
    	}
    	return Msg.success();
    }
   
    /**
     * 导入教师信息
     * @param files
     * @param request
     * @param session
     * @return
     * @throws IOException
     * @throws SQLException
     */
    @RequestMapping(value="ImportTeacherInfo",method=RequestMethod.POST)
    @ResponseBody
    public Msg ImportTeacherInfo(@RequestParam(required = false) MultipartFile files, HttpServletRequest request,HttpSession session) throws IOException, SQLException{
    	Admin admin = (Admin)session.getAttribute("user");
    	if(files.getSize() != 0) {
    		// 文件原始名称
            String originalFileName = files.getOriginalFilename();
            //获取文件的后缀名
            String Filehzm = originalFileName.substring(originalFileName.lastIndexOf("."));
    		String path = request.getSession().getServletContext().getRealPath("") + "\\static\\file\\Template\\" + files.getOriginalFilename() + admin.getAdminid() + Filehzm;
    		//创建需要上传的文件对象
    		File newFile = new File(path);
    		//将需要上传的本地文件写入到需要上传到的位置
    		files.transferTo(newFile);
    		SaveTeacherData saveTeacherData = new SaveTeacherData();
    		saveTeacherData.save(path);
    	}
    	return Msg.success();
    }    
    
    /**
     * 导出学生信息
     * @return
     */
    @RequestMapping(value="ExportStudentInfo",method=RequestMethod.POST)
    @ResponseBody
    public Msg ExportStudentInfo(){
    	String exportpath = "C:\\Users\\Administrator\\Desktop\\导出的学生信息.xlsx";
    	ExportStudentInfo exportstu = new ExportStudentInfo();
    	exportstu.expertstu(exportpath);
    	return Msg.success();
    }

    /**
     * 导出教师信息
     * @return
     */
    @RequestMapping(value="ExportTeacherInfo",method=RequestMethod.POST)
    @ResponseBody
    public Msg ExportTeacherInfo(){
    	String exportpath = "C:\\Users\\Administrator\\Desktop\\导出的教师信息.xlsx";
    	ExportTeacherInfo exportteacher = new ExportTeacherInfo();
    	exportteacher.exportteacher(exportpath);
    	return Msg.success();
    }    
    
}