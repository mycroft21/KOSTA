package day07_homework;

import java.util.Scanner;

public class Test05 {
public static int max(int a, int b){
	
	int max = 0;
	
	if(a<b){
		max = b;
		
	}else if(a>b){
		max =a;
	}else System.out.println(a + " �� " + b + " �ΰ��� �����ϴ�.");
	
	return max;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���ϰ� ���� �ΰ��� ������� �Է��� �ּ���!");
	int a = sc.nextInt();
	int b = sc.nextInt();		
	
	System.out.println(max(a,b));
}
}