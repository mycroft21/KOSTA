package Exam;

import java.util.Scanner;

public class Test4 {
public static void main(String[] args) {
	System.out.println("���ù�");
	int x = new Scanner(System.in).nextInt();
	System.out.println("��������");
	int y =new Scanner(System.in).nextInt();
	

	int m = x/y;
	if(x%y!=0)m++;

		System.out.println("��������"+m);
	
	
	
}
}
