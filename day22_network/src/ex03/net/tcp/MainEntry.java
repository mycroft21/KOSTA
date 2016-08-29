package ex03.net.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generaoted method stub
		String host = "221.141.152.1";//127.0.0.1
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for(InetAddress item : address){
				System.out.println(item.getCanonicalHostName());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
