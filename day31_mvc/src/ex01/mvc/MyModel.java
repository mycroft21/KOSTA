package ex01.mvc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {

	Object[][] data;
	String[] columnName;
	int rows, cols; // ���ڵ� ��� ���� ������ ������ ����

	@Override
	public int getColumnCount() { // �ʵ�(��)�� ����
		return columnName.length;
	}

	@Override
	public int getRowCount() { // ���ڵ� ���� �˾Ƴ���
		return data.length;
	}

	public void getRowCount(ResultSet rsScroll) { // user method
		try {
			rsScroll.last(); // ���ڵ��� ������ ������ Ŀ�� �̵�
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

	// DB�� ����� �����͸� ä��
	public void setData(ResultSet rs) {
		try {
			ResultSetMetaData rsmd = rs.getMetaData();// �����Ϳ� ���� ���� ����.
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
						data[r][i] = Util.toKor((String) rs.getObject(i + 1));// varchar2 type �ѱ۱��� ó��.
																				
				} // end for
				
				r++;// ����
			} // end while
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end setData( ResultSet rs )

}
