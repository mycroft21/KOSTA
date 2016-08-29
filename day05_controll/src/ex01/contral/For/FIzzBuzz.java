package ex01.contral.For;

import java.util.Scanner;

public class FIzzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=0, y=0, z=0;
		for(x=1 ; x <= 100; x++){
			
			if(x%35==0){
				System.out.print("Fizzbuzz");
			} else if (x % 5 == 0){
				System.out.print("Fizz");}
			else if ( x % 7 == 0){System.out.print("Buzz");}
				else{ System.out.print(x);}
				
				System.out.println("");
				
				
				switch(x%35){
				case 0: System.out.println("FizzBuzz"); break;
				case 7: case 14: case 21: case 28: System.out.println("Buzz"); break;
				case 5: case 10: case 15: case 20: case 25: case 30: System.out.println("Fizz"); break;
				default: System.out.println(x);
				}
				
				
			}
			
			
		}
		
	}


