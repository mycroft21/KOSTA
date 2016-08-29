package ex00.trier;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import org.apache.commons.dbcp2.BasicDataSource;

public class CalDAO {

	static BasicDataSource ds;
	public static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	private static String sql = null;

	public CalDAO() {

		Properties prop = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			File profile = new File("e:/jdbc.properties");
			prop = new Properties();

			prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
			prop.setProperty("id", "system");
			prop.setProperty("pwd", "1129");

			if (!profile.exists())
				profile.createNewFile();

			fis = new FileInputStream(profile);

			prop.load(new BufferedInputStream(fis));

			fos = new FileOutputStream(profile);
			prop.store(fos, "JDBC  Configuration Settings ");

			prop.load(fis);

			ds = new BasicDataSource();
			ds.setDriverClassName(prop.getProperty("driver"));
			ds.setUrl(prop.getProperty("url"));
			ds.setUsername(prop.getProperty("id"));
			ds.setPassword(prop.getProperty("pwd"));
			ds.setInitialSize(4);

			conn = ds.getConnection();
			conn.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end

	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		CalDAO.conn = conn;
	}

	public ArrayList<CalDTO> select() throws Exception {
		ArrayList<CalDTO> list = new ArrayList<CalDTO>();

		sql = "select * from cal";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();

		while (rs.next()) {
			CalDTO cto = new CalDTO();
			cto.setWeek(rs.getString(1));
			cto.setDay(rs.getString(2));
			cto.setNum_day(rs.getString(3));
			list.add(cto);
		}

		return list;
	}

	void insert(String week, String day, String num_day) throws Exception {

		sql = "insert into cal values(?,?,?)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, week);
		pstmt.setString(2, day);
		pstmt.setString(3, num_day);

		pstmt.executeUpdate();

	}

	public void delete(String num_day) throws Exception {

		sql = "delete cal where num_day like '" + num_day + "'";

		pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();

	}

	public void update(String num_day) throws Exception {

		Scanner sc = new Scanner(System.in);

		sql = "update cal set week = ?, day = ?, num_day = ? where num_day = '" + num_day + "'";
		pstmt = conn.prepareStatement(sql);

		System.out.println("바꿀 데이터를 입력합니다.");
		System.out.println("week : ");
		pstmt.setString(1, sc.next());
		System.out.println("day : ");
		pstmt.setString(2, sc.next());
		System.out.println("day_num : ");
		pstmt.setString(3, sc.next());

		pstmt.executeUpdate();

	}

}
