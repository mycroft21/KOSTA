package ex01.file;

import java.io.File;
import java.util.Date;

public class FIleInfo {

	public static void main(String[] args) throws Exception {
		File file = null;
		
		byte[] fileName= new byte[100];
		String strName;
		System.out.print("file name = ");//����� test.txt
										//���� ��� E:\WorkSpace\day18_file\test.txt
		System.in.read(fileName); //IOException ó���Ұ�
		strName = new String(fileName).trim();
		file = new File(strName);
		
		/*System.out.println(file.getName());//
		*/
		System.out.println("���� ��� :" + file.getAbsolutePath());

		System.out.println("ǥ�� ��� :" + file.getCanonicalPath());

		System.out.println("�������� :" + new Date(file.lastModified()));

		System.out.println("����ũ�� :" + file.length() + "KB");

		System.out.println("�б� �Ӽ� :" + file.canRead());

		System.out.println("���� �Ӽ� :" + file.canWrite());

		System.out.println("���� ��� :" + file.getParent());

		System.out.println("���� �Ӽ� :" + file.isHidden());


	}

}
