package day11_oop2;

class nate{
	private int x,y,z;

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

	public int getZ() {
		return z;
	}

	public nate(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public nate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setZ(int z) {
		this.z = z;
	}
	void disp() {
		// TODO Auto-generated method stub
		System.out.print(x);
	}


	
	
}



public class Ex02_oop {
public static void main(String[] args) {
	nate cc = new nate(10,10,10);
	cc.disp();
}
}
