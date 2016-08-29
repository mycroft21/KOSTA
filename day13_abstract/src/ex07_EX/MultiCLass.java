package ex07_EX;

public class MultiCLass implements Subway, BUs, Plain {

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop(int y) {
		// TODO Auto-generated method stub
		BUs.super.stop(y);
	}

	@Override
	public void move(int i) {
		// TODO Auto-generated method stub
		Subway.super.move(i);
	}

}
