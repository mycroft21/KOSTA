package ex07_EX;

public interface Subway extends Tran {
	@Override
	default void move(int i) {
		// TODO Auto-generated method stub
		System.out.println("ÁöÇÏ¾Æ¾Ó Ã¶Ã¶Ã¶Ã¶" + accelerate * i + "¼ÓµµÀÔ´Ï´Ù.");

	}

	@Override
	default void stop(int y) {
		// TODO Auto-generated method stub
		System.out.println("¶×µû¶û ¶×µû¾Ó~ ÀÌ¹ø¿¡ ³×¸®½Ç ¿ªÀº" + accelerate * y + "¼ÓµµÀÔ´Ï´Ù.");
	}
}
