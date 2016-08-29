package ex01.properties;

import java.sql.*;
import java.io.*;
import java.util.*;

public class PropertiesEx {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement  pstmt = null;
		Properties  prop = null;
		FileInputStream  fis = null;
		FileOutputStream  fos = null;
		
		try {
			File profile = new File("jdbc.properties");
			prop = new Properties();
			
			prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
			prop.setProperty("id", "system");
			prop.setProperty("pwd", "1129");
			
			//������ ���ٸ� ���� �����
			if( !profile.exists() ) profile.createNewFile();
			//������Ƽ ���� �б� ��Ʈ�� ����
			fis = new FileInputStream(profile);
			//������Ƽ ������ �޸𸮿� �ø���(������ �о�´�)
			prop.load(new BufferedInputStream(fis));
			
			fos= new FileOutputStream(profile);
			prop.store(fos, "JDBC  Configuration Settings " );	
			
			prop.load(fis);
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String pwd = prop.getProperty("pwd");
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pwd);
			String sql = "create table Properties( id varchar(20) )";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("Properties table success!! ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







