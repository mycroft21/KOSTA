package day08_array;

import java.util.Scanner;

public class Ex03_Array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new  int[5];
	for(int i = 0; i < arr.length; i++){
		System.out.println("정수 숫자 입력:");
		arr[i] = sc.nextInt();
	}
	for(int i = 0; i < arr.length ; i ++){
		System.out.println(arr[i]);
	}
	int sum = 0;
	for(int item : arr){
		sum += item;
	}
	System.out.println(sum);
}
}
