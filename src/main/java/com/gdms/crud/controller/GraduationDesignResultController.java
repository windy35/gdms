package com.gdms.crud.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdms.crud.bean.GDQueryCondition;
import com.gdms.crud.bean.GraduationdesignWithBLOBs;
import com.gdms.crud.bean.Graduationdesignresult;
import com.gdms.crud.bean.GraduationdesignresultWithBLOBs;
import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Student;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.service.GraduationDesignResultService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GraduationDesignResultController {
	@Autowired
	GraduationDesignResultService graduationdesignresultService;
	
	/**
	 * 专业负责人获取毕设信息
	 * @param session
	 * @return
	 */
	@RequestMapping(value="getPLgdresultList",method=RequestMethod.POST)  
	@ResponseBody
    public Msg getPLgdresultList(HttpSession session,@ModelAttribute GDQueryCondition gdQueryCondition,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		
		PageHelper.startPage(pn,5);		
		List<Graduationdesignresult> gdresultlist = graduationdesignresultService.getPLgdresultList(teacher,gdQueryCondition);
		//使用PageInfo包装查询后的结果
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo page = new PageInfo(gdresultlist,5);
		model.addAttribute("pageInfo",page);
		return Msg.success().add("pageInfo",page);	
	}
	

	
	/**
	 * 指导教师审核开题报告
	 * @param session
	 * @return
	 */
	@RequestMapping(value="AuditKTBG",method=RequestMethod.POST)  
	@ResponseBody
    public Msg AuditKTBG(@ModelAttribute GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getKtbginstructoropinion())) {
			error_Msg[0] = "请选择开题报告审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getKtbginstructordetailopinion())) {
			error_Msg[1] = "请输入开题报告审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.updateKTBGAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}	
	
	/**
	 * 指导教师审核中期检查表
	 * @param session
	 * @return
	 */
	@RequestMapping(value="AuditZQJCB",method=RequestMethod.POST)  
	@ResponseBody
    public Msg AuditZQJCB(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getZqjcbinstructoropinion())) {
			error_Msg[0] = "请选择中期检查表审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getZqjcbinstructordetailopinion())) {
			error_Msg[1] = "请输入中期检查表审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.updateZQJCBAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}	
	
	/**
	 * 指导教师审核外文译文和原件
	 * @param session
	 * @return
	 */
	@RequestMapping(value="AuditWWYWHYJ",method=RequestMethod.POST)  
	@ResponseBody
    public Msg AuditWWYWHYJ(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getWwywhyjinstructoropinion())) {
			error_Msg[0] = "请选择外文译文和原件审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getWwywhyjinstructordetailopinion())) {
			error_Msg[1] = "请输入外文译文和原件审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.updateWWYWHYJAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}		
	
	/**
	 * 指导教师审核指导记录
	 * @param session
	 * @return
	 */
	@RequestMapping(value="AuditZDJL",method=RequestMethod.POST)  
	@ResponseBody
    public Msg AuditZDJL(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getZdjlinstructoropinion())) {
			error_Msg[0] = "请选择指导记录审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getZdjlinstructordetailopinion())) {
			error_Msg[1] = "请输入指导记录审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.updateZDJLAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}	
	
	/**
	 * 指导教师审核毕业论文
	 * @param session
	 * @return
	 */
	@RequestMapping(value="AuditBYLW",method=RequestMethod.POST)  
	@ResponseBody
    public Msg AuditBYLW(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getBylwinstructoropinion())) {
			error_Msg[0] = "请选择毕业论文审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getBylwinstructordetailopinion())) {
			error_Msg[1] = "请输入毕业论文审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.updateBYLWAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}		
	
	/**
	 * 指导教师审核答辩PPT
	 * @param session
	 * @return
	 */
	@RequestMapping(value="AuditDBPPT",method=RequestMethod.POST)  
	@ResponseBody
    public Msg AuditDBPPT(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getDbpptinstructoropinion())) {
			error_Msg[0] = "请选择答辩PPT审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getDbpptinstructordetailopinion())) {
			error_Msg[1] = "请输入答辩PPT审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.updateDBPPTAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}			
	
	/**
	 * 学生查询自己所有毕设结果信息
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="QueryStudentGDResultlist",method=RequestMethod.POST)
	@ResponseBody
    public Msg QueryStudentGDResultlist(@ModelAttribute GDQueryCondition gdQueryCondition,HttpSession session,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		//引入PageHelper分页插件
		//在查询之前只需要调用，传入页码以及每页的数据数目为5
		PageHelper.startPage(pn,5);		
		
		Student stu = (Student)session.getAttribute("user");
		List<GraduationdesignresultWithBLOBs> graduationdesignresultlist = graduationdesignresultService.StudentQueryGDResultlist(gdQueryCondition,stu);
		//使用PageInfo包装查询后的结果
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		PageInfo page = new PageInfo(graduationdesignresultlist,5);
		model.addAttribute("pageInfo",page);
		return Msg.success().add("pageInfo",page);
	}		
	
	/**
	 * 教师查询所有毕设结果信息
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="QueryTeacherGDResultlist",method=RequestMethod.POST)
	@ResponseBody
    public Msg QueryTeacherGDResultlist(@ModelAttribute GDQueryCondition gdQueryCondition,HttpSession session,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		//引入PageHelper分页插件
		//在查询之前只需要调用，传入页码以及每页的数据数目为5
		PageHelper.startPage(pn,5);		
		
		Teacher teacher = (Teacher)session.getAttribute("user");
		List<Graduationdesignresult> graduationdesignresultlist = graduationdesignresultService.QueryTeacherGDResultlist(gdQueryCondition,teacher);
		
		//使用PageInfo包装查询后的结果
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		PageInfo page = new PageInfo(graduationdesignresultlist,5);
		model.addAttribute("pageInfo",page);
		return Msg.success().add("pageInfo",page);
	}		
	
	/**
	 * 教师查询自己申报的毕设结果信息
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="QueryTeacherOwnGDResultlist",method=RequestMethod.POST)
	@ResponseBody
    public Msg QueryTeacherOwnGDResultlist(@ModelAttribute GDQueryCondition gdQueryCondition,HttpSession session,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		//引入PageHelper分页插件
		//在查询之前只需要调用，传入页码以及每页的数据数目为5
		PageHelper.startPage(pn,5);		
		
		Teacher teacher = (Teacher)session.getAttribute("user");
		List<Graduationdesignresult> graduationdesignresultlist = graduationdesignresultService.QueryTeacherOwnGDResultlist(gdQueryCondition,teacher);
		
		//使用PageInfo包装查询后的结果
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		PageInfo page = new PageInfo(graduationdesignresultlist,5);
		model.addAttribute("pageInfo",page);
		return Msg.success().add("pageInfo",page);
	}		
	
	/**
	 * 专业负责人审核开题报告
	 * @param session
	 * @return
	 */
	@RequestMapping(value="PLAuditKTBG",method=RequestMethod.POST)  
	@ResponseBody
    public Msg PLAuditKTBG(@ModelAttribute GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getKtbgexpertopinion())) {
			error_Msg[0] = "请选择开题报告审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getKtbgexpertdetailopinion())) {
			error_Msg[1] = "请输入开题报告审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.PLupdateKTBGAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}	
	
	/**
	 * 专业负责人审核中期检查表
	 * @param session
	 * @return
	 */
	@RequestMapping(value="PLAuditZQJCB",method=RequestMethod.POST)  
	@ResponseBody
    public Msg PLAuditZQJCB(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getZqjcbexpertopinion())) {
			error_Msg[0] = "请选择中期检查表审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gdresult.getZqjcbexpertdetailopinion())) {
			error_Msg[1] = "请输入中期检查表审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationdesignresultService.PLupdateZQJCBAudit(gdresult,teacher.getName());			
		}
		return Msg.success();
	}	
	
	/**
	 * 专业负责人审核外文译文和原件
	 * @param session
	 * @return
	 */
	@RequestMapping(value="PLAuditWWYWHYJ",method=RequestMethod.POST)  
	@ResponseBody
    public Msg PLAuditWWYWHYJ(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getWwywhyjexpertopinion())) {
			error_Msg[0] = "请选择外文译文和原件审核意见";
		}else if("".equals(gdresult.getWwywhyjexpertdetailopinion())) {
			error_Msg[1] = "请输入外文译文和原件审核详细意见";
		}else {
			graduationdesignresultService.PLupdateWWYWHYJAudit(gdresult,teacher.getName());
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}		
	
	/**
	 * 专业负责人审核指导记录
	 * @param session
	 * @return
	 */
	@RequestMapping(value="PLAuditZDJL",method=RequestMethod.POST)  
	@ResponseBody
    public Msg PLAuditZDJL(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getZdjlexpertopinion())) {
			error_Msg[0] = "请选择指导记录审核意见";
		}else if("".equals(gdresult.getZdjlexpertdetailopinion())) {
			error_Msg[1] = "请输入指导记录审核详细意见";
		}else {
			graduationdesignresultService.PLupdateZDJLAudit(gdresult,teacher.getName());
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}	
	
	/**
	 * 专业负责人审核毕业论文
	 * @param session
	 * @return
	 */
	@RequestMapping(value="PLAuditBYLW",method=RequestMethod.POST)  
	@ResponseBody
    public Msg PLAuditBYLW(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getBylwexpertopinion())) {
			error_Msg[0] = "请选择毕业论文审核意见";
		}else if("".equals(gdresult.getBylwexpertdetailopinion())) {
			error_Msg[1] = "请输入毕业论文审核详细意见";
		}else {
			graduationdesignresultService.PLupdateBYLWAudit(gdresult,teacher.getName());
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}		
	
	/**
	 * 专业负责人审核答辩PPT
	 * @param session
	 * @return
	 */
	@RequestMapping(value="PLAuditDBPPT",method=RequestMethod.POST)  
	@ResponseBody
    public Msg PLAuditDBPPT(GraduationdesignresultWithBLOBs gdresult,HttpSession session) {
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gdresult.getDbpptexpertopinion())) {
			error_Msg[0] = "请选择答辩PPT审核意见";
		}else if("".equals(gdresult.getDbpptexpertdetailopinion())) {
			error_Msg[1] = "请输入答辩PPT审核详细意见";
		}else {
			graduationdesignresultService.PLupdateDBPPTAudit(gdresult,teacher.getName());
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}			
	
}
