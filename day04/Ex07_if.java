import java.util.*;
class Ex07_if
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

	int a = 0;
	int b = 0;
	int c = 0;

	System.out.println("���� ������ �Է����ּ���");

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

			if (x > y && x > z)
		{a = x;
		if ( y > z){ b = y; c = z;}
		else if (z > y){ b = z; c = y;}	} // x�� �ְ�
			else if ( y > z && y > x){ 
			if ( x > z)	{ b = x; c = z;}
			else if (z > x){ b = z; c = x;} a = y;}// y�� �ְ�
		else if ( z > x && z > y)
		{if (x > y){ b = x; c = y;}
		else if (y > x){ b = y; c = x;} a = z; }// z�� �ְ�
			else { System.out.println("�����߿� ���� ���� �ְų� �߸� �Է��ϼ̽��ϴ�."); a = z;}

			System.out.println("���� ������� �����մϴ�.");
			System.out.println(a + " " + b + " " + c);

}//endm
}//endc