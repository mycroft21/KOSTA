package Eex01.staticMember;



class Atm{
	int count;//instance member object needed
	static int total;//static
	
	public Atm(int amount){
		count += amount;
	total += amount;
	}
	
	public void disp(){
		System.out.println("count = " + count +"\ntotal = "+ total);
	}
	
	public static void main(String[] args) {
		
	}
	
}//atm end

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Atm.total);
		
		Atm atm = new Atm(1800);
		
		System.out.println(atm.count);
		atm.disp();
		
		System.out.println("-============================-");
		
		Atm at2 = new Atm(1000);
		at2.disp();
System.out.println("-============================-");
		
		Atm at3 = new Atm(2000);
		at2.disp();
		
		
		
	}//endm

}//endc
