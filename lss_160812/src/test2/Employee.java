package test2;

public class Employee {

	String name;
	int id;
	int basicpay;
	int com;
	int totalpay;
	
	
	public Employee(int id, String name, int basicPay, int com) {
		
		this.id = id;
		this.name = name;
		this.basicpay = basicPay;
		this.com = com;
		
	}
	
		
	

	void calcpay(){
		totalpay = basicpay + com;
	}
	
	@Override
	public String toString() {
		
		
		return "��� "+ id+"�� "+ name+" ��  "+ totalpay+"�� �ѱ޿��� �޽��ϴ�.";
	}

}



	
	
	
	

	
	
	
	



