package day07_allay;

import java.util.Scanner;

public class ex03_method {

	public static void main(String[] args) { // ������ �������� ����
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x= ");
		int x = sc.nextInt();
		System.out.print("y= ");
		int y = sc.nextInt();
		
		plus();//�Լ� ȣ��

		System.out.println("main method = " + x + "," + y);
		
		System.out.println("main end");
	}// endm

	// �Ű������� ����, ����Ÿ�� ���� ���
	public static void plus() { //�Լ� ���Ǳ�
		int hap = 100 + 30;
		System.out.println("plus method hap = " + hap);

	}

	// �Ű������� ����, ����Ÿ�� �ִ� ���

	// �Ű� ������ �ְ� ����Ÿ�� ���� ���

	// �Ű� ������ �ְ�, ����Ÿ�Ե� �ִ� ���

}// endc