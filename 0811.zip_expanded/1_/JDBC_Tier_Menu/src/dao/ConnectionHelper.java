package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {

	public static Connection getConnection(String dsn) {
		
		Connection conn =null;
		try{
				if(dsn.equals("mysql")){
					//mysql 연결 코드
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDB","kingsmile","1004");
				}else if(dsn.equals("oracle")){
					//Oracle 연결 코드
					Class.forName("oracle.jdbc.OracleDriver");
					conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.7.162:1521:xe","kingsmile","oracle");
				}
		}catch(Exception e){
		}
		finally{
			return conn;
				}
			}	
	}
