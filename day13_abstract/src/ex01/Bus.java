package ex01;

public class Bus extends Vihcle {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("부릉부릉");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("학생입니다.");
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "버스";
	}

}
