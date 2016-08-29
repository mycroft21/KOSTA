package prob.prob123;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
	}

	private static String printTime(int seconds) {
		
		int h,m,s;
		
		s= seconds%60;
		m= (seconds/60)%60;
		h= seconds/60/60;
		return h+"시 "+ m +"분 "+ s+"초";
	}
}