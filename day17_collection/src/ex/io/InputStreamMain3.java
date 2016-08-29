package ex.io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamMain3 {

	public static void main(String[] args) throws IOException{
	System.out.println("input = ");
	int su ;
	
	while((su=System.in.read()) != -1){
		if(su==10||su==13||su==32) continue;
		if(su==113||su==81)break;
		
		char ch = (char)su;
		System.out.println(ch + "("+su+")\t");
	}
	}

}
