package random;

import java.util.Random;
import java.util.Scanner;

public class Ex02_updown {
	public static void main(String[] args) {

		Random r = new Random();
		int input = 0, su = 0;
		String yes = null;
		
		do {
			su = r.nextInt(100) + 1;
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println((i + 1) + " 번째 기회 숫자를 입력해 주세요.");
					input = new Scanner(System.in).nextInt();
					if (100 >= input & su < input) {
						System.out.println("down");
					} else if (0 < input & su > input) {
						System.out.println("up");
					} else if (su == input) {
						System.out.println("정답입니다.");
						break;
					} else {
						System.out.println("잘못된 값입니다. 다시 합니다.");
						i--;
					}//게임진행
				} catch (Exception e) {
					System.out.println("잘못된 값입니다. 다시 합니다.");
					i--;
				}//오류 교정
			}
			
			if (su != input) {
				System.out.println("패배했습니다.");
			}//패배 출력
			
			System.out.println("정답은 " + su);
			System.out.println("다시 하시려면 y를 눌르세요");
			yes = new Scanner(System.in).next();
		} while (yes.equals("y"));//재시작부

	}
}
