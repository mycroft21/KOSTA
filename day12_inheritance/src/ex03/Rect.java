package ex03;

import java.util.Scanner;

public class Rect extends CIrcle {
	double w;
	int h;

	public Rect(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	public Rect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public void disp() {
		// TODO Auto-generated method stub
		super.disp();

		System.out.println("���̸� �Է� �� �ּ���!");
		h = new Scanner(System.in).nextInt();

		w = result;

		result = h * w;

		super.draw();

		System.out.printf("������ ���Ǵ� : %.2f", result);

	}

}
