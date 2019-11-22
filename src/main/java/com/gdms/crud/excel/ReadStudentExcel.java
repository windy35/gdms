/**
 * 
 */
package com.gdms.crud.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gdms.crud.bean.Student;


/**
 * @author Hongten
 * @created 2014-5-18
 */
public class ReadStudentExcel {

	public List<Student> readXls(String Excel_path) throws IOException {
		InputStream is = new FileInputStream(Excel_path);
		XSSFWorkbook XSSFWorkbook = new XSSFWorkbook(is);
		Student student = null;
		List<Student> list = new ArrayList<Student>();
		//只读取Sheet1中的数据
		for (int numSheet = 0; numSheet < 1; numSheet++) {
			XSSFSheet XSSFSheet = XSSFWorkbook.getSheetAt(numSheet);
			if (XSSFSheet == null) {
				continue;
			}
			// ѭ����Row
			for (int rowNum = 1; rowNum <= XSSFSheet.getLastRowNum(); rowNum++) {
				XSSFRow XSSFRow = XSSFSheet.getRow(rowNum);
				if (XSSFRow != null) {
					student = new Student();
					XSSFCell studentid = XSSFRow.getCell(0);
					XSSFCell name = XSSFRow.getCell(1);
					XSSFCell gender = XSSFRow.getCell(2);
					XSSFCell phone = XSSFRow.getCell(3);
					XSSFCell email = XSSFRow.getCell(4);
					XSSFCell classid = XSSFRow.getCell(5);
					XSSFCell deprtmentid = XSSFRow.getCell(6);
					XSSFCell majorid = XSSFRow.getCell(7);
					XSSFCell gradeid = XSSFRow.getCell(8);
					XSSFCell password = XSSFRow.getCell(9);
					student.setStudentid(getValue(studentid));
					student.setName(getValue(name));
					student.setGender(getValue(gender));
					student.setPhone(getValue(phone));
					student.setEmail(getValue(email));
					student.setClassid((int)Float.parseFloat(getValue(classid)));
					student.setDepartmentid((int)Float.parseFloat(getValue(deprtmentid)));
					student.setMajorid((int)Float.parseFloat(getValue(majorid)));
					student.setGradeid((int)Float.parseFloat(getValue(gradeid)));
					student.setPassword(getValue(password));
					list.add(student);
				}
			}
		}
		return list;
	}
	
	 @SuppressWarnings("static-access")
	private String getValue(XSSFCell XSSFCell) {
	        if (XSSFCell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
	            // ���ز������͵�ֵ
	            return String.valueOf(XSSFCell.getBooleanCellValue());
	        } else if (XSSFCell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
	            // ������ֵ���͵�ֵ
	            return String.valueOf(XSSFCell.getNumericCellValue());
	        } else {
	            // �����ַ������͵�ֵ
	            return String.valueOf(XSSFCell.getStringCellValue());
	        }
	    }
}
