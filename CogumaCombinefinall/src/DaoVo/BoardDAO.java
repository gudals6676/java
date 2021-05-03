package DaoVo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import DaoVo.BoardVO;

public class BoardDAO {
	String id;
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	String sql = "";
	StudentVO vo = null;
	ResultSet rs = null;
	ArrayList<BoardVO> al = new ArrayList<BoardVO>();
	Scanner sc = new Scanner(System.in);
	String d1 ="";
	String bdn="";
	String bmn="";
	String nop="";
	int dI =0;
	int Inop=0;
	// 설정 지역변수들 전부 여기로 꺼내놓은 배운것 그대로 썻음..

	public void getcon() { // 커넥부분
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

	public ArrayList<BoardVO> SelectALL() {
		try {// 해당문을 실행
			getcon();
			String sql = "select bd_number, bd_content, bd_NOP from Board ";
			// 입력시에는 'test'지만 자바상에서 삭제할 경우는 입력을 test만 받음
			PreparedStatement psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌
				String d1 = rs.getString(1);
				String d2 = rs.getString(2);
				String d3 = rs.getString(3);
				al.add(new BoardVO(d1, d2, d3));
			}

			// 추가)2. 사용자에게 입력받을 값을 SQL문 명령 실행
		} catch (Exception e) { // 오류가 생길때 실행
			e.printStackTrace(); // 어떤 오류가 있는지를 출력
		}
		return al;
	}

	public int BoardMeet_update(String id,String bd_number, String bd_NOP) {
		this.id=id;
		try {// 해당문을 실행
			getcon();

			Inop = Integer.parseInt(bd_NOP);//스트링 -> 인트
	
			Inop += 1;//인트값 1증가

			if(Inop<10) {
				nop = Integer.toString(Inop);
				nop = "0"+nop;
			}else {
				nop = Integer.toString(Inop);
			}
			
			bdn=bd_number;
			String sql = "update Board set bd_NOP =? where bd_number =?";
			// 입력시에는 'test'지만 자바상에서 삭제할 경우는 입력을 test만 받음
			PreparedStatement psmt = conn.prepareStatement(sql);
			System.out.println(nop+"\t"+bdn);
			psmt.setString(1, nop);
			psmt.setString(2, bdn);
			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("변경성공1");
			} else {
				System.out.println("명령실패1");
			}
			//여기까지 보드를 갱신하는 부분
		} catch (Exception e) { // 오류가 생길때 실행
			e.printStackTrace(); // 어떤 오류가 있는지를 출력
		}
		
		try {// 해당문을 실행
			sql = "select max(bm_number) from BoardManager";
			// 입력시에는 'test'지만 자바상에서 삭제할 경우는 입력을 test만 받음
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {// 넘겨주는 자료를 한개씩 받아오다가 마지막 자료가없을때 false를 넘겨줌
				d1 = rs.getString(1);
			}
		} catch (Exception e) { // 오류가 생길때 실행
			e.printStackTrace(); // 어떤 오류가 있는지를 출력
		}
		try {
			dI = Integer.parseInt(d1);
			dI += 1;
			if(dI<10) {
				bmn = Integer.toString(dI);
				bmn = "0"+bmn;
			}else {
				bmn = Integer.toString(dI);
			}
			sql = "insert into BoardManager values (?,?,?)";

			psmt = conn.prepareStatement(sql);
			System.out.println(id+"\t"+bmn+"\t"+bdn);
			psmt.setString(1, bmn);
			psmt.setString(2, id);
			psmt.setString(3, bdn);
			cnt = psmt.executeUpdate();
			
			if (cnt > 0) {
				System.out.println("변경성공2");
			} else {
				System.out.println("명령실패2");
			}
		} catch (Exception e) { // 오류가 생길때 실행
			e.printStackTrace(); // 어떤 오류가 있는지를 출력
		}
		
		return cnt;
	}

	public int bd_insert(String id,String bd_content) {
		try {// 해당문을 실행
			getcon();
			sql = "select max(bd_number) from BOARD";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			
			while (rs.next()) {
				d1 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		try {
			dI = Integer.parseInt(d1);
			dI += 1;
			if(dI<10) {
				bdn = Integer.toString(dI);
				bdn = "0"+bdn;
			}else {
				bdn = Integer.toString(dI);
			}
			
			sql = "insert into Board values (?,'admin',?,?,'01')";
			System.out.println(bdn+"\t"+id+"\t"+bd_content);
			psmt = conn.prepareStatement(sql); 
			psmt.setString(1, bdn);
			psmt.setString(2, id);
			psmt.setString(3, bd_content);

			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("변경성공1");
			} else {
				System.out.println("명령실패1");
			}
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		try {
			sql = "select max(bm_number) from BoardManager";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				d1 = rs.getString(1);
			}
		} catch (Exception e) { // 오류가 생길때 실행
			e.printStackTrace(); // 어떤 오류가 있는지를 출력
		}
		try {
			dI = Integer.parseInt(d1);
			dI += 1;
			if(dI<10) {
				bmn = Integer.toString(dI);
				bmn = "0"+bmn;
			}else {
				bmn = Integer.toString(dI);
			}
			sql = "insert into BoardManager values (?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, bmn);
			psmt.setString(2, id);
			psmt.setString(3, bdn);
			cnt = psmt.executeUpdate();
			
			if (cnt > 0) {
				System.out.println("변경성공2");
			} else {
				System.out.println("명령실패2");
			}
		} catch (Exception e) { // 오류가 생길때 실행
			e.printStackTrace(); // 어떤 오류가 있는지를 출력
		}

		return cnt;
	}
	public int Tbd_insert(String id,String bd_content) {
		try {// 해당문을 실행
			getcon();
			sql = "select max(bd_number) from BOARD";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			
			while (rs.next()) {
				d1 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		try {
			dI = Integer.parseInt(d1);
			dI += 1;
			if(dI<10) {
				bdn = Integer.toString(dI);
				bdn = "0"+bdn;
			}else {
				bdn = Integer.toString(dI);
			}
			
			sql = "insert into Board values (?,?,'Sadmin',?,'00')";
			System.out.println(bdn+"\t"+id+"\t"+bd_content);
			psmt = conn.prepareStatement(sql); 
			psmt.setString(1, bdn);
			psmt.setString(2, id);
			psmt.setString(3, bd_content);

			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("변경성공1");
			} else {
				System.out.println("명령실패1");
			}
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		
		return cnt;
	}
	
}
