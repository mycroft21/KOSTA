package ex07_EX;

public interface Plain extends Tran {

	@Override
	default void move(int i) {
		// TODO Auto-generated method stub
		System.out.println("���Ͼƾ� öööö" + accelerate * i + "�ӵ��Դϴ�.");
	}

	@Override
	default void stop(int y) {
		// TODO Auto-generated method stub
		System.out.println("�׵��� �׵���~ �̹��� �׸��� ����" + accelerate * y + "�ӵ��Դϴ�.");
	}

}
