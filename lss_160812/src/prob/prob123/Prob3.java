package prob.prob123;

public class Prob3 {
	public static void main(String[] args) {
		String url = "http://localhost:8080/order.do?prdId=PROD-0001&prdName=iPhone5&price=850000&maker=Apple";
		System.out.println("제품 번호 : " + getParameter(url, "prdId"));
		System.out.println("제품 이름 : " + getParameter(url, "prdName"));
		System.out.println("제품 가격 : " + getParameter(url, "price"));
		System.out.println("제조 회사 : " + getParameter(url, "maker"));
	}

	private static String getParameter(String url, String paramName) {
		String[] a = url.split("&");
		String[] b = null;
		for(int i =0; i<a.length;i++){
		
			if(a[i].contains(paramName))
			b = a[i].split("=");
		}
		return b[1];

		
	}	
}
