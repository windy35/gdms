package com.gdms.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.internal.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gdms.crud.bean.Auditstatustype;
import com.gdms.crud.bean.Department;
import com.gdms.crud.bean.Designtype;
import com.gdms.crud.bean.GDQueryCondition;
import com.gdms.crud.bean.Grade;
import com.gdms.crud.bean.Graduationdesign;
import com.gdms.crud.bean.GraduationdesignWithBLOBs;
import com.gdms.crud.bean.Graduationdesignresult;
import com.gdms.crud.bean.GraduationdesignresultWithBLOBs;
import com.gdms.crud.bean.Ktbginfo;
import com.gdms.crud.bean.Major;
import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Student;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.bean.Titlesource;
import com.gdms.crud.dao.DepartmentMapper;
import com.gdms.crud.dao.MajorMapper;
import com.gdms.crud.service.GraduationDesignResultService;
import com.gdms.crud.service.GraduationDesignService;
import com.gdms.crud.service.KtbgInfoService;
import com.gdms.crud.service.TeacherService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * 处理申报选题相关功能
 * @author 周汶锋
 *
 */

@Controller
public class GraduationDesignController {
	@Autowired
	GraduationDesignService graduationDesignService;		
	@Autowired
	GraduationDesignResultService GraduationDesignResultService;		
	@Autowired
	KtbgInfoService ktbgInfoService;	
	@Autowired
	TeacherService teacherService;
	/**
	 * 获取查询的题目类型、题目来源和教师信息的下拉列
	 * @return
	 */
	@RequestMapping(value="getxllb",method=RequestMethod.POST)  
	@ResponseBody
    public Msg getxllb(HttpSession session) {
		List<Designtype> designtypelist = graduationDesignService.getDesigntypelist();
		List<Titlesource> titlesourcelist = graduationDesignService.getTitlesourcelist();		
		List<Teacher> teacherInfolist = graduationDesignService.getTeacherInfolist();
		List<Auditstatustype> auditstatustypelist = graduationDesignService.getAuditstatustypelist();
		List<Department> departmentlist = graduationDesignService.getDepartmentlist();
		List<Grade> gradelist = graduationDesignService.getGradelist();
		List<Major> majorlist = graduationDesignService.getMajorlist();
		return Msg.success().add("designtypelist",designtypelist).add("titlesourcelist",titlesourcelist).add("teacherInfolist",teacherInfolist).add("auditstatustypelist",auditstatustypelist).add("departmentlist", departmentlist).add("gradelist", gradelist).add("majorlist", majorlist);
	}	
	
	/**
	 * 获取学院所对应的专业信息
	 * @return
	 */
	@RequestMapping(value="getZDmajorlist",method=RequestMethod.POST)  
	@ResponseBody
    public Msg getZDmajorlist(HttpSession session,@RequestParam("departmentid")Integer departmentid) {
		List<Major> majorlist = graduationDesignService.getZDmajorlist(departmentid);
		return Msg.success().add("majorlist", majorlist);
	}
	
	/**
	 * 获取专业所对应的班级信息
	 * @return
	 */
	@RequestMapping(value="getZDclasslist",method=RequestMethod.POST)  
	@ResponseBody
    public Msg getZDclasslist(HttpSession session,@RequestParam("majorid")Integer majorid) {
		List<com.gdms.crud.bean.Class> classlist = graduationDesignService.getZDclasslist(majorid);
		return Msg.success().add("classlist", classlist);
	}	
	
	/**
	 * 获取某个学院对应的学生的下拉列表
	 * @param session
	 * @return
	 */
	@RequestMapping(value="getXYStuxllb",method=RequestMethod.POST)
	@ResponseBody
	public Msg getXYStuxllb(HttpSession session) {
		Teacher teacher = (Teacher)session.getAttribute("user");
		List<Student> stulist = teacherService.getXYtudentList(teacher);
		return Msg.success().add("stulist", stulist);
	}
	
