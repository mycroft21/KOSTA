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
		
		s1=s1+s2;s1 = s1.concat(s2);//���ڰ���
		System.out.println(s1);
		
		String s3 = new String("   ab       cd       ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim();//��������
		System.out.println(s3.length());
		System.out.println(s3);
		
		System.out.println("\n\n");
		
		String s4 = new String("akb/dkdkb/23k55/pakrkb/003k845");
		String[] s5 = s4.split("kb");//Ư�� ���ڿ��� �������� �и�
		for(int i = 0; i < s5.length; i ++){
			System.out.println(s5[i]);
		}
		
		System.out.println("\n\n");
		String s6 = new String("010-6627-0713");
		String[] s7 = s6.split("-");//Ư�� ���ڿ��� �������� �и�
		for(int i = 0; i < s7.length; i ++){
			System.out.println(s7[i]);
		}
		
		String s8 = "1234 56789d0 sdfghj    ul;k";
		char ch = s8.charAt(1);//()�� �ε�����ȣ�� �̴´�
		System.out.println(ch);
		
		System.out.println("����" +s8.indexOf('d'));//���ۺ��� ���ڱ���
		System.out.println("������"+s8.lastIndexOf('d'));
		
		s8 = s8.substring(3, 7);//3�̻� 7�̸�
		System.out.println(s8);
		
		s8 = s8.substring(1);//1������ ������
		System.out.println(s8);
		
		System.out.println("==========================");
		System.out.println("�ҹ���"+ s2.toLowerCase());
		System.out.println("�빮��"+ s1.toUpperCase());
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();//���ڿ��� ĳ���ͷ� ��� �迭
		
		for(int i =0; i<ch2.length; i++){
			System.out.print("\t"+ch2[i]);
		}

	
	}

}
