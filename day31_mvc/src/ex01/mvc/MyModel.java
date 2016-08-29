package ex01.mvc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {

	Object[][] data;
	String[] columnName;
	int rows, cols; // 레코드 행과 열의 개수를 저장할 변수

	@Override
	public int getColumnCount() { // 필드(열)의 개수
		return columnName.length;
	}

	@Override
	public int getRowCount() { // 레코드 개수 알아내기
		return data.length;
	}

	public void getRowCount(ResultSet rsScroll) { // user method
		try {
			rsScroll.last(); // 레코드의 마지막 행으로 커서 이동
			rows = rsScroll.getRow();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	// DB에 저장된 데이터를 채움
	public void setData(ResultSet rs) {
		try {
			ResultSetMetaData rsmd = rs.getMetaData();// 데이터에 대한 정보 얻어옴.
			cols = rsmd.getColumnCount();
			columnName = new String[cols];

			for (int i = 0; i < cols; i++) {
				columnName[i] = rsmd.getColumnName(i + 1);
			}

			data = new Object[rows][cols];
			int r = 0;
			while (rs.next()) {
				for (int i = 0; i < cols; i++) {
					if (i != 1)
						data[r][i] = rs.getObject(i + 1);// number type
					else
						data[r][i] = Util.toKor((String) rs.getObject(i + 1));// varchar2 type 한글깨짐 처리.
																				
				} // end for
				
				r++;// 증가
			} // end while
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end setData( ResultSet rs )

}
