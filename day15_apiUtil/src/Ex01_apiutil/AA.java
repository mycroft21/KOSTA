package Ex01_apiutil;

class Test {
	int x;

	public Test(int x) {
		this.x = x;
	}
}

public class AA {
	public static void main(String args[]) {
		Test x1 = new Test(10);
		Test x2 = new Test(10);
		method(x1, x2);
		System.out.println(x1.x + ", " + x2.x);
	}

	public static void method(Test v1, Test v2) {
		v2.x = 20;
		v1 = v2;
		System.out.println(v1.x+v2.x);
	}
}