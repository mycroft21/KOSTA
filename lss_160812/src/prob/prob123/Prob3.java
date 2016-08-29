package prob.prob123;

public class Prob3 {
	public static void main(String[] args) {
		String url = "http://localhost:8080/order.do?prdId=PROD-0001&prdName=iPhone5&price=850000&maker=Apple";
		System.out.println("��ǰ ��ȣ : " + getParameter(url, "prdId"));
		System.out.println("��ǰ �̸� : " + getParameter(url, "prdName"));
		System.out.println("��ǰ ���� : " + getParameter(url, "price"));
		System.out.println("���� ȸ�� : " + getParameter(url, "maker"));
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