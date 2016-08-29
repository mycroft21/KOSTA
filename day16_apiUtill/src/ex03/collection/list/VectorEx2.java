package ex03.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

// 순서가 있고 , 중복을 허용하비가
public class VectorEx2 {

	public static void main(String[] args) {

		int i;
		Date date = new Date();
		Vector v = new Vector(3, 5);
		v.addElement("자바");
		v.addElement(new Double(10.2));
		v.addElement(date);

		v.addElement("자바");
		System.out.println("====================객체3개추가========");
		System.out.println("size" + v.size() + "\t capacity" + v.capacity());

		for (int j = 0; j < 10; j++) {
			v.addElement(new Integer(j));
		}

		System.out.println("===========10===================");
		System.out.println("size" + v.size() + "\t capacity" + v.capacity());

		System.out.println("\n ===============");

		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");

		}
		System.out.println("\n\n");

		System.out.println("========objec check========");
		if (v.contains("자바"))
			System.out.println("자바 있어");
		else
			System.out.println("자바 없어");

		System.out.println("\n10.2 의 위치\t" + v.indexOf(new Double(10.2)));

		System.out.println("time : " + date);
		System.out.println();
		
		
		
		System.out.println(v.get(v.indexOf(date)));

		// data 삭제
		v.removeElementAt(v.lastIndexOf(date));
		
		for (int j = 0; j < v.size(); j += 3) {
			v.removeElementAt(j);
		}

		v.setElementAt("자바", 2);// 3번째 위치로 추가
		enu = v.elements();

		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}
		System.out.println("\n size : " + v.size() + " \t capacity : " + v.capacity());

		v.trimToSize();// 공백제거
		System.out.println("===========공백제거==========");

		System.out.println("\n size : " + v.size() + " \t capacity : " + v.capacity());

		v.setSize(2);// 사이즈를 2로 제한
		System.out.println("\n ============사이즈 2줄임=============== \n");
		
		
		enu = v.elements();

		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}

		v.removeAllElements();// 모든 요소 제거

		System.out.println("\n size : " + v.size() + " \t capacity : " + v.capacity());
	}

}
