package ex01.control.loop;

import java.util.Scanner;

public class Ex03_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i =0; while(i < 10){ i++; System.out.println(i); }
		 */

		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("��� �۵� �մϴ�. \n 1.���� \n 2.���� \n 3.���� \n --------------------------------------");
					System.out.println("�Է�");
			
			int key = new Scanner(System.in).nextInt();

			if (key == 1) {
				speed++;
				System.out.println("�ӵ��� ���� �ƽ��ϴ�. ���� �ӵ��� " + speed + "�Դϴ�.\n");

			} else if (key == 2) {
				speed--;
				System.out.println("�ӵ��� ���� �ƽ��ϴ�. ���� �ӵ��� " + speed + "�Դϴ�.\n");

			} else if (key == 3) {
				System.out.println("��� �����մϴ�. �����ϰڽ��ϴ�. �� �ƴ� �ȵ��ݾ�? �ӵ�?!\n");
				
				
				
			}
		}

	}

}
