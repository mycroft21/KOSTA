package ex03.string;

public class MainEntry {
public static void main(String[] args) {
	
	String str = "abc";
	System.out.println(str);
	
	char[] data = {'k','b','e'};
	str  =  new String(data);
	System.out.println(str);
	System.out.println("kbs");
	
	String cde = "cdefghij";
	System.out.println("abc" + cde);
	
	String c = "abcdef".substring(2);//중간값 뽑는 함수
	System.out.println(c);
	System.out.println("cde = " + cde);
	String d = cde.substring(1, 3);// 1 이상 3미만
	System.out.println(d);
	System.out.println(c +":"+d);
}
}
