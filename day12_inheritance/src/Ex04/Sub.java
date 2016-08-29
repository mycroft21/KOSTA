package Ex04;

import java.util.Scanner;

public class Sub {

	Scanner sc = new Scanner(System.in);

	String temp;

	int i;

	public Sub() {
		System.out.println("출석부를 제작합니다. 총 몇명을 입력 하시겠습니까?");
		this.i = sc.nextInt();
	}

	public String temp() {

		return sc.next();
	}

	public void show() {

	}

}
