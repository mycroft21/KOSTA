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

		System.out.println("\n\n��� ������ �����մϴ�.\n------------ \n\t1.���\n\t2.��ȸ \n\t3.����\n-------------------");

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
					System.out.println("������ ��ȣ�� �Է��ϼ���! �߸� �Է½� ó������ ���ư��ϴ�. ���� 0��");

					temp = Integer.parseInt(br.readLine());

					if (temp == 0)
						break;
					System.out.println(temp);
					LIST.remove(temp);
					System.out.println(temp + "�� ���� �Ϸ�!");

				} catch (IOException e) {
					i--;
				}
			}

		}
	}

}
