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
					"시스템을 입력합니다.\n================================== \n1. 추가 \t2. 삭제 \t3. 출력  \n================================\n+다른키를 입력 하시면 종료됩니다.");

			x = Integer.parseInt(br.readLine());

			switch (x) {
			case 1:
				do{
				System.out.println("자룔를 입력 합니다. 자료를 입력해 주세요.");
				x++;
				al.add(br.readLine());
				
				if(al.get(x).equals("q"))x=0;
				}while(x==0);
				System.out.println();
				break;

			case 2:
				System.out.println("자룔를 삭제 합니다. 몇번째 자료를 삭제 할까요.");
				System.out.println(al);

				al.remove(Integer.parseInt(br.readLine()) - 1);
				System.out.println();
				break;

			case 3:
				System.out.println("자료를 출력합니다.");
				System.out.println(al);
				System.out.println();
				break;

			default:
				x = 0;
				break;
			}
		} while (x != 0);
		System.out.println("시스템을 졸료합니다.");

	}

}
