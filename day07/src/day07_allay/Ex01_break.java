package day07_allay;

public class Ex01_break {

	public static void main(String[] args) {

		/*
		 * out:for(int i = 1; i <=10; i++){ if(i==5)break; if(i==3)continue;
		 * 
		 * for(int y =1; y <=10; y++){ if(y==2)break; //if(y==1)break out;
		 * 
		 * } System.out.println(i); }
		 */

		UP: for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					break UP;
				System.out.print(j + "\t");
			}
			System.out.println("여기는 j밖");
		}
		System.out.println("여기는 완전 밖");
	}
}
