package ex02.app;

import ex02.lib.Calculator;

public class GoodCalc extends Calculator {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int subtract(int x, int y) {
		return x-y;
	}

	@Override
	public double average(int[] x) {
		double sum =0;
		for(int i = 0; i< x.length; i++){sum+=x[i];}
		return sum/x.length;
	}

}
