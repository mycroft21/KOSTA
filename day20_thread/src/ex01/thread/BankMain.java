package ex01.thread;

//은행업무
class Atm {
	private int money;

	public Atm(int money) {
		this.money = money;
	}

	// 입금함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + ": 입금액" + amount);

	}

	// 출금함수
	public synchronized void withdraw(int amount, String name) {
		if ((money - amount) > 0) {
			Thread.yield();
			money -= amount;
			System.out.println(name + ": 출금액" + amount);
		} else {
			System.out.println("잔액이 부족합니다.");

		}
	}

	// 잔액확인
	public void getMoney() {
		System.out.println("\t\t잔액은 : " + money);
	}
}

// 사용자 & 스레드
class UserAtm extends Thread {

	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() { // 스레드 실행부
		for (int i = 0; i < 2; i++) {
			try {
				sleep(100);
			} catch (Exception e) {
				e.getLocalizedMessage();
			}
			
			
			if(flag){
				obj.deposit(((int)Math.round(Math.random()*10)+5)*100, getName());
				obj.getMoney(); 
			}else{
				obj.withdraw(((int)Math.round(Math.random()*10)+2)*100, getName());
				obj.getMoney();
			}
			
			flag=true;
		}

	}

}

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "박정희");
		UserAtm user2 = new UserAtm(at, "김정희");
		UserAtm user3 = new UserAtm(at, "이정희");
		UserAtm user4 = new UserAtm(at, "남정희");
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}

}
