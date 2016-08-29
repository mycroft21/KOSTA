

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
	
		try{
		System.out.println("x = ");
		int x= new Scanner(System.in).nextInt();
		System.out.println("y = ");
		int y= new Scanner(System.in).nextInt();
		
		System.out.println("\n\n " + x +","+y);
		}		catch(NullPointerException e){
			e.printStackTrace();
		}		catch(InputMismatchException e){
			e.printStackTrace();
		}		catch(Exception e){
			System.out.println("정수만 주라");
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
