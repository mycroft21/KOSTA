package Ex05_oop;

import java.util.Scanner;

public class MainSawn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Swan sw1 = new Swan("��", "�ڹ� ����", "50��", "����");
		Swan sw = new Swan();

		System.out.println("����� �̸��� �����Դϱ�?");
		sw.setName(sc.next());
		System.out.println("����� �μ��� ����Դϱ�?");
		sw.setSubject(sc.next());
		System.out.println("����� �޿��� ���Դϱ�?");
		sw.setPayment(sc.next());
		System.out.println("����� ����ó�� �Է��� �ֽʽÿ�.");
		sw.setCellPh(sc.next());

		sw.show();

	}

}