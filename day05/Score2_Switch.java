import java.util.*;

class Score2_Switch
{
public static void main(String[] args){

	System.out.println("이름을 입력해 주세요.");

		char grade = 'x';
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int kor, eng, art, exe, total=0;

	System.out.println("국어, 영어, 미술, 체육 점수를 순서대로 입력해주세요");

		kor = sc.nextInt();
		eng = sc.nextInt();
		art = sc.nextInt();
		exe = sc.nextInt();
		total = kor + eng + art + exe;

	double avg = total/ 4.;


	switch(total/40){//문자형과 정수형만 올수 있다.

		case 10 : grade = 'A' ; break;
		case 9: grade = 'A' ; break;
		case 8: grade = 'B' ; break;
		case 7: grade = 'C' ; break;
		case 6: grade = 'D' ; break;
		case 5: case 4: case 3: case 2: case 1: case 0: grade = 'F' ; break;
		default: {System.out.printf("잘못 입력하셨습니다."); System.exit(1);} break;
		}//switch end


	System.out.printf(name + " 학생의 총점은 " + total + "점이고 평균은 %.2f", avg);
	System.out.print("점이며 학점은 " + grade + "를 획득하셨습니다." +
					"\n 수고하셨습니다! \n --------------------------------------------------");

}}//end