package ex03.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

class Point {

}

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("배");
		list.add("포도");
		list.add("파인애플");
		list.add("사과");

		System.out.println("용소개수 :" + list.size());

		System.out.println("=========interator method=============");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

		System.out.println("\n\n===========get method==============");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}

		
		
	}

}

/*
 * package ex03.collection.list;
 * 
 * import java.util.ArrayList;
 * 
 * class Point{
 * 
 * }
 * 
 * 
 * public class ArrayListEx1 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * ArrayList list = new ArrayList(10); list.add(new Integer(5)); list.add(new
 * Integer(8)); list.add(new Integer(4)); list.add(new Integer(1)); list.add(new
 * Integer(0)); list.add(new Integer(9)); list.add(new Integer(8)); list.add(new
 * Integer(8));
 * 
 * for(int i =0; i < list.size(); i++){ System.out.print(list.get(i) + "\t"); }
 * 
 * 
 * 
 * }
 * 
 * }
 */