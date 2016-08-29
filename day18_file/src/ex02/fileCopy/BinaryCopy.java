package ex02.fileCopy;

import java.io.*;

public class BinaryCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src  = new File("c:/windows/explorer.exe");
		
		File dist = new File("E:/Explorer.bin");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		try{
		fis = new FileInputStream(src);//파일 입력 바이트 스트림 연결
		fos = new FileOutputStream(dist); //파일 출력 자이트 스트림 연결
		bis = new BufferedInputStream(fis);//버퍼 입력 스트림 연결
		bos = new BufferedOutputStream(fos);//버퍼 출력 스트림 연결
		
		while((c = bis.read())!=-1){
			bos.write((char)c);
		}
		
		System.out.println("파일복사성공!");
		bis.close(); bos.close(); fis.close(); fos.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
