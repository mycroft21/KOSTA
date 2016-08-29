package bmi.trier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class BMI_Check {

	static HashMap<Integer, BMI> map = new HashMap<>();

	static int count = 1;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		BMI_Check bc = new BMI_Check();
		
		
	do{	System.out.println("1.저장 2.삭제3.출력4.저장5.로드6.종료");
		switch (Integer.parseInt(br.readLine())) {
		case 1:
			bc.enter();
			break;


		case 2:
			bc.delete();
			break;

		case 3:
			show();
			break;

		case 4:
			save();
			break;

		case 5:
			load();
			break;

		case 6:
			System.out.println("시스템을 종료합니다."); System.exit(0);
			break;
		default:
			break;
		}
	}while(true);}

	
	private static void load() throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:/BMI.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		map = (HashMap<Integer, BMI>) ois.readObject();
		fis.close();
		ois.close();
		count=map.size()+1;
	}

	private static void save() throws Exception {
		// TODO Auto-generated method stub
		File file = new File("E:/BMI.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map);
		oos.close();
		fos.close();
	}

	private static void show() {
		// TODO Auto-generated method stub
		for(int i =1; i <= map.size(); i++){
		System.out.println(map.get(i));
	}}

	private static void delete() {
		// TODO Auto-generated method stub
	do{	for(int i =1; i <= map.size(); i++){
			System.out.println(i+"."+map.get(i));	}
		System.out.println("지워야할 번호를 알려 주세요!");
		try {
			
			map.remove(Integer.parseInt(br.readLine()));
			System.out.println("삭제 성공");break;
		} catch (NumberFormatException e) {
			System.out.println("실패 했습니다. 다시시도 해주세요");
		} catch (IOException e) {
			System.out.println("실패 했습니다. 다시시도 해주세요");
		}}while(true);
	
	}

	private static void enter() throws Exception {
		// TODO Auto-generated method stub
			BMI bmi = new BMI();
			map.put(count, bmi.input(bmi));
			count++;
	}

}
