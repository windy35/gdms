/**
 * 
 */
package com.gdms.crud.excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gdms.crud.bean.Student;


/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class StudentDbUtil {

	/**
	 * @param sql
	 */
	public static void insert(String sql, Student student) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName(StudentCommon.DRIVER);
			conn = DriverManager.getConnection(StudentCommon.URL, StudentCommon.USERNAME, StudentCommon.PASSWORD);
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getStudentid());
			ps.setString(2, student.getName());
			ps.setString(3, student.getGender());
			ps.setString(4, student.getPhone());
			ps.setString(5, student.getEmail());
			ps.setInt(6, student.getClassid());
			ps.setInt(7, student.getDepartmentid());
			ps.setInt(8, student.getMajorid());
			ps.setInt(9, student.getGradeid());
			ps.setString(10, student.getPassword());
			boolean flag = ps.execute();
			if(!flag){
				System.out.println("Save data : Studentid = " + student.getStudentid() + " , Name = " + student.getName() + ", Gender = " + student.getGender() + ", Phone = " + student.getPhone() + ", Email = " + student.getEmail() + ", Classid = " + student.getClassid() + ", Departmentid = " + student.getDepartmentid() + ", Majorid = " + student.getMajorid() + ", Gradeid = " + student.getGradeid() + ", Password = " + student.getPassword() + " succeed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List selectOne(String sql, Student student) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			Class.forName(StudentCommon.DRIVER);
			conn = DriverManager.getConnection(StudentCommon.URL, StudentCommon.USERNAME, StudentCommon.PASSWORD);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				if(rs.getString("studentid").equals(student.getStudentid()) || rs.getString("name").equals(student.getName())|| rs.getString("gender").equals(student.getGender()) || rs.getString("phone").equals(student.getPhone()) || rs.getString("email").equals(student.getEmail()) || rs.getInt("classid") == student.getClassid() || rs.getInt("departmentid") == student.getDepartmentid() || rs.getInt("majorid") == student.getMajorid() || rs.getInt("gradeid") == student.getGradeid() || rs.getString("password").equals(student.getPassword())){
					list.add(1);
				}else{
					list.add(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}
	
	
	public static ResultSet selectAll(String sql) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(StudentCommon.DRIVER);
			conn = DriverManager.getConnection(StudentCommon.URL, StudentCommon.USERNAME, StudentCommon.PASSWORD);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return rs;
	}

}
