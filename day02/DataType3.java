class DataType3{
	public static void main(String[] args){


		String str = "A"; // 2����Ʈ 1����Ʈ A + ��ħǥ null \0�� 1����Ʈ
		char ch = 'A'; // 1����Ʈ but �ڹٴ� �����ڵ� ��� 2����Ʈ
		char ch2 = 67; // �ƽ�Ű �ڵ�� c
		char ch3 = 'b';

		System.out.println(ch);//A
		System.out.println(str);//A
		System.out.println(ch2);
		System.out.println((int)ch3);// ascII? 65
		System.out.println(ch2 + ch3); // 
		System.out.println("_____________________________");
		for( int i = 'a'; i <= 'z'; i++){
			System.out.print((char)i + "\t");
				}//for end
	}//main


}//class