package ex02.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		int num, gno, g_start, g_end, modiNum;
		num = gno = g_start = g_end = modiNum = 0;
		String gname = null;
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="system";   	String pwd = "1129";
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		
		ResultSet rs = null;
		Statement  stmt = null;
		PreparedStatement  pstmt = null;
				
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, pwd);
		conn.setAutoCommit(false);  // �ڵ� Ŀ�� ���� 
		
		stmt = conn.createStatement();
		while( true ) {
			System.out.print("���ϴ� ����� ������ �ּ���  \n");
			System.out.println("1. Gift select,  2. Gift insert,  3. Gift update,  4. Gift delete, 5. Gift rollback, 6. exit  ");
			num = sc.nextInt();
			
			switch( num ){
			// select 
			case 1 :  rs = stmt.executeQuery("SELECT * FROM GIFT");
						printdata(rs);
						break; 
			//insert
			case 2 : 
				System.out.print("gno = "); 		 	gno = sc.nextInt();
				System.out.print("gname = ");  		gname = sc.next(); 
				System.out.print("g_start = ");  		g_start = sc.nextInt();
				System.out.print("g_end = ");  			g_end = sc.nextInt();
				try {
					stmt.executeQuery("INSERT INTO GIFT VALUES(" + gno + ", '" 
												+ new String( gname.getBytes("utf-8"), "utf-8" ) + "' ," + g_start + ", " + g_end + ")");
				} catch (Exception e) {
					e.printStackTrace();
				}
				conn.commit();   //�߰� �Ϸ�....
				System.out.println(gname + " �߰� �Ǿ����ϴ�.");
				break;
				
			case 3 : 	
				rs = stmt.executeQuery("SELECT * FROM GIFT");
				printdata(rs);
				System.out.print("������ �������� gno�� �����ϼ��� :  ");
				modiNum = sc.nextInt();
				System.out.println("������ �����ʹ� ���� ? ");
				System.out.println("1. gno,  2. gname,  3. ��ǰ����");
				num = sc.nextInt();
				switch( num ){
						case 1 :
							System.out.println("���� gno : ");
							rs = stmt.executeQuery("SELECT GNO FROM GIFT WHERE GNO = " + modiNum );
							while( rs.next() ){
								System.out.println(rs.getInt(1) + " �Դϴ�.");
							} // in while end
							System.out.println("�� ������ �ٲٽðڽ��ϱ�? ");
							gno = sc.nextInt();
							
							pstmt = conn.prepareStatement("UPDATE GIFT SET GNO = ?  WHERE  GNO = " + modiNum);
							pstmt.setInt(1, gno);
							pstmt.executeUpdate();  // !!!!! 
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
							break;
							
						case 2 :
							System.out.println("���� ��ǰ �̸��� : ");
							rs = stmt.executeQuery("SELECT GNAME FROM GIFT WHERE GNO = " + modiNum );
							while( rs.next() ){
								System.out.println(rs.getString(1) + " �Դϴ�.");
							} // in while end
							System.out.println("�������� �ٲٽðڽ��ϱ�? ");
							gname = sc.next();
							
							pstmt = conn.prepareStatement("uPDATE GIFT SET GNAME = ?   WHERE  GNO = " + modiNum );
							pstmt.setString(1, gname);
							pstmt.executeUpdate();  // !!!!! 
							System.out.println("��ǰ���� ���� �Ϸ� �Ǿ����ϴ�.");
							break;
							
						case 3 :
							System.out.println("���� g_start ������?  ");
							rs = stmt.executeQuery("SELECT G_START  FROM GIFT WHERE GNO = " + modiNum );
							while( rs.next() ){
								System.out.println(rs.getInt(1) + " �Դϴ�.");
							} // in while end
							System.out.println("g_start �󸶷� �����Ͻðڽ��ϱ�? ");
							g_start  = sc.nextInt();
							
							pstmt = conn.prepareStatement("UPDATE GIFT SET G_START = ?  WHERE  GNO = " + modiNum);
							pstmt.setInt(1, g_start);
							pstmt.executeUpdate();  // !!!!! 
							System.out.println("���� ������ ���� �Ϸ� �Ǿ����ϴ�.");
							/////////////////////////////////////////////////////////////////////////////
							
							System.out.println("���� g_end ������?  ");
							rs = stmt.executeQuery("SELECT G_END  FROM GIFT WHERE GNO = " + modiNum );
							while( rs.next() ){
								System.out.println(rs.getInt(1) + " �Դϴ�.");
							} // in while end
							System.out.println("g_start �󸶷� �����Ͻðڽ��ϱ�? ");
							g_end  = sc.nextInt();
							
							pstmt = conn.prepareStatement("UPDATE GIFT SET G_END = ?  WHERE  GNO = " + modiNum);
							pstmt.setInt(1, g_end);
							pstmt.executeUpdate();  // !!!!! 
							System.out.println("�ְ� ������ ���� �Ϸ� �Ǿ����ϴ�.");
							break;
							
							default : System.out.println("�߸� �Է� �ϼ̽��ϴ�."); 
									break;
				} // update switch end
				break;
				
			case 4 :
				rs = stmt.executeQuery("SELECT * FROM GIFT");
				printdata(rs);
				System.out.print("������ ������ �̸��� �Է� �ϼ��� ");
				gname = sc.next();
				
				//stmt.executeUpdate("delete from gift where gname = '" + gname + " ' " );
				pstmt = conn.prepareStatement("DELETE FROM GIFT WHERE GNAME = ? " );
				pstmt.setString(1, gname);
				pstmt.executeUpdate();
				System.out.println( gname + " �� �ش��ϴ� ��ǰ�� ���� �Ǿ����ϴ�.");
				break;
				
			case 5 :
				conn.rollback();
				System.out.println("�ѹ� �߽��ϴ�.");
				break;
				
			case 6 :
				pstmt.close();
				stmt.close();
				conn.close();
				System.exit(0);
				break;
				
				default :
					System.out.println("�ٽ� �Է��� �ּ���");
					break;
				
			} // out switch end
			
		} // while end	
	}

	public  static void printdata(ResultSet rs) {
		 int num = 1;
		 try {
			ResultSetMetaData  rsmd = null;  //���̺��� ������ ��� �� �� �ִ� �������̽�
			// resultset�� �����͸� MetaData�� ������ �ľ��Ѵ�.
			// MetaData = �Ӽ� ���� ��� �� �� �ִ�.
			rsmd = rs.getMetaData();
			
			int colCount = rsmd.getColumnCount(); //�÷� ���� ���Ѵ�.
			
			while( rs.next() ) {
				System.out.print( num + " ��  --> ");
				num++;
				
				for (int i = 1; i <= colCount ; i++ ) {
					
					switch( rsmd.getColumnType(i) ) {  //�� Ÿ�Ժ��� ��� �Ѵ�.
							case  Types.NUMERIC :
							case  Types.INTEGER :
								System.out.print( rsmd.getColumnName(i) + " : " + rs.getInt(i) );
								// System.out.printf( " %d ",   rs.getInt(i) );  //(Object[])rs.getObject(i) );
								break;
								
							case Types.FLOAT :
								System.out.print( rsmd.getColumnName(i) + " : " + rs.getFloat(i) );
								break;
								
							case Types.DOUBLE :
								System.out.print( rsmd.getColumnName(i) + " : " + rs.getDouble(i) );
								break;
								
							case Types.CHAR :
								System.out.print( rsmd.getColumnName(i) + " : " + rs.getString(i) );
								break;
								
							case Types.DATE :
								System.out.print( rsmd.getColumnName(i) + " : " + rs.getDate(i) );
								break;
								
							default :
								//System.out.println("defult ");
								System.out.print( rsmd.getColumnName(i) + " : " + rs.getString(i) );
					} // switch end
					System.out.println();
				} // for end
				
			} //while end
			
		} catch (Exception e) {
			System.err.println("SQLException : " + e.getMessage() );
		} // try end
		 
	} // printdata method end
}
