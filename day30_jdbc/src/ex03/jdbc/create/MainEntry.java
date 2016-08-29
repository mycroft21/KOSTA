package ex03.jdbc.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainEntry {

	static{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		String url = null;
				//"jdbc:oracle:thin:@localhost:1521:xe";
		String user = null;
				//"system";
		String pwd = null;
				//"1129";
		Connection conn =null;
		Statement stmt = null;
		
		try {url="jdbc:oracle:thin:@localhost:1521:xe";
		user = "system";
		pwd = "1129";
		conn = DriverManager.getConnection(url,user,pwd);
		stmt = conn.createStatement();
		
		String sql = "CREATE TABLE KOSTATABLE(NAME VARCHAR2(20),AGE NUMBER)";
		stmt.executeUpdate(sql);
		System.out.println("succes");
		
		sql = "SELECT * FROM KOSTATABLE";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			System.out.println("name : " + rs.getString(1));
			System.out.println("age : "+ rs.getString(2));
		}
			sql = "DROP TABLE KOSTATABLE";
			int result = stmt.executeUpdate(sql);
			System.out.println("drop"+result);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{try{
			
		
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}catch (Exception e2) {
			e2.printStackTrace();}
			
		}//end try
		
	}

}
