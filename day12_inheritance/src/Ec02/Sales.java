package Ec02;

public class Sales extends Reaular{
	int sales=0;

	public Sales(int sales) {
		
		this.sales = sales;
	}

	public Sales() {
	
		// TODO Auto-generated constructor stub
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
	@Override
	public void setTime(int time) {
		// TODO Auto-generated method stub
		super.setTime(100);
	}
		@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		super.setLevel(1);
	}
	public void incentive(){
		
	

	

		
		sales = getTime()*salery[getLevel()];
		
		System.out.println("원급은 "+ sales + "입니다.");
	}

	}

	