package test2;
public class SalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e [] = new Employee[4];
		
		e[0] = new Employee(1000, "�̻��", 10000, 5000);
		e[1] = new Manager(2000, "�谣��", 10000, 5000,1000);
		e[2] = new Employee(3000, "�ڱ��", 10000, 5000);
		e[3] = new Manager(4000, "���ӿ�", 10000, 5000,10000);
		
		e[1].calcpay();
		for(int i = 0; i< e.length; i++){
			e[i].calcpay();
			System.out.println(e[i].toString());
		}
	}

}