import java.util.ArrayList;
import java.util.Scanner;

import dao.DepartmentData;
import dto.Department;

public class Program {
	public static void main(String[] args) {
	//Menu ����
	//CRUD ����ϴ� Ŭ���� data����
	DepartmentData data = new DepartmentData();	
	while(true)
	{
		String selection = menu();
		switch (selection) 
		{
			case "1": //���
				ArrayList<Department> departments=
				data.getDepartmentList();
				for(Department department :departments )
				{
					System.out.println(department.toString());
				}
			break;
			
			case "2": //���
				Department dept = new Department();
				inputDepartment(dept,false); //�μ��ڵ� , �μ��� �Է� 
				data.insertDepartment(dept);
			break;
			
			case "3": //����
				System.out.print("������ �μ��� :");
				String deptName2 = scanner.nextLine();
				ArrayList<Department> departments3 = 
				data.getDepartmentByName(deptName2);//�μ��� like �˻�
				if(departments3.size() > 0)
				{
					for(int i =0 ; i <departments3.size() ; i++ )
					{
						System.out.println(departments3.get(i).toString());
					}
					System.out.println("[�μ� ���� ���� �Է�]");
					Department toUpdate = new Department();
					inputDepartment(toUpdate, false);
					data.updateDepartment(toUpdate);
				}else{
					System.out.println("�˻� ����");
				}
			break;
			
			case "4": //����
				System.out.print("������ �μ��� :");
				String deptName5 = scanner.nextLine();
				ArrayList<Department> departments4 = 
				data.getDepartmentByName(deptName5);//�μ��� like �˻�
				if(departments4.size() > 0)
				{
					for(int i =0 ; i <departments4.size() ; i++ )
					{
						System.out.println(departments4.get(i).toString());
					}
					System.out.println("������ �μ� �ڵ� : ");
					String deptCode = scanner.nextLine();
					data.deleteDepartment(Integer.parseInt(deptCode));
									
				}else{
					System.out.println("�˻� ����");
				}
			break;
			
			case "5": //�˻�
				System.out.print("�˻��� �μ��� :");
				String deptname = scanner.nextLine();
				ArrayList<Department> departments2 = 
						data.getDepartmentByName(deptname);//�μ��� like �˻�
				if(departments2.size() > 0)
				{
					for(int i =0 ; i <departments2.size() ; i++ )
					{
						System.out.println(departments2.get(i).toString());
					}
				}else
				{
					System.out.println("�˻� ����");
				}
			break;
			
			case "6": //����
			      System.out.println("���α׷� ����");
			      return;
			
		}
	}
		
	}
	//ȭ�� ��� Munu
	private static Scanner scanner = new Scanner(System.in);
	private static String menu()
	{
		System.out.println("*******************");
		System.out.println("*1.�μ����");
		System.out.println("*2.�μ����");
		System.out.println("*3.�μ�����");
		System.out.println("*4.�μ�����");
		System.out.println("*5.�μ��˻�");
		System.out.println("*6.����");
		System.out.println("*******************");
		System.out.print("�۾� ����:");
		return scanner.nextLine();
	}
	private static void inputDepartment(Department department , boolean update)
	{
		if(!update){
			System.out.print("�μ��ڵ� :");
			department.setDeptNo(Integer.parseInt(scanner.nextLine()));
		}
		System.out.print("�μ��̸� :");
		department.setDeptName(scanner.nextLine());
	}

}












