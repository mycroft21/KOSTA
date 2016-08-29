package DBCONN.UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectionHelper Ŭ������ ����
�Ź� ����̹� �ε� ....
     connection����....

������ �ϳ��� ���μ������� �ϳ��� ����
�����ϸ� �� �ٵ�

�ذ� ����� > �����ڿ� �̱���  
 */
public class ConnectionSingletonHeler {
	
	//�ϳ��� ���μ������� �������� ����� �� �ִ� �����ڿ� (static)
	private static Connection conn;
	private ConnectionSingletonHeler(){}
	
	//�Լ� (������: public , static ) 
	public static  Connection getConnection(String dsn){
		//Connection conn = null;
		if(conn != null){
			return conn;
		}
		
		try{
			if(dsn.equals("mysql")){
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","system","1129");
				
			}else if(dsn.equals("oracle")){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1129");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return conn;
		}
	}
   
	public static void close() throws SQLException {
		if(conn != null){
			if(!conn.isClosed()){
				conn.close();
			}
		}
	}

}
