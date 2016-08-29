import java.util.*;
class Ex02_Switch
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("숫자를 입력해 주십시오 : ");

int su = sc.nextInt();

switch(su){
	case 1 : System.out.print("집"); //break;
	case 2 : System.out.print("피아노"); //break;
	case 3 : System.out.print("우산"); //break;
}//스위치 엔드

 System.out.println("상품에 당첨되셨습니다.");


}//endm
}//endc
