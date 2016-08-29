package suju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class SujuRequest {

	public static HashMap<Integer, Cliunt> LIST = new HashMap<>();
	int ClNum, HP, temp = 0;
	String Ad, CLname;
	boolean sp = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public SujuRequest() throws Exception {

		System.out.println("\n\n등록 업무를 시작합니다.\n------------ \n\t1.등록\n\t2.조회 \n\t3.삭제\n-------------------");

		temp = new Scanner(System.in).nextInt();

		if (temp == 1) {
			Enter en1 = new Enter();
		}

		else if (temp == 2) {
			System.out.println(LIST.size());
			System.out.println(LIST.toString());
		}

		else if (temp == 3) {

			for (int i = 0;; i++) {
				try {
					System.out.println("삭제할 번호를 입력하세요! 잘못 입력시 처음으로 돌아갑니다. 종료 0번");

					temp = Integer.parseInt(br.readLine());

					if (temp == 0)
						break;
					System.out.println(temp);
					LIST.remove(temp);
					System.out.println(temp + "번 삭제 완료!");

				} catch (IOException e) {
					i--;
				}
			}

		}
	}

}
