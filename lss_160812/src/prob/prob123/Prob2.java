package prob.prob123;

public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("생성된 정수 : " + num);
		if (primeNumber(num)) {
			System.out.println("---> 소수입니다.");
		} else {
			System.out.println("---> 소수가 아닙니다.");
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
		
		return false;//1이 소수일 경우 true.... 기억이안나
	}
}