package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import m.Vo;

public class DAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	Vo vo = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);

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

	public int studnet_join(String studnetnumber, String id, String pw, String name, String age, String tel,
			String address, String email, String data, String class_classNumber, String teacher_teacherNumber) {
		try {
			getcon();
			sql = "insert into Student values(?,?,?,?,?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, studnetnumber);
			psmt.setString(2, id); // 01의 값을 받아야함
			psmt.setString(3, pw);
			psmt.setString(4, name);
			psmt.setString(5, age);
			psmt.setString(6, tel);
			psmt.setString(7, address);
			psmt.setString(8, email);
			psmt.setString(9, data);
			psmt.setString(10, class_classNumber);
			psmt.setString(11, teacher_teacherNumber);
			

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

	public int socer_insert(String java, String javatest, String python, String pythontest) {
		try {
			getcon();
			sql = "insert into Socer values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, java); // 01의 값을 받아야함
			psmt.setString(2, javatest);
			psmt.setString(3, python);
			psmt.setString(4, pythontest);
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

	public int calss_insert(String classname, String startdate, String enddate, String branch) {
		try {
			getcon();
			sql = "insert into Class values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, classname); // 01의 값을 받아야함
			psmt.setString(2, startdate);
			psmt.setString(3, enddate);
			psmt.setString(4, branch);
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

	public int board_insert(String data, String time, String place, String peoplennumber, String content) {
		try {
			getcon();
			sql = "insert into Board values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, data); // 01의 값을 받아야함
			psmt.setString(2, time);
			psmt.setString(3, place);
			psmt.setString(4, peoplennumber);
			psmt.setString(4, content);
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
