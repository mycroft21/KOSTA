/*
class OperaterEx03{
	public static void main(String[] args){


//���������: +-
	int x = 10, y = 20;

	int got = x * y;

	System.out.println("x * y = " + (x*y));
	System.out.println("x * y = " + got);

	System.out.println("x / y = " + (x/y));
	System.out.printf("\n\n 3 + 4 * 5 = " + (3 + 4 * 5));
	System.out.println("\n\n 3 + 4 * 5 = " + ((3 + 4) * 5));

	System.out.println("\n\n 7 % 3 = " + (7%3) + "\t 7 / 3 = " + (7 / 3));
	



	}//mainend

} //classsend */

class OperaterEx03
{
	public static void main(String[] args){

int pay = 567890;

int man = pay / 10000;

int chun = pay / 1000 - (man * 10);

int bak = pay / 100 - (man * 100) - (chun * 10);

int sib = pay / 10 - (man * 1000) - (chun * 100) - ( bak * 10);

System.out.println("���� : " + man + "��" + "\n õ�� : " + chun + "��" + "\n ��� : " + bak + "��" + "\n �ʿ� : " + sib + "��\n\n\n\n");

System.out.println("���� : " + (pay/10000) + " ��");
System.out.println("õ�� : " + ((pay%10000)/1000) + " ��");
System.out.println("��� : " + ((pay%500)/100) + " ��");
System.out.println("�ʿ� : " + ((pay%100)/10) + " ��");
System.out.println("����� : " + ((pay%1000)/500) + " ��");



	}//mainend



}//classend
