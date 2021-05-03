package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextField;

public class TeacherDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	TeacherVO1 vo = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	ArrayList<TeacherVO1> vot1 = new ArrayList<TeacherVO1>();
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

	public ArrayList<TeacherVO1> teacher_select(String stu_name1) { // 12. ��Ʃ��Ʈ ���̺��� �̸����� �˻�
// �Ⱦ�
		try {
			getcon();
			sql = "select *from score where stu_pw=?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, stu_name1); // 01�� ���� �޾ƾ���

			rs = psmt.executeQuery();

			while (rs.next()) { // next ���̺� ���� ������� true ��ȯ
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

				vo = new TeacherVO1(stu_id, s_tea_id, s_Class_number, stu_pw, stu_name, stu_birthday, stu_tel,
						stu_address, stu_email, stu_meet, stu_BMN);
				vot1.add(vo);
//���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ ������ ���� �ƴ϶� ��� �����͸� ���� �� �� �ִ� ��ü

			}

			// �μ�Ʈ ������Ʈ ����Ʈ�� executupdata() ������ ����(��ɹ�)��� 2�� ��������� 2�� �Էµ�
			// ����Ʈ �ٸ� �翭�� ��� ���̺� �ִ� ���� �����ϱ� ����
		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
		return vot1;
	}

	public ArrayList<TeacherVO1> teacher_calss_select() { // 12. ���ھ� ���̺��� ��Ʃ��Ʈ �̸����� �˻�
		// Teacher_GUI_1 Teacher_GUI_2���� ���
		try {
			getcon();
			sql = "SELECT * FROM student A, score B WHERE A.stu_id = B.stu_id";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) { // next ���̺� ���� ������� true ��ȯ
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
				String sco_Number = rs.getString(12);
				String sc_stu_id = rs.getString(13);
				String sco_date = rs.getString(14);
				String sco_subject = rs.getString(15);
				String sco_score = rs.getString(16);
				vo = new TeacherVO1(stu_id, s_tea_id, s_Class_number, stu_pw, stu_name, stu_birthday, stu_tel,
						stu_address, stu_email, stu_meet, stu_BMN, sco_Number, sc_stu_id, sco_date, sco_subject,
						sco_score);
				vot1.add(vo);
//���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ ������ ���� �ƴ϶� ��� �����͸� ���� �� �� �ִ� ��ü

			}

			// �μ�Ʈ ������Ʈ ����Ʈ�� executupdata() ������ ����(��ɹ�)��� 2�� ��������� 2�� �Էµ�
			// ����Ʈ �ٸ� �翭���� ��� ���̺� �ִ� ���� �����ϱ� ����
		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
		return vot1;
	}

	public ArrayList<TeacherVO1> teacher_STUDENT_noselect() {// 12.2 �л� ��ä ��ȸ
		// �Ⱦ�
		getcon();
		sql = "select * from STUDENT";

		// 01�� ���� �޾ƾ���

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) { // next ���̺� ���� ������� true ��ȯ
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

				TeacherVO1 vo = new TeacherVO1(stu_id, s_tea_id, s_Class_number, stu_pw, stu_name, stu_birthday,
						stu_tel, stu_address, stu_email, stu_meet, stu_BMN);
				vot1.add(vo);
				// ���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ ������ ���� �ƴ϶� ��� �����͸� ���� �� �� �ִ� ��ü

			}

			// �μ�Ʈ ������Ʈ ����Ʈ�� executupdata() ������ ����(��ɹ�)��� 2�� ��������� 2�� �Էµ�
			// ����Ʈ �ٸ� �翭���� ��� ���̺� �ִ� ���� �����ϱ� ����
		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		} finally { // Ʈ���� ĳġ ���̳θ� �Ѽ�Ʈ
			close();// ������ ��ɵ��� �� ���ٰ� �ݾ��ִ� ��� ������ ������� �޼ҵ�
		}
		return vot1;
	}

	public int teacher_student_UPDATE(String stu_pw) { // 17 �� ����
		// �Ⱦ�

		getcon();
		String sql = "UPDATE student SET stu_bmn = '1' WHERE  stu_pw=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, stu_pw);

			int cnt = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
//
//	public TeacherVO1 teacher_calss_select(String Calss_Number) {// 13.1 Ŭ���� ���� ��ȸ
//		// �Ⱦ�
//		try {
//			getcon();
//			sql = "select *from class where id=?";
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, Calss_Number); // 01�� ���� �޾ƾ���
//
//			rs = psmt.executeQuery();
//
//			while (rs.next()) { // next ���̺� ���� ������� true ��ȯ
//				String sco_Number = rs.getString(1);
//				String sc_stu_id = rs.getString(2);
//				String sco_date = rs.getString(3);
//				String sco_subject = rs.getString(4);
//				String sco_score = rs.getString(5);
//
//				vo = new TeacherVO1(sco_Number, sc_stu_id, sco_date, sco_subject, sco_score);
//				// ���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ ������ ���� �ƴ϶� ��� �����͸� ���� �� �� �ִ� ��ü
//
//			}
//
//			// �μ�Ʈ ������Ʈ ����Ʈ�� executupdata() ������ ����(��ɹ�)��� 2�� ��������� 2�� �Էµ�
//			// ����Ʈ �ٸ� �翭���� ��� ���̺� �ִ� ���� �����ϱ� ����
//		} catch (Exception e) {
//			System.out.println("�����߻�");
//			e.printStackTrace();
//		}
//		return vo;
//	}
//
//	public ArrayList<TeacherVO1> teacher_Calss_noselect() {// 13.2 ��Ʃ��Ʈ Ŭ���� ��ü ��ȸ
//		// �Ⱦ�
//		try {
//			getcon();
//			sql = "select * from STUDENT";
//			psmt = conn.prepareStatement(sql);
//
//			// 01�� ���� �޾ƾ���
//
//			rs = psmt.executeQuery();
//
//			while (rs.next()) { // next ���̺� ���� ������� true ��ȯ
//				String stu_id = rs.getString(1);
//				String s_tea_id = rs.getString(2);
//				String s_Class_number = rs.getString(3);
//				String stu_pw = rs.getString(4);
//				String stu_name = rs.getString(5);
//				String stu_birthday = rs.getString(6);
//				String stu_tel = rs.getString(7);
//				String stu_address = rs.getString(8);
//				String stu_email = rs.getString(9);
//				String stu_meet = rs.getString(10);
//				String stu_BMN = rs.getString(11);
//
//				vo = new TeacherVO1(stu_id, s_tea_id, s_Class_number, stu_pw, stu_name, stu_birthday, stu_tel,
//						stu_address, stu_email, stu_meet, stu_BMN);
//				vot1.add(vo);
//				// ���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ ������ ���� �ƴ϶� ��� �����͸� ���� �� �� �ִ� ��ü
//
//			}
//
//			// �μ�Ʈ ������Ʈ ����Ʈ�� executupdata() ������ ����(��ɹ�)��� 2�� ��������� 2�� �Էµ�
//			// ����Ʈ �ٸ� �翭���� ��� ���̺� �ִ� ���� �����ϱ� ����
//		} catch (Exception e) {
//			System.out.println("�����߻�");
//			e.printStackTrace();
//		}
//		return vot1;
//	}
//
//	public ArrayList<TeacherVO1> teacher_student_score_noselect() {// 14.1 ���ھ� ��ü ��ȸ
//		// �Ⱦ�
//		try {
//			getcon();
//			sql = "select *from Score";
//			psmt = conn.prepareStatement(sql);
//
//			// 01�� ���� �޾ƾ���
//
//			rs = psmt.executeQuery();
//
//			while (rs.next()) { // next ���̺� ���� ������� true ��ȯ
//				String sco_Number = rs.getString(1);
//				String sc_stu_id = rs.getString(2);
//				String sco_date = rs.getString(3);
//				String sco_subject = rs.getString(4);
//				String sco_score = rs.getString(5);
//
//				vo = new TeacherVO1(sco_Number, sc_stu_id, sco_date, sco_subject, sco_score);
//				vot1.add(vo);
//				// ���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ ������ ���� �ƴ϶� ��� �����͸� ���� �� �� �ִ� ��ü
//
//			}
//
//			// �μ�Ʈ ������Ʈ ����Ʈ�� executupdata() ������ ����(��ɹ�)��� 2�� ��������� 2�� �Էµ�
//			// ����Ʈ �ٸ� �翭���� ��� ���̺� �ִ� ���� �����ϱ� ����
//		} catch (Exception e) {
//			System.out.println("�����߻�");
//			e.printStackTrace();
//		}
//		return vot1;
//	}
//
//	public TeacherVO1 teacher_student_score_select(String stu_id) {// 14.2 ���ھ� ���� ��ȸ
//		// �Ⱦ�
//		try {
//			getcon();
//			sql = "select *from Score where id=?";
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, stu_id); // 01�� ���� �޾ƾ���
//
//			rs = psmt.executeQuery();
//
//			while (rs.next()) { // next ���̺� ���� ������� true ��ȯ
//				String sco_Number = rs.getString(1);
//				String sc_stu_id = rs.getString(2);
//				String sco_date = rs.getString(3);
//				String sco_subject = rs.getString(4);
//				String sco_score = rs.getString(5);
//
//				vo = new TeacherVO1(sco_Number, sc_stu_id, sco_date, sco_subject, sco_score);
//				// ���ϰ��� �����͸� �����Ҷ� �ϳ��ϳ��� ������ ������ ���� �ƴ϶� ��� �����͸� ���� �� �� �ִ� ��ü
//
//			}
//
//			// �μ�Ʈ ������Ʈ ����Ʈ�� executupdata() ������ ����(��ɹ�)��� 2�� ��������� 2�� �Էµ�
//			// ����Ʈ �ٸ� �翭���� ��� ���̺� �ִ� ���� �����ϱ� ����
//		} catch (Exception e) {
//			System.out.println("�����߻�");
//			e.printStackTrace();
//		}
//		return vo;
//	}
//
//	public int teacher_class_creat(String class_Number, String c_tea_id, String class_className, String class_branch) { // 16
//		// ��
//		// ����
//		// �Ⱦ�
//		try {
//			getcon();
//			sql = "insert into Class values(?,?,?,?)";
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, class_Number); // 01�� ���� �޾ƾ���
//			psmt.setString(2, c_tea_id);
//			psmt.setString(3, class_className);
//			psmt.setString(4, class_branch);
//
//			cnt = psmt.executeUpdate(); // �� �κп��� ���� 0���� �ٲ۴�
//
//		} catch (Exception e) {
//			System.out.println("�����߻�");
//			e.printStackTrace(); // ������ ���� ���� ���� �ڵ�� e�� �����
//		}
//		return cnt;
//	}
//
//	public boolean teacher_class_del(String class_Number) { // 17 �� ����
//		// �Ⱦ�
//
//		boolean result = false;
//		getcon();
//		String sql = "delete from Class where class_Number=?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, class_Number);
//
//			int cnt = psmt.executeUpdate();
//
//			if (cnt > 0) {
//				result = true;
//			} else {
//				result = false;
//			}
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return result;
//	}

	private void close() {
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
}