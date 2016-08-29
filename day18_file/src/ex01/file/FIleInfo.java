package ex01.file;

import java.io.File;
import java.util.Date;

public class FIleInfo {

	public static void main(String[] args) throws Exception {
		File file = null;
		
		byte[] fileName= new byte[100];
		String strName;
		System.out.print("file name = ");//상대경로 test.txt
										//절대 경로 E:\WorkSpace\day18_file\test.txt
		System.in.read(fileName); //IOException 처리할것
		strName = new String(fileName).trim();
		file = new File(strName);
		
		/*System.out.println(file.getName());//
		*/
		System.out.println("절대 경로 :" + file.getAbsolutePath());

		System.out.println("표준 경로 :" + file.getCanonicalPath());

		System.out.println("수정일자 :" + new Date(file.lastModified()));

		System.out.println("파일크기 :" + file.length() + "KB");

		System.out.println("읽기 속성 :" + file.canRead());

		System.out.println("쓰기 속성 :" + file.canWrite());

		System.out.println("파일 경로 :" + file.getParent());

		System.out.println("숨김 속성 :" + file.isHidden());


	}

}
