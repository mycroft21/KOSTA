package ex02.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Scanner;

public class Dept2Main {
	public static void main(String[] args) throws Exception {

		int num;
		String sel, sub, sub2, sub3, insert = null;
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> aln = new ArrayList<>();

		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);

		Class.forName("oracle.jdbc.OracleDriver");

		System.out.println("Drive ok");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "1129");
		conn.setAutoCommit(false);// �ڵ�Ŀ�� ����

		System.out.println("DB ok!");

		stmt = conn.createStatement();

		System.out.println("������ TABLE�� �������ּ���!");
		String table = sc.nextLine();

		try {
			sel = "SELECT * FROM " + table;
			rs = stmt.executeQuery(sel);

			ResultSetMetaData rsmd = null;

			rsmd = rs.getMetaData();

			int colCount = rsmd.getColumnCount();

			while (rs.next()) {
				for (int i = 1; i <= colCount; i++) {

					switch (rsmd.getColumnType(i)) { // �� Ÿ�Ժ��� ��� �Ѵ�.
					case Types.NUMERIC:
					case Types.INTEGER:
						al.add(rsmd.getColumnName(i));
						break;
					case Types.FLOAT:
						al.add(rsmd.getColumnName(i));
						break;
					case Types.DOUBLE:
						al.add(rsmd.getColumnName(i));
						break;
					case Types.CHAR:
						al.add(rsmd.getColumnName(i));
						break;
					case Types.DATE:
						al.add(rsmd.getColumnName(i));
						break;
					default:
						al.add(rsmd.getColumnName(i));
					} // switch end

				}
				System.out.println("\n-------------------------------------------------------------\n");

			}
			System.out.println(al.get(3));
		} catch (Exception e) {
			e.printStackTrace();
		}

		do {
			System.out.println("���ϴ� ����� �������ּ���!\n----------------------------");
			System.out.println("1. " + table + " select\n2. " + table + " update\n3. " + table + " insert\n" + "4. "
					+ table + " delete\n5. " + table + " roll back\n6. EXIT!");

			num = sc.nextInt();

			System.out.println();

			switch (num) {

			case 1:
				sel = "SELECT * FROM " + table;
				rs = stmt.executeQuery(sel);

				show(rs);

				break;

			case 2:
				sel = "SELECT * FROM " + table;
				rs = stmt.executeQuery(sel);

				show(rs);

				

				insert = null;
				System.out.println("�ٲ� �׸��� �Է��մϴ�.");
				sub = sc.next().trim();
				System.out.println("�ٲ� ���� �Է��մϴ�.");
				sub2 = sc.next().trim();
				System.out.println("�Է��� ���� �Է��մϴ�.");
				sub3 = sc.next().trim();

				pstmt = conn.prepareStatement("update " + table + " set " + sub 
						+ " = " + sub3 + " where " + sub + " = " + sub2	);

				pstmt.executeUpdate();

				break;
			case 3:
				insert = null;
				System.out.println("�����͸� �Է��մϴ�.");
				for (int i = 0; i < al.size(); i++) {
					if (i != 0) {
						if (al.get(0).equals(al.get(i)))
							break;
					}

					System.out.println(al.get(i) + " : ");
					aln.add(sc.next());
					if (i == 0)
						insert = "'" + aln.get(0) + "'";
					else {
						insert = insert + ",'" + aln.get(i) + "'";
					}

				}
				System.out.println(insert);

				pstmt = conn.prepareStatement(
						"insert into " + table + " values(" + new String(insert.getBytes("utf-8"), "utf-8") + ")");
				
				pstmt.executeUpdate();

				conn.commit();

				System.out.println("\n" + insert + "\n�߰� �Ϸ�!");

				break;

			case 4:
				rs = stmt.executeQuery("SELECT * FROM " + table);
				show(rs);

				System.out.println("������ �׸��� ���� �Է��� �ּ���!");
				sub = sc.next();
				System.out.println("������ �׸��� �Է��� �ּ���");
				sub2 = sc.next();
				pstmt = conn.prepareStatement("delete from " + table + " where " + sub + " = '" + sub + "'");

				pstmt.executeUpdate();

				System.out.println("���� �ž����ϴ�.");

			case 5:

				conn.rollback();
				System.out.println("�ѹ� �߽��ϴ�.");
				break;

			case 6:
				if(pstmt != null)pstmt.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();

				System.out.println("see ya~!");
				System.exit(0);
				break;
			default:
				System.out.println("�ٽ��Է����ּ���");
				break;
			}

		} while (true);

	}

	private static void show(ResultSet rs) {
		int num = 1;
		try {
			ResultSetMetaData rsmd = null;

			rsmd = rs.getMetaData();

			int colCount = rsmd.getColumnCount();

			while (rs.next()) {
				System.out.println(num + " ��---> ");
				num++;

				for (int i = 1; i <= colCount; i++) {

					switch (rsmd.getColumnType(i)) { // �� Ÿ�Ժ��� ��� �Ѵ�.
					case Types.NUMERIC:
					case Types.INTEGER:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "\t");
						// System.out.printf( " %d ", rs.getInt(i) );
						// //(Object[])rs.getObject(i) );
						break;

					case Types.FLOAT:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "\t");
						break;

					case Types.DOUBLE:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + "\t");
						break;

					case Types.CHAR:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getString(i) + "\t");
						break;

					case Types.DATE:
						System.out.print(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "\t");
						break;

					default:

						System.out.print(rsmd.getColumnName(i) + " : " + rs.getString(i) + "\t");
					} // switch end

				}
				System.out.println("\n-------------------------------------------------------------\n");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
