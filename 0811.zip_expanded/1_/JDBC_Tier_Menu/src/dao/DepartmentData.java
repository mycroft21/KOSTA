package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.Department;

import JDBC_UTIL.*;

public class DepartmentData {
	public ArrayList<Department> getDepartmentList() {
		ArrayList<Department> departments = new ArrayList<Department>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionHelper.getConnection("oracle");
			String sql = "SELECT deptno,dname FROM dept";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Department department = new Department();
				department.setDeptNo(rs.getInt(1));
				department.setDeptName(rs.getString(2));
				departments.add(department);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			ConnUtil.close(rs);
			ConnUtil.close(pstmt);
			ConnUtil.close(conn);

			/*
			 * if (rs != null) try { rs.close(); } catch(Exception ex){} if
			 * (pstmt != null) try { pstmt.close(); } catch(Exception ex){} if
			 * (conn != null) try { conn.close(); } catch(Exception ex){}
			 */
		}
		return departments;

	}

	public ArrayList<Department> getDepartmentByName(String deptName) {

		ArrayList<Department> departments = new ArrayList<Department>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionHelper.getConnection("oracle");

			String sql = "SELECT * FROM dept WHERE dname LIKE ?";
			// SELECT * FROM dept WHERE dname LIKE '%A%'
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + deptName + "%");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Department department = new Department();
				department.setDeptNo(rs.getInt(1));
				department.setDeptName(rs.getString(2));
				departments.add(department);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception ex) {
				}
		}
		return departments;
	}

	public void insertDepartment(Department department) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnectionHelper.getConnection("oracle");

			String sql = "INSERT INTO dept(deptno,dname)  VALUES(?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, department.getDeptNo());
			pstmt.setString(2, department.getDeptName());

			pstmt.executeUpdate();// insert, update, delete

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception ex) {
				}
		}
	}

	public void updateDepartment(Department toUpdate) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnectionHelper.getConnection("oracle");

			String sql = "UPDATE dept " + "SET dname = ? " + "WHERE deptno = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, toUpdate.getDeptName());
			pstmt.setInt(2, toUpdate.getDeptNo());

			pstmt.executeUpdate();// insert, update, delete

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception ex) {
				}
		}
	}

	public void deleteDepartment(int deptCode) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnectionHelper.getConnection("oracle");

			String sql = "DELETE FROM dept " + "WHERE deptno = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptCode);

			pstmt.executeUpdate();// insert, update, delete

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception ex) {
				}
		}

	}

}
