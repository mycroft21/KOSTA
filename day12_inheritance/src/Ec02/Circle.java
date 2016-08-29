package Ec02;

public class Circle extends Point {
	private int r;

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle() {
		System.out.println("CIrcle");
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	private Point pt;
	
	private void disp() {
		super.display();
		// TODO Auto-generated method stub
		System.out.println("circle");
	}

}
