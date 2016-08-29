package Exam;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	
	System.out.println("값을 입력해주세요");
	
	int x = new Scanner(System.in).nextInt();
	
	int sum1=0,sum2=0,sum3 =0;

	
	for(int y =0; x> y; y++){
		
		switch(y%15){
		
		case 0: sum3 +=y; sum2 +=y; sum1+=y; break;
		case 3: case 6: case 9: case 12: sum1 += y; sum3+=y; break;
		case 5: case 10: sum2 +=y; sum3 +=y; break;
		default: break;
			
		}
	}
	
	System.out.println("3과 5의 배수의 합 : "+sum3+"\n3의 배수의 합 : " + sum1 +"\n 5의 배수의 합 : " + sum2);
		
	

}
}
