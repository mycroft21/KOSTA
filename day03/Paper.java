import java.util.*;
class Paper
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
    
	System.out.println("�̸��� �Է��ϼ���  ");
	 
	 String name = sc.next();

	System.out.println(name + "�� ����ǥ�� �ۼ��մϴ�.");
	
	int kor = sc.nextInt();

	System.out.println("���������� " + kor +"���Դϴ�.");

		int eng = sc.nextInt();

	System.out.println("���������� " + eng +"���Դϴ�.");

		int com = sc.nextInt();

	System.out.println("���������� " + com +"���Դϴ�.");

float ave = (kor + eng + com)/3f;

		System.out.printf("������ " + (kor + eng + com) + "�̰� ����� " + "%.2f �Դϴ�.", ave );




	}
}
