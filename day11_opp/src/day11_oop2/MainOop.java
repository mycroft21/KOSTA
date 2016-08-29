package day11_oop2;

class Circle {
	private int x, y, r = (int) 3.14;

	public Circle() {
		x = 10;
		y = 20;
		r = 3;
	}

	public Circle(int xx, int yy, int rr) {
		x = xx;
		y = yy;
		r = rr;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	int getR() {
		return r;
	}

	void setX(int xx) {
		x = xx;
	}

	void setY(int yy) {
		y = yy;
	}

	void setR(int rr) {
		r = rr;
	}

	void output() {
		if(x<y) r = -r;
		System.out.println("원의 넓이는 = " + (x - y) * r);
	}

}

public class MainOop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cc = new Circle(10,20,30);

		System.out.println(cc.getX() + "," + cc.getY() + "," + cc.getR());
		cc.output();
		cc.setX(8);
		cc.setY(3);
		cc.setR(10);
		int m =cc.getX() - cc.getY();
		
		System.out.println("반지름은 " + m);
		
		cc.output();

	}

}
