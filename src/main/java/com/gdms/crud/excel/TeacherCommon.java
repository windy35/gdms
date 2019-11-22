/**
 * 
 */
package com.gdms.crud.excel;

/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class TeacherCommon {

	// connect the database
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_NAME = "gdms";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "mysql2018";
	public static final String IP = "127.0.0.1";
	public static final String PORT = "3306";
	public static final String URL = "jdbc:mysql://" + IP + ":" + PORT + "/" + DB_NAME;
	
	// sql
	public static final String INSERT_TEACHER_SQL = "insert into teacher(teacherid, name, gender, phone,email,departmentid,positionaltitle,P_leaderId_sign,fzzybh,password) values(?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE_TEACHER_SQL = "update teacher set name = ?, gender= ?, phone = ?, email = ?, departmentid=?, positionaltitle=?, P_leaderId_sign=?, fzzybh=?, password=? where id = ? ";
	public static final String SELECT_TEACHER_ALL_SQL = "select teacherid, name, gender, phone,email,departmentid,positionaltitle,P_leaderId_sign,fzzybh,password from teacher";
	public static final String SELECT_TEACHER_SQL = "select * from teacher where name like ";
	
	
	// common
	//public static final String EXCEL_PATH = "lib/teacher_info.xls";
	
}
