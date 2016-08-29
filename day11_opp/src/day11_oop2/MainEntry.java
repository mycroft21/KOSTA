package day11_oop2;

class Point {
	private int x, y;
	public Point(){//�Ű����� ���� ������ �Լ� = default constructor
		x = 5; y = 100;
	}

	public Point(int xx){ //�Ű����� �ϳ� ¥��
		x=xx; y = 38;
	}
	public Point(int xx, int yy){
		x=xx; y=xx;
	}
	void setx(int xx) {
		x = xx;
	}

	int getx() {
		return x;
	}

	void sety(int xx) {
		y = xx;
	}

	int gety() {
		return y;
	}

	void print() {
		System.out.println("x = " + x + ", y = " + y);

	}

}

public class MainEntry {
	public static void main(String[] args) {

		Point pt = new Point();

		pt.setx(15);
		pt.sety(55);

		System.out.println(pt.gety());
		pt.getx();
		pt.print();

	}
}
