package ex04.thread;

public class UserThread extends Thread {
	String name;

	public UserThread(String name) {//생성자 함수

		this.name = name;
	}

	public void run() {//스레드 실행부 구현부
		System.out.println(name);
	try{	for(int i = 1; i <=10; i++){
			if(i==7){
				sleep(1000);
				System.out.println(name);
			}//if end
			System.out.println(i);
		}}catch(Exception e){
			e.getLocalizedMessage();
		}
	}

}
