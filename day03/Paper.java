import java.util.*;
class Paper
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
    
	System.out.println("이름을 입력하세요  ");
	 
	 String name = sc.next();

	System.out.println(name + "의 성적표를 작성합니다.");
	
	int kor = sc.nextInt();

	System.out.println("국어점수는 " + kor +"점입니다.");

		int eng = sc.nextInt();

	System.out.println("영어점수는 " + eng +"점입니다.");

		int com = sc.nextInt();

	System.out.println("전산점수는 " + com +"점입니다.");

float ave = (kor + eng + com)/3f;

		System.out.printf("총점은 " + (kor + eng + com) + "이고 평균은 " + "%.2f 입니다.", ave );




	}
}
