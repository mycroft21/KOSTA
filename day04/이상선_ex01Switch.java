import java.util.*;
class Ex01_Switch
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("���ڸ� �Է��� �ֽʽÿ� : ");

int su1 = sc.nextInt();
int su2 = sc.nextInt();

System.out.println("��ȣ�� �Է��� �ֽʽÿ� : ");

String str = sc.next();

switch(str){
	case "+": System.out.println("���� �ž����ϴ�." + su1 + str + su2 + " = " + (su1 + su2) ); break;
	case "-": System.out.println("���� �ž����ϴ�." + su1 + str + su2 + " = " + (su1 - su2) ); break;
	case "*": System.out.println("���� �ž����ϴ�." + su1 + str + su2 + " = " + (su1 * su2) ); break;
	case "/": System.out.println("���� �ž����ϴ�." + su1 + str + su2 + " = " + (su1 / su2) ); break;
	default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");}



}//endm
}//endc

/*import java.util.*;
class Ex01_Switch
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("���ø� �����ϼ��� (s,d,b,j)? ");
String str = new Scanner(System.in).next();
char city = str.charAt(0);

	switch(city){
		case 's': System.out.print("����"); break;
		case 'b': System.out.print("�λ�"); break;
		case 'd': System.out.print("�뱸"); break;
		case 'j': System.out.print("����"); break;
		default : {System.out.print("�߸� �����ϼ̽��ϴ�. ó������ ���ư�����.");
					System.exit(0);	}
		}
			System.out.print("��/�� �����ϼ̽��ϴ�.");
}//endm
}//endc

import java.util.*;
class Ex01_Switch
{ public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int pint = 2;

	switch(pint){ //���� - �������Ǵ� �������� �ü� �ִ�. �Ǽ��� Ÿ���� �ȵ�
		case 1 : System.out.println("1���̳׿�"); 
		case 2 : System.out.println("2���̳׿�");
		case 3 : System.out.println("3���̳׿�"); }


}//endm
}//endc */