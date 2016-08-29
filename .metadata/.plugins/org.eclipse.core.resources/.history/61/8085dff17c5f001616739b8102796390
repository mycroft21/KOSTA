package DBCONN.UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 ConnectionHelper 클래스의 문제
매번 드라이버 로드 ....
     connection생성....

어차피 하나의 프로세스에서 하나만 만들어서
재사용하면 될 텐데

해결 방법은 > 공유자원 싱글톤  
 */
public class ConnectionSingletonHeler {
	
	//하나의 프로세스에서 공통으로 사용할 수 있는 공용자원 (static)
	private static Connection conn;
	private ConnectionSingletonHeler(){}
	
	//함수 (접근자: public , static ) 
	public static  Connection getConnection(String dsn){
		//Connection conn = null;
		if(conn != null){
			return conn;
		}
		
		try{
			if(dsn.equals("mysql")){
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","sampleUser","1004");
				
			}else if(dsn.equals("oracle")){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kingsmile","oracle");
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
