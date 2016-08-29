package ex04.io;

import java.io.*;

public class MainEntry {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	/*	InputStream is = System.in;
	
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("input");
		
		/*String str = br.readLine();
		int num = Integer.parseInt(str);*/
		
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(num +302);
	
	}

}
