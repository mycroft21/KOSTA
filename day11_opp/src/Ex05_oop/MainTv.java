package Ex05_oop;

import java.util.Scanner;

import Ex05_oop.ClassTV.Channel;
import Ex05_oop.ClassTV.color;

public class MainTv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ClassTV tv = new ClassTV();
		color co = tv.new color();
		Channel cha = tv.new Channel("����", "�Ʒ��� �ٷ���", "9�� ��������ũ", "���ݸ��������ϴ�.", "��ť 3��", "���Ⱥ�");
		String Color = "0";

		do {

			System.out.println("�ֹ� �Ͻ� TV�� ���� ǥ���� ������ �ּ���!");
			System.out.println("=============================");
			System.out.println(" 1. ��� �ǹ� \n 2. �����̾� ���� \n 3. ��ũ�� ȭ��Ʈ  \n 4. ���� ��� \n 5. ���� ����");
			System.out.println("=============================");

			Color = sc.next();

			switch (Color) {
			case "1":
				Color = co.s;
				break;
			case "2":
				Color = co.b;
				break;
			case "3":
				Color = co.w;
				break;
			case "4":
				Color = co.g;
				break;
			case "5":
				Color = co.r;
				break;
			default:
				Color = "0";
				System.out.println("�߸� ���� �ϼ̽��ϴ�.");
				break;

			}
		} while (Color == "0");

		co.setTV(Color);

		System.out.println("�մ��� ���� �Ͻ� TV�� ���� " + co.TV + "�Դϴ�. TV �۵��� �����մϴ�.");

		int ch = 0;
		do {
			System.out.println("ä���� ������ �ּ���!");

			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println(cha.jtbc);
				break;
			case 2:
				System.out.println(cha.ebs);
				break;
			case 3:
				System.out.println(cha.kbs);
				break;
			case 4:
				System.out.println(cha.A);
				break;
			case 5:
				System.out.println(cha.sbs);
				break;
			case 6:
				System.out.println(cha.mbc);
				break;
			default:
				Color = "0";
				System.out.println("tv�� �����մϴ�..");
				break;

			}
		} while (Color != "0");

	}
}