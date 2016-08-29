package suju;

import java.util.HashMap;
import java.util.Scanner;

public class Register {

	public static HashMap<Integer, Cliunt> LIST = new HashMap<>();
	public static HashMap<Integer, Product> PRODUCT = new HashMap<>();

	int temp;
	Scanner sc = new Scanner(System.in);

	public Register() {
		do {
			try {

				WareHouse wh = new WareHouse();

				System.out.println("접수를 시작합니다.");

				System.out.println("\t1.주문한다. \n\t2. 재고를 조회한다. \n\t3. 상품을 등록한다.\n\t4. 종료합니다.");

				temp = sc.nextInt();

				if (temp == 1) {

					wh.buy();

				} else if (temp == 2) {

					wh.show();

				} else if (temp == 3) {

					wh.save();

				} else if (temp == 4) {
					break;
				}

			} catch (Exception e) {
				System.out.println("잘못 입력 하셨습니다.");
			}

		} while (true);
	}

}
