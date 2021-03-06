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
	// 설정 지역변수들 전부 여기로 꺼내놓은 배운것 그대로 썻음..
	
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

			psmt.setString(1, id); // 01의 값을 받아야함
			psmt.setString(2, pw);
			psmt.setString(3, name);

			cnt = psmt.executeUpdate(); // 이 부분에서 값을 0에서 바꾼다

		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace(); // 오류시 여기 실행 오류 코드는 e에 저장됨
		}
		if (cnt > 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		return cnt;
	}


}
