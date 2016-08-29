package Exam;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int count = 0;
		int a, b, c, d;
		for (int i = 0; i < 10001; i++) {

			a = i % 10;
			b = (i / 10) % 10;
			c = (i / 100) % 10;
			d = (i / 1000) % 10;
			if (a == 8)
				count++;
			if (b == 8)
				count++;
			if (c == 8)
				count++;
			if (d == 8)
				count++;

		}

		System.out.println(count);
	}

}
