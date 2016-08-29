package Eex01.staticMember;


class Point{ }

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt = new Point();
		System.out.println("pt info");
		System.out.println("class name "+ pt.getClass());
		System.out.println("hash code "+ pt.hashCode());
		System.out.println("object String : "+ pt.toString());
		System.out.println("object String2 : " + pt);
		System.out.println("==================================");
		System.out.println(Integer.parseInt("15db9742", 16));
		System.out.println();
		
		
		Point pt2 = new Point();
		System.out.println("pt info");
		System.out.println("class name "+ pt2.getClass());
		System.out.println("hash code "+ pt2.hashCode());
		System.out.println("object String : "+ pt2.toString());
		System.out.println("object String2 : " + pt2);
		System.out.println("==================================");
		System.out.println(pt.hashCode() + "," + pt2.hashCode());
		
		System.out.println("pt2.toString() : toString() ÀÇ ÀÇ¹Ì");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
	}

}
