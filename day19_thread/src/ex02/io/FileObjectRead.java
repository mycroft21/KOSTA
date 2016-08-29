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
		
		System.out.println("\t\t>>> 회원정보 << \n");
		System.out.println("이름 \t 아읻\t비밀번호\t성별\t나이\t전화번호");
		System.out.println(name+"\t"+id+"\t"+pwd+"\t"+gender+"\t"+age+"\t"+phone);
		
		
	}catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
}
}
