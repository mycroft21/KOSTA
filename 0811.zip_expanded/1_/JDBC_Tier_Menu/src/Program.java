import java.util.ArrayList;
import java.util.Scanner;

import dao.DepartmentData;
import dto.Department;

public class Program {
	public static void main(String[] args) {
	//Menu 구성
	//CRUD 담당하는 클래스 data생성
	DepartmentData data = new DepartmentData();	
	while(true)
	{
		String selection = menu();
		switch (selection) 
		{
			case "1": //목록
				ArrayList<Department> departments=
				data.getDepartmentList();
				for(Department department :departments )
				{
					System.out.println(department.toString());
				}
			break;
			
			case "2": //등록
				Department dept = new Department();
				inputDepartment(dept,false); //부서코드 , 부서명 입력 
				data.insertDepartment(dept);
			break;
			
			case "3": //변경
				System.out.print("변경할 부서명 :");
				String deptName2 = scanner.nextLine();
				ArrayList<Department> departments3 = 
				data.getDepartmentByName(deptName2);//부서명 like 검색
				if(departments3.size() > 0)
				{
					for(int i =0 ; i <departments3.size() ; i++ )
					{
						System.out.println(departments3.get(i).toString());
					}
					System.out.println("[부서 변경 정보 입력]");
					Department toUpdate = new Department();
					inputDepartment(toUpdate, false);
					data.updateDepartment(toUpdate);
				}else{
					System.out.println("검색 실패");
				}
			break;
			
			case "4": //삭제
				System.out.print("삭제할 부서명 :");
				String deptName5 = scanner.nextLine();
				ArrayList<Department> departments4 = 
				data.getDepartmentByName(deptName5);//부서명 like 검색
				if(departments4.size() > 0)
				{
					for(int i =0 ; i <departments4.size() ; i++ )
					{
						System.out.println(departments4.get(i).toString());
					}
					System.out.println("삭제할 부서 코드 : ");
					String deptCode = scanner.nextLine();
					data.deleteDepartment(Integer.parseInt(deptCode));
									
				}else{
					System.out.println("검색 실패");
				}
			break;
			
			case "5": //검색
				System.out.print("검색할 부서명 :");
				String deptname = scanner.nextLine();
				ArrayList<Department> departments2 = 
						data.getDepartmentByName(deptname);//부서명 like 검색
				if(departments2.size() > 0)
				{
					for(int i =0 ; i <departments2.size() ; i++ )
					{
						System.out.println(departments2.get(i).toString());
					}
				}else
				{
					System.out.println("검색 실패");
				}
			break;
			
			case "6": //종료
			      System.out.println("프로그램 종료");
			      return;
			
		}
	}
		
	}
	//화면 출력 Munu
	private static Scanner scanner = new Scanner(System.in);
	private static String menu()
	{
		System.out.println("*******************");
		System.out.println("*1.부서목록");
		System.out.println("*2.부서등록");
		System.out.println("*3.부서변경");
		System.out.println("*4.부서삭제");
		System.out.println("*5.부서검색");
		System.out.println("*6.종료");
		System.out.println("*******************");
		System.out.print("작업 선택:");
		return scanner.nextLine();
	}
	private static void inputDepartment(Department department , boolean update)
	{
		if(!update){
			System.out.print("부서코드 :");
			department.setDeptNo(Integer.parseInt(scanner.nextLine()));
		}
		System.out.print("부서이름 :");
		department.setDeptName(scanner.nextLine());
	}

}












