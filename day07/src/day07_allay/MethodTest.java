package day07_allay;

import java.util.Scanner;

public class MethodTest {

	// �Ű����� ���� ���ϰ� ���� �żҵ�
	public static void show() {

		System.out.println("sunny");

	}

	// �Ű����� ���� ���ϰ� �ִ� �żҵ�
	public void display(String name, int i) {
		System.out.println(name + "�̱���");
		System.out.println(i);
	}

	public static void mymy(String name, int age, String home) {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		/* home = new Scanner(System.in).next(); */
		System.out.println("�ּ� : " + home);
	}

	public static void add(int a, int b) {
		System.out.println("���� " + (a + b));
	}

	// �Ű������� ������ ������ �ִ� ���
	public static int dis() {
		int i = 3;
		int y = 5;

		return i * y;
	}

	public static String see(){
		String kosta = "KOSTA";
		return kosta;	
	}

	public static void max(int a, int b) {
		if (a > b) {
			System.out.println("ū���� a�̰� ����" + a);
		} else if (a == b) {
			System.out.println("�μ��� ���� �����ϴ�.");
		} else {
			System.out.println("ū���� b�̰� ���� " + b);
		}
	}
	public static int plus(int x, int y, int z){
		int hap = x + y + z;
		return hap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		Ex04_method my = new Ex04_method();
		my.abs(1);
		
		MethodTest me = new MethodTest();
		
		me.display("���",1);
		int x = dis();
		x= dis()+5;
		System.out.println(x + " " + (dis()));

		System.out.println("main end");
		String see = see();
		System.out.println(see);
		System.out.println(plus(2,3,4));
	}

}