package ex05_interface;

public interface BB extends IDraw {

	@Override
	default void draw() {
		// TODO Auto-generated method stub
	System.out.println("bb클래스에서 인터페이스 idraw의 메소드를 오버라이드 했음");	
	}
}
