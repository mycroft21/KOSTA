package ex03.net.tcp;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://www.oracle.com/us/products/networking/ethernet/quad-gbe-nic/overview/index.html");
		
		System.out.println("�������� = " + url.getProtocol());
		System.out.println("ȣ��Ʈ�� ��Ʈ = " + url.getAuthority());
		System.out.println("ȣ��Ʈ = " + url.getHost());
		System.out.println("��Ʈ = " + url.getPort());
		System.out.println("��� = " + url.getPath());
		System.out.println("���� = " + url.getQuery());
		System.out.println("���ϸ� = " + url.getFile());
		System.out.println("���� = " + url.getRef());
	}
}
