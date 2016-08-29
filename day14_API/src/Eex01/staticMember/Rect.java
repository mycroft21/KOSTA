package Eex01.staticMember;


import java.lang.*;


class Tri extends Object{
	int x, y;
	
	public void disp(){
		System.out.println(x +","+y);
	}

	@Override
	public String toString() {
		return "Tri [x=" + x + ", y=" + y + "]";
	}

/*	@Override
	public String toString() {
		String str = x + "," + y;
		return str;
	}*/
}

public class Rect extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tri t = new Tri();
		t.disp();
		System.out.println("----------------------------");
		System.out.println(t);
		System.out.println(t.toString());
		
	}

}
