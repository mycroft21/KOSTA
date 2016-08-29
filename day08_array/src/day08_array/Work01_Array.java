package day08_array;

import java.util.Random;
import java.util.Scanner;

//특정달의 평균 강수량
public class Work01_Array {

	public static void main(String[] args) {

		double[] rain = new double[30];

		for (int i = 0; i < rain.length; i++) {
			rain[i] = (int) (Math.random() * 100 + 1);

		}

		double sum = 0, ave = 0;

		for (double i : rain) {
			sum += i;
		}
		ave = (sum / rain.length);

		System.out.printf("평균 강수량은 %.2f", ave);
		System.out.print("%입니다.");

	}// end m

}// end c
