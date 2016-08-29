package ex03;

import java.io.InputStream;
import java.util.Scanner;

public class CIrcle extends man {
	int r;

	public CIrcle() {

		// TODO Auto-generated constructor stub
	}

	public CIrcle(int r) {

		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void disp() {
		// TODO Auto-generated method stub

		System.out.println("원의 반지름을 입력해 주세요!");
		r = new Scanner(System.in).nextInt();

		super.draw();
		result = r * r * Math.PI;
		System.out.printf("원의 넓이는 : %.2f \n", result);

	}

}
