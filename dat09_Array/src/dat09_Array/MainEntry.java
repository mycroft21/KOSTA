package dat09_Array;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] x = new int[3][4];

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[0].length; j++) {

				if (i == 2) {
					x[i][j] = x[i - 2][j] + x[i - 1][j];
				} else {
					System.out.println((i + 1) + "�� " + (j + 1) + "���� ���� �Է� �ϼ���");
					x[i][j] = sc.nextInt();
				}
			}
		}

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[0].length; j++) {

				System.out.print(x[i][j] + "\t");

			}
			System.out.println();
		}
		for (int i = 0; i < x.length; i++) {
			
		}

		
	}
}
