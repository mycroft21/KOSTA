package ex01.jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SelectMain {
public static void main(String[] args) throws Exception {
	//1.drive load
	Class.forName("oracle.jdbc.OracleDriver");
	System.out.println("드라이버 연결");

	//2.connection & open
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe"
			,"system","1129");
	System.out.println("연결 성공!");
	//3.DML
	Statement stmt = conn.createStatement();
	//insert into gift
	
	
	

}
}
