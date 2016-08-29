package ex02.app;

import ex02.lib.Calculator;

public class MainEntry {

	public static void main(String[] args) {
 
		Calculator calc = new GoodCalc();
		
		System.out.println(calc.add(44,55));
		System.out.println(calc.subtract(77, 33));
		System.out.println(calc.average(new int[]{28,46,32,44}));
		
	}

}
