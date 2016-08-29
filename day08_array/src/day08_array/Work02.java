package day08_array;

import java.util.Random;
import java.util.Scanner;

//특정달의 평균 강수량
public class Work02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		double[] rain = new double[30];
		String yes = null;

		double[] mon = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		for (int i = 0; i < mon.length; i++) {
			mon[i] = rain();
		}

		do {
			System.out.println("\n-------------------------------------------------");

			int x;
			do {
				System.out.println("원하는 달수를 입력해 주세요.");
				x = sc.nextInt();
				if (x < 1 || x > 12)
					System.out.println("잘못 입력 했습니다. 다시 입력해 주세요.");
			} while (x < 1 || x > 12);
			System.out.printf(x + "월의 평균 강수량은 %.2f", mon[x - 1]);
			System.out.print("%입니다.");
			System.out.println("\n-------------------------------------------------");
			System.out.println("계속하시겠습니까?(y)");

			yes = sc.next();
		} while (yes.equals("y") ^ yes.equals("Y"));
	}// end m

	public static double rain() {
		double sum = 0;
		int[] rain = new int[30];

		for (int i = 0; i < rain.length; i++) {
			rain[i] = (int) (Math.random() * 100 + 0);

		}

		for (double i1 : rain)
			sum += i1;
		return sum / 30;
	}// end r

}// end c