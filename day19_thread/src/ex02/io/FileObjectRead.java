package ex02.io;

import java.io.*;

public class FileObjectRead {
public static void main(String[] args) {
	String name = null;
	String id = null;
	String pwd = null;
	Boolean gender = true;
	int age = 0;
	String phone = null;
	String temp = null;
	
	File f = new File("E:\\WorkSpace\\day19_thread\\members.txt");
	
	try{
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		name = (String)ois.readObject();
		id = (String)ois.readObject();
		pwd = (String)ois.readObject();
		gender = (boolean)ois.readObject();
		age = (int)ois.readObject();
		phone = (String)ois.readObject();
		
		ois.close();
		
		System.out.println("\t\t>>> ȸ������ << \n");
		System.out.println("�̸� \t �Ɵ�\t��й�ȣ\t����\t����\t��ȭ��ȣ");
		System.out.println(name+"\t"+id+"\t"+pwd+"\t"+gender+"\t"+age+"\t"+phone);
		
		
	}catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
}
}
