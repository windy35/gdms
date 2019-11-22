package com.gdms.crud.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.gdms.crud.bean.BylwinfoWithBLOBs;
import com.gdms.crud.bean.Comment;
import com.gdms.crud.bean.CommentWithBLOBs;
import com.gdms.crud.bean.Dbinfo;
import com.gdms.crud.bean.Dbpptinfo;
import com.gdms.crud.bean.Graduationdesign;
import com.gdms.crud.bean.GraduationdesignWithBLOBs;
import com.gdms.crud.bean.Graduationdesignresult;
import com.gdms.crud.bean.GraduationdesignresultWithBLOBs;
import com.gdms.crud.bean.Ktbginfo;
import com.gdms.crud.bean.Lyhdtitleinfo;
import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Notice;
import com.gdms.crud.bean.Student;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.bean.Teachernotice;
import com.gdms.crud.bean.Wwywhyjinfo;
import com.gdms.crud.bean.WwywhyjinfoWithBLOBs;
import com.gdms.crud.bean.Zdjlinfo;
import com.gdms.crud.bean.ZqjcinfoWithBLOBs;
import com.gdms.crud.service.BylwInfoService;
import com.gdms.crud.service.CommentService;
import com.gdms.crud.service.DbInfoService;
import com.gdms.crud.service.DbpptInfoService;
import com.gdms.crud.service.GraduationDesignResultService;
import com.gdms.crud.service.GraduationDesignService;
import com.gdms.crud.service.KtbgInfoService;
import com.gdms.crud.service.LoginService;
import com.gdms.crud.service.LyhdtitleinfoService;
import com.gdms.crud.service.NoticeService;
import com.gdms.crud.service.StudentService;
import com.gdms.crud.service.TeacherNoticeService;
import com.gdms.crud.service.TeacherService;
import com.gdms.crud.service.WwywhyjInfoService;
import com.gdms.crud.service.ZdjlInfoService;
import com.gdms.crud.service.ZqjcInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 处理页面跳转功能
 * @author 周汶锋
 *
 */
@Controller
public class JumpPageController {
	@Autowired
	GraduationDesignService graduationDesignService;		
	@Autowired
	LoginService loginService;
	@Autowired
	GraduationDesignResultService graduationDesignResultService;
	@Autowired
	KtbgInfoService ktbgInfoService;
	@Autowired
	NoticeService noticeService; 
	@Autowired
	ZqjcInfoService zqjcbInfoService;
	@Autowired
	ZdjlInfoService zdjlInfoService;
	@Autowired
	WwywhyjInfoService wwywhyjInfoService;
	@Autowired
	BylwInfoService bylwInfoService;
	@Autowired
	DbpptInfoService dbpptInfoService;
	@Autowired
	LyhdtitleinfoService lyhdtitleinfoService;
	@Autowired
	CommentService commentService;
	@Autowired
	TeacherService teacherService;
	@Autowired
	StudentService studentService;
	@Autowired
	DbInfoService dbInfoService;
	@Autowired
	TeacherNoticeService teacherNoticeService;
	
