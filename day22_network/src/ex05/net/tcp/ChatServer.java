package ex05.net.tcp;

import java.io.*;
import java.net.*;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		ServerSocket ss = new ServerSocket(port); //server socket
		System.out.println("chat server start!!!!");
		
		while(true) {
			Socket  s = ss.accept(); // client socket
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintStream ps = new PrintStream(System.out);
			
			ps.print(s.getInetAddress().getHostAddress());
			String str = br.readLine();
			byte[] buffer = str.getBytes("euc-kr");
			String msg = new String(buffer, "euc-kr");
			ps.print("  : ���� ���� �޼��� ===> " + msg);
			
			br.close();
			s.close();
		} // while end
	}
}







