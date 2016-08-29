package day07_homework;

import java.util.Scanner;

public class Test05 {
public static int max(int a, int b){
	
	int max = 0;
	
	if(a<b){
		max = b;
		
	}else if(a>b){
		max =a;
	}else System.out.println(a + " 의 " + b + " 두값은 같습니다.");
	
	return max;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("비교하고 싶은 두값을 순서대로 입력해 주세요!");
	int a = sc.nextInt();
	int b = sc.nextInt();		
	
	System.out.println(max(a,b));
}
}
