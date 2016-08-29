package day07_allay;

public class Ex02_Break {
	public static void main(String[] args) {

		/*boolean t = true;

		firts: {

			second: {
				third: {

					int k = 100;
					System.out.println("before the break");

					if (t)
						break second;
					System.out.println("this won't exersi");

				}
				System.out.println("third end out");
			}
			System.out.println("second end out");
		}
		System.out.println("first end out");
*/
		
		int count = 0;
		
		for(int i  =1; i < 101; i++){
			if(i%2 !=0){
				count++;
				continue;
			}
			
			if((count % 10)==0){System.out.println();
				System.out.print(i+"\t");
			}
		}
		
	
		
		
	}
}
