package dat09_Array;

import java.util.Scanner;

public class Ex04_sort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] name = new String[7];
		int[] grade = { 1, 2, 3, 4, 5, 6, 7 };
		int[] kor = new int[7];
		int[] exe = new int[7];
		int[] com = new int[7];
		int[] sum = new int[7];
		int[] avg = new int[7];
		char[] hap = new char[7];

		for (int i = 0; i < name.length; i++) {
			System.out.println("�̸��� �Է��� �ּ���!");
			name[i] = sc.next();

			do {
				System.out.println("���� ������ �Է��� �ּ���");
				kor[i] = sc.nextInt();
			} while (kor[i] > 100 ^ kor[i] < 0);

			do {
				System.out.println("ü�� ������ �Է��� �ּ���");
				exe[i] = sc.nextInt();
			} while (exe[i] > 100 ^ exe[i] < 0);

			do {
				System.out.println("���� ������ �Է��� �ּ���");
				com[i] = sc.nextInt();
			} while (com[i] > 100 ^ com[i] < 0);

			sum[i] = kor[i] + exe[i] + com[i];

		}

		for (int i = 0; i < avg.length; i++) {
			avg[i] = (kor[i] + exe[i] + com[i]) / 3;

			switch (avg[i] / 10) {
			case 10:
			case 9:
				hap[i] = 'A';
				break;
			case 8:
			case 7:
				hap[i] = 'B';
				break;
			case 6:
			case 5:
				hap[i] = 'C';
				break;
			case 4:
				hap[i] = 'D';
				break;
			default:
				hap[i] = 'F';
			}// ����
		}

		int temp = 0;

		for (int i = 0; i < 7; i++) {
			temp =0;
			for (int j = 0; j < 7; j++) {
				if (sum[i] >= sum[j]){temp++;}

			}
			grade[i] = 8 - temp;

		}

		for (int x = 0; x < grade.length; x++) {
			System.out.println(name[x] + "�� ������ " + hap[x] + "�����Դϴ�.");
			System.out.println("���� : " + kor[x] + "�� ü�� : " + exe[x] + "�� ���� : " + com[x] + "���̸� ������ " + sum[x]
					+ "�� ����� " + avg[x] + "�� �Դϴ٤�.");
			System.out.println(grade[x]+ "�� �Դϴ� �����մϴ�.");
			System.out.println("=================================================================================");
		}

	}

}