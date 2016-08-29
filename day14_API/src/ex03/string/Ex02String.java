package ex03.string;

public class Ex02String {
	public static void main(String[] args) {
		String s1 = new String("seuol");
		String s2 = new String("seuol");
		
		if(s1 ==s2)System.out.println("s1==s2 : 0000");
		else System.out.println("s1 == s2: xxxx");
		
		if(s1.equals(s2))System.out.println("s1 ==s2 : 0000");
		else System.out.println("s1 != s2 : oooo");
		System.out.println("\n=============================================");
		
		
		String s3 = "happyvirus";
		String s4 = "happyvirus";
		
		if(s3 ==s4)System.out.println("s3==s4 : 0000");
		else System.out.println("s3 == s4: xxxx");
		
		String s5 = new String("happyvirus");
		String s6 = "happyvirus";
		
		if(s5 ==s6)System.out.println("s3==s4 : 0000");
		else System.out.println("s3 == s4: xxxx");
		
		System.out.println(s5.hashCode()+" "+ s6.hashCode());
		System.out.println(s4.hashCode()+" "+ s3.hashCode());
		s6="ddid";
		System.out.println(s6.hashCode());
		
		
	}

}
