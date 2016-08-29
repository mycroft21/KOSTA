package ex01;

public class MainEntry {

	public static void main(String[] args) {

		Vihcle[] vi = new Vihcle[4];

		vi[0] = new Subway();
		vi[1] = new Bus();
		vi[2] = new Bic();
		vi[3] = new Plain();

		for (int i = 0; i < vi.length; i++) {

			System.out.println("-----------------------------------------------\n" + vi[i].name());
			vi[i].start();
			vi[i].stop();
			System.out.println();
		}

	}
}
