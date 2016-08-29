package DBConn.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

/*connectionHelper Ŭ������ ����
 �Ź� ����̹� �ε�... �Ź� conection ��ü ����
 
 ������ �ϳ��� ���μ������� �ϳ��� ���� �����ϸ� ���ٵ�..
 �ذ����� > �����ڿ� �̱���!*/

public class ConnectionSingletonHelper {
	// �ϳ��� ���μ������� �������� ����� �� �ִ� ��� �ڿ�(static)
	private static Connection conn;

	private ConnectionSingletonHelper() {}

	public static Connection getConnection(String dsn) { //

		if (conn != null) {
			return conn;
		}

		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver"); // ����̹� Ŭ���� �̸� ���
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb ", "system", "1129");

			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver"); // ����̹� Ŭ���� �̸� ���
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1129");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		if (conn != null) {
			return conn;
		}
				
				try {
					if( dsn.equals("mysql")) {
						Class.forName("com.mysql.jdbc.Driver"); //����̹� Ŭ���� �̸� ��� 
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", userid, pwd);
					
					} else if( dsn.equals("oracle")) {
						Class.forName("oracle.jdbc.OracleDriver"); //����̹� Ŭ���� �̸� ��� 
						conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", userid, pwd );
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					return conn;
				}
			}

}
