import java.util.*;
class Ex_04Switch
{
	public static void main(String[] args) 
	{

		System.out.print("������ �Է��Ͻʽÿ� : ");
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();

		int soc = no/10;

		if (no <=100){

		switch(soc){
			case 10 : System.out.println("A+"); break;
			case 9 : System.out.println("A"); break;
			case 8 : System.out.println("B"); break;
			case 7 : System.out.println("C"); break;
			case 6 : System.out.println("D"); break;
			case 0 : case 1 : case 2 : case 3 : case 4 : case 5 : System.out.println("F"); break;
			default: System.out.println("�߸��Է��ϼ̽��ϴ�.");}//ends
		}//end if
		else{ System.out.println("�߸��Է��ϼ̽��ϴ�.");}






	}//endm
}//endc
