package ex03.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIstEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = 0;

		ArrayList<String> name = new ArrayList<String>();

		ArrayList<Integer> math = new ArrayList<Integer>();
		ArrayList<Integer> eng = new ArrayList<Integer>();
		ArrayList<Integer> kor = new ArrayList<Integer>();
		ArrayList<Integer> sum = new ArrayList<Integer>();

		ArrayList<Integer> rank = new ArrayList<Integer>();
		ArrayList<String> grade = new ArrayList<String>();

		do {
			System.out.println("이름을 입력해 주세요!");
			name.add(sc.next());

			System.out.println("다음 이름을 입력 하시려면 1번 \n아니면 2번을 입력해주세요 ");
			x = sc.nextInt();
		} while (x == 1);

		for (int i = 0; i < name.size(); i++) {
			try {
				System.out.println(name.get(i) + "의 수학 성적을 입력 하세요!");
				math.add(sc.nextInt());
				System.out.println(name.get(i) + "의 영어 성적을 입력 하세요!");
				eng.add(sc.nextInt());
				System.out.println(name.get(i) + "의 국어 성적을 입력 하세요!");
				kor.add(sc.nextInt());
			} catch (Exception e) {
				System.out.println("잘못 입력 하셧습니다.");
				i--;
			}
		}

		for (int i = 0; i < name.size(); i++) {
			sum.add(math.get(i) + eng.get(i) + kor.get(i));
		}

		for (int i = 0; i < name.size(); i++) {
			x = 0;
			for (int j = 0; j < name.size(); j++) {
				if (sum.get(i) < sum.get(j))
					x++;
			}
			rank.add(x + 1);
		}
		System.out.println("================================================================");
		System.out.println("성적푶를 출력합니다.");
		System.out.println("================================================================");
		System.out.println("이름\t수학\t영어\t국어\t총점\t등수");

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i) + "\t" + math.get(i) + "\t" + eng.get(i) + "\t" + kor.get(i) + "\t"
					+ sum.get(i) + "\t" + rank.get(i));
		}
		System.out.println("================================================================");

	}

}
