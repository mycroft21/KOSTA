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
			OutputStream om = new FileOutputStream("e:\\memo.txt");//���� ���
			
			OutputStream os = new FileOutputStream("e:\\person.txt");
			
			System.out.println("�߸��� ���� �Է� �Ͻø� �ڵ����� ����˴ϴ�.");
			System.out.println("������ �Է����ּ���! 1. ����  2. ����");
			s = Integer.parseInt(br.readLine());

			System.out.println("�����Ը� �Է����ּ���");
			kg = Double.parseDouble(br.readLine());

			System.out.println("Ű�� �Է����ּ���");
			h = Double.parseDouble(br.readLine());
			
			if(s==1) temp = (kg/((h/100.0)*(h/100.0)));
			else if (s==2) temp = Math.round(((h)/((kg*kg)/100))*100)/100;
			else{ x=0;}
			
			
			if(temp<20) re="ü�ߺ���";
			else if (temp>=25&&temp<30) re = "��ü��";
			else if (temp<25&&temp>=20) re = "����";
			else if (temp >=30) re= "��";
			
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
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		}while(x!=0);
		
	}

}
