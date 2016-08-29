package es03_interface;

interface A {
	final int x = 99;
	
	final static int y =77;
	
	public void show();
	}
	
interface B {
	void disp();
}

interface C {
	String name = "happy";
	public void draw();
}

class Kosta implements A{//인터페이스를 구현한 클래스징

	@Override
	public void show() {
		System.out.println("interface test");
		
	}
	
}

interface D extends B{
	void view();
}
class PPoint{
	
}
class TPoint extends PPoint implements B,C{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainInerface {
public static void main(String[] args) {
	Kosta k = new Kosta();
	k.show();
	A a = new Kosta();
	a.show();
}
}
