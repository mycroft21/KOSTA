import java.util.*;

class ExceptionTest{

	public static void main(String[] args) 
	{

		try{
			
		int x = new Scanner(System.in).nextInt();

		int y = new Scanner(System.in).nextInt();


		int resutl = x/y;
			System.out.println(resutl);
		}catch(ArithmeticException e)
		{//1.����� �޽��� System.out.println("������ ������ �����ϴ�." + e.getMessage());
			
			//2. Ŭ�����̿� (2)
			e.printStackTrace();
			
			
		} catch(Exception e) {
			System.out.println("������ ������ �����ϴ�." + e.getMessage());
			
		}finally{
			System.out.println("������ ���صſ�");
			//fiel, database, io,.... ��ó���Ŀ��� �ݾ��ֱ� ����

		}		//tryend

		

	}
}
/*
		int x = new Scanner(System.in).nextInt();

		int y = new Scanner(System.in).nextInt();

			if (y == 0)
			{System.out.println("������ ������ �����ϴ�.");
				System.exit(0);
			}

		int resutl = x/y; */