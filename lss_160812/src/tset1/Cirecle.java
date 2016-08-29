package tset1;

public class Cirecle extends Shape {
	private int r;

	
	public Cirecle(int r) {
		// TODO Auto-generated constructor stub
		this.r =r;
	}
	@Override
	
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * r* r;
	}

	@Override
	
	double circuference() {
		// TODO Auto-generated method stub
		return Math.PI*r*2;
	}

}
