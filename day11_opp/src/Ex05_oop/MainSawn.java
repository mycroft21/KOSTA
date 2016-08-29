package Ex05_oop;

import java.util.Scanner;

public class MainSawn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Swan sw1 = new Swan("상선", "자바 개발", "50원", "없음");
		Swan sw = new Swan();

		System.out.println("사원의 이름은 무엇입니까?");
		sw.setName(sc.next());
		System.out.println("사원의 부서는 어디입니까?");
		sw.setSubject(sc.next());
		System.out.println("사원의 급여는 얼마입니까?");
		sw.setPayment(sc.next());
		System.out.println("사원의 연락처를 입력해 주십시오.");
		sw.setCellPh(sc.next());

		sw.show();

	}

}
