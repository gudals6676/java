package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ClassDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	ClassVO vo = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	// ���� ���������� ���� ����� �������� ���� �״�� ����..

	public void getcon() { // Ŀ�غκ�
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dbid = "hr";
			String dbpw = "hr";
			conn = DriverManager.getConnection(url, dbid, dbpw);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}