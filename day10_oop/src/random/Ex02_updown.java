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
					System.out.println((i + 1) + " ��° ��ȸ ���ڸ� �Է��� �ּ���.");
					input = new Scanner(System.in).nextInt();
					if (100 >= input & su < input) {
						System.out.println("down");
					} else if (0 < input & su > input) {
						System.out.println("up");
					} else if (su == input) {
						System.out.println("�����Դϴ�.");
						break;
					} else {
						System.out.println("�߸��� ���Դϴ�. �ٽ� �մϴ�.");
						i--;
					}//��������
				} catch (Exception e) {
					System.out.println("�߸��� ���Դϴ�. �ٽ� �մϴ�.");
					i--;
				}//���� ����
			}
			
			if (su != input) {
				System.out.println("�й��߽��ϴ�.");
			}//�й� ���
			
			System.out.println("������ " + su);
			System.out.println("�ٽ� �Ͻ÷��� y�� ��������");
			yes = new Scanner(System.in).next();
		} while (yes.equals("y"));//����ۺ�

	}
}