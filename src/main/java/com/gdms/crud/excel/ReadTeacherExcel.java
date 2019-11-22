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

import com.gdms.crud.bean.Teacher;


/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class ReadTeacherExcel {

	public List<Teacher> readXls(String Excel_path) throws IOException {
		InputStream is = new FileInputStream(Excel_path);
		XSSFWorkbook XSSFWorkbook = new XSSFWorkbook(is);
		Teacher teacher = null;
		List<Teacher> list = new ArrayList<Teacher>();
		// 只读Sheet1中的数据
		for (int numSheet = 0; numSheet < 1; numSheet++) {
			XSSFSheet XSSFSheet = XSSFWorkbook.getSheetAt(numSheet);
			if (XSSFSheet == null) {
				continue;
			}
			// ѭ����Row
			for (int rowNum = 1; rowNum <= XSSFSheet.getLastRowNum(); rowNum++) {
				XSSFRow XSSFRow = XSSFSheet.getRow(rowNum);
				if (XSSFRow != null) {
					teacher = new Teacher();
					XSSFCell teacherid = XSSFRow.getCell(0);
					XSSFCell name = XSSFRow.getCell(1);
					XSSFCell gender = XSSFRow.getCell(2);
					XSSFCell phone = XSSFRow.getCell(3);
					XSSFCell email = XSSFRow.getCell(4);
					XSSFCell deprtmentid = XSSFRow.getCell(5);
					XSSFCell positionaltitle = XSSFRow.getCell(6);
					XSSFCell pLeaderidSign = XSSFRow.getCell(7);
					XSSFCell fzzybh = XSSFRow.getCell(8);
					XSSFCell password = XSSFRow.getCell(9);
					teacher.setTeacherid(getValue(teacherid));
					teacher.setName(getValue(name));
					teacher.setGender(getValue(gender));
					teacher.setPhone(getValue(phone));
					teacher.setEmail(getValue(email));
					teacher.setDepartmentid((int)Float.parseFloat(getValue(deprtmentid)));
					teacher.setPositionaltitle(getValue(positionaltitle));
					if((int)Float.parseFloat(getValue(pLeaderidSign)) == 0)
						teacher.setpLeaderidSign(false);
					else
						teacher.setpLeaderidSign(true);
					teacher.setFzzybh((int)Float.parseFloat(getValue(fzzybh)));
					teacher.setPassword(getValue(password));
					list.add(teacher);
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
