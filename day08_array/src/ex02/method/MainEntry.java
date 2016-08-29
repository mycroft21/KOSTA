package ex02.method;

public class MainEntry {

	
	public static int add(int x, int y){
		return x + y;
	}
	public static double add(double x, double y){
		return x + y;
	}
	
	public static void add(int ... su){
		int sum = 0;
		for(int o = 0; o < su.length ; o++){
			sum = su[o];
			System.out.print(su[o] + "\t" + sum);
		}
	}
	
	public static void main(String[] args) {
		add(1,23,4,5);
		int su = add(3, 5);
		System.out.println(su + add(6.5,3));
		
}
	}
	
