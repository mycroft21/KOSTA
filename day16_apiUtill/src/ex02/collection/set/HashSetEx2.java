package ex02.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEx2 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		HashSet<Integer> hs2 = new HashSet<Integer>();//Ŭ������ �ڷ����� ��� ����!
		
		hs2.add(30);
		hs2.add(2);
		hs2.add(1000);
		hs2.add(20);
		hs2.add(55);
		
		hs.add("����");
		hs.add("Ű����");
		hs.add("��Ʈ��");
		hs.add("������");
		hs.add("����");
		
		System.out.println("��� ����" + hs.size());//�ߺ� �����

		Iterator it = hs.iterator();
		while(it.hasNext()){//���� ��Ұ� �ִٸ�
			System.out.println(it.next());//��Ҹ� ������ ���
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
