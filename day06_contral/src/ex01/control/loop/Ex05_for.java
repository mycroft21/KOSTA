package ex01.control.loop;

/*
public class Ex05_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6;
		int b = 0;
		int c = 0;
		for (b = 1; b <= 5; b++) {
			a = a - 1;
			for (c = a; c <= 5; c++) {
				System.out.print("*");

			}
			System.out.println("");

		}
		for (b = 1; b <= 5; b++) {
			a = a + 1;
			for (c = a; c <= 5; c++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}

}
*/
public class Ex05_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 1; a <= 5; a++) {
			for (int b = a; b <= 5; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a; c++) {
				System.out.print("*");

			}
			for (int d = 2; d <= a; d++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int a = 1; a <= 5; a++) {
			for (int b = 5 - a; b <= 5; b++) {
				System.out.print(" ");
			}
			for (int b = a; b <= 4; b++) {
				System.out.print("*");
			}
			for (int c = a; c <= 3; c++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}