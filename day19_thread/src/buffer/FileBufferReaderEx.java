package buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileBufferReaderEx {
public static void main(String[] args) throws Exception{
	int i =0;
	String file;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print (" �о�� ���ϸ��� �Է��ϼ���----->>");
	file = br.readLine();
	System.out.print (file + "������ ������.......");
	FileReader fr = new FileReader(file);
	BufferedReader reader = new BufferedReader(fr);
	
	while(( i = reader.read())!= -1){
		System.out.print((char)i +"\t");
		if(fr.equals("\n"))System.out.println();
		
	}
	fr.close();
}
}
