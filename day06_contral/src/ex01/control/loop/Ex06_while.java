package ex01.control.loop;

import java.util.Scanner;

public class Ex06_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = null;
		do {
			try {
				Scanner sc = new Scanner(System.in);

				int x = 0, y = 0;
				String m = null;
				char z;
				do {
					do {
						System.out.println("ù��° ���ڸ� �Է��� �ּ���!");
						x = sc.nextInt();
					} while (0 <= x ^ 100 >= x);

					do {
						System.out.println("�ι�° ���ڸ� �Է��� �ּ���!");
						y = sc.nextInt();
					} while (0 <= y ^ 100 >= y);

					do {
						System.out.println("�����ڸ� �Է��� �ּ���!");
						m = sc.next();
						z = m.charAt(0);
					} while (z != '+' && z != '-' && z != '*' && z != '/');

					if (z == '/' && y == 0) {
						System.out.println("0���� ������ �����ϴ�.");
					}

				} while (z == '/' && y == 0);

				switch (z) {
				case '+':
					System.out.println(x + " + " + y + " = " + (x + y));
					break;
				case '-':
					System.out.println(x + " - " + y + " = " + (x - y));
					break;
				case '*':
					System.out.println(x + " * " + y + " = " + (x * y));
					break;
				case '/':
					System.out.println(x + " / " + y + " = " + (x / y));
					break;
				default:
					System.out.println("�߸��ƽ��ϴ� ó������ �ٽ��� �ּ���!");
				}

				System.out.println("����Ͻ÷��� (y)�� ��������.");
				q = sc.next();
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		} while (q.equals("y") ^ q.equals("Y"));
	}// endm
}// endc