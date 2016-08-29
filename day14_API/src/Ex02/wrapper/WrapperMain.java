package Ex02.wrapper;

public class WrapperMain {
	public static void main(String[] args) {

		Integer Ix = new Integer(10);
		Integer Iy = new Integer("10");
		String su = "30";

		System.out.println(Ix.hashCode());
		System.out.println(Ix.getClass().getName() + '@' + Integer.toHexString(Ix.hashCode()));
		System.out.println(Iy.hashCode());
		System.out.println(Iy.getClass().getName() + '@' + Integer.toHexString(Iy.hashCode()));

		int x = Ix.intValue();//autoboxing, unboxing
		int y = Iy.intValue();//4.0 이하일때 ㅑㅜㅅㅍ미ㅕㄷ(0 형변환 해야 한다.
		
		System.out.println(x +", " +y);
		System.out.println(Ix + ","+Iy);
		
		int no = Integer.parseInt(su);
		int no2 = Integer.parseInt("293");
		System.out.println(no +" "+no2);
		
		System.out.println("==========================================================");
		System.out.println(x + "====>"+Integer.toBinaryString(x));
		System.out.println(x + "====>"+Integer.toHexString(x));System.out.println(x + "====>"+Integer.toOctalString(x));
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("11110111111", 2);
		
		System.out.println(e +","+f);
		System.out.println(Ix.MAX_VALUE);
		System.out.println(Ix.MIN_VALUE);
		
		Double d = new Double(345.6789);
		e =(int)d.doubleValue();
		System.out.println(e);
		System.out.println(d);
	}
}
