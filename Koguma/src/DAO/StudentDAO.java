package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;


import VO.StudentVO;;

public class StudentDAO {
	ArrayList<StudentVO> al = new ArrayList<StudentVO>();
	
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	StudentVO vo = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	// ���� ���������� ���� ����� �������� ���� �״�� ����..
	
	public void getConn() { //Ŀ�غκ�
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
	public void close() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public boolean Class_delete(String class_delete_number) {
	      // Ŭ���� �� ����
	      boolean result = false;
	      getConn();
	      String sql = "delete from Class where Class_Number=?";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, class_delete_number);

	         int cnt = psmt.executeUpdate();
	         
	         if(cnt>0) {
	            result = true;
	         }else {
	            result = false;
	         }
	      } catch (Exception e) {	        
	         e.printStackTrace();
	      }finally {
	         close();
	      }      
	      return result;
	   }
	public boolean Class_delete() {		
		return false;
	}///����û�� �л����� �˶� 1 ������ ����
	public int Student_update(String Stu_meet) {
		
		try {

			getConn();
			sql = "";			
			sql = " update student set stu_meet='1' where Stu_id = ?";							
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Stu_meet);
				
			cnt = psmt.executeUpdate();

			

		} catch (Exception e) {
			System.out.println("try���� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}finally {
	         close();
	      }
		return cnt;
	}
	public ArrayList<StudentVO> SelectALL() {
		try {// �ش繮�� ����
			getConn();
			String sql = "select stu_name, stu_tel, stu_email, stu_address from student";
			// �Է½ÿ��� 'test'���� �ڹٻ󿡼� ������ ���� �Է��� test�� ����
			psmt = conn.prepareStatement(sql);
			System.out.println("psmt >>>>>>> " + psmt);

			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {// �Ѱ��ִ� �ڷḦ �Ѱ��� �޾ƿ��ٰ� ������ �ڷᰡ������ false�� �Ѱ���
				String d1 = rs.getString(1);
				String d2 = rs.getString(2);
				String d3 = rs.getString(3);
				String d4 = rs.getString(4);
				vo = new StudentVO(d1, d2, d3, d4);
				al.add(vo);
			}
			
			// �߰�)2. ����ڿ��� �Է¹��� ���� SQL�� ���� ����
		} catch (Exception e) { // ������ ���涧 ����
			e.printStackTrace(); // � ������ �ִ����� ���
		}finally {
	         close();
	      }
		return al;
	}
}