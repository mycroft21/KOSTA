package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest { // socket 2개 필요함
	public static void main(String[] args) {
		ServerSocket socket = null;
		Socket ClientSocket = null;
		System.out.println("sever start");
		try {
			socket = new ServerSocket(9000); // 0~~1024 포트 넘버는 약속된것임...
			ClientSocket = socket.accept(); // clinet soket, 응답대기
			InputStream input = ClientSocket.getInputStream();// read
			OutputStream ouput = ClientSocket.getOutputStream();// write

			byte[] arr = new byte[100];
			input.read(arr);
			System.out.println(new String(arr));
			String msg = "안녕 디지몬?";
			ouput.write(msg.getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ClientSocket.close();
				socket.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
