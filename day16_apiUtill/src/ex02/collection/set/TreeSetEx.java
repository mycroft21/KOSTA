package ex02.collection.set;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
		}

		System.out.println(set);
	}

}
