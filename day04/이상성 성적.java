import java.util.*;
class Ex03_Switch 
{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	float kor, eng, com, ave, sco;
	kor = eng = com = ave = sco = 0;
	String reson = null;

System.out.println("����, ����, ���� ������ ������ �Է��� �ֽʽÿ�.");

	kor = sc.nextInt();
	eng = sc.nextInt();
	com = sc.nextInt();
	ave = (kor + eng + com)/3f;
	sco = kor + eng + com;

	if (kor < 40)
	{ System.out.print("���հ�"); reson = "���� ����";	}
	else if (eng < 40)
	{ System.out.print("���հ�"); reson = "���� ����";	}
	else if (com < 40)
	{ System.out.print("���հ�"); reson = "���� ����";	}
	else if (ave < 60)
	{ System.out.print("���հ�"); reson = "��� �̴�"; }
	else { System.out.print("���� �մϴ�. �հ�");}

	System.out.printf(" �Դϴ�. ������ " + sco + " ����� %.2f �Դϴ�.", + ave);
		System.out.println("���հ��Ͻ� ������ " + reson + "�Դϴ�.");




	}//endm
}//endc
