package day08_array;

import java.util.Random;
import java.util.Scanner;

//Ư������ ��� ������
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

		System.out.printf("��� �������� %.2f", ave);
		System.out.print("%�Դϴ�.");

	}// end m

}// end c