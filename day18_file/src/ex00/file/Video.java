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
			System.out.println("메뉴외 다른걸 입력하시면 종료됩니다.");
			System.out.println("1. 자료 입력\n2. 자료 수정\n3. 대여설정\n4. 출력설정\n5. 삭제 설정");
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
		System.out.println("삭제할 비디오를 입력하세요");
		title = br.readLine().trim();
		al.remove(title);
		jang.remove(title);
		name.remove(title);
		lend.remove(title);

	}

	private void show() {
		// TODO Auto-generated method stub
		System.out.println("제목\t장르\t대여자\t대여여부");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + "\t" + jang.get(al.get(i)) + "\t" + name.get(al.get(i)) + "\t"
					+ lend.get(al.get(i)) + "\n");
		}
	}

	private void lendv() throws Exception {
		System.out.println(al);
		System.out.println("빌려줄 비디오를 입력하세요");
		title = br.readLine().trim();

		System.out.println("빌려줄까요 말까요?");

		lend.remove(title);
		lend.put(title, br.readLine());

	}

	private void enter() throws Exception {

		up: do {
			System.out.println("제목을 입력해 주세요! X를 입력하면 입력이 종료 됩니다.");
			title = br.readLine().trim();

			if (title.equals("X"))
				break up;
			System.out.println(title + "의 장르를 입력 받습니다.");

			jang.put(title, br.readLine());
			name.put(title, null);
			date.put(title, null);
			lend.put(title, "no");
			al.add(title);
		} while (true);
	}

	private void remove() throws Exception {
		do {
			System.out.println("비디오의 목록입니다.");
			System.out.println(al);

			System.out.println("제목을 입력해 주세요!");
			this.title = br.readLine().trim();
			if (al.contains(title)) {
				System.out.println("수정할 학목을 선택해 주세요!");
				System.out.println("1.제목 2.장르 3.이름  4.대여여부");
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