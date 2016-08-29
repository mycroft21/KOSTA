package ex02.generic;

class GenericEx<T>{
	T[] v ;

	public void setV(T[] v) {	//¸â¹öÇÔ¼ö
		this.v = v;
	} 
	public void print(){
		for( T item : v){
			System.out.println(item);
		}
	}
}

public class MainEntry {
	public static void main(String[] args) {
		
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc","kbs","dirotor"};
		
		t1.setV(str);		t1.print();
		
		System.out.println("==================================");
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		
		Integer[] num ={1,2,3,4,5,66,33,4,2};
		
		t2.setV(num);		t2.print();
		
		System.out.println("==================================");
		
	}
	
}
