package ex3.jdbc.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import DBConn.Util.*;

public class Ex04_Connect_Helper {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
				//1. ����̹� ���
			   //Class.forName("com.mysql.jdbc.Driver"); //����̹� Ŭ���� �̸� ���� 
			   //System.out.println("My SQL ����̹� �ε� �Ϸ�");
			   
			   //2. �������(ConnectionString)
			   //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","sampleUser","1004");
			   
			   //conn = ConnectionHelper.getConnection("mysql");
			   conn = ConnectionSingletonHelper.getConnection("oracle");
			
			   //3.���ɻ��� (CRUD)
			   stmt = conn.createStatement();
			   String sql = "select empno, ename , job  from emp";
			   
			   //4.���ɽ���(mysql ���� ���� ���� ����)
			    rs = stmt.executeQuery(sql);
			   
			   //5.����ó��
			   while(rs.next()){
				   System.out.printf("[%d][%s][%s]\n", 
						                 rs.getInt(1) , rs.getString(2) , rs.getString(3) );
			   }
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}finally{
			//6.�ڿ�����
			//DB���� ����
			if(rs != null){try{rs.close();}catch(Exception e){}}
			if(stmt != null){try{stmt.close();}catch(Exception e){}}
			if(conn != null){try{conn.close();}catch(Exception e){}}
		}
		
	}

}