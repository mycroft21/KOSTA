package ex02.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

public class DeptDAO { // controller

	BasicDataSource ds;

	public DeptDAO() {
		ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		ds.setUsername("system");
		ds.setPassword("1129");
		ds.setInitialSize(4);// default 8개 갯수를 조절할 수 있다.
	}// constructor end

	// DML - select
	public ArrayList<DeptDTO> select() throws Exception {
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		conn = ds.getConnection();
		String sql = "SELECT * FROM DEPT2";
		pstm = conn.prepareStatement(sql);
		rs = pstm.executeQuery();

		while (rs.next()) {
			DeptDTO dto = new DeptDTO();
			dto.setDcode(rs.getString(1));
			dto.setDname(rs.getString(2));
			dto.setPdept(rs.getString(3));
			dto.setArea(rs.getString(4));
			list.add(dto);

		}

		return list;
	}

	public void delete(String dcode) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstm = null;
	

		conn = ds.getConnection();
		String sql = "DELETE DEPT2 where dcode like '" + dcode + "'";
		pstm = conn.prepareStatement(sql);
		pstm.executeUpdate();
		System.out.println("삭제 완료!");
	}
}
