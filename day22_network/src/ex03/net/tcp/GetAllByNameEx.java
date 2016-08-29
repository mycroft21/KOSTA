package ex03.net.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress addr;
		addr = InetAddress.getLocalHost();
		System.out.println("로컬호스트 일므: "+addr.getHostName());
		System.out.println("로컬호스트 주소: "+ addr.getHostAddress());
		
		addr = InetAddress.getByName("www.google.com");
		System.out.println("google 호스트 이름 : " +addr.getHostName());
		System.out.println("google 호스트 주소 : " + addr.getHostAddress());
		
		byte[] address = new byte[4];
		address[0] = (byte)117; //117.52.2.25
		address[1] = (byte)52;
		address[2] = (byte)2;
		address[3] = (byte)25;

		addr = InetAddress.getByAddress(address);
		System.out.println("daum 호스트 이름 : " +addr.getHostName());
		System.out.println("daum 호스트 주소 : " + addr.getHostAddress());
		System.out.println("daum 호스트 이름 : " + addr.getCanonicalHostName());
		
		InetAddress[] arr;
		arr = InetAddress.getAllByName("www.kosta.or.kr");
		for(InetAddress kosta :arr){
			System.out.println("kosta 호스트 이름 : "+ kosta.getHostName());
			System.out.println("kosta 호스트 주소 : "+ kosta.getHostAddress());
		}
		
		
		
	}

}
