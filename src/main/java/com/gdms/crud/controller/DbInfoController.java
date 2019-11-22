package com.gdms.crud.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdms.crud.bean.Dbinfo;
import com.gdms.crud.bean.GraduationdesignWithBLOBs;
import com.gdms.crud.bean.Msg;
import com.gdms.crud.bean.Teacher;
import com.gdms.crud.service.DbInfoService;

@Controller
public class DbInfoController {
	@Autowired
	DbInfoService dbInfoService;
	
	/**
	 * 专业负责人设置答辩信息
	 * @param session
	 * @return
	 */
	@RequestMapping(value="SetDbInfo",method=RequestMethod.POST)  
	@ResponseBody
    public Msg SetDbInfo(Dbinfo dbinfo,HttpSession session) {
		//用于存储错误信息
		String error_Msg[] = new String[6];
		if("0".equals(dbinfo.getStudentid())) {
			error_Msg[0] = "请选择";
		}else if("".equals(dbinfo.getDbtime())) {
			error_Msg[1] = "请选择";
		}else if("".equals(dbinfo.getDbplace())) {
			error_Msg[2] = "请输入";
		}else if("0".equals(dbinfo.getPwzzxx())) {
			error_Msg[3] = "请选择";
		}else if("0".equals(dbinfo.getDrpwxx())) {
			error_Msg[4] = "请选择";
		}else if("0".equals(dbinfo.getMsxx())) {
			error_Msg[5] = "请选择";
		}else {
			dbinfo.setSypwxx(dbinfo.getPwzzxx() + dbinfo.getDrpwxx() + dbinfo.getMsxx());
			dbInfoService.SetDbInfo(dbinfo);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}	
	
	/**
	 * 答辩组长教师设置答辩成绩
	 * @param session
	 * @return
	 */
	@RequestMapping(value="SetDbcj",method=RequestMethod.POST)  
	@ResponseBody
    public Msg SetDbcj(Dbinfo dbinfo,HttpSession session) {
		//用于存储错误信息
		String error_Msg[] = new String[1];
		if(dbinfo.getDbcj() == null) {
			error_Msg[0] = "请输入";
		}else if(dbinfo.getDbcj()<0 || dbinfo.getDbcj()>100) {
			error_Msg[0] = "请输入0~100之间的数字";
		}else {
			dbInfoService.updateDbInfo(dbinfo);
			return Msg.success();
		}
		return Msg.fail().add("error_Msg", error_Msg);
	}		
}
