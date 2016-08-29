package ex01.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer {
	HashMap  clients;//ä�����α׷����� ����� ���� ����
	
	public TcpMultiChatServer() { //�������Լ�
		clients = new HashMap();//key, value
		Collections.synchronizedMap(clients);
	}
	
	public void start() {
		ServerSocket ss = null; //������
		Socket s = null;//Ŭ���̾�Ʈ��
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("���� ���� �Ǿ����ϴ�");//�������� �˸�
			
			while (true) {
				s = ss.accept(); //���δ��....
				System.out.println("[" + s.getInetAddress() + " :" + s.getPort() + "] ���� �����Ͽ����ϴ�");//���������ߴ���
				ServerReceiver thread = new ServerReceiver(s);  //user class
				thread.start();
			} // end while
		} catch (Exception e) {			e.printStackTrace();		}
	} //start() end
	
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while ( it.hasNext() ) {//������ �ִٸ�
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());//�������� �ٲ㼭
				dos.writeUTF(msg);//����Ʈ
			} catch (IOException e) {		e.printStackTrace();			}
		} // end while
	} // sendToAll(String msg) end
	
	class ServerReceiver extends Thread {  //inner class �����带 ���
		Socket s;
		DataInputStream dis;
		DataOutputStream dos; 
		
		public ServerReceiver(Socket s) {  //���ڰ� �ִ� �������Լ�
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
			} catch (Exception e) {	e.printStackTrace();		}
		} //constructor end
		
		public void run() {  //������ ������(�����)
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("#" + name + " ���� �����ϼ̽��ϴ�.");
				
				clients.put(name, dos);
				System.out.println("���� ���� ������ ���� : " + clients.size() + " �Դϴ�");
				
				while ( dis != null ) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {   e.printStackTrace();
			} finally {
				sendToAll("#" + name + " ���� �����̽��ϴ�.");
				clients.remove(name);//Ű������
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "] ���� ���� �����Ͽ����ϴ�." );
				System.out.println("���� ���� ������ ���� : " + clients.size() + " �Դϴ�");
			}
		} //run() end
	} //ServerReceiver class end
	
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}
