//DAO �ܿ���  �۾��� CRUD �۾�
//Deptdao �ȿ��� method ������  CRUD ó��
//DAO ��Ű�� �ȿ� Ŭ������ �������� DB �۾��ϴ� Ŭ������

package DAO;

import DBCONN.UTIL.*; //DB���� , DB���� ���� Ŭ������ ���
import DTO.Dept; // DB���� select�� �����  Dept ��ü�� ��� ���ؼ�

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//util Ŭ������
import java.util.ArrayList; //�������� �����͸� ��� ���ؼ�


public class Deptdao {
	//private Connection conn = null;
	//public Deptdao(){
	//	conn = ConnectionSingletonHeler.getConnection("oracle");
	//}
	//public void DBClose(){
	//	try {
	//				conn.close();
	//	} catch (SQLException e) {
	//				e.printStackTrace();
	//	}
	//}
	//CRUD ���õ� method ����
	//��� : ������ ,  static , return ó�� , parameter ó�� 
	public ArrayList<Dept> getDeptList(){
		//DB���� -> select ~ -> ��ü��� -> return
		ArrayList<Dept> Depts = new ArrayList<Dept>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			 conn = ConnectionHelper.getConnection("oracle");
			 System.out.println(conn.isClosed());
			 System.out.println(conn.toString());
			 stmt = conn.createStatement();
			 String sql = "select Deptno, dname, loc from Dept order by Deptno asc";
			
			 rs = stmt.executeQuery(sql);
			 /*
			 Dept d = new Dept();
			 d.setDeptno(1000);
			 d.setDname("IT");
			 d.setLoc("seoul");
			 
			 Depts.add(d);
			 */
			 while(rs.next()){
				 Dept data = new Dept();
				 data.setDeptno(rs.getInt(1));
				 data.setDname(rs.getString(2));
				 data.setLoc(rs.getString(3));
				 Depts.add(data);
			 }
			 
			 
		}catch(Exception e){
				e.printStackTrace();
		}finally{
			ConnectionCloseHelper.close(stmt);
			ConnectionCloseHelper.close(rs);
			ConnectionCloseHelper.close(conn);
		}
		return Depts;
	}
	
	//�Ѱ��� row�� ó���ϴ� method
	//Read (where �������� ���� key �÷����� ������ �����ϱ� ���ؼ�)
	public Dept getDeptListByDeptno(int Deptno){

		Dept singleDept=null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			 conn = ConnectionHelper.getConnection("oracle");
			 System.out.println(conn.isClosed());
			 System.out.println(conn.toString());
			 
			 String sql = "select Deptno, dname, loc from Dept where Deptno=?";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, Deptno);
			
			
			 rs = pstmt.executeQuery();
			
			 while(rs.next()){
				 singleDept = new Dept();
				 singleDept.setDeptno(rs.getInt(1));
				 singleDept.setDname(rs.getString(2));
				 singleDept.setLoc(rs.getString(3));
				
			 }
			 
		}catch(Exception e){
				e.printStackTrace();
		}finally{
			ConnectionCloseHelper.close(pstmt);
			ConnectionCloseHelper.close(rs);
			ConnectionCloseHelper.close(conn);
		}
		return singleDept;
		
	}
	
	
	//DML(insert , update, delete)
	public int InsertDept(Dept d) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int ResultRow = 0;
		
		conn = ConnectionHelper.getConnection("oracle");
		try {
			pstmt = conn.prepareStatement("insert into Dept(Deptno,dname,loc) values(?,?,?)");
			pstmt.setInt(1, d.getDeptno());
			pstmt.setString(2, d.getDname());
			pstmt.setString(3, d.getLoc());
			
			ResultRow = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			ConnectionCloseHelper.close(pstmt);
			ConnectionCloseHelper.close(conn);
		}
	
		return ResultRow;
		
	}
	
	public int UpdateDept(Dept d){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int ResultRow = 0;
		
		conn = ConnectionHelper.getConnection("oracle");
		try {
			pstmt = conn.prepareStatement("update Dept set dname=? , loc=? where Deptno=?");
			
			pstmt.setString(1, d.getDname());
			pstmt.setString(2, d.getLoc());
			pstmt.setInt(3, d.getDeptno());
			
			
			ResultRow = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			ConnectionCloseHelper.close(pstmt);
			ConnectionCloseHelper.close(conn);
		}
	
		return ResultRow;
		
	}
	public int DeleteDept(int Deptno){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int ResultRow = 0;
		
		conn = ConnectionHelper.getConnection("oracle");
		try {
			pstmt = conn.prepareStatement("delete from Dept where Deptno=?");
			
			pstmt.setInt(1, Deptno);
		
			
			ResultRow = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			ConnectionCloseHelper.close(pstmt);
			ConnectionCloseHelper.close(conn);
		}
	
		return ResultRow;
		
	}
}
