package ex07_EX;

public class MainEntry {

	public static void main(String[] args) {

		BUs mt = new MultiCLass();

		Subway sb = new MultiCLass();

		Plain pl = new MultiCLass();

		sb.move(100);
		sb.stop(10);
		
		System.out.println();

		mt.move(88);
		mt.stop(7);

		System.out.println();
		
		pl.move(67);
		mt.stop(11);

	}

}
