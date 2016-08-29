import java.util.*;
class Ex05Switch
{
	public static void main(String[] args) 
	{

		System.out.print("숫자를 입력하십시오 : ");
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();

		int soc = no%2;
		

		switch(soc){
			case 1 : System.out.println("홀수"); break;
			case 0 : System.out.println("짝수"); break;
			
			default: System.out.println("잘못입력하셨습니다.");}//ends






	}//endm
}//endc