	/**
	 * 获取查询到的毕设列表
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="QueryBSXTlist",method=RequestMethod.POST)  
	@ResponseBody
    public Msg QueryGDlist(@ModelAttribute GDQueryCondition gdQueryCondition,@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){		
		//引入PageHelper分页插件
		//在查询之前只需要调用，传入页码以及每页的数据数目为5
		PageHelper.startPage(pn,5);		
		
		//执行查询操作
		List<Graduationdesign> QueryGDlist = graduationDesignService.QueryBSXTlist(gdQueryCondition);						
		
		//使用PageInfo包装查询后的结果
		//只需要将PageInfo交给页面，因为它封装了详细的页面信息，包括有我们查询出来的信息
		//传入连续显示的页面为5页，即用户可以选择离当前页近5页的数据进行查看
		@SuppressWarnings("rawtypes")
		PageInfo page = new PageInfo(QueryGDlist,5);
		model.addAttribute("pageInfo",page);
		return Msg.success().add("pageInfo",page);			
	}
	

	/**
	 * 执行学生申报毕设选题的操作
	 * @return
	 */
	@RequestMapping(value="DeclareBSXT",method=RequestMethod.POST)
	@ResponseBody
    public Msg DeclareBSXT(@ModelAttribute GraduationdesignWithBLOBs graduationDesign,HttpSession session){
		//用于存放错误信息
		String[] error_Msg = new String[7];
		//对数据进行校验	
        if(graduationDesign.getTitle().equals(""))
        	error_Msg[0] = "请输入毕设题目";
        else if(graduationDesign.getTypeid() == 0)
        	error_Msg[1] = "请选择题目类型"; 
        else if(graduationDesign.getTitlesourceid() == 0)
        	error_Msg[2] = "请选择题目来源";
        else if(graduationDesign.getInstructorid().equals("0"))
        	error_Msg[3] = "请选择导师编号及姓名";
        else if(graduationDesign.getGdintroduction().equals(""))
        	error_Msg[4] = "请输入课题内容介绍";
        else if(graduationDesign.getGdtask().equals(""))
        	error_Msg[5] = "请输入毕业设计(论文)任务要求";
        else if(graduationDesign.getRequirestudentcount() == 0)
        	error_Msg[6] = "请选择预计完成工作量所需学生数";           
        else {
        	//执行插入操作        	
    		graduationDesignService.handleDeclareBSXT(graduationDesign,session);
    		return Msg.success();
        }
        return Msg.fail().add("error_Msg", error_Msg);
	}
	
