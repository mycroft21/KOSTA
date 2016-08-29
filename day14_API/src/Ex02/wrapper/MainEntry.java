package Ex02.wrapper;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 2개 입력 요망:");
		
		int num = Integer.parseInt(args[0]);
		int su = Integer.parseInt(args[1]);
		System.out.println("\n\nhap = "+ (num + su));
		
		
		int sum =0;
		for(int i =0; i<args.length; i++){
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println("sum = " +sum);
	}

}
