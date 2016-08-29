package ex00.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class BMI {

	public static void main(String[] args) throws Exception {

		HashMap<Object,Object> hm = new HashMap<>();
		
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int s = 0, x=1,y=0;
		double kg = 0, h = 0;
		double temp = 0;
		ArrayList al = new ArrayList<>();
		
		String re = null;
		
		File file = new File("E:\\WorkSpace\\day18_file\\memo.txt");
		FileOutputStream fis = new FileOutputStream(file);
		DataOutputStream dis = new DataOutputStream(fis);
		
		
		do{
		try {
			OutputStream om = new FileOutputStream("e:\\memo.txt");//절대 경로
			
			OutputStream os = new FileOutputStream("e:\\person.txt");
			
			System.out.println("잘못된 값을 입력 하시면 자동으로 종료됩니다.");
			System.out.println("성별을 입력해주세요! 1. 남자  2. 여자");
			s = Integer.parseInt(br.readLine());

			System.out.println("몸무게를 입력해주세요");
			kg = Double.parseDouble(br.readLine());

			System.out.println("키를 입력해주세요");
			h = Double.parseDouble(br.readLine());
			
			if(s==1) temp = (kg/((h/100.0)*(h/100.0)));
			else if (s==2) temp = Math.round(((h)/((kg*kg)/100))*100)/100;
			else{ x=0;}
			
			
			if(temp<20) re="체중부족";
			else if (temp>=25&&temp<30) re = "과체중";
			else if (temp<25&&temp>=20) re = "정상";
			else if (temp >=30) re= "비만";
			
			System.out.println(temp);
			System.out.println(re);
			
			dis.writeDouble(s);
			dis.writeDouble(h);
			dis.writeDouble(kg);
			dis.writeUTF(re);
			dis.flush();
			om.write(re.getBytes());
			al.add(s);
			al.add(h);
			al.add(kg);
			al.add(re);
			
			hm.put(y, al);
			
			if(hm.containsKey(y)) {
				System.out.println(al.get(y));
			}
			
			
			System.out.println();
			
		} catch (Exception e) {
			x=0;
			System.out.println("잘못 입력 하셨습니다.");
		}
		}while(x!=0);
		
	}

}