	/**
	 * 执行教师申报选题的操作
	 * @return
	 */
	@RequestMapping(value="TeacherDeclareBSXT",method=RequestMethod.POST)
	@ResponseBody
    public Msg TeacherDeclareBSXT(@ModelAttribute GraduationdesignWithBLOBs graduationDesign,HttpSession session){
		//用于存放错误信息
		String[] error_Msg = new String[7];
		//对数据进行校验	
        if("".equals(graduationDesign.getTitle()))
        	error_Msg[0] = "请输入毕设题目";
        else if("请选择".equals(graduationDesign.getSubjectaffiliation()))
        	error_Msg[1] = "请选择所属专业";        
        else if(graduationDesign.getTypeid() == 0)
        	error_Msg[2] = "请选择题目类型"; 
        else if(graduationDesign.getTitlesourceid() == 0)
        	error_Msg[3] = "请选择题目来源";
        else if("".equals(graduationDesign.getGdintroduction()))
        	error_Msg[4] = "请输入课题内容介绍";
        else if("".equals(graduationDesign.getGdtask()))
        	error_Msg[5] = "请输入毕业设计(论文)任务要求";
        else if(graduationDesign.getRequirestudentcount() == 0)
        	error_Msg[6] = "请选择预计完成工作量所需学生数";           
        else {
        	//执行插入操作        	
    		graduationDesignService.teacherhandleDeclareBSXT(graduationDesign,session);
    		return Msg.success();
        }
        return Msg.fail().add("error_Msg", error_Msg);
	}
		
	
	/**
	 * 学生执行修改选题的操作
	 * @return
	 */
	@RequestMapping(value="AlertBSXT",method=RequestMethod.POST)
	@ResponseBody
    public Msg AlertBSXT(@ModelAttribute GraduationdesignWithBLOBs graduationDesign,@RequestParam(value="graduationdesignresultid")String graduationdesignresultid){
		//用于存放错误信息
		String[] error_Msg = new String[7];
		//对数据进行校验	
/*        if("".equals(graduationDesign.getTitle()))
        	error_Msg[0] = "请输入毕设题目";
        else */if(graduationDesign.getTypeid() == 0)
        	error_Msg[1] = "请选择题目类型"; 
        else if(graduationDesign.getTitlesourceid() == 0)
        	error_Msg[2] = "请选择题目来源";
        else if("0".equals(graduationDesign.getInstructorid()))
        	error_Msg[3] = "请选择导师编号及姓名";
        else if("".equals(graduationDesign.getGdintroduction()))
        	error_Msg[4] = "请输入课题内容介绍";
        else if("".equals(graduationDesign.getGdtask()))
        	error_Msg[5] = "请输入毕业设计(论文)任务要求";
/*        else if(graduationDesign.getRequirestudentcount() == 0)
        	error_Msg[6] = "请选择预计完成工作量所需学生数";   */        
        else {
        	//执行修改操作 
    		Integer gdresultid = Integer.valueOf(graduationdesignresultid);
    		graduationDesignService.handleAlertBSXT(graduationDesign,gdresultid);
    		return Msg.success();
        }
        return Msg.fail().add("error_Msg", error_Msg);
	}		
	
	/**
	 * 选择已有的毕设选题
	 * @return
	 */
	@RequestMapping(value="chooseBSXT",method=RequestMethod.POST)  
	@ResponseBody
	public Msg chooseBSXT(@ModelAttribute Graduationdesign gd,HttpSession session) {
		Student stu = (Student)session.getAttribute("user");
		if(GraduationDesignResultService.chooseBSXT(gd,stu).equals("SUCCESS")) {
			return Msg.success();	
		}			
		else
			return Msg.fail();
	}	

	
	/**
	 * 指导教师审核毕设选题
	 * @param session
	 * @return
	 */
	@RequestMapping(value="AuditBSXT",method=RequestMethod.POST)  
	@ResponseBody
    public Msg AuditBSXT(@ModelAttribute GraduationdesignWithBLOBs gd,HttpSession session) {		
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gd.getBsxtinstructoropinion())) {
			error_Msg[0] = "请选择毕设选题审核意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else if("".equals(gd.getBsxtinstructordetailopinion())) {
			error_Msg[1] = "请输入毕设选题审核详细意见";
			return Msg.fail().add("error_Msg", error_Msg);
		}else {
			graduationDesignService.TeacherupdateBSXTAudit(gd,teacher.getName());			
		}
		return Msg.success();
	}	
	
	
	/**
	 * 专业负责人审核毕设选题
	 * @param session
	 * @return
	 */
	@RequestMapping(value="PLAuditBSXT",method=RequestMethod.POST)  
	@ResponseBody
    public Msg PLAuditBSXT(GraduationdesignWithBLOBs gd,HttpSession session) {
		Teacher teacher = (Teacher)session.getAttribute("user");
		//用于存储错误信息
		String error_Msg[] = new String[2];
		if("请选择".equals(gd.getBsxtexpertopinion())) {
			error_Msg[0] = "请选择开题报告审核意见";
		}else if("".equals(gd.getBsxtexpertdetailopinion())) {
			error_Msg[1] = "请输入开题报告审核详细意见";
		}else {
			graduationDesignService.PLupdateBSXTAudit(gd,teacher.getName());
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}	
	
}

