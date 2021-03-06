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
	// 설정 지역변수들 전부 여기로 꺼내놓은 배운것 그대로 썻음..
	
	public void getConn() { //커넥부분
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
	      // 클래스 반 삭제
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
	}///면담신청시 학생에게 알람 1 값으로 수정
	public int Student_update(String Stu_meet) {
		
		try {

			getConn();
			sql = "";			
			sql = " update student set stu_meet='1' where Stu_id = ?";							
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Stu_meet);
				
			cnt = psmt.executeUpdate();

			

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}finally {
	         close();
	      }
		return cnt;
	}
	public ArrayList<StudentVO> SelectALL() {
		try {// 해당문을 실행
			getConn();
			String sql = "select stu_name, stu_tel, stu_email, stu_address from student";
			// 입력시에는 'test'지만 자바상에서 삭제할 경우는 입력을 test만 받음
			psmt = conn.prepareStatement(sql);
			System.out.println("psmt >>>>>>> " + psmt);

			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌
				String d1 = rs.getString(1);
				String d2 = rs.getString(2);
				String d3 = rs.getString(3);
				String d4 = rs.getString(4);
				vo = new StudentVO(d1, d2, d3, d4);
				al.add(vo);
			}
			
			// 추가)2. 사용자에게 입력받을 값을 SQL문 명령 실행
		} catch (Exception e) { // 오류가 생길때 실행
			e.printStackTrace(); // 어떤 오류가 있는지를 출력
		}finally {
	         close();
	      }
		return al;
	}
}
