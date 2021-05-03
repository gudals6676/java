package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	StudentVO vo = null;
	ResultSet rs = null;
	ArrayList<BoardVO> al = new ArrayList<BoardVO>();
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

	public int Student_Join(String id, String pw, String name, String birthday, String tel, String address,
			String email) {
		try {
			getcon();
			// insert into Student
			// values('b1','a1','1','b123','정지윤','97/1/2','010','북구','na','0','0');
			String sql = "insert into Student values (?,'a1','0',?,?,?,?,?,?,'0','0')";

			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, birthday);
			psmt.setString(5, tel);
			psmt.setString(6, address);
			psmt.setString(7, email);

			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	// 지윤씨꺼 시작
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

	// 학생 정보 수정
	public StudentVO StudentUpdate(String id, String columns, String content) {

		try {
			getcon();
			sql = "update Student set " + columns + " =  " + content + " where stu_id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String getid = rs.getString(1);

				vo = new StudentVO(getid);
			}

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;

	}

	////////////////////////// 주현누나꺼 ----------------------------------------
	public ArrayList<StudentVO> Studentinfo(String s_id) { // String stu_id
		ArrayList<StudentVO> arr = new ArrayList<StudentVO>();

		try {
			getcon();
			sql = "select stu_id, sco_date, sco_subject, sco_score from Score where stu_id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, s_id);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌
				String id = rs.getString(1);
				String date = rs.getString(2);
				String subject = rs.getString(3);
				String score = rs.getString(4);

				vo = new StudentVO(id, date, subject, score);
				arr.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;

	}

	public int SupplementaryData(String stu_id) { // String stu_id
		try {
			getcon();
			sql = "select student.stu_name, score.sco_score from student, score where student.stu_id = score.stu_id and student.stu_id = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, stu_id); // 01의 값을 받아야함
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌
				String stu_name = rs.getString(1);
				String sco_score = rs.getString(2);
				if (Integer.parseInt(sco_score) <= 50) {
					sql = " update JDBC_member set email = ? where id = ?";

				} else {
					sql = " update JDBC_member set addr = ? where id = ?";

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;

	}

}
