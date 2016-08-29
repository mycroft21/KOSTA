package Eex01.staticMember;


class Point2{
	int x,y;
}
public class EqualMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p1 = new Point2();
		Point2 p2 = new Point2();
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		if( p1 ==p2)System.out.println("aaaaaaa");
		else System.out.println("bbbbbbbbb");
		
		int x = 3, y =3;
		System.out.println("기본자료 비교");
		if( x==y)System.out.println("same");
		else System.out.println("nope");
		
		System.out.println("참조 자료형 비교");
		String str1 = new String("korea");
		String str2 = new String("korea");
		
		if(str1 == str2)System.out.println("same");
		else System.out.println("nope");
		
		System.out.println("\nequals method");
		if(str1.equals(str2)) System.out.println("smae");
		else System.out.println("npe");
	}

}
