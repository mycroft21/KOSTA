package ex02.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEx2 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		HashSet<Integer> hs2 = new HashSet<Integer>();//클래스형 자료형만 사용 가능!
		
		hs2.add(30);
		hs2.add(2);
		hs2.add(1000);
		hs2.add(20);
		hs2.add(55);
		
		hs.add("물병");
		hs.add("키보드");
		hs.add("노트북");
		hs.add("곰인형");
		hs.add("물병");
		
		System.out.println("요소 갯수" + hs.size());//중복 비허용

		Iterator it = hs.iterator();
		while(it.hasNext()){//다음 요소가 있다면
			System.out.println(it.next());//요소를 꺼내서 출력
		}
		System.out.println("==========================");
		for(String item : hs){
			System.out.println(item);
		}
		
		System.out.println("==========================");
		
		Iterator it2 = hs2.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
	
	
	
	}

}
