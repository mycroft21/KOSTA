package ex01.control.loop;

import java.util.Scanner;

public class Ex04_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;

		System.out.println("외우고 싶은 구구단 단수를 입력해 주세요!");

		int b = new Scanner(System.in).nextInt();

		System.out.println(b + "단");
		/*
		while (a < 10) {
			System.out.println(b + "X" + a + "=" + a * b);
			a++;
		}*/

		do {
			System.out.println(b + "X" + a + "=" + a * b);
			a++;
		} while (a < 10);

	}

}
