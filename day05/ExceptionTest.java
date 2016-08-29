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
		{//1.사용자 메시지 System.out.println("영으로 나눌수 없습니다." + e.getMessage());
			
			//2. 클래스이용 (2)
			e.printStackTrace();
			
			
		} catch(Exception e) {
			System.out.println("영으로 나눌수 없습니다." + e.getMessage());
			
		}finally{
			System.out.println("무조건 실해돼요");
			//fiel, database, io,.... 일처리후에는 닫아주길 권장

		}		//tryend

		

	}
}
/*
		int x = new Scanner(System.in).nextInt();

		int y = new Scanner(System.in).nextInt();

			if (y == 0)
			{System.out.println("영으로 나눌수 없습니다.");
				System.exit(0);
			}

		int resutl = x/y; */