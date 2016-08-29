package ex01.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
	public static void main(String[] args) {
		if ( args.length != 1 ) {
			System.out.println("USAGE : java TcpMultiChatClient ��ȭ�� ");
			System.exit(0);
		} //end if
		
		try {
			String ip = "221.141.152.47";
			Socket s = new Socket(ip, 7777);
			System.out.println("������ ���� �Ǿ����ϴ�.");
			Thread sender = new Thread(new ClientSender(s, args[0]));
			Thread receiver = new Thread(new ClientRecievier(s));
			sender.start();			receiver.start();
		} catch (Exception e) {			e.printStackTrace();		}		
	} //main end
	
	static class ClientSender extends Thread {
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {   //�Ű����� 2�� �������Լ�
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {	e.printStackTrace();		}			
		}

		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				if (dos != null)
					dos.writeUTF(name);
				while (dos != null)
					dos.writeUTF("[" + name + "]" + sc.nextLine());
			} catch (Exception e) {		e.printStackTrace();  	}			
		}
	} //ClientSender end
	
	static class ClientRecievier extends Thread {
		Socket s;
		DataInputStream dis;
		
		public ClientRecievier(Socket s) { //�Ű����� 1�� �������Լ�
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {	  e.printStackTrace();	}
		}

		public void run() {
			while ( dis != null ) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) { e.printStackTrace(); }
			}// while end
		}
	} // ClientRecievier end
}
