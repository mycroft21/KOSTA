package ex01.util;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("���=1�����ݸ�=3|������=1", "=|",true);//true ������ ���
		
		while(st.hasMoreElements()){//���� ��Ұ� ������ ����
			//System.out.println(st.nextToken());//����Ʈ�� �����̽� ��! 
			
			if(st.equals("="))System.out.print("\t");
			else if(st.equals("|"))System.out.println("\n");
			else System.out.print(st.nextToken());
			
		}
	}

}
