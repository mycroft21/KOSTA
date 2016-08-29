package day07_allay;

import java.util.Scanner;

public class Ex07 {
	public static int input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��� �ּ���!");

		int a = sc.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��� �ּ���!");

		int b = sc.nextInt();

		System.out.println("�����ڸ� �Է��� �ּ���!");
		String c = sc.next();

		char op = c.charAt(0);
		int anccer = process(a, b, op);
		return anccer;
	}

	public static int process(int a, int b, char op) {

		int type = 0;

		try {
			switch (op) {

			case '+':
				type = a + b;
				break;
			case '-':
				type = a - b;
				break;
			case '*':
				type = a * b;
				break;
			case '/':
				type = a / b;
				break;
			}
		} catch (Exception e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
			System.exit(0);
		}

		return type;
	}

	public static void output() {

		System.out.println("�� ������ " + input() + "�Դϴ�.");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		output();

	}

}
