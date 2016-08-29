package ex04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

System.out.println("정수 input");
int num1 = Integer.parseInt(bf.readLine());

System.out.println("부호 input");


String cha = bf.readLine();


System.out.println("정수 input");
int num2 = Integer.parseInt(bf.readLine());

switch(cha){
case "+": System.out.println(num1 + num2);; break;
case "-": System.out.println(num1 - num2);; break;
case "*": System.out.println(num1 * num2);; break;
case "/": System.out.println(num1/ num2);; break;

}





	}

}
