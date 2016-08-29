import java.util.*;

class Score_Switch
{
public static void main(String[] args){

char grade;
int su = new Scanner(System.in).nextInt();

switch(su/10){//문자형과 정수형만 올수 있다.

	case 10 : grade = 'A' ; break;
		case 9: grade = 'b' ; break;
		case 8: grade = 'c' ; break;
		case 7: grade = 'd' ; break;
		case 6: grade = 'f' ; break;
		default: grade = 'x' ; break;
}//switch end

System.out.println(su + "==_>" + grade + " 입니당^^");




}//endm
}//endc
