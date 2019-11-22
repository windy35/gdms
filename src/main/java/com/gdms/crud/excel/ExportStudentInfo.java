package com.gdms.crud.excel;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class ExportStudentInfo {
	    //public final static String outputFile="C:\\Users\\Administrator\\Desktop\\student.xlsx";

	    public final static String url="jdbc:mysql://127.0.0.1:3306/gdms";

	    public final static String user="root";

	    public final static String password="mysql2018";

		private static XSSFWorkbook workbook;
		
		public void expertstu(String exportpath){
			   try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection conn=(Connection) DriverManager.getConnection(url, user, password);
		            Statement stat = (Statement) conn.createStatement();
		            ResultSet resultSet = stat.executeQuery("select * from student;");
		            workbook = new XSSFWorkbook();
		            XSSFSheet sheet=workbook.createSheet("studentDB");
		            XSSFRow row = sheet.createRow((short)0);
		            XSSFCell cell=null;
		            cell=row.createCell((short)0);
		            cell.setCellValue("学生编号");
		            cell=row.createCell((short)1);
		            cell.setCellValue("姓名");
		            cell=row.createCell((short)2);
		            cell.setCellValue("性别");
		            cell=row.createCell((short)3);
		            cell.setCellValue("电话");
		            cell=row.createCell((short)4);
		            cell.setCellValue("邮箱");
		            cell=row.createCell((short)5);
		            cell.setCellValue("班级编号(见Class)");
		            cell=row.createCell((short)6);
		            cell.setCellValue("学院编号(见Department)");
		            cell=row.createCell((short)7);
		            cell.setCellValue("专业编号(见Major)");
		            cell=row.createCell((short)8);
		            cell.setCellValue("学年编号(见Grade)");
		            cell=row.createCell((short)9);
		            cell.setCellValue("密码(6~16位数字或字母)");	            
		            int i=1;
		            while(resultSet.next())
		            {
		                row=sheet.createRow(i);
		                cell=row.createCell(0);
		                cell.setCellValue(resultSet.getString("StudentId"));
		                cell=row.createCell(1);
		                cell.setCellValue(resultSet.getString("Name"));
		                cell=row.createCell(2);
		                cell.setCellValue(resultSet.getString("Gender"));
		                cell=row.createCell(3);
		                cell.setCellValue(resultSet.getString("Phone"));
		                cell=row.createCell(4);
		                cell.setCellValue(resultSet.getString("Email"));
		                cell=row.createCell(5);
		                cell.setCellValue(resultSet.getString("ClassId"));
		                cell=row.createCell(6);
		                cell.setCellValue(resultSet.getString("DepartmentId"));
		                cell=row.createCell(7);
		                cell.setCellValue(resultSet.getString("MajorId"));
		                cell=row.createCell(8);
		                cell.setCellValue(resultSet.getString("Gradeid"));
		                cell=row.createCell(9);
		                cell.setCellValue(resultSet.getString("Password"));	                
		                i++;
		             }
		            
		            //设置第二张Sheet Department
		            sheet=workbook.createSheet("Department");
		            row = sheet.createRow((short)0);
		            cell=row.createCell((short)0);
		            cell.setCellValue("学院编号");
		            cell=row.createCell((short)1);
		            cell.setCellValue("学院名称");	            
		            i=1;
		            ResultSet deptresultSet = stat.executeQuery("select * from department;");
		            while(deptresultSet.next())
		            {
		                row=sheet.createRow(i);
		                cell=row.createCell(0);
		                cell.setCellValue(deptresultSet.getString("DepartmentId"));
		                cell=row.createCell(1);
		                cell.setCellValue(deptresultSet.getString("DepartmentName"));
		                i++;
		             }	 
		            //设置第三张Sheet Major
		            sheet=workbook.createSheet("Major");
		            row = sheet.createRow((short)0);
		            cell=row.createCell((short)0);
		            cell.setCellValue("专业编号");
		            cell=row.createCell((short)1);
		            cell.setCellValue("专业名称");	            
		            i=1;
		            ResultSet majorresultSet = stat.executeQuery("select * from major;");
		            while(majorresultSet.next())
		            {
		                row=sheet.createRow(i);
		                cell=row.createCell(0);
		                cell.setCellValue(majorresultSet.getString("MajorId"));
		                cell=row.createCell(1);
		                cell.setCellValue(majorresultSet.getString("MajorName"));
		                i++;
		             }
		            //设置第四张Sheet Class
		            sheet=workbook.createSheet("Class");
		            row = sheet.createRow((short)0);
		            cell=row.createCell((short)0);
		            cell.setCellValue("班级编号");
		            cell=row.createCell((short)1);
		            cell.setCellValue("班级名称");	      	            
		            i=1;
		            ResultSet classresultSet = stat.executeQuery("select * from class;");
		            while(classresultSet.next())
		            {
		                row=sheet.createRow(i);
		                cell=row.createCell(0);
		                cell.setCellValue(classresultSet.getString("ClassId"));
		                cell=row.createCell(1);
		                cell.setCellValue(classresultSet.getString("ClassName"));
		                i++;
		             }	  
		            //设置第五张Sheet Grade
		            sheet=workbook.createSheet("Grade");
		            row = sheet.createRow((short)0);
		            cell=row.createCell((short)0);
		            cell.setCellValue("学年编号");
		            cell=row.createCell((short)1);
		            cell.setCellValue("学年名称");	    	            
		            i=1;
		            ResultSet graderesultSet = stat.executeQuery("select * from grade;");
		            while(graderesultSet.next())
		            {
		                row=sheet.createRow(i);
		                cell=row.createCell(0);
		                cell.setCellValue(graderesultSet.getString("GradeId"));
		                cell=row.createCell(1);
		                cell.setCellValue(graderesultSet.getString("GradeName"));
		                i++;
		             }	  	
		           	            
		            FileOutputStream FOut = new FileOutputStream(exportpath);
		            workbook.write(FOut);
		            conn.close();
		            stat.close();
		            FOut.flush();
		            FOut.close();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		}
}