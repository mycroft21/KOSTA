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

				System.out.println("������ �����մϴ�.");

				System.out.println("\t1.�ֹ��Ѵ�. \n\t2. ��� ��ȸ�Ѵ�. \n\t3. ��ǰ�� ����Ѵ�.\n\t4. �����մϴ�.");

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
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}

		} while (true);
	}

}
