package ex02_Abstract;

public abstract class Shape {//�ּҸ� ������
	public double result = 0;
	public abstract double calc(double x);//�߻�޼ҵ�
	public abstract void show(String name);
	
	public void view(){
		System.out.println("���� Ŭ���� �������ϴ�.");
	}
}
