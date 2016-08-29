package ex04.thread;

public class Main2 {

public static void main(String[] args) {
	
	
	Thread t1 = new Thread(new UserRunnable("t1"));
	Thread t2 = new Thread( new UserRunnable("t2"));
	Thread t3 = new Thread(new UserRunnable("t3"));
	
	t1.start();
	t2.start();
	t3.start();
	
/*	Thread t = new Thread();
	t.start();*/
	
	
	
	
	
	
}
}
