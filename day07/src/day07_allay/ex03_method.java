package day07_allay;

import java.util.Scanner;

public class ex03_method {

	public static void main(String[] args) { // 시작점 진입점이 메인
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x= ");
		int x = sc.nextInt();
		System.out.print("y= ");
		int y = sc.nextInt();
		
		plus();//함수 호출

		System.out.println("main method = " + x + "," + y);
		
		System.out.println("main end");
	}// endm

	// 매개변수가 없고, 리턴타입 없는 경우
	public static void plus() { //함수 정의구
		int hap = 100 + 30;
		System.out.println("plus method hap = " + hap);

	}

	// 매개변수가 없고, 리턴타임 있는 경우

	// 매개 변수가 있고 리턴타입 없는 경우

	// 매개 변수가 있고, 리턴타입도 있는 경우

}// endc
