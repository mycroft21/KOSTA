import java.util.*;
class Ex07_if
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

	int a = 0;
	int b = 0;
	int c = 0;

	System.out.println("숫자 세개를 입력해주세요");

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

			if (x > y && x > z)
		{a = x;
		if ( y > z){ b = y; c = z;}
		else if (z > y){ b = z; c = y;}	} // x가 최고값
			else if ( y > z && y > x){ 
			if ( x > z)	{ b = x; c = z;}
			else if (z > x){ b = z; c = x;} a = y;}// y가 최고값
		else if ( z > x && z > y)
		{if (x > y){ b = x; c = y;}
		else if (y > x){ b = y; c = x;} a = z; }// z가 최고값
			else { System.out.println("숫자중에 같은 값이 있거나 잘못 입력하셨습니다."); a = z;}

			System.out.println("값을 순서대로 정렬합니다.");
			System.out.println(a + " " + b + " " + c);

}//endm
}//endc