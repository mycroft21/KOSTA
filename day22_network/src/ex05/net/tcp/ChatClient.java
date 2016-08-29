package ex05.net.tcp;
import java.io.*;
import java.net.*;

public class ChatClient {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ps.print("������ ���� ip ===>  " );
		ip = br.readLine();  //����ó��
		ps.print("������ �޼��� ===>  " );
		str = br.readLine();
		
		byte[] buffer = str.getBytes("euc-kr");
		String msg = new String(buffer, "euc-kr");
		
		Socket  client = new Socket(ip, port);
		OutputStream  os = client.getOutputStream();
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(os));
		
		bw.write(str, 0, msg.length());
		bw.flush();
		
		bw.close();
		client.close();
		ps.print(ip + " �� �޼��� ���� ����!!!");
		ps.close();
	}
}








