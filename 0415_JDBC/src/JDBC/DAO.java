package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

	// DAO : 데이터베이스와 연결되는 일들을 처리해주는 Java파일
	// (중복되는 코드 최소화, 보안)
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	VO vo = null;
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
	public int DAO_insert(String id, String pw, String tel, String email, String addr) {
		
		try {
			getConn();
			
			sql = "insert into JDBC_member values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, tel);
			psmt.setString(4, email);
			psmt.setString(5, addr);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;
	}
	public int DAO_delete(String id) {
		
		try {

			getConn();

			sql = "delete from JDBC_member where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			cnt = psmt.executeUpdate();

			

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;
	}
	public int DAO_update(String id, String choice, String data) {
		
		try {

			getConn();
			sql = "";
			if (choice.equals("1")) {
				sql = " update JDBC_member set pw = ? where id = ?";
				
			}else if(choice.equals("2")) {
				sql = " update JDBC_member set tel = ? where id = ?";
				
			}else if(choice.equals("3")) {
				sql = " update JDBC_member set email = ? where id = ?";
			}else {
				sql = " update JDBC_member set addr = ? where id = ?";
			}
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, data);
			psmt.setString(2, id);
		

			cnt = psmt.executeUpdate();

			

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return cnt;
	}
	public VO DAO_OneSelect(String id2) {
		  try {
				getConn();
				sql = "select * from JDBC_member where id = ?";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id2);
				rs = psmt.executeQuery();

				//insert, update, delete: executeUpdate() -> 정수형리턴(명령에 성공한 수)
	            //select : executeQuery() -> 테이블에 있는 값을 리턴
				
				while(rs.next()) {
					String id = rs.getString(1);
					String pw = rs.getString(2);
					String tel = rs.getString(3);
					String email = rs.getString(4);
					String addr = rs.getString(5);
					
					vo = new VO(id, pw, tel, email, addr);
					//VO/DTO :파이갈읜 데이터를 공유할 때
					//        하나하나의 변수를 보내는게 아니라
					//        묶어서 데이터를 전송할 수 있는 객체
				
				}
				

			} catch (Exception e) {

				System.out.println("try문에 에러가 발생했습니다.");
				e.printStackTrace();
			}
		  return vo;
	}
	public ArrayList<VO> DAO_Select() {
		ArrayList<VO> arr = new ArrayList<VO>();//전체검색시 덮어쓰기가 되어 리스트 생성
		
		try {

			getConn();
			sql = "select * from JDBC_member";
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();

			//insert, update, delete: executeUpdate() -> 정수형리턴(명령에 성공한 수)
            //select : executeQuery() -> 테이블에 있는 값을 리턴
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String tel = rs.getString(3);
				String email = rs.getString(4);
				String addr = rs.getString(5);
				
				vo = new VO(id, pw, tel, email, addr);
				arr.add(vo);
				
			}
			

		} catch (Exception e) {

			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return arr;
	}
}
