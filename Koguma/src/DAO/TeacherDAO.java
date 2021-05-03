package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import VO.TeacherVO;

public class TeacherDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	VO.TeacherVO vo = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	// ���� ���������� ���� ����� �������� ���� �״�� ����..
	
	public void getcon() {
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
	public int teacher_join(String id, String pw, String name) {
		try {
			getcon();
			sql = "insert into Teacher values(?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id); // 01�� ���� �޾ƾ���
			psmt.setString(2, pw);
			psmt.setString(3, name);

			cnt = psmt.executeUpdate(); // �� �κп��� ���� 0���� �ٲ۴�

		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace(); // ������ ���� ���� ���� �ڵ�� e�� �����
		}
		if (cnt > 0) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		return cnt;
	}


}