package ex.io;

import java.io.InputStream;

public class InputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input = ?");
		InputStream is = System.in;// ǥ�� �Է�
		try{
		System.out.print("���Ϲ��� :");
		int num1 = is.read() - 48;//����ó���ؾ��� '0'~'9' : 48 ~ 57(AscII code)
		is.read(); is.read();
		int num2 = is.read() -48;
	
		System.out.println((char)num1);
		System.out.println(num1 + num2);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
