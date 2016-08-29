package ex04.thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 id: " +id);
		System.out.println("현재 스레드 name: " +name);
		System.out.println("현재 스레드 priority: " +priority);
		System.out.println("현재 스레드 state: " +state);
	
		}

}
