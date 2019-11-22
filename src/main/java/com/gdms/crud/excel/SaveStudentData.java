/**
 * 
 */
package com.gdms.crud.excel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.gdms.crud.bean.Student;


/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class SaveStudentData {

	@SuppressWarnings({ "rawtypes" })
	public void save(String Excel_path) throws IOException, SQLException {
		ReadStudentExcel xlsMain = new ReadStudentExcel();
		Student student = null;
		List<Student> list = xlsMain.readXls(Excel_path);

		for (int i = 0; i < list.size(); i++) {
			student = list.get(i);
			List l = StudentDbUtil.selectOne(StudentCommon.SELECT_STUDENT_SQL + "'%" + student.getName() + "%'", student);
			if (!l.contains(1)) {
				StudentDbUtil.insert(StudentCommon.INSERT_STUDENT_SQL, student);
			} else {
				System.out.println("The Record was Exist : Studentid. = " + student.getStudentid() + " , Name = " + student.getName() + ", Gender = " + student.getGender() + ", Phone = " + student.getPhone() + ", Email = " + student.getEmail() + ", Classid = " + student.getClassid() + ", Departmentid = " + student.getDepartmentid() + ", Majorid = " + student.getMajorid() + ", Gradeid = " + student.getGradeid() + ", Password = " + student.getPassword() + ", and has been throw away!");
			}
		}
	}
}
