package ex01.util;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("�迬��/����ȣ/������/����ȯ/���¿�/�迵��","/");//��ū���� �����ڸ� ���� �� �� ����!
		
		while(token.hasMoreElements()){//���� ��Ұ� ������ ����
			System.out.println(token.nextToken());//����Ʈ�� �����̽� ��! 
			
		}

	}

}
