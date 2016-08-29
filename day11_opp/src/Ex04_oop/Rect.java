package Ex04_oop;

public class Rect {

	private int x,y,x2,y2;

	public Rect(int x, int y, int x2, int y2) {
		super();
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}

	public Rect() {
		this(1,2,3,4);
		
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

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	public void disp(){
		System.out.println("Rect"+x+","+y+","+x2+","+y2);
	}
	
	
	
}