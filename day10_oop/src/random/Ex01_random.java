package random;

import java.lang.reflect.Array;
import java.util.Random;

public class Ex01_random {
	public static void main(String[] args) {
		Random r = new Random();
		int[] iNum = new int[6];

		for (int i = 0; i < 6; i++) {
			iNum[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (iNum[i] == iNum[j]) {
					i--;

				}
			}
		}
		
	
		for (int item : iNum) {
			System.out.println(item);
		}

	}
}
