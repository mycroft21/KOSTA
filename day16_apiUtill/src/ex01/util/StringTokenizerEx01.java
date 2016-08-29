package ex01.util;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("김연아/박찬호/박정희/전두환/노태우/김영삼","/");//토큰에다 구분자를 넣을 수 도 있지!
		
		while(token.hasMoreElements()){//다음 요소가 있으면 찍어라
			System.out.println(token.nextToken());//디폴트는 스페이스 바! 
			
		}

	}

}
