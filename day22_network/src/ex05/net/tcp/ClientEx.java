package ex05.net.tcp;

import java.io.*;
import java.net.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedReader stin = null;
		BufferedWriter bw = null;
		Socket s = null;
		try {
			s = new Socket("localhost",9999);

			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			String outputMessage;
			while(true) {
				outputMessage = stin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}
				
				//Ű���忡�� ���� ���ڿ� ����
				bw.write("Ŭ���̾�Ʈ> "+
				outputMessage + "\n");
				bw.flush();
				
				String inputMessage = stin.readLine();
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();
			} catch (IOException e2) {
				System.out.println("������ ä�� �� ���� �߻�....");
			}
		}
	}
}
