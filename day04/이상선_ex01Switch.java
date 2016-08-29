import java.util.*;
class Ex01_Switch
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("숫자를 입력해 주십시오 : ");

int su1 = sc.nextInt();
int su2 = sc.nextInt();

System.out.println("기호를 입력해 주십시오 : ");

String str = sc.next();

switch(str){
	case "+": System.out.println("연산 돼었습니다." + su1 + str + su2 + " = " + (su1 + su2) ); break;
	case "-": System.out.println("연산 돼었습니다." + su1 + str + su2 + " = " + (su1 - su2) ); break;
	case "*": System.out.println("연산 돼었습니다." + su1 + str + su2 + " = " + (su1 * su2) ); break;
	case "/": System.out.println("연산 돼었습니다." + su1 + str + su2 + " = " + (su1 / su2) ); break;
	default : System.out.println("잘못 입력하셨습니다.");}



}//endm
}//endc

/*import java.util.*;
class Ex01_Switch
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("도시를 선택하세요 (s,d,b,j)? ");
String str = new Scanner(System.in).next();
char city = str.charAt(0);

	switch(city){
		case 's': System.out.print("서울"); break;
		case 'b': System.out.print("부산"); break;
		case 'd': System.out.print("대구"); break;
		case 'j': System.out.print("제주"); break;
		default : {System.out.print("잘못 선택하셨습니다. 처음으로 돌아가세요.");
					System.exit(0);	}
		}
			System.out.print("을/를 선택하셨습니다.");
}//endm
}//endc

import java.util.*;
class Ex01_Switch
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int pint = 2;

	switch(pint){ //조건 - 문자형또는 정수형만 올수 있다. 실수형 타입은 안됨
		case 1 : System.out.println("1점이네요"); 
		case 2 : System.out.println("2점이네요");
		case 3 : System.out.println("3점이네요"); }


}//endm
}//endc */