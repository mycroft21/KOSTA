package day13_abstract;

//디폴트 생성자 함수 확인, api만들기
public class DefaultContrucotr {
/**
 * 
 * @param args 특별히 값을 넘기지 않음
 * @author 3 나는 이뻐요
 * @param x 합을 구할 첫번째 변수
 * @param y 합을 구할 두번째 변수
 * @param sum 두정수의 합을 리턴
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		char ch;
		String str;
		final int TEN = 10;
		
		x=7;
		y=sum(x, TEN);
		ch = '?';
		str = "hello";
		System.out.println(ch);
		System.out.println(str);
		System.out.println(TEN);
		System.out.println(y);
		
		
	}//endm

public static int sum(int x, int y) {
	// TODO Auto-generated method stub
	return x+y;
}
	

}
