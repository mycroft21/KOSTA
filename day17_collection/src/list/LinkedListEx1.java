package list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a");
		list.addLast("z");
		System.out.println(list);
		list.remove("k");//������ �̸� ����
		System.out.println(list);
		list.remove(2);//������ ��ȣ
		System.out.println(list);
		list.removeFirst();//ù��° ����
		System.out.println(list);
		list.removeLast();//������ ����
		System.out.println(list);
		list.set(2,"a");//�ش��� �ε��� ��ȣ�� ��ü
		System.out.println(list);
		list.set(3,list.get(1)+"change");// 3��° �ڷῡ ù��°���� ������ ü������ �ٿ��� ��ü
		System.out.println(list);
		String str1 = (String)list.peek();
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		String str2 = (String)list.poll();
		System.out.println(str2);
		System.out.println(list);
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
