package ex03.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

// ������ �ְ� , �ߺ��� ����Ϻ�
public class VectorEx2 {

	public static void main(String[] args) {

		int i;
		Date date = new Date();
		Vector v = new Vector(3, 5);
		v.addElement("�ڹ�");
		v.addElement(new Double(10.2));
		v.addElement(date);

		v.addElement("�ڹ�");
		System.out.println("====================��ü3���߰�========");
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
		if (v.contains("�ڹ�"))
			System.out.println("�ڹ� �־�");
		else
			System.out.println("�ڹ� ����");

		System.out.println("\n10.2 �� ��ġ\t" + v.indexOf(new Double(10.2)));

		System.out.println("time : " + date);
		System.out.println();
		
		
		
		System.out.println(v.get(v.indexOf(date)));

		// data ����
		v.removeElementAt(v.lastIndexOf(date));
		
		for (int j = 0; j < v.size(); j += 3) {
			v.removeElementAt(j);
		}

		v.setElementAt("�ڹ�", 2);// 3��° ��ġ�� �߰�
		enu = v.elements();

		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}
		System.out.println("\n size : " + v.size() + " \t capacity : " + v.capacity());

		v.trimToSize();// ��������
		System.out.println("===========��������==========");

		System.out.println("\n size : " + v.size() + " \t capacity : " + v.capacity());

		v.setSize(2);// ����� 2�� ����
		System.out.println("\n ============������ 2����=============== \n");
		
		
		enu = v.elements();

		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}

		v.removeAllElements();// ��� ��� ����

		System.out.println("\n size : " + v.size() + " \t capacity : " + v.capacity());
	}

}
