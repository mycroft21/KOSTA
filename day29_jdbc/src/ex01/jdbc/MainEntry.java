package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) throws Exception {
		// 1. ����̺����� �ο�����! ���� �߻�����
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("�������������̹���� �ε� ����!!!");
		// 2. ����&OPEN //����̹� : @IP:PortNumber:SID(or ���������ͺ��̽���)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pwd = "1129";
		Connection conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("���ڿ� ���� �Ϸ�!!");
		// 3. ���(DML, ��ɾ�.......)
		System.out.println("DB OK!");

		Statement stmt = conn.createStatement();// DML ��ɾ�... ��ȯ���� �ִ� ��� select

		ResultSet rs = stmt.executeQuery("select * from gift");

		System.out.println("��ǰ��ȣ\t��ǰ��\t�ּҰ�\t�ְ�");
		while (rs.next()) {
			int gno = rs.getInt(1); // getXXX(�ε�����ȣ);
			String gname = rs.getString("gname"); // getXXX("�ʵ��");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end

		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n ��Ͽ��� ������ ��ȣ��?");
		int num = sc.nextInt();
		System.out.println("��Ͽ��� �ٲ� g_end ����?");
		int val = sc.nextInt();

		String sql = "update GIFT set g_end = " + val + " where gno = " + num;

		int result = stmt.executeUpdate(sql); // ���� >> ���� ����, ���� >> 0���ϵ�
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

		// 4. �ڿ� ��ȯ(�ݱ�)
		conn.close();

	}

}
