package day07_allay;

import java.util.Scanner;

public class Ex05_method {

	public static void plus(int x, int y) {
		System.out.println("���Լ��� ���� " + x + " + " + y + " = " + (x + y));
	}

	public static void nana() {
		int y =0;
		int x = new Scanner(System.in).nextInt();
		
		try{ do{ y = new Scanner(System.in).nextInt();
				//if(y==0) System.out.println("0���� ���� ���� �����ϴ�! �ٽ��Է��� �ּ���.");
				
		} while(y == 0);
		}catch(Exception a){
			System.out.println(a.getMessage());
		}
		
		
		
		System.out.println("���Լ��� ������ " + x + " / " + y + " = " + (x / y));
	}

	public static int gob(int x, int y) {
		System.out.println("���Լ��� ������ " + x + " * " + y + " = " + (x * y));
		return (x * y);
	}

	public static int mina(int x, int y) {
		System.out.print("���Լ��� ������ " + x + " - " + y + " = ");
		int da = (x - y);
		return da;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		plus(4, 6);
		nana();
		gob(5, 9);
		System.out.print(mina(4, 3));
	}

}