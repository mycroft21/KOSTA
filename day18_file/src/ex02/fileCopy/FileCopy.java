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
		
		long end = System.currentTimeMillis();//끝난 시간 저장 변수
		System.out.println(end -start);//복사에 걸린시간
		System.out.println("성공");
		input.close();output.close();
	}

}
