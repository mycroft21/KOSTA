package ex06.Multi;

import ex02_Abstract.Shape;
import ex05_interface.IDraw;

public class MultiClass extends Shape implements IDraw, Test {

	int num = 88;

	
	@Override	
	public void draw() {
		// TODO Auto-generated method stub
System.out.println("iDraw inter");

	}

	@Override
	public double calc(double x) {
		// TODO Auto-generated method stub
		result = x+11;
		return result;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		calc(12.3);
		System.out.println(result + "¿‘¥œ¥Ÿ.");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Text inter");
		System.out.println(num);
	}

}
