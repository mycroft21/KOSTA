package ex04.net.tcp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTIme {

	public static void main(String[] args) {

		String serverIP = "221.141.152.47";
		int port = 7000;
		Date date = null;
		try {
			Socket clinet = new Socket(serverIP, port);
			InputStream is = clinet.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("server �ð� ���� �Ϸ� ����� Ŭ���̾�Ʈ !!!");
			date = (Date) ois.readObject();
			System.out.println("���� �ð��� : " + date + "������");
			ois.close();
			clinet.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
