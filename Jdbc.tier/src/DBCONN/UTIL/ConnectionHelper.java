package DBCONN.UTIL;

import java.sql.Connection;
import java.sql.DriverManager;

//DB���� ���� �ݺ������� �ڵ� �ذ�
/*
�ٸ� Ŭ�������� �Ʒ� �ڵ� ������ ���� �ʵ��� ����

Class.forName("oracle.jdbc.OracleDriver"); //����̹� Ŭ���� �̸� ��� 
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","1004");

�̷� ������ ��� 
ConnectionHelper.getConnection("mysql") or ("oracle")
dsn = > data source name 
 
 */

public class ConnectionHelper {
	
	//�Լ� (������: public , static ) 
	public static  Connection getConnection(String dsn){
		Connection conn = null;
		
		try{
			if(dsn.equals("mysql")){
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","system","1129");
				
			}else if(dsn.equals("oracle")){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.7.162:1521:xe","system","1129");
			}
		}catch(Exception e){
			
		}finally{
			return conn;
		}
	}
	
	public static  Connection getConnection(String dsn , String userid , String pwd){
		Connection conn = null;
		
		try{
			if(dsn.equals("mysql")){
				 Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb",userid,pwd);
				
			}else if(dsn.equals("oracle")){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",userid,pwd);
			}
		}catch(Exception e){
			
		}finally{
			return conn;
		}
	}
}
