package JDBC_UTIL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConnUtil {
	public static void close(Connection conn)
	{
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void close(ResultSet rs)
	{
		if(rs != null){
			try{
				rs.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void close(PreparedStatement psmts)
	{
		if(psmts != null){
			try{
				psmts.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
