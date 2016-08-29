package ex07_EX;

public interface Tran {
	double accelerate = 0.1;

	void move();

	void stop(int x);

	void move(int y);

	void stop();
}
