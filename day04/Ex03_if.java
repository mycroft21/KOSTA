import java.util.*;
class Ex03_if{
	public static void main(String[] args){

		String op = null;
		int su1, su2, result = 0;
		Scanner sc = new Scanner(System.in);


		System.out.print("������(Operator) = ");
		op = sc.nextLine(); // ���鵵 ���� �ϰ� �ν�

		System.out.print("su1 = "); su1 = sc.nextInt();
		System.out.print("su2 = "); su2 = sc.nextInt();

		char ch = op.charAt(0); // null���ڸ� ����

		if (ch == '+')
		{ result = su1 + su2;
		} else if (ch == '-')
		{ result = su1 - su2;
		} else if (ch == '*')
		{ result = su1 * su2;
		} else if (ch == '/')
		{ result = su1 / su2;
		} else if (ch == '%')
		{ result = su1 % su2;
		} else { System.out.prinln{

		System.out.println("\n\n" + su1 + " " + op + " " + su2 + " = " + result);
	}//end main
}