package ex04.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTIme {

	public static void main(String[] args) {

		int port = 7000;
		try {
			System.out.println("서버 런칭 디텍티드");

			ServerSocket ss = new ServerSocket(port);
			while (true) {
				Socket client = ss.accept(); // socket2
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(new Date());
				oos.flush();
				client.close();
			

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
