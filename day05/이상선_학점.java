import java.util.*;

class Score2_Switch
{
public static void main(String[] args){

	System.out.println("�̸��� �Է��� �ּ���.");

		char grade = 'x';
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int kor, eng, art, exe, total=0;

	System.out.println("����, ����, �̼�, ü�� ������ ������� �Է����ּ���");

		kor = sc.nextInt();
		eng = sc.nextInt();
		art = sc.nextInt();
		exe = sc.nextInt();
		total = kor + eng + art + exe;

	double avg = total/ 4.;


	switch(total/40){//�������� �������� �ü� �ִ�.

		case 10 : grade = 'A' ; break;
		case 9: grade = 'A' ; break;
		case 8: grade = 'B' ; break;
		case 7: grade = 'C' ; break;
		case 6: grade = 'D' ; break;
		case 5: case 4: case 3: case 2: case 1: case 0: grade = 'F' ; break;
		default: System.out.printf("�߸� �Է��ϼ̽��ϴ�."); System.exit(1); break;
		}//switch end


	System.out.printf(name + " �л��� ������ " + total + "���̰� ����� %.2f", avg);
	System.out.print("���̸� ������ " + grade + "�� ȹ���ϼ̽��ϴ�." +
					"\n �����ϼ̽��ϴ�! \n --------------------------------------------------");

}}//end