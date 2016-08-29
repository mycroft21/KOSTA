package ex01.mvc;

public class Util {  //�ѱ�ó��
	public static String toKor(String str) {
		try {
			byte[] b = str.getBytes("euc-kr");  // or "utf-8"
			return new String(b);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public static String toLatin(String str ) {
			try {
				byte[] b = str.getBytes();  
				return new String(b, "euc-kr");
				
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	}
}
