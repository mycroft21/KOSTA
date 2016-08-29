/*
class OperaterEx03{
	public static void main(String[] args){


//산술연산자: +-
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

System.out.println("만원 : " + man + "개" + "\n 천원 : " + chun + "개" + "\n 백원 : " + bak + "개" + "\n 십원 : " + sib + "개\n\n\n\n");

System.out.println("만원 : " + (pay/10000) + " 장");
System.out.println("천원 : " + ((pay%10000)/1000) + " 장");
System.out.println("백원 : " + ((pay%500)/100) + " 개");
System.out.println("십원 : " + ((pay%100)/10) + " 개");
System.out.println("오백원 : " + ((pay%1000)/500) + " 개");



	}//mainend



}//classend
