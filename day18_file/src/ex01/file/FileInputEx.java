package ex01.file;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try{
			
			OutputStream os = new FileOutputStream("e:\\memo.txt");//���� ���

			/*OutputStream os = new FileOutputStream("e:/memo.txt");*///\\�ι����� ���� /�̰Ž�
			
			while(true){
				System.out.println("���忭 �Է� ��� : ");
				String str = sc.nextLine() +"\r\n";
				
				if(str.equals("EXIT\r\n"))break;
				os.write(str.getBytes());
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
