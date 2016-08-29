import java.sql.SQLException;
import java.util.ArrayList;

import DAO.deptdao;
import DBCONN.UTIL.ConnectionSingletonHeler;
import DTO.dept;

//DTO (Data Transfer Object) -> 
//DAO(Data Access Object) -> CRUD


public class program {

	public static void main(String[] args) throws SQLException {
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
	   
	//	DeptList.dbClose();
		
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
