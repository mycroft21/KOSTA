import java.util.*;
class Ex05Switch
{
	public static void main(String[] args) 
	{

		System.out.print("���ڸ� �Է��Ͻʽÿ� : ");
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();

		int soc = no%2;
		

		switch(soc){
			case 1 : System.out.println("Ȧ��"); break;
			case 0 : System.out.println("¦��"); break;
			
			default: System.out.println("�߸��Է��ϼ̽��ϴ�.");}//ends






	}//endm
}//endc
