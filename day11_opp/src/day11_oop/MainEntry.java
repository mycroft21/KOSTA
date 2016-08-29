package day11_oop;

import java.io.ObjectInputStream.GetField;
import java.util.Set;

public class MainEntry {
public static void main(String[] args) {
	
	Class_A A = new Class_A();//객체생서,메모리할당,생성자함수 자동 호출됨.
	Class_B B = new Class_B();
	System.out.println(B.b);
	System.out.println(A.y);
	System.out.println(B.c);
	
	int m = A.getx();
	System.out.println(m);
	
	A.setx(55);
	
	System.out.println(A.getx());
	
	
}
}
