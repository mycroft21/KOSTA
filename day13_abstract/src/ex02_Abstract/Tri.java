package ex02_Abstract;

public class Tri extends Shape {

	private int h = 7;
	@Override
	public double calc(double x) {
		result = x * h /2;
		
		return result;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		calc(8.1);
		System.out.println(result+"크기의"+name+"을 그려버렸다.");
	}

}
