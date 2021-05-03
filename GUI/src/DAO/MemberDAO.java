package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import VO.MemberVO;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	MemberVO vo = null;
	ResultSet rs = null;

	public void getConn() {
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");

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

	public int joininsert(String id, String pw, String name, String gender, String hobby) {

		try {
			getConn();

			sql = "insert into memberinfo values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, gender);
			psmt.setString(5, hobby);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;
	}

	public MemberVO loginSelect(String id, String pw) {
		try {
			getConn();
			sql = "select * from memberinfo where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();

			// insert, update, delete: executeUpdate() -> 정수형리턴(명령에 성공한 수)
			// select : executeQuery() -> 테이블에 있는 값을 리턴

			while (rs.next()) {
				String id1 = rs.getString(1);
				String pw1 = rs.getString(2);
				String name = rs.getString(3);
				String gender = rs.getString(4);
				String hobby = rs.getString(5);

				vo = new MemberVO(id1, pw1, name, gender, hobby);
				// VO/DTO :파이갈읜 데이터를 공유할 때
				// 하나하나의 변수를 보내는게 아니라
				// 묶어서 데이터를 전송할 수 있는 객체

			}

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return vo;
	}
	public ArrayList<MemberVO> allSelect() {
	      ArrayList<MemberVO> al = new ArrayList<MemberVO>();

	      getConn();
	      String sql = "select * from memberinfo";

	      try {
	         psmt = conn.prepareStatement(sql);
	         rs = psmt.executeQuery();
	         while (rs.next()) {
	            String Id1 = rs.getString(1);
	            String Pw1 = rs.getString(2);
	            String Name = rs.getString(3);
	            String Gender = rs.getString(4);
	            String Hobby = rs.getString(5);
	            MemberVO vo = new MemberVO(Id1, Pw1, Name, Gender, Hobby);
	            al.add(vo);
	         }
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {
	    	  //try문에서 예외상황이 발생하던지 하지 않던지 제일 마지막으로 무조건 실행하는 부분
	         close();
	      }
	      return al;
	   }
	public boolean delete(String id) {
	      // TODO Auto-generated method stub
	      boolean result = false;
	      getConn();
	      String sql = "delete from memberinfo where id=?";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, id);

	         int cnt = psmt.executeUpdate();
	         
	         if(cnt>0) {
	            result = true;
	         }else {
	            result = false;
	         }
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         close();
	      }      
	      return result;
	   }
}
