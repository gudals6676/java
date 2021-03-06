package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
	
	public void getcon() { //커넥부분
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
	public int Student_Join() {
		try {
			getcon();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public int Student_Login(String id,String pw) {
		try {
			getcon();
			sql = "select STU_id from student";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id); // 01의 값을 받아야함
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
		
	}
//여기 추가.
	public ArrayList<StudentVO> Studentinfo() {      //String stu_id
		
		ArrayList<StudentVO> arr = new ArrayList<StudentVO>();
		
		try {
			getcon();
			sql = "select stu_id, sco_date, sco_subject, sco_score from Score";
			psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌
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
	
	
	public int SupplementaryData(String stu_id) { //String stu_id
		try {
			getcon();
			sql = "select student.stu_name, score.sco_score from student, score where student.stu_id = score.stu_id and student.stu_id = ? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, stu_id); // 01의 값을 받아야함
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌
				String stu_name = rs.getString(1);
				String sco_score = rs.getString(2);
				 if (Integer.parseInt(sco_score)<=50) {
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
	
	
	
// 여기까지.	
	
}
