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

		System.out.println("높이를 입력 해 주세요!");
		h = new Scanner(System.in).nextInt();

		w = result;

		result = h * w;

		super.draw();

		System.out.printf("원통의 부피는 : %.2f", result);

	}

}
