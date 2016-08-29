package ex01.contral.For;

public class Ex06_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1, b;

		while (a <= 3) {
			b = 1;
			while (b <= 4) {
				System.out.print(b + "\t");
				b++;
			}//endw2
			System.out.println();
			a++;
		}//endw1

		int x = 2;

		do {
			int y = 1;
			System.out.println(x + "´Ü");
			do {
				System.out.print(x + "X" + y + "=" + x * y + "\t");
				y++;
			} while (y < 10);//do2
			System.out.println();
			x++;
		} while (x < 10);//do1

	}//endm
}//endc
