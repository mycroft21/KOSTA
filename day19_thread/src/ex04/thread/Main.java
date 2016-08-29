package ex04.thread;

public class Main {

public static void main(String[] args) {
	
	Thread t1 = new UserThread("t1");
	Thread t2 = new UserThread("t2");
	Thread t3 = new UserThread("t3");
	
	t1.start();
	t2.start();
	t3.start();
	
	
/*	Thread t = new Thread();
	t.start();*/
	
	
	
	
	
	
}
}
