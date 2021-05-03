package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
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

	public int Student_Join(String id, String pw, String name, String birthday, String tel, String address,
			String email) {
		try {
			getcon();
			// insert into Student
			// values('b1','a1','1','b123','������','97/1/2','010','�ϱ�','na','0','0');
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

	// �������� ����
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
			System.out.println("try���� ������ �߻��߽��ϴ�.");
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
			System.out.println("try���� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		
		return cnt;
		// TODO Auto-generated method stub
		
	}

	// �л� ���� ����
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
			System.out.println("try���� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		return vo;

	}


	////////////////////////// ���������� ----------------------------------------
	public ArrayList<StudentVO> Studentinfo(String s_id) { // String stu_id
		ArrayList<StudentVO> arr = new ArrayList<StudentVO>();

		try {
			getcon();
			sql = "select stu_id, sco_date, sco_subject, sco_score from Score where stu_id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, s_id);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {// �Ѱ��ִ� �ڷḦ �Ѱ��� �޾ƿ��ٰ� ������ �ڷᰡ������ false�� �Ѱ���
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
	public int SupplementaryData(String s_id) { // String stu_id
		String id= s_id;
		int C_score=0;
		try {
			getcon();
			sql="select avg(sco_score) from SCORE where stu_id= ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id); // 01�� ���� �޾ƾ���
			rs = psmt.executeQuery();
			if(rs.next()) {
				C_score = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return C_score;
	}
	public String SupplementaryName(String s_id) {
		String s="";
		try {
			getcon();
			sql="select STU_NAME from Student where stu_id= ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, s_id); // 01�� ���� �޾ƾ���
			rs = psmt.executeQuery();
			if(rs.next()) {
				s = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
		
	}

}
