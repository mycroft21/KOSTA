package bmi.one;

import java.util.ArrayList;
import java.util.Scanner;

public class BMImanage extends BMI {
	
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<BMI>list = new ArrayList<BMI>();

	public static void main(String[] args) {
	
	
		while(true){
			System.out.println("1.추가 | 2. 삭제 | 3. 출력 | 4. 종료");
			
			int num = sc.nextInt();
			
			switch(num){
			case 1: 
			 add();	 break;
			 
			case 2:
				delete(); 	break;
				
			case 3:
				print();		break;
				
			case 4:
				System.exit(0);	
			}
		}

		
		
	}

	public static void add(){
		
		BMI bmi = new BMI();
		
		System.out.println("********추가********");
		
		System.out.println("이름 입력하세요");
		bmi.name = sc.next();
		
		System.out.println("몸무게를 입력하세요");
		bmi.weight = sc.nextInt();
		
		System.out.println("키를 입력하세요");
		bmi.height = sc.nextInt();
		
		bmi.bmibmi = (bmi.weight) / ((bmi.height / 100.0)*(bmi.height / 100.0)) ;
		
		
		if(bmi.bmibmi < 18.5){
			bmi.result ="체중부족입니다.";
		}
		
		else if((bmi.bmibmi >= 18.5) && (bmi.bmibmi <=22.9)){
			bmi.result = "정상입니다.";
		}
		
		else if((bmi.bmibmi >= 23.0) && (bmi.bmibmi <=24.9)){
			bmi.result = "과체중입니다.";
		}
		
		else{
			bmi.result = "비만입니다.";
		}
	
		list.add(bmi);	
	}
	
	public static void delete(){
		
		System.out.println("********삭제********");
		System.out.println("삭제할 사람의 이름을 입력하세요");
		String name2 = sc.next();
		
		for(int i=0; i<list.size(); i++ ){
			if(name2 .equals(list.get(i).name)){
				list.remove(i);
				System.out.println("삭제하였습니다.");
				break;
			} // if end
		} // for end		
	}
	
	public static void print(){
		
		System.out.println("********출력********");
		
		for(int i=0; i<list.size(); i++){
			
			BMI bmi = list.get(i);
			
			System.out.println("이름 :"+bmi.name);
			System.out.println("몸무게 :"+bmi.weight);
			System.out.println("키 :"+bmi.height);
			System.out.println("BMI :" + bmi.bmibmi);
			System.out.println("결과 :" + bmi.result);
		
		} // end for 	
	}
}
