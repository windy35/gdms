/**
 * 
 */
package com.gdms.crud.excel;

/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class StudentCommon {

	// connect the database
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_NAME = "gdms";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "mysql2018";
	public static final String IP = "127.0.0.1";
	public static final String PORT = "3306";
	public static final String URL = "jdbc:mysql://" + IP + ":" + PORT + "/" + DB_NAME;
	
	// sql
	public static final String INSERT_STUDENT_SQL = "insert into student(studentid, name, gender, phone,email,classid,departmentid,majorid,gradeid,password) values(?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE_STUDENT_SQL = "update student set name = ?, gender= ?, phone = ?, email = ?, classid=?, departmentid=?, majorid=?, gradeid=?, password=? where id = ? ";
	public static final String SELECT_STUDENT_ALL_SQL = "select studentid,studentid,name,gender,phone,email,classid,departmentid,majorid,gradeid,password from student";
	public static final String SELECT_STUDENT_SQL = "select * from student where name like ";
	
	
	// common
	//public static final String EXCEL_PATH = "lib/student_info.xls";
	
}
