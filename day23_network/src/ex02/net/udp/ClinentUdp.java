package ex02.net.udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClinentUdp {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		int port = 5000;
		String str;
		byte[] b;

		try {
			System.out.println("**#* FILE CLINET *#**");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송할 대상은 오디? (server_ip)");
			String ipAddress = br.readLine();
			System.out.println("전솔할 파일 (파일명.확장자) = ");
			String FileName = br.readLine();

			File file = new File(FileName);

			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(-1);
			}

			ds = new DatagramSocket();
			InetAddress iaddress = InetAddress.getByName(ipAddress);
			str = "start";
			b = str.getBytes();

			dp = new DatagramPacket(b, b.length, iaddress, port);
			ds.send(dp);// 송신

			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

			b = new byte[65636];
			while (true) {
				int count = dis.read(b, 0, b.length);
				if (count == -1)
					break;

				dp = new DatagramPacket(b, count, iaddress, port);
				ds.send(dp);

			} // while end
			str = "end";
			b = str.getBytes();

			dp = new DatagramPacket(b, b.length, iaddress, port);
			ds.send(dp);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			try {
				br.close();
				dis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// TODO: handle finally clause
		}

	}
}
