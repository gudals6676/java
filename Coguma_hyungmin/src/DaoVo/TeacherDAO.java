package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	TeacherVO vo = null;
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
	// 선생님 로그인
	public TeacherVO TeacherLogin(String id, String pw) {
		try {
			getcon();

			sql = "select * from teacher where tea_id = ? and tea_pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String getid = rs.getString(1);
				String getpw = rs.getString(2);

				vo = new TeacherVO(getid, getpw);
			}
		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}

		return vo;

	}
	public ArrayList<TeacherVO> selectClass() {
		
		ArrayList<TeacherVO> c_list = new ArrayList<TeacherVO>();
		try {
			getcon();

			sql = "select * from class";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String c_num = rs.getString(1);
				String t_id = rs.getString(2);
				String c_name = rs.getString(3);
				String c_branch = rs.getString(4);

				vo = new TeacherVO(c_num, t_id, c_name, c_branch);
				c_list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}

		return c_list;
		
	}
	
	public int deleteClass(String c_num) {
		cnt = 0;
		
		
		try {
			getcon();

			sql = "delete from class where CLASS_NUMBER = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, c_num);
			cnt = psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int insertClass(TeacherVO vo) {
		cnt = 0;
		try {
			getcon();

			sql = "insert into class values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getClass_Number());
			psmt.setString(2, vo.getC_tea_id());
			psmt.setString(3, vo.getClass_className());
			psmt.setString(4, vo.getClass_branch());
			cnt = psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;
	}
	



}
