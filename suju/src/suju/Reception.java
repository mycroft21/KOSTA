package suju;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Reception {

	public static HashMap<Integer, Cliunt> LIST = new HashMap<>();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		for (;;) {
			System.out.println("*****	안녕하세요! 환영합니다.	***** \n\t1.접수\n\t2.등록 업무\n\t3.취소\n\t4.종료"
					+ "\n-----------------------------------");

			int suju = new Scanner(System.in).nextInt();

			switch (suju) {
			case 1: {
					Register rr = new Register();
			}
				break;

			case 2: {
				SujuRequest sr = new SujuRequest();
			}
				break;

			case 3: {
			
				
				
			}
				break;

			case 4:
				System.exit(-1);
				break;

			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");

			}
		}

	}

}
