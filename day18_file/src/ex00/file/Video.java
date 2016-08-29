package ex00.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Video {

	ArrayList al = new ArrayList<>();
	String title = null;
	int x = 0, y = 0;
	String temp = null;
	HashMap<String, String> jang = new HashMap<>();
	HashMap<String, String> name = new HashMap<>();
	HashMap<String, Date> date = new HashMap<>();
	HashMap<String, String> lend = new HashMap<>();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Video() throws Exception {

		do {
			System.out.println("�޴��� �ٸ��� �Է��Ͻø� ����˴ϴ�.");
			System.out.println("1. �ڷ� �Է�\n2. �ڷ� ����\n3. �뿩����\n4. ��¼���\n5. ���� ����");
			x = Integer.parseInt(br.readLine());

			switch (x) {
			case 1:
				enter();

				break;
			case 2:
				remove();
				break;

			case 3:
				lendv();
				break;

			case 4:
				show();
				break;

			case 5:
				del();
				break;
			default:
				x = 0;

			}

		} while (x != 0);

	}

	private void del() throws Exception {
		System.out.println(al);
		System.out.println("������ ������ �Է��ϼ���");
		title = br.readLine().trim();
		al.remove(title);
		jang.remove(title);
		name.remove(title);
		lend.remove(title);

	}

	private void show() {
		// TODO Auto-generated method stub
		System.out.println("����\t�帣\t�뿩��\t�뿩����");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + "\t" + jang.get(al.get(i)) + "\t" + name.get(al.get(i)) + "\t"
					+ lend.get(al.get(i)) + "\n");
		}
	}

	private void lendv() throws Exception {
		System.out.println(al);
		System.out.println("������ ������ �Է��ϼ���");
		title = br.readLine().trim();

		System.out.println("�����ٱ�� �����?");

		lend.remove(title);
		lend.put(title, br.readLine());

	}

	private void enter() throws Exception {

		up: do {
			System.out.println("������ �Է��� �ּ���! X�� �Է��ϸ� �Է��� ���� �˴ϴ�.");
			title = br.readLine().trim();

			if (title.equals("X"))
				break up;
			System.out.println(title + "�� �帣�� �Է� �޽��ϴ�.");

			jang.put(title, br.readLine());
			name.put(title, null);
			date.put(title, null);
			lend.put(title, "no");
			al.add(title);
		} while (true);
	}

	private void remove() throws Exception {
		do {
			System.out.println("������ ����Դϴ�.");
			System.out.println(al);

			System.out.println("������ �Է��� �ּ���!");
			this.title = br.readLine().trim();
			if (al.contains(title)) {
				System.out.println("������ �и��� ������ �ּ���!");
				System.out.println("1.���� 2.�帣 3.�̸�  4.�뿩����");
				x = Integer.parseInt(br.readLine());
				switch (x) {
				case 1:
					for (int i = 0; i < al.size(); i++) {
						if (title.equals(al.get(i)))
							y = i;
						break;
					}
					al.set(y, br.readLine());

					
					temp = jang.get(title);
					jang.remove(title);
					jang.put((String) al.get(y), temp);

					temp = name.get(title);
					name.remove(title);
					name.put((String) al.get(y), temp);
					name.remove(title);

					temp = lend.get(title);
					lend.put((String) al.get(y), temp);
					lend.remove(title);
					lend.put((String) al.get(y), temp);

					break;

				case 2:
					jang.remove(title);
					jang.put(title, br.readLine());

					break;

				case 3:
					name.remove(title);
					name.put(title, br.readLine());
					break;

				case 4:
					lend.remove(title);
					lend.put(title, br.readLine());
					break;

				default:
					x = 0;
				}

			}
		} while (x != 0);
	}

}