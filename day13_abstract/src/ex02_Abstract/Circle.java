package ex02_Abstract;

public class Circle extends Shape {

	public double calc(double x) {
		// TODO Auto-generated method stub
		result = x*x*Math.PI;
		return result;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		calc(5.5);
		System.out.println(result + "반지름의" + name + "이 그려져씁니다.=");
	}

}
