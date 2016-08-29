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
						System.out.println("첫번째 숫자를 입력해 주세요!");
						x = sc.nextInt();
					} while (0 <= x ^ 100 >= x);

					do {
						System.out.println("두번째 숫자를 입력해 주세요!");
						y = sc.nextInt();
					} while (0 <= y ^ 100 >= y);

					do {
						System.out.println("연산자를 입력해 주세요!");
						m = sc.next();
						z = m.charAt(0);
					} while (z != '+' && z != '-' && z != '*' && z != '/');

					if (z == '/' && y == 0) {
						System.out.println("0으로 나눌수 없습니다.");
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
					System.out.println("잘못됐습니다 처음부터 다시해 주세요!");
				}

				System.out.println("계속하시려면 (y)를 누르세요.");
				q = sc.next();
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		} while (q.equals("y") ^ q.equals("Y"));
	}// endm
}// endc
