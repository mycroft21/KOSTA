package ex04.thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("���� ������ id: " +id);
		System.out.println("���� ������ name: " +name);
		System.out.println("���� ������ priority: " +priority);
		System.out.println("���� ������ state: " +state);
	
		}

}
