import java.util.*;
class Ex03_Switch 
{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	float kor, eng, com, ave, sco;
	kor = eng = com = ave = sco = 0;
	String reson = null;

System.out.println("국어, 영어, 전산 순으로 점수를 입력해 주십시오.");

	kor = sc.nextInt();
	eng = sc.nextInt();
	com = sc.nextInt();
	ave = (kor + eng + com)/3f;
	sco = kor + eng + com;

	if (kor < 40)
	{ System.out.print("불합격"); reson = "국어 과락";	}
	else if (eng < 40)
	{ System.out.print("불합격"); reson = "영어 과락";	}
	else if (com < 40)
	{ System.out.print("불합격"); reson = "전산 과락";	}
	else if (ave < 60)
	{ System.out.print("불합격"); reson = "평균 미달"; }
	else { System.out.print("축하 합니다. 합격");}

	System.out.printf(" 입니다. 총점은 " + sco + " 평균은 %.2f 입니다.", + ave);
		System.out.println("불합격일시 사유는 " + reson + "입니다.");




	}//endm
}//endc
