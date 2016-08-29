package prob5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) throws Exception {
		String fileName = "E:\\WorkSpace\\lss_160812\\src\\prob5\\data.txt";
		makeVariable(fileName);
	}

	private static void makeVariable(String fileName) throws Exception {
		Scanner sc = new Scanner(new File(fileName));
		
		ArrayList<String> al = new ArrayList<>();
		
		while(sc.hasNextLine()){
			al.add(sc.nextLine());
		}
		
		for(int i = 0; i<al.size(); i++){
			System.out.println(al.get(i));
		}

	}
}
