package ex05_interface;

public interface BB extends IDraw {

	@Override
	default void draw() {
		// TODO Auto-generated method stub
	System.out.println("bbŬ�������� �������̽� idraw�� �޼ҵ带 �������̵� ����");	
	}
}
