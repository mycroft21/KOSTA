package ex02.mvc;

import java.util.ArrayList;

public class MvcMain {//view
	
	public static void main(String[] args) throws Exception {
		DeptDAO dao = new DeptDAO();
		
		ArrayList<DeptDTO> list = dao.select();
	
		for(DeptDTO dto : list){
			System.out.println(dto.dcode + "\t"+ dto.dname + "\t" + dto.pdept + "\t"+ dto.area);
		}
	
		dao.delete("200");
	
	}

}
