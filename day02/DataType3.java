class DataType3{
	public static void main(String[] args){


		String str = "A"; // 2바이트 1바이트 A + 마침표 null \0이 1바이트
		char ch = 'A'; // 1바이트 but 자바는 유니코드 사용 2바이트
		char ch2 = 67; // 아스키 코드로 c
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