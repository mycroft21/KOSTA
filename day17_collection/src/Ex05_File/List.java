package Ex05_File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List {

	int x = 0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public List() throws NumberFormatException, IOException {
		ArrayList al = new ArrayList();

		al.add("love");
		al.add("2");

		do {
			System.out.println(
					"�ý����� �Է��մϴ�.\n================================== \n1. �߰� \t2. ���� \t3. ���  \n================================\n+�ٸ�Ű�� �Է� �Ͻø� ����˴ϴ�.");

			x = Integer.parseInt(br.readLine());

			switch (x) {
			case 1:
				do{
				System.out.println("�ڷ㸦 �Է� �մϴ�. �ڷḦ �Է��� �ּ���.");
				x++;
				al.add(br.readLine());
				
				if(al.get(x).equals("q"))x=0;
				}while(x==0);
				System.out.println();
				break;

			case 2:
				System.out.println("�ڷ㸦 ���� �մϴ�. ���° �ڷḦ ���� �ұ��.");
				System.out.println(al);

				al.remove(Integer.parseInt(br.readLine()) - 1);
				System.out.println();
				break;

			case 3:
				System.out.println("�ڷḦ ����մϴ�.");
				System.out.println(al);
				System.out.println();
				break;

			default:
				x = 0;
				break;
			}
		} while (x != 0);
		System.out.println("�ý����� �����մϴ�.");

	}

}
