package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import DaoVo.TeacherVO;


public class TeacherDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	TeacherVO vo = null;
	ResultSet rs = null;
	ArrayList<TeacherVO> vot1 = new ArrayList<TeacherVO>();
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

	// 지윤씨꺼----------------------------------------------------------
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

	// --형민꺼-------------------------------------------------------------------
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

	// 남진씨꺼 -----------------------------
	
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public ArrayList<TeacherVO> teacher_STUDENT_noselect() {// 12.2 학생 전채 조회
			//데이터베이스의 학생 전체를 불러오는 부분
		try {
			getcon();
			sql = "select * from STUDENT";

			// 01의 값을 받아야함

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) { // next 테이블에 값이 있을경우 true 반환
				String stu_id = rs.getString(1);
				String s_tea_id = rs.getString(2);
				String s_Class_number = rs.getString(3);
				String stu_pw = rs.getString(4);
				String stu_name = rs.getString(5);
				String stu_birthday = rs.getString(6);
				String stu_tel = rs.getString(7);
				String stu_address = rs.getString(8);
				String stu_email = rs.getString(9);
				String stu_meet = rs.getString(10);
				String stu_BMN = rs.getString(11);
				System.out.println(stu_id+s_tea_id+s_Class_number+stu_pw+stu_name);
				System.out.println(stu_birthday+stu_tel+stu_address+stu_email);
				System.out.println(stu_meet+stu_BMN);
				
				vo = new TeacherVO(stu_id, s_tea_id, s_Class_number, stu_pw, stu_name, stu_birthday,
						stu_tel, stu_address, stu_email, stu_meet, stu_BMN);
				vot1.add(vo);
				// 파일간의 데이터를 존송할때 하나하나의 변수를 보내는 것이 아니라 묶어서 데이터를 전송 할 수 있는 객체

			}
		
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		} finally { // 트라이 캐치 파이널리 한세트
			close();// 나머지 기능들을 다 썻다고 닫아주는 기능 위에서 만들어준 메소드
		}
		return vot1;
	}
	public int teacher_student_UPDATE(String name) { 
		// 안씀

		getcon();
		String sql = "UPDATE student SET stu_meet = '1' WHERE  stu_name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	public ArrayList<TeacherVO> teacher_calss_select(String id) { // 12. 스코어 테이블에서 스튜던트 이름으로 검색
		// Teacher_GUI_1 Teacher_GUI_2에서 사용
		try {
			getcon();
			sql = "SELECT B.stu_name,A.sco_subject,A.sco_score FROM score A, Student B WHERE A.stu_id=B.stu_id and B.tea_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) { // next 테이블에 값이 있을경우 true 반환
				String stu_name = rs.getString(1);
				String sco_subject = rs.getString(2);
				String sco_score = rs.getString(3);
				System.out.println(stu_name+sco_score+sco_subject);
				vo = new TeacherVO(stu_name,sco_subject,sco_score);
				vot1.add(vo);
			}
		} catch (Exception e) {
			
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return vot1;
	}
	public ArrayList<TeacherVO> teacher_calss_S(String id,String name) { // 12. 스코어 테이블에서 스튜던트 이름으로 검색
		// Teacher_GUI_1 Teacher_GUI_2에서 사용
		try {
			getcon();
			sql = "SELECT B.stu_name,A.sco_subject,A.sco_score FROM score A, Student B WHERE A.stu_id=B.stu_id and B.stu_name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) { // next 테이블에 값이 있을경우 true 반환
				String stu_name = rs.getString(1);
				String sco_subject = rs.getString(2);
				String sco_score = rs.getString(3);
				System.out.println(stu_name+sco_score+sco_subject);
				vo = new TeacherVO(stu_name,sco_subject,sco_score);
				vot1.add(vo);
			}
		} catch (Exception e) {
			
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return vot1;
	}



}
