package day07_homework;

public class Test02 {
	
	public static int root(){
		int a =0;
		out:for(a=0; a<10; a++){
			if(a*a==9){
				break out;
			}
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(root());
	}

}
