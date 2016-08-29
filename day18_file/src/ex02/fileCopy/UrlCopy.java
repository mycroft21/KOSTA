package ex02.fileCopy;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlCopy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://icon.daumcdn.net/w/icon/1606/30/105915014.png");
	
		InputStream input = url.openStream();
		OutputStream output = new FileOutputStream("humor.jpg");
		byte[] buffer = new byte[1024];
		
		while(true){
			int data = input.read(buffer);
			if(data == -1) break;
			output.write(buffer, 0, data);
			
		}
		input.close();output.close();
	
	
	}

}
