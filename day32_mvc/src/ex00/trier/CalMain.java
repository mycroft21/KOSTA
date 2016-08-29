package ex00.trier;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;


public class CalMain {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;

		CalDAO cao = new CalDAO();
		
		
		while (true) {
			
			System.out.println("-------------------------------------------------------");
			System.out.println("�۾��� �����մϴ�.\n");
			System.out.println("1.select\n2.insert\n3.delete\n4.update\n5.rollback\n6.exit");

			num = sc.nextInt();

			switch (num) {
			case 1:

				ArrayList<CalDTO> list = cao.select();

				for (CalDTO dto : list) {
					System.out.println(dto.toString());
				}
				break;
			case 2:

				System.out.println("data�� �Է��մϴ�!");
				System.out.println("week : ");
				String week = sc.next();
				System.out.println("day : ");
				String day = sc.next();
				System.out.println("num_day : ");
				String num_day = sc.next();

				cao.insert(week, day, num_day);

				list = cao.select();

				for (CalDTO dto : list) {
					System.out.println(dto.toString());
				}
				System.out.println("INSERT COMPLET!");

				break;
			case 3:
				list = cao.select();

				for (CalDTO dto : list) {
					System.out.println(dto.toString());
				}
				System.out.println("INSERT COMPLET!");

				System.out.println("������ �ڷḦ �����ϼ���!");
				System.out.println("num_day : ");
				num_day = sc.next();
				cao.delete(num_day);

				System.out.println("DELETE COMPELET!");

				break;
			case 4:

				list = cao.select();

				for (CalDTO dto : list) {
					System.out.println(dto.toString());
				}
				System.out.println("INSERT COMPLET!");

				System.out.println("������ �ڷḦ �����ϼ���!");
				System.out.println("num_day : ");
				num_day = sc.next();

				cao.update(num_day);

				System.out.println("UPDATE SUCCES!");

				break;
				
			case 5:
				Connection conn = cao.getConn();
				conn.rollback();
				System.out.println("rollback compelet!");
				break;
				
			case 6:
				System.out.println("see ya!!!");
				System.exit(0);
				break;

			default:
				break;
			}

		}
	}

}