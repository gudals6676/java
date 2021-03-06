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
	// 설정 지역변수들 전부 여기로 꺼내놓은 배운것 그대로 썻음..

	public void getcon() { // 커넥부분
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

	// 학생 로그인
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
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}

		return vo;

	}

	// 학생 정보
	public StudentVO StudentUpdate(String getid) {

		try {
			getcon();
			sql = "select * from Student where stu_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, getid);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(5);
				String pw = rs.getString(4);
				String birth = rs.getString(6);
				String tel = rs.getString(7);
				String address = rs.getString(8);
				String email = rs.getString(9);

				vo = new StudentVO(id, pw, name, birth, tel, address, email);
			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;

	}

	public int updateInfo(StudentVO update_vo) {
		
		int cnt = 0;
		System.out.println("name >>> " + update_vo.getStu_name());
		try {
			getcon();
			sql = "update student set stu_pw=?, stu_name=?, stu_birthday=?, stu_tel=?, stu_email=?, stu_address =? where stu_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, update_vo.getStu_pw());
			psmt.setString(2, update_vo.getStu_name());
			psmt.setString(3, update_vo.getStu_birthday());
			psmt.setString(4, update_vo.getStu_tel());
			psmt.setString(5, update_vo.getStu_email());
			psmt.setString(6, update_vo.getStu_address());
			psmt.setString(7, update_vo.getStu_id());

			cnt = psmt.executeUpdate();


		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		
		return cnt;
		// TODO Auto-generated method stub
		
	}

}
