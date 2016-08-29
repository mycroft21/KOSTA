package Ex01.collec;

public class MainEntry {
	public static void main(String[] args) {

		Strudent stu = new Strudent((int) (Math.random()*100), (int) (Math.random()*100), (int) (Math.random()*100));

		System.out.println(stu.getCom());
	}
}
