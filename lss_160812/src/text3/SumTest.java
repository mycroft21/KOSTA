package text3;

public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 20;
		
		MaySum ms1 = new MaySum(i,j);
		MaySum ms2 = new MaySum(i,j);

		System.out.println(ms1);
		
		if(ms1.equals(ms2))
			System.out.println("ms1�� ms2�� �հ�� �����մϴ�.");
		
		
	}

}
