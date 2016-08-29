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
		list.remove("k");//데이터 이름 가능
		System.out.println(list);
		list.remove(2);//데이터 번호
		System.out.println(list);
		list.removeFirst();//첫번째 제거
		System.out.println(list);
		list.removeLast();//마지막 제거
		System.out.println(list);
		list.set(2,"a");//해당한 인덱스 번호를 교체
		System.out.println(list);
		list.set(3,list.get(1)+"change");// 3번째 자료에 첫번째것을 꺼내서 체인지를 붙여서 교체
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
