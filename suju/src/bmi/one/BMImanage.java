package bmi.one;

import java.util.ArrayList;
import java.util.Scanner;

public class BMImanage extends BMI {
	
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<BMI>list = new ArrayList<BMI>();

	public static void main(String[] args) {
	
	
		while(true){
			System.out.println("1.�߰� | 2. ���� | 3. ��� | 4. ����");
			
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
		
		System.out.println("********�߰�********");
		
		System.out.println("�̸� �Է��ϼ���");
		bmi.name = sc.next();
		
		System.out.println("�����Ը� �Է��ϼ���");
		bmi.weight = sc.nextInt();
		
		System.out.println("Ű�� �Է��ϼ���");
		bmi.height = sc.nextInt();
		
		bmi.bmibmi = (bmi.weight) / ((bmi.height / 100.0)*(bmi.height / 100.0)) ;
		
		
		if(bmi.bmibmi < 18.5){
			bmi.result ="ü�ߺ����Դϴ�.";
		}
		
		else if((bmi.bmibmi >= 18.5) && (bmi.bmibmi <=22.9)){
			bmi.result = "�����Դϴ�.";
		}
		
		else if((bmi.bmibmi >= 23.0) && (bmi.bmibmi <=24.9)){
			bmi.result = "��ü���Դϴ�.";
		}
		
		else{
			bmi.result = "���Դϴ�.";
		}
	
		list.add(bmi);	
	}
	
	public static void delete(){
		
		System.out.println("********����********");
		System.out.println("������ ����� �̸��� �Է��ϼ���");
		String name2 = sc.next();
		
		for(int i=0; i<list.size(); i++ ){
			if(name2 .equals(list.get(i).name)){
				list.remove(i);
				System.out.println("�����Ͽ����ϴ�.");
				break;
			} // if end
		} // for end		
	}
	
	public static void print(){
		
		System.out.println("********���********");
		
		for(int i=0; i<list.size(); i++){
			
			BMI bmi = list.get(i);
			
			System.out.println("�̸� :"+bmi.name);
			System.out.println("������ :"+bmi.weight);
			System.out.println("Ű :"+bmi.height);
			System.out.println("BMI :" + bmi.bmibmi);
			System.out.println("��� :" + bmi.result);
		
		} // end for 	
	}
}
