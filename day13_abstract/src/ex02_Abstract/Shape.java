package ex02_Abstract;

public abstract class Shape {//최소만 가진다
	public double result = 0;
	public abstract double calc(double x);//추상메소드
	public abstract void show(String name);
	
	public void view(){
		System.out.println("슈퍼 클래스 세잎읍니다.");
	}
}
