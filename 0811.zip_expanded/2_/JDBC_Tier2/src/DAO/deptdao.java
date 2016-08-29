//DAO 단에서  작업은 CRUD 작업
//deptdao 안에서 method 단위로  CRUD 처리
//DAO 패키지 안에 클래스는 직접적인 DB 작업하는 클래스들

package DAO;

import DBCONN.UTIL.*; //DB연결 , DB연결 해제 클래스들 사용
import DTO.dept; // DB에서 select한 결과를  dept 객체에 담기 위해서

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//util 클래스들
import java.util.ArrayList; //여러건의 데이터를 담기 위해서


public class deptdao {
	 Connection conn = null;
	 public deptdao() throws SQLException{
		 conn = ConnectionSingletonHeler.getConnection("oracle");
	 }  
	 public void dbClose() throws SQLException{
		 ConnectionSingletonHeler.close();
	 }
	//CRUD 관련되 method 설계
	//고민 : 접근자 ,  static , return 처리 , parameter 처리 
	public ArrayList<dept> getDeptList() throws SQLException{
		//DB연결 -> select ~ -> 객체담고 -> return
		ArrayList<dept> depts = new ArrayList<dept>();
		
	
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
		
			 System.out.println( "one : " + conn.isClosed());
			 System.out.println( "one : " + conn.toString());
		
			 stmt = conn.createStatement();
			 String sql = "select deptno, dname, loc from dept order by deptno asc";
			
			 rs = stmt.executeQuery(sql);
			 /*
			 dept d = new dept();
			 d.setDeptno(1000);
			 d.setDname("IT");
			 d.setLoc("seoul");
			 
			 depts.add(d);
			 */
			 while(rs.next()){
				 dept data = new dept();
				 data.setDeptno(rs.getInt(1));
				 data.setDname(rs.getString(2));
				 data.setLoc(rs.getString(3));
				 depts.add(data);
			 }
			 
			 
		}catch(Exception e){
				e.printStackTrace();
		}finally{
			ConnectionCloseHelper.close(stmt);
			ConnectionCloseHelper.close(rs);
			//ConnectionCloseHelper.close(conn);
		}
		return depts;
	}
	
	//한건의 row를 처리하는 method
	//Read (where 조건절의 값은 key 컬럼으로 유일행 보장하기 위해서)
	public dept getDeptListByDeptno(int deptno){

		dept singledept=null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			
			 System.out.println( "two : " + conn.isClosed());
			 System.out.println( "two : " + conn.toString());
			 
			 String sql = "select deptno, dname, loc from dept where deptno=?";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, deptno);
		
			 rs = pstmt.executeQuery();
			 while(rs.next()){
				 singledept = new dept();
				 singledept.setDeptno(rs.getInt(1));
				 singledept.setDname(rs.getString(2));
				 singledept.setLoc(rs.getString(3));
				
			 }
			 
		}catch(Exception e){
				e.printStackTrace();
		}finally{
		
				ConnectionCloseHelper.close(pstmt);
				ConnectionCloseHelper.close(rs);
				//ConnectionCloseHelper.close(conn);
		}
		return singledept;
		
	}
	
}
