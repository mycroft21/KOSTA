package dat09_Array;

import java.util.Scanner;

public class Ex02_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("난수를 생성해 주세요.");
		int su = sc.nextInt();

		int[][][] arr = new int[4][3][3];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				for (int x = 0; x < arr[0][0].length; x++) {

					arr[i][j][x] = su * (i + x -j) - (i*j * x);

					System.out.print(arr[i][j][x] + "\t");
				}
				System.out.println();
			}
			System.out.println("=---------------------------------------------------------=");
		}
		
		

	}
}
