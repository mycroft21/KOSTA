package ex02_Abstract;

public class MainAb {
public static void main(String[] args) {
	new Circle().show("�ٶ���");
	
	Shape sp = new Circle();//��ӹ��� �ڽ����δ� ������ �����ϴٿ�
	sp.show("����");
	
	Reat r = new Reat();
	r.show("����");
	
	Tri t = new Tri();
	t.show("��");

	System.out.println("========================================������ Ŭ����");
	Shape s = new Circle();//������ �ϳ��� �̸����� �ٵ�, �θ��� �߻� Ŭ������ �̿��� ��ü ����
	
	s.show("��ġ");
	s = new Reat();
	s.show("���");
	s= new Tri();
	s.show("��");
	
	System.out.println("\nqoduf------------------------------------���\n");
	Shape[] sh = new Shape[3];
	sh[1] = new Reat();
	sh[2] = new Tri();
	sh[0] = new Circle();
	
	for(int i = 0; i < 3; i++){
		sh[i].show(i+"��°");
	}
	
}
}
