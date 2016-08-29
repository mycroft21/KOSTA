package ex01.thread;

//�������
class Atm {
	private int money;

	public Atm(int money) {
		this.money = money;
	}

	// �Ա��Լ�
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + ": �Աݾ�" + amount);

	}

	// ����Լ�
	public synchronized void withdraw(int amount, String name) {
		if ((money - amount) > 0) {
			Thread.yield();
			money -= amount;
			System.out.println(name + ": ��ݾ�" + amount);
		} else {
			System.out.println("�ܾ��� �����մϴ�.");

		}
	}

	// �ܾ�Ȯ��
	public void getMoney() {
		System.out.println("\t\t�ܾ��� : " + money);
	}
}

// ����� & ������
class UserAtm extends Thread {

	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() { // ������ �����
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
		UserAtm user1 = new UserAtm(at, "������");
		UserAtm user2 = new UserAtm(at, "������");
		UserAtm user3 = new UserAtm(at, "������");
		UserAtm user4 = new UserAtm(at, "������");
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}

}
