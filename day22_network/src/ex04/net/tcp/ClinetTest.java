package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

class ClinetTest {//socket 1개필요 (server ip,port)
	public static void main(String[] args) {
		
		Socket socket = null;
		try {
		
			socket = new Socket("127.0.0.1",9000);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			String str = "안녕... 아구몬";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
