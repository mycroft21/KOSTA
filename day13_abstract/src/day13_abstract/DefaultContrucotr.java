package day13_abstract;

//����Ʈ ������ �Լ� Ȯ��, api�����
public class DefaultContrucotr {
/**
 * 
 * @param args Ư���� ���� �ѱ��� ����
 * @author 3 ���� �̻���
 * @param x ���� ���� ù��° ����
 * @param y ���� ���� �ι�° ����
 * @param sum �������� ���� ����
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		char ch;
		String str;
		final int TEN = 10;
		
		x=7;
		y=sum(x, TEN);
		ch = '?';
		str = "hello";
		System.out.println(ch);
		System.out.println(str);
		System.out.println(TEN);
		System.out.println(y);
		
		
	}//endm

public static int sum(int x, int y) {
	// TODO Auto-generated method stub
	return x+y;
}
	

}
