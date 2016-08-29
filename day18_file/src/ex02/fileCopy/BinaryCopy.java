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
		fis = new FileInputStream(src);//���� �Է� ����Ʈ ��Ʈ�� ����
		fos = new FileOutputStream(dist); //���� ��� ����Ʈ ��Ʈ�� ����
		bis = new BufferedInputStream(fis);//���� �Է� ��Ʈ�� ����
		bos = new BufferedOutputStream(fos);//���� ��� ��Ʈ�� ����
		
		while((c = bis.read())!=-1){
			bos.write((char)c);
		}
		
		System.out.println("���Ϻ��缺��!");
		bis.close(); bos.close(); fis.close(); fos.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
