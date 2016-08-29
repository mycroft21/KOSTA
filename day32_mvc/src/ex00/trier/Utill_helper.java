package ex00.trier;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class Utill_helper {
	static BasicDataSource ds;
	

	public static void Conection(){
		Properties prop = null;
	PreparedStatement pstmt =null;
	FileInputStream  fis = null;
	FileOutputStream  fos = null;
	
		
		try{
			File profile = new File("e:/jdbc.properties");
			prop = new Properties();
			
			prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
			prop.setProperty("id", "system");
			prop.setProperty("pwd", "1129");
			
			if( !profile.exists() ) profile.createNewFile();
			
			fis = new FileInputStream(profile);

			prop.load(new BufferedInputStream(fis));

			fos= new FileOutputStream(profile);
			prop.store(fos, "JDBC  Configuration Settings " );	
			
			prop.load(fis);
			
			ds = new BasicDataSource();
			ds.setDriverClassName(prop.getProperty("driver"));
			ds.setUrl(prop.getProperty("url"));
			ds.setUsername(prop.getProperty("id"));
			ds.setPassword(prop.getProperty("pwd"));
			ds.setInitialSize(4);
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
				
		
	}
	
	private void close() {


	}

}
