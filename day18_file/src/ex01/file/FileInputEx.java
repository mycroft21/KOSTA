package ex01.file;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try{
			
			OutputStream os = new FileOutputStream("e:\\memo.txt");//절대 경로

			/*OutputStream os = new FileOutputStream("e:/memo.txt");*///\\두번쓰기 싫음 /이거써
			
			while(true){
				System.out.println("문장열 입력 요망 : ");
				String str = sc.nextLine() +"\r\n";
				
				if(str.equals("EXIT\r\n"))break;
				os.write(str.getBytes());
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
