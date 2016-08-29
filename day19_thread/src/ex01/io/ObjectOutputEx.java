package ex01.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Grade vo = new Grade();
		vo.setSubject("미술");
		vo.setScore(70);
		
		
		/*vo.setSubject("전산");
		vo.setScore(77);*/
		
		
		System.out.println("before"+ vo);
		OutputStream os = new FileOutputStream("grade2.txt");//파일 출력 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(vo);
		
		
		InputStream stream = new FileInputStream("grade.dat");
		ObjectInputStream ois = new ObjectInputStream(stream);
		
		Grade vo2 = (Grade)ois.readObject();
		System.out.println("after"+vo2);
		ois.close();
	}

}
