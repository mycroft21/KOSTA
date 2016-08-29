package ex02_Abstract;

public class Reat extends Shape {
	private int h = 10;

	@Override
	public double calc(double x) {
		result = h * x;
		return result;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		calc(4.7);
		System.out.println(result + "크기의" + name + "을 그렸습니다.");
	}

}
