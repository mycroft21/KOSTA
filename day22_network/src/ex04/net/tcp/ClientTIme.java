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
			System.out.println("server 시간 측정 완료 여기는 클라이언트 !!!");
			date = (Date) ois.readObject();
			System.out.println("현재 시간은 : " + date + "데스요");
			ois.close();
			clinet.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
