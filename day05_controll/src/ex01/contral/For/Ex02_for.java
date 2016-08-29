package ex01.contral.For;

import java.util.Scanner;

public class Ex02_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println("몇단을 외울지 입력하세요 : ");
		int sc = new Scanner(System.in).nextInt();

		for (a = 1; a <= 9; a++) {

			System.out.println(sc + " * " + a + " = " + (sc * a));

		}

	}

}
