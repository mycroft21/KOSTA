package day07_allay;

public class Ex04_method {

	public static String star(String x, int y) {

		for (int i = 1; i <= y; i++) {
			System.out.print(x);
			;
		}

		return x;

	}

	public static int abs(int a) {
		int b = 0;
		if (a < 0)
			b = (a * -1);
		else
			b = a;

		return b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abs(-7));
		star("*", 5);
	}

}
