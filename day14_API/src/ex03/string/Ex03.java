package ex03.string;

public class Ex03 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String s1 = "happyvirus";
		String s2 = "Seoul";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("eo", "KEREA"));
		System.out.println(s2);
		s2=s2.replaceAll("eo", "kera");
		System.out.println(s2.hashCode());
		s2="Seoul";
		System.out.println(s2.hashCode());
		
		s1=s1+s2;s1 = s1.concat(s2);//문자결합
		System.out.println(s1);
		
		String s3 = new String("   ab       cd       ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim();//공백제거
		System.out.println(s3.length());
		System.out.println(s3);
		
		System.out.println("\n\n");
		
		String s4 = new String("akb/dkdkb/23k55/pakrkb/003k845");
		String[] s5 = s4.split("kb");//특정 문자열을 기점으로 분리
		for(int i = 0; i < s5.length; i ++){
			System.out.println(s5[i]);
		}
		
		System.out.println("\n\n");
		String s6 = new String("010-6627-0713");
		String[] s7 = s6.split("-");//특정 문자열을 기점으로 분리
		for(int i = 0; i < s7.length; i ++){
			System.out.println(s7[i]);
		}
		
		String s8 = "1234 56789d0 sdfghj    ul;k";
		char ch = s8.charAt(1);//()의 인덱스번호를 뽑는다
		System.out.println(ch);
		
		System.out.println("시작" +s8.indexOf('d'));//시작부터 문자까지
		System.out.println("마지막"+s8.lastIndexOf('d'));
		
		s8 = s8.substring(3, 7);//3이상 7미만
		System.out.println(s8);
		
		s8 = s8.substring(1);//1번부터 끝까지
		System.out.println(s8);
		
		System.out.println("==========================");
		System.out.println("소문자"+ s2.toLowerCase());
		System.out.println("대문자"+ s1.toUpperCase());
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();//문자열을 캐릭터로 끊어서 배열
		
		for(int i =0; i<ch2.length; i++){
			System.out.print("\t"+ch2[i]);
		}

	
	}

}
