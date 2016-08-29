package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load");

		String url = "jdbc:oracle:thin:@127.0.01:1521:xe";
		String id = "system";
		String pwd = "1129";

		Connection conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("DB OK!");

		Statement stmt = conn.createStatement();// DML ��ɾ�... ��ȯ���� �ִ� ��� select
		ResultSet rs = stmt.executeQuery("select * from gift");

		System.out.println("��ǰ��ȣ\t��ǰ��\t\t�ּҰ�\t�ְ�");

		while (rs.next()) {
			int gno = rs.getInt(1); // getXXX(�ε�����ȣ);
			String gname = rs.getString("gname"); // getXXX("�ʵ��");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "          \t" + g_s + "\t" + g_e);
		} // while end

		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n ��Ͽ��� ������ ��ȣ��?");
		int num = sc.nextInt();
		String sql = "delete from gift where gno = " + num;

		int result = stmt.executeUpdate(sql); // ���� >> ���� ����, ���� >> 0���ϵ�
		System.out.println(result + "�����ΰ�!\n");

		while (rs.next()) {
			int gno = rs.getInt(1); // getXXX(�ε�����ȣ);
			String gname = rs.getString("gname"); // getXXX("�ʵ��");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end

		System.out.println("\n\n ��Ͽ��� ������ ��ȣ��?");
		num = sc.nextInt();
		System.out.println("��Ͽ��� �ٲ� g_end ����?");
		int val = sc.nextInt();

		sql = "update GIFT set g_end = " + val + " where gno = " + num;

		result = stmt.executeUpdate(sql); // ���� >> ���� ����, ���� >> 0���ϵ�
		System.out.println(result + "�����ΰ�!\n");

		while (rs.next()) {

			int gno = rs.getInt(1); // getXXX(�ε�����ȣ);
			String gname = rs.getString("gname"); // getXXX("�ʵ��");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}

		// conn.commit(); // java�� �⺻������ �ڵ� Ŀ��!

		rs.close();
		stmt.close();
		conn.close();

		System.out.println("See ya~!");

	}

}
