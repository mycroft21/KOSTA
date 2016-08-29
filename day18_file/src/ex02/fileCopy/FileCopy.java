package ex02.fileCopy;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) throws Exception{
		
		long start = System.currentTimeMillis();
		
		InputStream input = new FileInputStream("E:/mine.png");
		OutputStream output = new FileOutputStream("copy.png");

		byte[] buffer = new byte[1024*8];
		
		
		while(true){
			
			int inputData = input.read(buffer);
			if(inputData == -1) break;
			output.write(buffer,0,inputData);
			
		}// end while
		
		long end = System.currentTimeMillis();//���� �ð� ���� ����
		System.out.println(end -start);//���翡 �ɸ��ð�
		System.out.println("����");
		input.close();output.close();
	}

}
