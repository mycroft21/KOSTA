package ex02.net.udp;

import java.io.*;
import java.net.*;


public class DatagramServer {

	private final static int PACKSIZE=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1){System.out.println("using:Datagramserver port");
		return;}
		
		
		try {
			int port = Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("the sever is ready!!!");
			
			for(;;){
				DatagramPacket dp = new DatagramPacket(new byte[PACKSIZE], PACKSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress() + "\t" + dp.getPort() + " : "+ new String(dp.getData()));
				ds.send(dp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
