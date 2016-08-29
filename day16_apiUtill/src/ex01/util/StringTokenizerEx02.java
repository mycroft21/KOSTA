package ex01.util;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("사과=1이초콜릿=3|샴페인=1", "=|",true);//true 구분자 사용
		
		while(st.hasMoreElements()){//다음 요소가 있으면 찍어라
			//System.out.println(st.nextToken());//디폴트는 스페이스 바! 
			
			if(st.equals("="))System.out.print("\t");
			else if(st.equals("|"))System.out.println("\n");
			else System.out.print(st.nextToken());
			
		}
	}

}
