package test2;

public class Manager extends Employee{

	int managerCom;
	public Manager(int id, String name, int basicPay, int com, int managerCom) {
		super(id, name, basicPay, com);
		this.managerCom=managerCom;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void calcpay() {
		// TODO Auto-generated method stub
		super.calcpay();
		super.totalpay= super.basicpay+super.com+managerCom;
	}

}