	/*************(Admin)管理员相关跳转页面的操作************/
	//跳转到管理学生信息的页面
    @RequestMapping(value="JumpManageStuInfoPage",method=RequestMethod.GET)  
    @ResponseBody
    public ModelAndView JumpManageStuInfoPage(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	ModelAndView mv = new ModelAndView("Login/Admin/StudentInfoManage/ManageStudentInfo");
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Student> studentlist = studentService.getAllStu();
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(studentlist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;
    }	
	
	//跳转到管理教师信息的页面
    @RequestMapping(value="JumpManageTeacherInfoPage",method=RequestMethod.GET)  
    @ResponseBody
    public ModelAndView JumpManageTeacherInfoPage(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	ModelAndView mv = new ModelAndView("Login/Admin/TeacherInfoManage/ManageTeacherInfo");
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Teacher> teacherlist = teacherService.getALlTeacher();
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(teacherlist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;
    }    
    
	/************(Notice)通知信息相关的页面跳转操作**********/
	
	 /**
     * 跳转到发布通知的页面
     * @return
     */
	@RequestMapping(value="SetNotice",method=RequestMethod.GET)
	public String SetNotice() {
		return "Login/Admin/PutNotice/SetNotice";
	}
	
    /**
     * 跳转到详细教师通知信息的页面
     * @param noticeid
     * @return
     */
    @RequestMapping(value="/JumpTeacherNoticeDetail",method=RequestMethod.GET)
	public ModelAndView JumpTeacherNoticeDetail(Integer noticeid,HttpSession session){
    Student stu = (Student)session.getAttribute("user");
    //获取当前查询的数据在list中的位置
    int index = -1;
    String hasNext = null;
    String hasPreview = null;
    Teachernotice PreviewDetail = null;
    Teachernotice NextDetail = null;
    Teachernotice teachernoticeinfo = teacherNoticeService.getOneTeachernotice(noticeid);
	
	List<Teachernotice> teachernoticelist = teacherNoticeService.getStuTeacherNotice(stu);
	for(Teachernotice temp:teachernoticelist) {
		index += 1;
		if(temp.getNoticeid().equals(teachernoticeinfo.getNoticeid()))
			break;
	}		

	//获取上一条和下一条通知信息	
	if((index+1)<teachernoticelist.size()) {
		NextDetail = teachernoticelist.get(index+1);
		hasNext = "true";
	}
	if((index-1)>-1) {
		PreviewDetail = teachernoticelist.get(index-1);
		hasPreview = "true";
	}		
	
	//将该通知标记为已读
	Teachernotice tn = teacherNoticeService.getOneTeachernotice(noticeid);
	tn.setReadornot(true);
	teacherNoticeService.updateOneTeachernotice(tn);
	//更新新(未读)通知数目
	long xtzCount = teacherNoticeService.getXTZCount(stu);
	
	ModelAndView mv = new ModelAndView("Login\\Student\\InteractionBetweenTAndS\\TeacherNoticeDetail"); 
	mv.addObject("Noticeinfo",teachernoticeinfo);
	mv.addObject("hasPreview",hasPreview);
	mv.addObject("hasNext",hasNext);
	mv.addObject("PreviewDetail",PreviewDetail);
	mv.addObject("NextDetail",NextDetail);
	session.setAttribute("xtzCount", xtzCount);
	return mv;
	}   		
	
    /**
     * 跳转到详细通知信息的页面
     * @param noticeid
     * @return
     */
    @RequestMapping(value="/JumpNoticeDetail",method=RequestMethod.GET)
	public ModelAndView JumpNoticeDetail(Integer noticeid){
    //获取当前查询的数据在list中的位置
    int index = -1;
    String hasNext = null;
    String hasPreview = null;
    Notice PreviewDetail = null;
    Notice NextDetail = null;
	Notice Noticeinfo = noticeService.getOneNotice(noticeid);
	
	List<Notice> noticelist = noticeService.getAllNotice();
	for(Notice temp:noticelist) {
		index += 1;
		if(temp.getNoticeid().equals(Noticeinfo.getNoticeid()))
			break;
	}		

	//获取上一条和下一条通知信息	
	if((index+1)<noticelist.size()) {
		NextDetail = noticelist.get(index+1);
		hasNext = "true";
	}
	if((index-1)>-1) {
		PreviewDetail = noticelist.get(index-1);
		hasPreview = "true";
	}		
	
	ModelAndView mv = new ModelAndView("NoticeDetail"); 
	mv.addObject("Noticeinfo",Noticeinfo);
	mv.addObject("hasPreview",hasPreview);
	mv.addObject("hasNext",hasNext);
	mv.addObject("PreviewDetail",PreviewDetail);
	mv.addObject("NextDetail",NextDetail);
	return mv;
	}   	
    
    /**
     * 跳转到详细通知信息的页面
     * @param noticeid
     * @return
     */
    @RequestMapping(value="/JumpNoticeDetail2",method=RequestMethod.GET)
	public ModelAndView JumpNoticeDetail2(Integer noticeid){
    //获取当前查询的数据在list中的位置
    int index = -1;
    String hasNext = null;
    String hasPreview = null;
    Notice PreviewDetail = null;
    Notice NextDetail = null;
	Notice Noticeinfo = noticeService.getOneNotice(noticeid);
	
	List<Notice> noticelist = noticeService.getAllNotice();
	for(Notice temp:noticelist) {
		index += 1;
		if(temp.getNoticeid().equals(Noticeinfo.getNoticeid()))
			break;
	}		

	//获取上一条和下一条通知信息	
	if((index+1)<noticelist.size()) {
		NextDetail = noticelist.get(index+1);
		hasNext = "true";
	}
	if((index-1)>-1) {
		PreviewDetail = noticelist.get(index-1);
		hasPreview = "true";
	}		
	
	ModelAndView mv = new ModelAndView("NoticeDetail2"); 
	mv.addObject("Noticeinfo",Noticeinfo);
	mv.addObject("hasPreview",hasPreview);
	mv.addObject("hasNext",hasNext);
	mv.addObject("PreviewDetail",PreviewDetail);
	mv.addObject("NextDetail",NextDetail);
	return mv;
	}   	    
    
	/**************************LoginService相关的页面跳转操作****************************/
	/**
	 * 用户登录的时候调用
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value="/loginJump",method=RequestMethod.GET)  
    public ModelAndView LoginJump(@RequestParam(value="Role")String Role,HttpSession session) throws UnsupportedEncodingException{
		if("学生".equals(new String(Role.getBytes("ISO-8859-1"),"utf-8"))) {
			Student stu = (Student)session.getAttribute("user");
			ModelAndView mv = new ModelAndView("Login/StudentMain");
			//获取新通知的数目
			long xtzCount = teacherNoticeService.getXTZCount(stu);
			session.setAttribute("xtzCount", xtzCount);
			return mv;
		}			
		else if("教师".equals(new String(Role.getBytes("ISO-8859-1"),"utf-8"))) {
			Teacher teacher = (Teacher)session.getAttribute("user");
			if(teacher.getChoosexnsign() == false) {
				ModelAndView mv = new ModelAndView("Login/TeacherChooseXN");
				return mv;				
			}else {
				ModelAndView mv = new ModelAndView("Login/TeacherMain");
				return mv;
			}
		}
		else {
			ModelAndView mv = new ModelAndView("Login/AdminMain");
			return mv;
		}
	}
	

    /**
     * 跳转到教师登录的页面
     * @return
     */
    @RequestMapping(value="JumpTeacherMain",method=RequestMethod.GET)  
    public String JumpTeacherMain(HttpSession httpSession,String xnbh) {
    	httpSession.setAttribute("xnbh", xnbh);
    	return "Login/TeacherMain";
    }    
    
    /**
     * 用户退出登录的时候调用
     * @return
     */
    @RequestMapping(value="loginOut",method=RequestMethod.GET)  
    public String LoginOut(HttpSession httpSession) {
    	httpSession.removeAttribute("user");    	
    	return "login";
    }	
    
    /**
     * 跳转到登陆界面
     * @return
     */
    @RequestMapping(value="JumpLoginPage",method=RequestMethod.GET)  
    public String JumpLoginPage(HttpSession httpSession) {    	
    	return "login";
    }    
    
    /**
     * 跳转到更多通知的页面
     * @return
     */
    @RequestMapping(value="JumpNoticeMore",method=RequestMethod.GET)  
    public String JumpNoticeMore(HttpSession httpSession) {    	
    	return "NoticeMore";
    } 
    /**************************************************************************************************/
    
    /**************************学生相关的页面跳转操作****************************/
	/**
	 * 学生对中期检查表的审核情况
	 * @return
	 */
	@RequestMapping(value="StuJumpZQJCBPages",method=RequestMethod.GET) 
    public ModelAndView StuJumpZQJCBPages() {
		return new ModelAndView("Login\\Student\\SubmitProcessDocument\\UploadZQJCB");
	}	    
    
    
    
    /**************************教师相关的页面跳转操作****************************/
    
	/**
	 * 教师查询所有申报的毕设选题审核情况
	 * @return
	 */
	@RequestMapping(value="JumpTeacherDeclareBSXTPage",method=RequestMethod.GET) 
    public ModelAndView JumpTeacherDeclareBSXTPage() {
		return new ModelAndView("Login\\Teacher\\DeclareTopic\\DeclareBSXTPage");
	}	    
    
	/**
	 * 教师对毕设选题的审核情况
	 * @return
	 */
	@RequestMapping(value="JumpTeacherBSXTResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpTeacherBSXTResultPages() {
		return new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\BSXTResultlist");
	}		
	
	/**
	 * 教师对开题报告的审核情况
	 * @return
	 */
	@RequestMapping(value="JumpTeacherKTBGResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpTeacherKTBGResultPages() {
		return new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\KTBGResultlist");
	}		

	/**
	 * 教师对中期检查表的审核情况
	 * @return
	 */
	@RequestMapping(value="JumpTeacherZQJCBResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpTeacherZQJCBResultPages() {
		return new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\ZQJCBResultlist");
	}	
	
	/**
	 * 教师对毕业论文的审核情况
	 * @return
	 */
	@RequestMapping(value="JumpTeacherBYLWResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpTeacherBYLWResultPages() {
		return new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\BYLWResultlist");
	}		
	
	/**
	 * 教师对答辩PPT的审核情况
	 * @return
	 */
	@RequestMapping(value="JumpTeacherDBPPTResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpTeacherDBPPTResultPages() {
		return new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\DBPPTResultlist");
	}		
	
	
	/**************************专业负责人相关的页面跳转操作****************************/	
	
	
	/**
	 * 专业负责人毕设选题审核情况列表
	 * @return
	 */
	@RequestMapping(value="JumpPLBSXTResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpPLBSXTResultPages() {
		return new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_BSXTResultlist");
	}	
		
	/**
	 * 专业负责人审核开题报告审核情况列表
	 * @return
	 */
	@RequestMapping(value="JumpPLKTBGResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpPLKTBGResultPages() {
		return new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_KTBGResultlist");
	}	
	
	/**
	 * 专业负责人中期检查表审核情况列表
	 * @return
	 */
	@RequestMapping(value="JumpPLZQJCBResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpPLZQJCBResultPages() {
		return new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_BSXTResultlist");
	}	
		
	/**
	 * 专业负责人审核毕业论文审核情况列表
	 * @return
	 */
	@RequestMapping(value="JumpPLBYKWResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpPLBYKWResultPages() {
		return new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_KTBGResultlist");
	}		
	
	/**
	 * 专业负责人审核答辩PPT审核情况列表
	 * @return
	 */
	@RequestMapping(value="JumpPLDBPPTResultPages",method=RequestMethod.GET) 
    public ModelAndView JumpPLDBPPTResultPages() {
		return new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_DBPPTResultlist");
	}		
	
	/**
	 * 查询某个毕设的详细信息（毕设选题）
	 * @return
	 */
	@RequestMapping(value="JumpBSXTDetailPages",method=RequestMethod.GET) 
    public ModelAndView JumpBSXTDetailPages(@RequestParam(value="gdResultID")String gdResultID,@RequestParam(value="gdID")String gdID,HttpServletRequest request,HttpSession session) {
		//String 转换为Integer
		Integer gdresultid = Integer.valueOf(gdResultID);
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdresultid);
		ModelAndView mv = new ModelAndView("Login\\BSXTDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		return mv;
	}


	
	/**
	 * 查询某个毕设选题的详细信息
	 * @return
	 */
	@RequestMapping(value="StuJumpBSXTDetailPages",method=RequestMethod.GET) 
    public ModelAndView StuJumpBSXTDetailPages(@RequestParam(value="gdID")String gdID,HttpServletRequest request,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid,stu);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdid,stu.getStudentid());
		ModelAndView mv = new ModelAndView("Login\\BSXTDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		return mv;
	}	
	
	/**
	 * 学生跳转到显示申报选题结果的页面
	 * @return
	 */
	@RequestMapping(value="StuJumpDeclareBSXTPage",method=RequestMethod.GET)  
    public String StuJumpDeclareBSXTPage() {
			return "Login\\Student\\DeclareTopic\\DeclareBSXTPage";
	}
		

	/**************************教师用户设置相关的页面跳转操作****************************/	
	/**
	 * 跳转到教师用户信息的页面
	 * @return
	 */
	@RequestMapping(value="JumpTeacherInfoPage",method=RequestMethod.GET)  
    public String JumpTeacherInfoPage() {
		return "Login/Teacher/setting/UserInfo";		
	}
	
	/**
	 * 跳转到教师修改密码的页面
	 * @return
	 */
	@RequestMapping(value="JumpAlertTeacherPwPage",method=RequestMethod.GET)  
    public String JumpAlertTeacherPwPage() {
		return "Login/Teacher/setting/AlertPassword";		
	}	
	
	

	/**
	 * 专业负责人对开题报告进行审核
	 * @return
	 */
	@RequestMapping(value="JumpAuditKTBGPages",method=RequestMethod.GET)    	
    public ModelAndView JumpAuditKTBGPages(@RequestParam(value="gdID")String gdID,@RequestParam(value="gdResultID")String gdResultID,HttpServletRequest request) {
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditKTBGPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		return mv;
	}	
	
	
	/**
	 * 学生跳转到修改某个毕设信息的页面
	 * @return
	 */
	@RequestMapping(value="StuJumpAlertGDPages",method=RequestMethod.GET) 
	public ModelAndView StuJumpAlertGDPages(@RequestParam(value="gdID")String gdID,@RequestParam(value="gdResultID")String gdResultID,HttpServletRequest request) {
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		//String 转换为Integer
		Integer gdResultid = Integer.valueOf(gdResultID);		
		Graduationdesignresult gdresult = graduationDesignService.selectGDResultDetail(gdResultid);
	    ModelAndView mv=new ModelAndView("Login\\Student\\DeclareTopic\\AlertBSXTPage");  
	    mv.addObject("GDInfo", gd);
	    mv.addObject("GDResultInfo", gdresult);
	    return mv;  		
	}
	
	/**
	 * 教师跳转到修改某个毕设信息的页面
	 * @return
	 */
	@RequestMapping(value="TeacherJumpAlertGDPages",method=RequestMethod.GET) 
	public ModelAndView TeacherJumpAlertGDPages(@RequestParam(value="gdID")String gdID,@RequestParam(value="gdResultID")String gdResultID,HttpServletRequest request) {
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		//String 转换为Integer
		Integer gdResultid = Integer.valueOf(gdResultID);		
		Graduationdesignresult gdresult = graduationDesignService.selectGDResultDetail(gdResultid);
	    ModelAndView mv=new ModelAndView("Login\\Teacher\\DeclareTopic\\AlertBSXT");  
	    mv.addObject("GDInfo", gd);
	    mv.addObject("GDResultInfo", gdresult);
	    return mv;  		
	}
		
	
	/**
	 * 跳转到毕设选题列表的页面
	 * @return
	 */
	@RequestMapping(value="JumpBSXTlistPages",method=RequestMethod.GET)  
    public String JumpBSXTlistPages() {
		return "Login\\Student\\DeclareTopic\\BSXTlist";
	}

	/**
	 * 教师跳转到申报毕设选题的页面
	 * @return
	 */
	@RequestMapping(value="TeacherJumpDeclareBSXTPage",method=RequestMethod.GET)  
    public String TeacherJumpDeclareBSXTPage() {
			return "Login\\Teacher\\DeclareTopic\\DeclareBSXTPage";
	}	
	
	/**
	 * 教师跳转到填写申报选题信息的页面
	 * @return
	 */
	@RequestMapping(value="TeacherJumpDeclareBSXTSuccess",method=RequestMethod.GET)  
    public String TeacherJumpDeclareBSXTSuccess() {
			return "Login\\Teacher\\DeclareTopic\\DeclareBSXT";
	}		
	
	/**
	 * 学生跳转到填写申报毕设选题信息的页面
	 * @return
	 */
	@RequestMapping(value="JumpDeclareBSXTSuccess",method=RequestMethod.GET)  
    public String JumpDeclareBSXTSuccess() {
			return "Login\\Student\\DeclareTopic\\DeclareBSXT";
	}	
	
	/**
	 * 跳转到填写申报选题的页面
	 * @return
	 */
	@RequestMapping(value="JumpDeclareBSXT",method=RequestMethod.GET)  
	@ResponseBody
    public Msg JumpDeclareBSXT(HttpSession session) {		
		Student stu = (Student)session.getAttribute("user");
		if(graduationDesignResultService.selecthasBSXTOrNot(stu.getStudentid()) == false)
			return Msg.success();
		else
			return Msg.fail();
	}	
    /**************************************************************************************************/

	
	/**************************用户信息相关的页面跳转操作***********************************************/	
	/**
	 * 跳转到学生用户信息的页面
	 * @return
	 */
	@RequestMapping(value="JumpUserInfoPage",method=RequestMethod.GET)  
    public String JumpUserInfoPage() {
		return "Login/Student/setting/UserInfo";		
	}
	
	/**
	 * 跳转到学生修改密码的页面
	 * @return
	 */
	@RequestMapping(value="JumpAlertPwPage",method=RequestMethod.GET)  
    public String JumpAlertPwPage() {
		return "Login/Student/setting/AlertPassword";		
	}	
	
	/**
	 * 跳转到管理员用户信息的页面
	 * @return
	 */
	@RequestMapping(value="AdminJumpUserInfoPage",method=RequestMethod.GET)  
    public String AdminJumpUserInfoPage() {
		return "Login/Admin/setting/UserInfo";		
	}
	
	/**
	 * 跳转到管理员修改密码的页面
	 * @return
	 */
	@RequestMapping(value="AdminJumpAlertPwPage",method=RequestMethod.GET)  
    public String AdminJumpAlertPwPage() {
		return "Login/Admin/setting/AlertPassword";		
	}		
	
	/**************************************************************************************************/
	
	/**************************跳转与开题报告(KTBG)相关的页面跳转操作***********************************************/
	/**
	 * 跳转到上传开题报告信息的页面
	 * @param stu
	 * @return
	 */
	@RequestMapping(value="JumpUploadKTBGPage",method=RequestMethod.GET)  
    public ModelAndView JumpUploadKTBGPage(@SessionAttribute("user")Student stu) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\UploadKTBG");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取开题报告信息
			Ktbginfo ktbginfo = ktbgInfoService.selectOneKtbgInfo(stu.getStudentid(), stu.getGraduationdesignid());
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(),stu);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("ktbginfo", ktbginfo);
		}
		return mv;	
	}	
	
	
	/**
	 * 学生跳转到修改开题报告信息的页面
	 * @param stu
	 * @return
	 */
	@RequestMapping(value="JumpAlertKTBGPage",method=RequestMethod.GET)  
    public ModelAndView JumpAlertKTBGPage(@SessionAttribute("user")Student stu,@RequestParam(value="ktbginfoid")Integer ktbginfoid) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\AlertKTBG");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取对应的毕设信息
			GraduationdesignWithBLOBs GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid());
			//获取对应的开题报告信息
		    Ktbginfo ktbgInfo = graduationDesignResultService.selectOneKtbgInfo(ktbginfoid);
		    mv.addObject("GDInfo", GDInfo);
			mv.addObject("ktbgInfo", ktbgInfo);		
		}
		return mv;	
	}		
		
	/**
	 * 查询某个毕设的（开题报告）详细信息
	 * @return
	 */
	@RequestMapping(value="JumpKTBGDetailPages",method=RequestMethod.GET) 
    public ModelAndView JumpKTBGDetailPages(@RequestParam(value="ktbginfoid")Integer ktbginfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")String gdID,HttpServletRequest request,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		GraduationdesignWithBLOBs GDInfo = graduationDesignService.selectGDDetail(gdid,stu);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		Ktbginfo ktbgInfo = graduationDesignResultService.selectOneKtbgInfo(ktbginfoid);

		ModelAndView mv = new ModelAndView("Login\\KTBGDetailInfo");
		mv.addObject("GDInfo", GDInfo);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("ktbgInfo", ktbgInfo);
		return mv;
	}	
	
	
	/**
	 * 教师查询某个毕设的（开题报告）详细信息
	 * @return
	 */
	@RequestMapping(value="TeacherJumpKTBGDetailPages",method=RequestMethod.GET) 
    public ModelAndView TeacherJumpKTBGDetailPages(@RequestParam(value="ktbginfoid")Integer ktbginfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")String gdID,@RequestParam(value="studentid")String studentid,HttpServletRequest request,HttpSession session) {
		Student stu = studentService.getOneStuInfo(studentid);
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		GraduationdesignWithBLOBs GDInfo = graduationDesignService.selectGDDetail(gdid,stu);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		Ktbginfo ktbgInfo = graduationDesignResultService.selectOneKtbgInfo(ktbginfoid);

		ModelAndView mv = new ModelAndView("Login\\KTBGDetailInfo");
		mv.addObject("GDInfo", GDInfo);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("ktbgInfo", ktbgInfo);
		return mv;
	}		
	

	/**
	 * 跳转到上传中期检查表信息的页面
	 * @param stu
	 * @return
	 */
	@RequestMapping(value="JumpUploadZQJCBPage",method=RequestMethod.GET)  
    public ModelAndView JumpUploadZQJCBPage(@SessionAttribute("user")Student stu) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\UploadZQJCB");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取中期检查表信息
			ZqjcinfoWithBLOBs zqjcbinfo = zqjcbInfoService.selectOneZqjcInfo(stu.getStudentid(), stu.getGraduationdesignid());
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(),stu);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("zqjcbinfo", zqjcbinfo);	   
		}
		return mv;	
	}		
	
	/**
	 * 学生跳转到修改中期检查表信息的页面
	 * @param stu
	 * @param zqjcinfoid
	 * @return
	 */
	@RequestMapping(value="JumpAlertZQJCBPage",method=RequestMethod.GET)  
    public ModelAndView JumpAlertZQJCBPage(@SessionAttribute("user")Student stu,@RequestParam(value="zqjcinfoid")Integer zqjcinfoid) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\AlertZQJCB");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid());
			//获取对应的中期检查表信息
		    ZqjcinfoWithBLOBs zqjcbinfo = zqjcbInfoService.selectOneZqjcInfo(stu.getStudentid(), stu.getGraduationdesignid());
		    zqjcbinfo.setXtbhyy(zqjcbinfo.getXtbhyy().trim());
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("zqjcbinfo", zqjcbinfo);		
		}
		return mv;	
	}		
		
	/**
	 * 查询某个毕设的（中期检查表）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="JumpZQJCBDetailPages",method=RequestMethod.GET) 
    public ModelAndView JumpZQJCBDetailPages(@RequestParam(value="zqjcbinfoid")Integer zqjcbinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取中期检查表信息
		ZqjcinfoWithBLOBs zqjcbinfo = zqjcbInfoService.selectOneZqjcbInfoById(zqjcbinfoid);
		ModelAndView mv = new ModelAndView("Login\\ZQJCBDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("zqjcbinfo", zqjcbinfo);
		return mv;
	}
	
	/**
	 * 教师查询某个毕设的（中期检查表）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="TeacherJumpZQJCBDetailPages",method=RequestMethod.GET) 
    public ModelAndView TeacherJumpZQJCBDetailPages(@RequestParam(value="zqjcbinfoid")Integer zqjcbinfoid,@RequestParam(value="studentid")String studentid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = studentService.getOneStuInfo(studentid);
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取中期检查表信息
		ZqjcinfoWithBLOBs zqjcbinfo = zqjcbInfoService.selectOneZqjcbInfoById(zqjcbinfoid);
		ModelAndView mv = new ModelAndView("Login\\ZQJCBDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("zqjcbinfo", zqjcbinfo);
		return mv;
	}
		
	
	/**
	 * 跳转到上传毕业论文信息的页面
	 * @param stu
	 * @return
	 */
	@RequestMapping(value="JumpUploadZDJLPage",method=RequestMethod.GET)  
    public ModelAndView JumpUploadZDJLPage(@SessionAttribute("user")Student stu) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\UploadZDJL");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取指导记录信息
			Zdjlinfo zdjlinfo = zdjlInfoService.selectOneZdjlInfo(stu.getStudentid(), stu.getGraduationdesignid());
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(),stu);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("zdjlinfo", zdjlinfo);	   
		}
		return mv;	
	}		
	
	/**
	 * 学生跳转到修改指导记录信息的页面
	 * @param stu
	 * @param zqjcinfoid
	 * @return
	 */
	@RequestMapping(value="JumpAlertZDJLPage",method=RequestMethod.GET)  
    public ModelAndView JumpAlertZDJLPage(@SessionAttribute("user")Student stu,@RequestParam(value="zdjlinfoid")Integer zdjlinfoid) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\AlertZDJL");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid());
			//获取对应的指导记录信息
			Zdjlinfo zdjlinfo = zdjlInfoService.selectOneZdjlbInfoById(zdjlinfoid);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("zdjlinfo", zdjlinfo);		
		}
		return mv;	
	}		
		
	/**
	 * 查询某个毕设的（指导记录）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="JumpZDJLDetailPages",method=RequestMethod.GET) 
    public ModelAndView JumpZDJLDetailPages(@RequestParam(value="zdjlinfoid")Integer zdjlinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取指导记录信息
		Zdjlinfo zdjlinfo = zdjlInfoService.selectOneZdjlbInfoById(zdjlinfoid);
		ModelAndView mv = new ModelAndView("Login\\ZDJLDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("zdjlinfo", zdjlinfo);
		return mv;
	}		
	
	/**
	 * 教师查询某个毕设的（指导记录）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="TeacherJumpZDJLDetailPages",method=RequestMethod.GET) 
    public ModelAndView TeacherJumpZDJLDetailPages(@RequestParam(value="studentid")String studentid,@RequestParam(value="zdjlinfoid")Integer zdjlinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = studentService.getOneStuInfo(studentid);
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取指导记录信息
		Zdjlinfo zdjlinfo = zdjlInfoService.selectOneZdjlbInfoById(zdjlinfoid);
		ModelAndView mv = new ModelAndView("Login\\ZDJLDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("zdjlinfo", zdjlinfo);
		return mv;
	}			
	
	/**
	 * 跳转到上传外文译文和原件信息的页面
	 * @param stu
	 * @return
	 */
	@RequestMapping(value="JumpUploadWWYWHYJPage",method=RequestMethod.GET)  
    public ModelAndView JumpUploadWWYWHYJPage(@SessionAttribute("user")Student stu) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\UploadWWYWHYJ");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取外文译文和原件信息
			WwywhyjinfoWithBLOBs wwywhyjinfo = wwywhyjInfoService.selectOneWwywhyjInfo(stu.getStudentid(), stu.getGraduationdesignid());
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(),stu);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("wwywhyjinfo", wwywhyjinfo);	   
		}
		return mv;	
	}		
	
	/**
	 * 学生跳转到修改外文译文和原件信息的页面
	 * @param stu
	 * @param zqjcinfoid
	 * @return
	 */
	@RequestMapping(value="JumpAlertWWYWHYJPage",method=RequestMethod.GET)  
    public ModelAndView JumpAlertWWYWHYJPage(@SessionAttribute("user")Student stu,@RequestParam(value="wwywhyjinfoid")Integer wwywhyjinfoid) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\AlertWWYWHYJ");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid());
			//获取对应的外文译文和原件信息
			Wwywhyjinfo wwywhyjinfo = wwywhyjInfoService.selectOneWwywhyjbInfoById(wwywhyjinfoid);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("wwywhyjinfo", wwywhyjinfo);		
		}
		return mv;	
	}		
		
	/**
	 * 查询某个毕设的（外文译文和原件）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="JumpWWYWHYJDetailPages",method=RequestMethod.GET) 
    public ModelAndView JumpWWYWHYJDetailPages(@RequestParam(value="wwywhyjinfoid")Integer wwywhyjinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取外文译文和原件信息
		Wwywhyjinfo wwywhyjinfo = wwywhyjInfoService.selectOneWwywhyjbInfoById(wwywhyjinfoid);
		ModelAndView mv = new ModelAndView("Login\\WWYWHYJDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("wwywhyjinfo", wwywhyjinfo);
		return mv;
	}			
	
	/**
	 * 教师查询某个毕设的（外文译文和原件）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="TeacherJumpWWYWHYJDetailPages",method=RequestMethod.GET) 
    public ModelAndView TeacherJumpWWYWHYJDetailPages(@RequestParam(value="studentid")String studentid,@RequestParam(value="wwywhyjinfoid")Integer wwywhyjinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = studentService.getOneStuInfo(studentid);
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取外文译文和原件信息
		Wwywhyjinfo wwywhyjinfo = wwywhyjInfoService.selectOneWwywhyjbInfoById(wwywhyjinfoid);
		ModelAndView mv = new ModelAndView("Login\\WWYWHYJDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("wwywhyjinfo", wwywhyjinfo);
		return mv;
	}				
	
	/**
	 * 跳转到上传毕业论文信息的页面
	 * @param stu
	 * @return
	 */
	@RequestMapping(value="JumpUploadBYLWPage",method=RequestMethod.GET)  
    public ModelAndView JumpUploadBYLWPage(@SessionAttribute("user")Student stu) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\UploadBYLW");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取毕业论文信息
			BylwinfoWithBLOBs bylwinfo = bylwInfoService.selectOneBylwInfo(stu.getStudentid(), stu.getGraduationdesignid());
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(),stu);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("bylwinfo", bylwinfo);	   
		}
		return mv;	
	}		
	
	/**
	 * 学生跳转到修改毕业论文信息的页面
	 * @param stu
	 * @param zqjcinfoid
	 * @return
	 */
	@RequestMapping(value="JumpAlertBYLWPage",method=RequestMethod.GET)  
    public ModelAndView JumpAlertBYLWPage(@SessionAttribute("user")Student stu,@RequestParam(value="bylwinfoid")Integer bylwinfoid) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\AlertBYLW");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid());
			//获取对应的毕业论文信息
			BylwinfoWithBLOBs bylwinfo = bylwInfoService.selectOneBylwbInfoById(bylwinfoid);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("bylwinfo", bylwinfo);		
		}
		return mv;	
	}		
		
	/**
	 * 查询某个毕设的（毕业论文）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="JumpBYLWDetailPages",method=RequestMethod.GET) 
    public ModelAndView JumpBYLWDetailPages(@RequestParam(value="bylwinfoid")Integer bylwinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取毕业论文信息
		BylwinfoWithBLOBs bylwinfo = bylwInfoService.selectOneBylwbInfoById(bylwinfoid);
		ModelAndView mv = new ModelAndView("Login\\BYLWDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("bylwinfo", bylwinfo);
		return mv;
	}	

	
	/**
	 * 教师查询某个毕设的（毕业论文）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="TeacherJumpBYLWDetailPages",method=RequestMethod.GET) 
    public ModelAndView TeacherJumpBYLWDetailPages(@RequestParam(value="studentid")String studentid,@RequestParam(value="bylwinfoid")Integer bylwinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = studentService.getOneStuInfo(studentid);
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取毕业论文信息
		BylwinfoWithBLOBs bylwinfo = bylwInfoService.selectOneBylwbInfoById(bylwinfoid);
		ModelAndView mv = new ModelAndView("Login\\BYLWDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("bylwinfo", bylwinfo);
		return mv;
	}		
	
	/**
	 * 跳转到上传答辩PPT信息的页面
	 * @param stu
	 * @return
	 */
	@RequestMapping(value="JumpUploadDBPPTPage",method=RequestMethod.GET)  
    public ModelAndView JumpUploadDBPPTPage(@SessionAttribute("user")Student stu) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\UploadDBPPT");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取答辩PPT信息
			Dbpptinfo dbpptinfo = dbpptInfoService.selectOneDbpptInfo(stu.getStudentid(), stu.getGraduationdesignid());
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(),stu);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("dbpptinfo", dbpptinfo);	   
		}
		return mv;	
	}		
	
	/**
	 * 学生跳转到修改答辩PPT信息的页面
	 * @param stu
	 * @param zqjcinfoid
	 * @return
	 */
	@RequestMapping(value="JumpAlertDBPPTPage",method=RequestMethod.GET)  
    public ModelAndView JumpAlertDBPPTPage(@SessionAttribute("user")Student stu,@RequestParam(value="dbpptinfoid")Integer dbpptinfoid) {
	    ModelAndView mv = new ModelAndView("Login\\Student\\SubmitProcessDocument\\AlertDBPPT");
		//获取毕设结果信息		
		if(graduationDesignResultService.selectPassAuditOrNot(stu)){
			//获取对应的毕设信息
			Graduationdesign GDInfo = graduationDesignService.selectGDDetail(stu.getGraduationdesignid());
			//获取对应的答辩PPT信息
			Dbpptinfo dbpptinfo = dbpptInfoService.selectOneDbpptbInfoById(dbpptinfoid);
		    mv.addObject("GDInfo", GDInfo);
		    mv.addObject("dbpptinfo", dbpptinfo);		
		}
		return mv;	
	}		
		
	/**
	 * 查询某个毕设的（答辩PPT）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="JumpDBPPTDetailPages",method=RequestMethod.GET) 
    public ModelAndView JumpDBPPTDetailPages(@RequestParam(value="dbpptinfoid")Integer dbpptinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取答辩PPT信息
		Dbpptinfo dbpptinfo = dbpptInfoService.selectOneDbpptbInfoById(dbpptinfoid);
		ModelAndView mv = new ModelAndView("Login\\DBPPTDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("dbpptinfo", dbpptinfo);
		return mv;
	}				
	
	/**
	 * 教师查询某个毕设的（答辩PPT）详细信息
	 * @param zqjcbInfoid
	 * @param gdResultID
	 * @param gdID
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="TeacherJumpDBPPTDetailPages",method=RequestMethod.GET) 
    public ModelAndView TeacherJumpDBPPTDetailPages(@RequestParam(value="studentid")String studentid,@RequestParam(value="dbpptinfoid")Integer dbpptinfoid,@RequestParam(value="gdResultID")Integer gdResultID,@RequestParam(value="gdID")Integer gdID,HttpServletRequest request,HttpSession session) {
		Student stu = studentService.getOneStuInfo(studentid);
		//获取毕设信息
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(stu.getGraduationdesignid(), stu);
		//获取毕设结果信息
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		//获取答辩PPT信息
		Dbpptinfo dbpptinfo = dbpptInfoService.selectOneDbpptbInfoById(dbpptinfoid);
		ModelAndView mv = new ModelAndView("Login\\DBPPTDetailInfo");
		mv.addObject("GDInfo", gd);
		mv.addObject("GDResultInfo", gdresult);
		mv.addObject("dbpptinfo", dbpptinfo);
		return mv;
	}					
	
    /**
     * 跳转到推送通知的页面
     * @return
     */
    @RequestMapping(value="JumpPushNotificationPage",method=RequestMethod.GET)  
    public ModelAndView JumpPushNotificationPage(HttpSession httpSession) {
    	Teacher teacher = (Teacher)httpSession.getAttribute("user");
    	ModelAndView mv = new ModelAndView("Login\\Teacher\\InteractionBetweenTAndS\\PushNotification");
    	List<Student>stulist = teacherService.getBZDStudentList(teacher.getTeacherid());
    	mv.addObject("stulist", stulist);
    	return mv;
    }		
    
    /**
     * 教师跳转到留言互动题目信息的页面
     * @return
     */
    @RequestMapping(value="JumpMessageInteractionPage",method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView JumpMessageInteractionPage(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	ModelAndView mv = new ModelAndView("Login\\Teacher\\InteractionBetweenTAndS\\MessageInteraction");
    	
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Lyhdtitleinfo> lyhdtitleinfolist = lyhdtitleinfoService.getAllLyTitle();
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(lyhdtitleinfolist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;
    }
    
    /**
     * 教师跳转到评论信息的页面
     * @return
     */
    @RequestMapping(value="JumpCommentPage",method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView JumpCommentPage(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam(value="titleid")Integer titleid) {
    	ModelAndView mv = new ModelAndView("Login\\Teacher\\InteractionBetweenTAndS\\CommentPage");
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<CommentWithBLOBs>commentlist = commentService.getOneTitleAllComment(titleid);
    	Lyhdtitleinfo lyhdtitleinfo = lyhdtitleinfoService.getOne(titleid);
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(commentlist,5);		
    	mv.addObject("pageInfo", page);
    	mv.addObject("lyhdtitleinfo", lyhdtitleinfo);    	
    	return mv;
    }	        
    
    /**
     * 学生跳转到留言互动题目信息的页面
     * @return
     */
    @RequestMapping(value="StuJumpMessageInteractionPage",method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView StuJumpMessageInteractionPage(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	ModelAndView mv = new ModelAndView("Login\\Student\\InteractionBetweenTAndS\\MessageInteraction");
    	
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Lyhdtitleinfo> lyhdtitleinfolist = lyhdtitleinfoService.getAllLyTitle();
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(lyhdtitleinfolist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;
    }    
    
    /**
     * 学生跳转到评论信息的页面
     * @return
     */
    @RequestMapping(value="StuJumpCommentPage",method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView StuJumpCommentPage(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam(value="titleid")Integer titleid) {
    	ModelAndView mv = new ModelAndView("Login\\Student\\InteractionBetweenTAndS\\CommentPage");
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<CommentWithBLOBs>commentlist = commentService.getOneTitleAllComment(titleid);
    	Lyhdtitleinfo lyhdtitleinfo = lyhdtitleinfoService.getOne(titleid);
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(commentlist,5);		
    	mv.addObject("pageInfo", page);
    	mv.addObject("lyhdtitleinfo", lyhdtitleinfo);    	
    	return mv;
    }	       

    /**
     * 跳转到审核团队信息的页面
     * @return
     */
    @RequestMapping(value="JumpAduitTeamInfo",method=RequestMethod.GET)  
    @ResponseBody
    public ModelAndView JumpAduitTeamInfo(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	Teacher teacher = (Teacher)httpSession.getAttribute("user");
    	ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditTeamInfo");
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Student> studentlist = teacherService.getBZDStudentList(teacher.getTeacherid());
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(studentlist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;
    }	   

    /**
     * 跳转到审核团队信息的页面
     * @return
     */
    @RequestMapping(value="ZYFZRJumpAduitTeamInfo",method=RequestMethod.GET)  
    @ResponseBody
    public ModelAndView ZYFZRJumpAduitTeamInfo(HttpSession httpSession,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	Teacher teacher = (Teacher)httpSession.getAttribute("user");
    	ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\AuditXYInfo");
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Student> studentlist = teacherService.getXYtudentList(teacher);
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(studentlist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;
    }	    
    
    /**
     * 跳转到设置答辩信息的页面
     * @return
     */
    @RequestMapping(value="JumpSetDbInfo",method=RequestMethod.GET)  
    public String JumpSetDbInfo(HttpSession httpSession) {
    	return "Login\\Teacher\\ProfessionalLeader\\SetDbInfo";
    }	
     
    /**
     * 学生跳转到查询答辩安排页面
     * @return
     */
    @RequestMapping(value="JumpDbAP",method=RequestMethod.GET)  
    public ModelAndView JumpDbAP(HttpSession session,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	Student stu = (Student)session.getAttribute("user");
    	ModelAndView mv = new ModelAndView("Login\\Student\\DBAndCJ\\StuDBAPlist");
    	
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Dbinfo> dbinfolist = dbInfoService.getStuDbinfolist(stu.getStudentid());
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(dbinfolist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;    	
    }	    
    
    /**
     * 教师跳转到查询答辩安排页面
     * @return
     */
    @RequestMapping(value="TeacherJumpDbAP",method=RequestMethod.GET)  
    public ModelAndView TeacherJumpDbAP(HttpSession session,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	Teacher teacher = (Teacher)session.getAttribute("user");
    	ModelAndView mv = new ModelAndView("Login\\Teacher\\DBAP\\TeacherDBAPlist");
    	
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Dbinfo> dbinfolist = dbInfoService.getTeacherDbinfolist(teacher.getTeacherid());
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(dbinfolist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;    	
    }	        
    
    /**
     * 教师跳转到答辩成绩评定页面
     * @return
     */
    @RequestMapping(value="TeacherJumpDbCJ",method=RequestMethod.GET)  
    public ModelAndView TeacherJumpDbCJ(HttpSession session,@RequestParam(value="pn",defaultValue="1")Integer pn) {
    	Teacher teacher = (Teacher)session.getAttribute("user");
    	ModelAndView mv = new ModelAndView("Login\\Teacher\\DBAP\\TeacherDBAPCJlist");
    	
		PageHelper.startPage(pn,5);
		//使用PageInfo包装查询后的结果
    	List<Dbinfo> dbinfolist = dbInfoService.getTeacherDbinfolist(teacher.getTeacherid());
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(dbinfolist,5);		
    	mv.addObject("pageInfo", page);
    	return mv;    	
    }	
    
	/**
	 * 指导老师对毕设选题进行审核
	 * @return
	 */
	@RequestMapping(value="JumpAuditBSXTPages",method=RequestMethod.GET)    	
    public ModelAndView JumpAuditBSXTPages(@RequestParam(value="gdID")String gdID,@RequestParam(value="gdResultID")String gdResultID,HttpServletRequest request) {
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditBSXTPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		return mv;
	}
	
	/**
	 * 指导教师对开题报告进行审核
	 * @return
	 */
	@RequestMapping(value="TeacherJumpAuditKTBGPages",method=RequestMethod.GET)    	
    public ModelAndView TeacherJumpAuditKTBGPages(@RequestParam(value="ktbginfoid")String ktbgInfoid,@RequestParam(value="gdID")String gdID,@RequestParam(value="gdResultID")String gdResultID,HttpServletRequest request) {
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		Integer ktbgInfoId = Integer.parseInt(ktbgInfoid);
		Ktbginfo ktbgInfo = graduationDesignResultService.selectOneKtbgInfo(ktbgInfoId);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditKTBGPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("ktbgInfo",ktbgInfo);
		return mv;
	}		
	
	/**
	 * 指导教师对中期检查表进行审核
	 * @return
	 */
	@RequestMapping(value="TeacherJumpAuditZQJCBPages",method=RequestMethod.GET)    	
    public ModelAndView TeacherJumpAuditZQJCBPages(@RequestParam(value="zqjcbinfoid")Integer zqjcbinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		ZqjcinfoWithBLOBs zqjcbinfo = graduationDesignResultService.selectOneZqjcbinfo(zqjcbinfoid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditZQJCBPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("zqjcbinfo",zqjcbinfo);
		return mv;
	}		
	
	/**
	 * 指导教师对外文译文和原件进行审核
	 * @return
	 */
	@RequestMapping(value="TeacherJumpAuditWWYWHYJPages",method=RequestMethod.GET)    	
    public ModelAndView TeacherJumpAuditWWYWHYJPages(@RequestParam(value="wwywhyjinfoid")Integer wwywhyjinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		WwywhyjinfoWithBLOBs wwywhyjinfo = graduationDesignResultService.selectOneWwywhyjinfo(wwywhyjinfoid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditWWYWHYJPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("wwywhyjinfo",wwywhyjinfo);
		return mv;
	}		
	
	/**
	 * 指导教师对指导记录进行审核
	 * @return
	 */
	@RequestMapping(value="TeacherJumpAuditZDJLPages",method=RequestMethod.GET)    	
    public ModelAndView TeacherJumpAuditZDJLPages(@RequestParam(value="zdjlinfoid")Integer zdjlinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(gdID);
		Zdjlinfo zdjlinfo = graduationDesignResultService.selectOneZdjlinfo(zdjlinfoid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditZDJLPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdResultID",gdResultID);
		mv.addObject("zdjlinfo",zdjlinfo);
		return mv;
	}			
	
	/**
	 * 指导教师对毕业论文进行审核
	 * @return
	 */
	@RequestMapping(value="TeacherJumpAuditBYLWPages",method=RequestMethod.GET)    	
    public ModelAndView TeacherJumpAuditBYLWPages(@RequestParam(value="bylwinfoid")Integer bylwinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		BylwinfoWithBLOBs bylwinfo = graduationDesignResultService.selectOneBylwinfo(bylwinfoid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditBYLWPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("bylwinfo",bylwinfo);
		return mv;
	}		
	
	/**
	 * 指导教师对答辩PPT进行审核
	 * @return
	 */
	@RequestMapping(value="TeacherJumpAuditDBPPTPages",method=RequestMethod.GET)    	
    public ModelAndView TeacherJumpAuditDBPPTPages(@RequestParam(value="dbpptinfoid")Integer dbpptinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		Dbpptinfo dbpptinfo = graduationDesignResultService.selectOneDbpptinfo(dbpptinfoid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ReviewTeamInformation\\AuditDBPPTPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("dbpptinfo",dbpptinfo);
		return mv;
	}		
	
	/**
	 * 专业负责人对毕设选题进行审核
	 * @return
	 */
	@RequestMapping(value="JumpPLAuditBSXTPages",method=RequestMethod.GET)    	
    public ModelAndView JumpPLAuditBSXTPages(@RequestParam("gdResultID")String gdResultID,@RequestParam(value="gdID")String gdID,HttpServletRequest request) {
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Integer gdresultid = Integer.valueOf(gdResultID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		GraduationdesignresultWithBLOBs GDResultInfo = graduationDesignResultService.selectOneGdResult(gdresultid);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_AudtBSXTPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("GDResultInfo",GDResultInfo);
		return mv;
	}
		
	/**
	 * 专业负责人对开题报告进行审核
	 * @return
	 */
	@RequestMapping(value="JumpPLAuditKTBGPages",method=RequestMethod.GET)    	
    public ModelAndView JumpPLAuditKTBGPages(@RequestParam(value="ktbginfoid")String ktbgInfoid,@RequestParam(value="gdID")String gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		//String 转换为Integer
		Integer gdid = Integer.valueOf(gdID);
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdid);
		Integer ktbgInfoId = Integer.parseInt(ktbgInfoid);
		Ktbginfo ktbgInfo = graduationDesignResultService.selectOneKtbgInfo(ktbgInfoId);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_AuditKTBGPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("gdresult",gdresult);
		mv.addObject("ktbgInfo",ktbgInfo);
		return mv;
	}		
	
	/**
	 * 专业负责人对中期检查表进行审核
	 * @return
	 */
	@RequestMapping(value="JumpPLAuditZQJCBPages",method=RequestMethod.GET)    	
    public ModelAndView JumpPLAuditZQJCBPages(@RequestParam(value="zqjcbinfoid")Integer zqjcbinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		ZqjcinfoWithBLOBs zqjcbinfo = graduationDesignResultService.selectOneZqjcbinfo(zqjcbinfoid);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_AuditZQJCBPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("zqjcbinfo",zqjcbinfo);
		mv.addObject("gdresult", gdresult);
		return mv;
	}		
	
	/**
	 * 专业负责人对外文译文和原件进行审核
	 * @return
	 */
	@RequestMapping(value="JumpPLAuditWWYWHYJPages",method=RequestMethod.GET)    	
    public ModelAndView JumpPLAuditWWYWHYJPages(@RequestParam(value="wwywhyjinfoid")Integer wwywhyjinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		WwywhyjinfoWithBLOBs wwywhyjinfo = graduationDesignResultService.selectOneWwywhyjinfo(wwywhyjinfoid);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_AuditWWYWHYJPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("wwywhyjinfo",wwywhyjinfo);
		mv.addObject("gdresult", gdresult);
		return mv;
	}		
	
	/**
	 * 专业负责人对指导记录进行审核
	 * @return
	 */
	@RequestMapping(value="JumpPLAuditZDJLPages",method=RequestMethod.GET)    	
    public ModelAndView JumpPLAuditZDJLPages(@RequestParam(value="zdjlinfoid")Integer zdjlinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		GraduationdesignWithBLOBs gd = graduationDesignService.selectGDDetail(gdID);
		Zdjlinfo zdjlinfo = graduationDesignResultService.selectOneZdjlinfo(zdjlinfoid);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_AuditZDJLPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("zdjlinfo",zdjlinfo);
		mv.addObject("gdresult", gdresult);
		return mv;
	}			
	
	/**
	 * 专业负责人对毕业论文进行审核
	 * @return
	 */
	@RequestMapping(value="JumpPLAuditBYLWPages",method=RequestMethod.GET)    	
    public ModelAndView JumpPLAuditBYLWPages(@RequestParam(value="bylwinfoid")Integer bylwinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		BylwinfoWithBLOBs bylwinfo = graduationDesignResultService.selectOneBylwinfo(bylwinfoid);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_AuditBYLWPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("bylwinfo",bylwinfo);
		mv.addObject("gdresult", gdresult);
		return mv;
	}		
	
	/**
	 * 专业负责人对答辩PPT进行审核
	 * @return
	 */
	@RequestMapping(value="JumpPLAuditDBPPTPages",method=RequestMethod.GET)    	
    public ModelAndView JumpPLAuditDBPPTPages(@RequestParam(value="dbpptinfoid")Integer dbpptinfoid,@RequestParam(value="gdID")Integer gdID,@RequestParam(value="gdResultID")Integer gdResultID,HttpServletRequest request) {
		Graduationdesign gd = graduationDesignService.selectGDDetail(gdID);
		Dbpptinfo dbpptinfo = graduationDesignResultService.selectOneDbpptinfo(dbpptinfoid);
		GraduationdesignresultWithBLOBs gdresult = graduationDesignResultService.selectOneGdResult(gdResultID);
		ModelAndView mv = new ModelAndView("Login\\Teacher\\ProfessionalLeader\\PL_AuditDBPPTPage");
		mv.addObject("GDInfo",gd);
		mv.addObject("gdresultID",gdResultID);
		mv.addObject("dbpptinfo",dbpptinfo);
		mv.addObject("gdresult", gdresult);
		return mv;
	}			
	
	
	/**
	 * 跳转到通知管理功能
	 * @return
	 */
	@RequestMapping(value="JumpManageNotice",method=RequestMethod.GET)
    @ResponseBody
	public ModelAndView JumpManageNotice(@RequestParam(value="pageNum",defaultValue="10")Integer pageNum,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model,Notice notice){
		PageHelper.startPage(pn,pageNum);		
		List<Notice> noticelist = noticeService.getNoticeBytitle(notice);
		/*List<Notice> noticelist = noticeService.getAllNotice();*/
		//使用PageInfo包装查询后的结果
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(noticelist,5);
		model.addAttribute("pageInfo",page);
		ModelAndView mv = new ModelAndView("Login\\Admin\\PutNotice\\ManageNotice");
		mv.addObject("pageInfo",page);
		return mv;
	}		
	
	/**
	 * 学生跳转到通知界面
	 * @return
	 */
	@RequestMapping(value="StuJumpNoticePage",method=RequestMethod.GET)
    @ResponseBody
	public ModelAndView StuJumpNoticePage(@RequestParam(value="pageNum",defaultValue="10")Integer pageNum,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model,Teachernotice teachernotice,HttpSession session){
		PageHelper.startPage(pn,pageNum);		
		Student stu = (Student)session.getAttribute("user");
		List<Teachernotice> teachernoticelist = teacherNoticeService.getStuTeacherNotice(stu);
		/*List<Notice> noticelist = noticeService.getAllNotice();*/
		//使用PageInfo包装查询后的结果
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(teachernoticelist,5);
		model.addAttribute("pageInfo",page);
		ModelAndView mv = new ModelAndView("Login\\Student\\InteractionBetweenTAndS\\StuNotice");
		mv.addObject("pageInfo",page);
		return mv;
	}	
	
	 /**
     * 跳转到选择学年的页面
     * @return
     */
	@RequestMapping(value="JumpChooseXN",method=RequestMethod.GET)
	public String JumpChooseXN() {
		return "Login/TeacherChooseXN";
	}	
}
