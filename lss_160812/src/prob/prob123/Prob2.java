package prob.prob123;

public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("������ ���� : " + num);
		if (primeNumber(num)) {
			System.out.println("---> �Ҽ��Դϴ�.");
		} else {
			System.out.println("---> �Ҽ��� �ƴմϴ�.");
		}
	}

	private static int generateRandom() {

		
		return (int) (Math.random()*100+1);
	}

	private static boolean primeNumber(int num) {

		for(int i =1;i <=num; i++){
			if(i!= 1 && num!=i){
			if(num%i==0){return false;}
			else{return true;}
			}
		}
		
		return false;//1�� �Ҽ��� ��� true.... ����̾ȳ�
	}
}