package ex02.net.udp;

import java.io.*;
import java.net.*;


public class DatagramClient {
	
	private final static int PACKSIZE=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2){System.out.println("using:Datagramserver host, port");
		return;}
		
		DatagramSocket ds = null;
		try { InetAddress host = InetAddress.getByName(args[0]);
		int port = Integer.parseInt(args[1]);
		
		ds = new DatagramSocket();
			byte[] data = "hello sever kosta UDP test hello hi ¾È³ç?".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, host, port);
			
			ds.send(dp);
			ds.setSoTimeout(2000);
			dp.setData(new byte[PACKSIZE]);
			System.out.println(new String(dp.getData()));
		
			
			
		} catch (Exception e) {
		System.out.println(e);		}finally{
			if(ds !=null) ds.close();
		}
		

	}

}
