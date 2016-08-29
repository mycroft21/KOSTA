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
				System.out.println(i + "번째 고객을 등록합니다. ");

				ClNum = i;
				System.out.println(i + "번 고객의 이름을 등록합니다.");
				CLname = br.readLine();
				System.out.println(i + "번 고객의 주소를 등록합니다.");
				Ad = br.readLine();
				System.out.println(i + "번 고객의 연락처를 등록합니다. 숫자만 입력하세요.");
				HP = Integer.parseInt(br.readLine());
				System.out.println(i + "번 고객은 특별 회원입니까?(1.특별회원, 그외 일반회원)");
				temp = Integer.parseInt(br.readLine());
				if (temp == 1)
					sp = true;

				this.LIST.put(i, new Cliunt(ClNum, CLname, Ad, HP, sp));

				System.out.println("계속하시려면 1을 입력해주세요!");
				temp = br.read();
				if (temp != 1)
					break;
				
				savegood sg = new savegood();
				sg.savegood(LIST);

				System.out.println("\n----------------------------------------\n");
			} catch (IOException e) {

				System.out.println("입력 오류 발생 다시 입력합니다.");
				i--;
			} 
		}

	}
	
		
	
	
		
}
