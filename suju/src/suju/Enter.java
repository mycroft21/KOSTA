package suju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.HashMap;

public class Enter {

	public static HashMap<Integer, Cliunt> LIST = new HashMap<>();
	int ClNum, HP, temp, temp1 = 0;
	String Ad, CLname;
	boolean sp = false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Enter() throws Exception {

		for (int i = LIST.size() + 1;; i++) {

			try {
				System.out.println(i + "��° ���� ����մϴ�. ");

				ClNum = i;
				System.out.println(i + "�� ���� �̸��� ����մϴ�.");
				CLname = br.readLine();
				System.out.println(i + "�� ���� �ּҸ� ����մϴ�.");
				Ad = br.readLine();
				System.out.println(i + "�� ���� ����ó�� ����մϴ�. ���ڸ� �Է��ϼ���.");
				HP = Integer.parseInt(br.readLine());
				System.out.println(i + "�� ���� Ư�� ȸ���Դϱ�?(1.Ư��ȸ��, �׿� �Ϲ�ȸ��)");
				temp = Integer.parseInt(br.readLine());
				if (temp == 1)
					sp = true;

				this.LIST.put(i, new Cliunt(ClNum, CLname, Ad, HP, sp));

				System.out.println("����Ͻ÷��� 1�� �Է����ּ���!");
				temp = br.read();
				if (temp != 1)
					break;
				
				savegood sg = new savegood();
				sg.savegood(LIST);

				System.out.println("\n----------------------------------------\n");
			} catch (IOException e) {

				System.out.println("�Է� ���� �߻� �ٽ� �Է��մϴ�.");
				i--;
			} 
		}

	}
	
		
	
	
		
}
