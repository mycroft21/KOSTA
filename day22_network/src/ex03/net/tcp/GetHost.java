package ex03.net.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress host;//127.0.0.1
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String add=br.readLine();
			host = InetAddress.getByName(add);
			
						
			System.out.println("google ȣ��Ʈ �̸� : " +host.getHostName());
			System.out.println("google ȣ��Ʈ �ּ� : " + host.getHostAddress());
			
			
			
		}catch(Exception e ){}
		
	}

}