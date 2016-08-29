package Ex04_oop;

public class Point {

	private int x, y, z;

	public Point() {
		this(1,2,3);
		this.x = 5;
		this.y = 5;
		this.z = 5;
	}

	public Point(int x, int y, int z) {

		this.x = x;
		this.y = y;
		this.z = z;
		
		System.out.println("Point");
	}

	void setX(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void disp(){
		System.out.println("point"+x+","+y+","+z);
	}
	

}
