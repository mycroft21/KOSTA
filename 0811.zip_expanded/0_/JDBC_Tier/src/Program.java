import java.util.ArrayList;

import DAO.deptdao;
import DTO.dept;

//DTO (Data Transfer Object) -> 
//DAO(Data Access Object) -> CRUD


public class program {

public static void main(String[] args) {
		//DAO 
		deptdao DeptList = new deptdao();
		
		///////////////////////////Multi ROW/////////////////////////////////////////////
		ArrayList<dept> DList = null;
		
		DList = DeptList.getDeptList();
		
		if(DList != null){
				print(DList);
		}else{
			System.out.println("Data Search Fail");
		}
		////////////////////////////Single ROW///////////////////////////////////////////
		dept singledept;
		singledept = DeptList.getDeptListByDeptno(10);
		if(singledept != null){
			print(singledept);
		}else{
			System.out.println("SingleRowData Search Fail");
		}
	
		///////////////////////////////////////Insert row///////////////////////////////////////
		/*
		System.out.println("***********************Insert*********************************");
		dept d = new dept();
		d.setDeptno(80);
		d.setDname("IT");
		d.setLoc("busan");
		
		int ResultRow = DeptList.InsertDept(d);
		if(ResultRow > 0){
			System.out.println("Insert Row : " + ResultRow );
		}else{
			System.out.println("Insert Fail");
		}
	*/
	  ///////////////////////////////////////////update row /////////////////////////////////////////////

		System.out.println("***********************UPdate*********************************");
		dept UpdateData = new dept();
		UpdateData.setDeptno(80);
		UpdateData.setDname("ITupdate");
		UpdateData.setLoc("seoul");
		
	    int	UpdateResultRow = DeptList.UpdateDept(UpdateData);
		if(UpdateResultRow > 0){
			System.out.println("Update Row : " + UpdateResultRow );
		}else{
			System.out.println("Update Fail");
		}
    /////////////////////////////////////////delete row/////////////////////////////////////////////////////

	    int DeleteResultRow = DeptList.DeleteDept(80);
		if(DeleteResultRow > 0){
			System.out.println("Delete Row : " + DeleteResultRow );
		}else{
			System.out.println("Delete Fail");
		}
	
	}
	public static void print(ArrayList<dept> list){
		for(dept d : list){
			System.out.printf("[%d][%s][%s]\n", d.getDeptno() , d.getDname() , d.getLoc());
		}
	}
	public static void print(dept list){
			System.out.printf("[%d][%s][%s]\n", list.getDeptno() , list.getDname() , list.getLoc());

	}
}
