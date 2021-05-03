package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import DaoVo.StudentVO;

public class StudentDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	StudentVO vo = null;
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

	// �л� �α���
	public StudentVO StudentLogin(String id, String pw) {
		try {
			getcon();

			sql = "select * from student where stu_id = ? and stu_pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String getid = rs.getString(1);
				String getpw = rs.getString(2);

				vo = new StudentVO(getid, getpw);
			}
		} catch (Exception e) {
			System.out.println("try���� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}

		return vo;

	}

	// �л� ����
	public StudentVO StudentUpdate(String getid) {

		try {
			getcon();
			sql = "select * from Student where stu_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, getid);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String pw = rs.getString(3);
				String birth = rs.getString(4);
				String tel = rs.getString(5);
				String address = rs.getString(6);
				String email = rs.getString(7);

				vo = new StudentVO(id, name, pw, birth, tel, address, email);
			}

		} catch (Exception e) {
			System.out.println("try���� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		return vo;

	}

	

}