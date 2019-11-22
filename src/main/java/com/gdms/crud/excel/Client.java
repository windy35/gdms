/**
 * 
 */
package com.gdms.crud.excel;

import java.io.IOException;
import java.sql.SQLException;

/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class Client {

	public static void main(String[] args) throws IOException, SQLException {
		/*SaveStudentData saveStudentData = new SaveStudentData();
		saveStudentData.save("C:\\Users\\Administrator\\Desktop\\student_info.xls");*/
		SaveTeacherData saveTeacherData = new SaveTeacherData();
		saveTeacherData.save("C:\\Users\\Administrator\\Desktop\\teacher_info.xls");
		System.out.println("end");
	}
}
