package ex03.file;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataoutputStreamEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:\\memo.txt");
		FileOutputStream fis = new FileOutputStream(file);
		DataOutputStream dis = new DataOutputStream(fis);

		
		dis.writeBoolean(true);
		dis.writeChar(65);
		dis.writeShort(100);
		dis.writeInt(2002);
		dis.writeLong(300);
		dis.writeFloat(6.7f);
		dis.writeDouble(10.2345);
		dis.flush();
		
		System.out.println("ok "+dis.size()+"byte save");
		
		
		dis.close();
	}

}
