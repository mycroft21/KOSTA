package Ex01;

class Point {
	protected int x, y;

	public Point() {
		System.out.println("디폴트 포");
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("매개변수 두개짜리");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.println(x + ",\t" + y);
	}

}

class Circle extends Point{//자손 클래스
	private int r;

	public Circle() {
		super();System.out.println("디폴트 서");
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y) {System.out.println("변수 서");
		
		// TODO Auto-generated constructor stub
	}

	public Circle(int r) {
	super();
	this.r = r;
}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	public void disp() {
		System.out.println(x + ",\t" + y+ ",\t"+r);
	}
	
}

class Rectangle {
	
}

public class MainEntry {
	public static void main(String[] args) {

		Point pt = new Point();
			pt.disp();
			Point cc = new Circle();
			cc.disp();
			Circle c1 = new Circle();
	}

}
