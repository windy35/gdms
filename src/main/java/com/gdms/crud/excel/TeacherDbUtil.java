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

import com.gdms.crud.bean.Teacher;


/** 参考https://www.cnblogs.com/hongten/p/java_poi_excel.html
 */
public class TeacherDbUtil {

	/**
	 * @param sql
	 */
	public static void insert(String sql, Teacher teacher) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName(TeacherCommon.DRIVER);
			conn = DriverManager.getConnection(TeacherCommon.URL, TeacherCommon.USERNAME, TeacherCommon.PASSWORD);
			ps = conn.prepareStatement(sql);
			ps.setString(1, teacher.getTeacherid());
			ps.setString(2, teacher.getName());
			ps.setString(3, teacher.getGender());
			ps.setString(4, teacher.getPhone());
			ps.setString(5, teacher.getEmail());
			ps.setInt(6, teacher.getDepartmentid());
			ps.setString(7, teacher.getPositionaltitle());
			ps.setBoolean(8, teacher.getpLeaderidSign());
			ps.setInt(9, teacher.getFzzybh());
			ps.setString(10, teacher.getPassword());
			boolean flag = ps.execute();
			if(!flag){
				System.out.println("Save data : Teacherid = " + teacher.getTeacherid() + " , Name = " + teacher.getName() + ", Gender = " + teacher.getGender() + ", Phone = " + teacher.getPhone() + ", Email = " + teacher.getEmail() + ", Departmentid = " + teacher.getDepartmentid() + ", positionaltitle = " + teacher.getPositionaltitle() + ", PLeaderidSign = " + teacher.getpLeaderidSign() + ", Fzzybh = " + teacher.getFzzybh() + ", Password = " + teacher.getPassword() + " succeed!");
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

	@SuppressWarnings({ "unchecked", "rawtypes", "unlikely-arg-type" })
	public static List selectOne(String sql, Teacher teacher) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			Class.forName(TeacherCommon.DRIVER);
			conn = DriverManager.getConnection(TeacherCommon.URL, TeacherCommon.USERNAME, TeacherCommon.PASSWORD);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				if(rs.getString("teacherid").equals(teacher.getTeacherid()) || rs.getString("name").equals(teacher.getName())|| rs.getString("gender").equals(teacher.getGender()) || rs.getString("phone").equals(teacher.getPhone()) || rs.getString("email").equals(teacher.getEmail()) || rs.getInt("departmentid") == teacher.getDepartmentid() || rs.getString("pLeaderidSign").equals(teacher.getpLeaderidSign()) || rs.getInt("fzzybh") == teacher.getFzzybh() || rs.getString("password").equals(teacher.getPassword())){
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
			Class.forName(TeacherCommon.DRIVER);
			conn = DriverManager.getConnection(TeacherCommon.URL, TeacherCommon.USERNAME, TeacherCommon.PASSWORD);
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
