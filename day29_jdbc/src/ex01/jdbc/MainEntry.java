package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) throws Exception {
		// 1. 드라이브으으 로오오드! 예외 발생가능
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드으으라이이이버어어 로드 성공!!!");
		// 2. 접속&OPEN //드라이버 : @IP:PortNumber:SID(or 전역데이터베이스명)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pwd = "1129";
		Connection conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("사자왕 연결 완료!!");
		// 3. 사용(DML, 명령어.......)
		System.out.println("DB OK!");

		Statement stmt = conn.createStatement();// DML 명령어... 반환값이 있는 경우 select

		ResultSet rs = stmt.executeQuery("select * from gift");

		System.out.println("상품번호\t상품명\t최소가\t최고가");
		while (rs.next()) {
			int gno = rs.getInt(1); // getXXX(인덱스번호);
			String gname = rs.getString("gname"); // getXXX("필드명");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end

		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n 목록에서 변경할 번호는?");
		int num = sc.nextInt();
		System.out.println("목록에서 바꿀 g_end 값은?");
		int val = sc.nextInt();

		String sql = "update GIFT set g_end = " + val + " where gno = " + num;

		int result = stmt.executeUpdate(sql); // 성공 >> 행의 갯수, 실패 >> 0리턴됨
		System.out.println(result + "성공인가!\n");

		while (rs.next()) {

			int gno = rs.getInt(1); // getXXX(인덱스번호);
			String gname = rs.getString("gname"); // getXXX("필드명");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}

		// conn.commit(); // java는 기본적으로 자동 커밋!

		rs.close();
		stmt.close();
		conn.close();

		// 4. 자원 반환(닫기)
		conn.close();

	}

}
