/**
 * 
 */
package com.gdms.crud.excel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.gdms.crud.bean.Teacher;


/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class SaveTeacherData {

	@SuppressWarnings({ "rawtypes" })
	public void save(String Excel_path) throws IOException, SQLException {
		ReadTeacherExcel xlsMain = new ReadTeacherExcel();
		Teacher teacher = null;
		List<Teacher> list = xlsMain.readXls(Excel_path);

		for (int i = 0; i < list.size(); i++) {
			teacher = list.get(i);
			List l = TeacherDbUtil.selectOne(TeacherCommon.SELECT_TEACHER_SQL + "'%" + teacher.getName() + "%'", teacher);
			if (!l.contains(1)) {
				TeacherDbUtil.insert(TeacherCommon.INSERT_TEACHER_SQL, teacher);
			} else {
				System.out.println("The Record was Exist and has been throw away!");
			}
		}
	}
}
