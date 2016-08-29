package ex.io;

import java.io.InputStream;

public class InputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input = ?");
		InputStream is = System.in;// 표준 입력
		try{
		System.out.print("단일문자 :");
		int num1 = is.read() - 48;//예외처리해야함 '0'~'9' : 48 ~ 57(AscII code)
		is.read(); is.read();
		int num2 = is.read() -48;
	
		System.out.println((char)num1);
		System.out.println(num1 + num2);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
