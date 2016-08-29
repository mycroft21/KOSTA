package ex03;

public class Tri extends Rect {

	double tri = 0;

	public void disp() {
		super.disp();

		tri = result / 3;

		super.draw();

		System.out.printf("\n¿ø»ÔÀº : %.2f", tri);
	}
}
