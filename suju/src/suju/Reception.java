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
			System.out.println("*****	�ȳ��ϼ���! ȯ���մϴ�.	***** \n\t1.����\n\t2.��� ����\n\t3.���\n\t4.����"
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
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���");

			}
		}

	}

}
