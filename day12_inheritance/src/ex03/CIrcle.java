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

		System.out.println("���� �������� �Է��� �ּ���!");
		r = new Scanner(System.in).nextInt();

		super.draw();
		result = r * r * Math.PI;
		System.out.printf("���� ���̴� : %.2f \n", result);

	}

}
