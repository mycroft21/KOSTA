package ex03.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIstEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = 0;

		ArrayList<String> name = new ArrayList<String>();

		ArrayList<Integer> math = new ArrayList<Integer>();
		ArrayList<Integer> eng = new ArrayList<Integer>();
		ArrayList<Integer> kor = new ArrayList<Integer>();
		ArrayList<Integer> sum = new ArrayList<Integer>();

		ArrayList<Integer> rank = new ArrayList<Integer>();
		ArrayList<String> grade = new ArrayList<String>();

		do {
			System.out.println("�̸��� �Է��� �ּ���!");
			name.add(sc.next());

			System.out.println("���� �̸��� �Է� �Ͻ÷��� 1�� \n�ƴϸ� 2���� �Է����ּ��� ");
			x = sc.nextInt();
		} while (x == 1);

		for (int i = 0; i < name.size(); i++) {
			try {
				System.out.println(name.get(i) + "�� ���� ������ �Է� �ϼ���!");
				math.add(sc.nextInt());
				System.out.println(name.get(i) + "�� ���� ������ �Է� �ϼ���!");
				eng.add(sc.nextInt());
				System.out.println(name.get(i) + "�� ���� ������ �Է� �ϼ���!");
				kor.add(sc.nextInt());
			} catch (Exception e) {
				System.out.println("�߸� �Է� �ϼ˽��ϴ�.");
				i--;
			}
		}

		for (int i = 0; i < name.size(); i++) {
			sum.add(math.get(i) + eng.get(i) + kor.get(i));
		}

		for (int i = 0; i < name.size(); i++) {
			x = 0;
			for (int j = 0; j < name.size(); j++) {
				if (sum.get(i) < sum.get(j))
					x++;
			}
			rank.add(x + 1);
		}
		System.out.println("================================================================");
		System.out.println("�������� ����մϴ�.");
		System.out.println("================================================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i) + "\t" + math.get(i) + "\t" + eng.get(i) + "\t" + kor.get(i) + "\t"
					+ sum.get(i) + "\t" + rank.get(i));
		}
		System.out.println("================================================================");

	}

}
