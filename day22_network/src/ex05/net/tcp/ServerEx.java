package ex05.net.tcp;

import java.io.*;
import java.net.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedReader stin = null;
		BufferedWriter bw = null;
		ServerSocket  ss = null;  //��������
		Socket  s = null; // Ŭ���̾�Ʈ ����
		System.out.println("�����......���� ������....");
		
		try {
			ss = new ServerSocket(9999);
			s = ss.accept();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// Ű����κ��� �Է� ��Ʈ��
			stin = new BufferedReader(new InputStreamReader(System.in));
			// Ŭ���̾�Ʈ���� ��� ��Ʈ��
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

			String inputMessage;
			while (true) {
				inputMessage = br.readLine();// Ŭ���̾�Ʈ���� ������ ���ڿ� ����
				// Ŭ���̾�Ʈ�� "Exit"�� ������ ���� ����

				if (inputMessage.equalsIgnoreCase("exit"))
					break;

				System.out.println(inputMessage);// Ŭ���̾�Ʈ�� ���� �޼��� ȭ�� ���

				String outputMessage = stin.readLine();// Ű���忡�� �� ���� ���ڿ� ����
				// Ű���忡�� ���� ���ڿ� ����
				bw.write("����> " + outputMessage + "\n");
				bw.flush();
			}
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e2) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ���� �߻�....");
			}
		}
	}
}
