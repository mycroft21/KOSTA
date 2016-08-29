package ex04.thread;

public class ThreadEX extends Thread{
String name;
public ThreadEX(String name) {
	this.name = name;
}

@Override
public void run() {
	int i = 0;
	while(true){
		System.out.println("thread name : "+name+"\t number : " + i++);
		if(i==10)break;
	
		try {
			sleep(5);
		} catch (Exception e) {
		e.getLocalizedMessage();}
	
	
	
	}

}
public static void main(String[] args) {
	ThreadEX te = new ThreadEX("力老 臭酒");
	ThreadEX te1 = new ThreadEX("力老 撤酒");
	ThreadEX te2 = new ThreadEX("力老 焊烹");
	
	te.setPriority(Thread.MAX_PRIORITY);//10;
	te1.setPriority(Thread.NORM_PRIORITY);
	te2.setPriority(Thread.MIN_PRIORITY);
	
	te.start();
	te1.start();
	te2.start();
	
}
}
