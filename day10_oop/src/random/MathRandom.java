package random;

public class MathRandom {
public static void main(String[] args) {
	
	int[] num =new int[5];
	
	System.out.println((int)(Math.random()*5));
	System.out.println(Math.random());

	System.out.println("========================================");

	for(int i =0; i < 5; i++){
		num[i] = (int)(Math.random()*5)+1;
		System.out.println(num[i]);
	}


}
}	