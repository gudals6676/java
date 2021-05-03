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

	public ArrayList<BoardVO> SelectALL() {
		try {// �ش繮�� ����
			getcon();
			String sql = "select bd_number, bd_content, bd_NOP from Board ";
			// �Է½ÿ��� 'test'���� �ڹٻ󿡼� ������ ���� �Է��� test�� ����
			PreparedStatement psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {// �Ѱ��ִ� �ڷḦ �Ѱ��� �޾ƿ��ٰ� ������ �ڷᰡ������ false�� �Ѱ���
				String d1 = rs.getString(1);
				String d2 = rs.getString(2);
				String d3 = rs.getString(3);
				al.add(new BoardVO(d1, d2, d3));
			}

			// �߰�)2. ����ڿ��� �Է¹��� ���� SQL�� ��� ����
		} catch (Exception e) { // ������ ���涧 ����
			e.printStackTrace(); // � ������ �ִ����� ���
		}
		return al;
	}

	public int BoardMeet_update(String id,String bd_number, String bd_NOP) {
		this.id=id;
		try {// �ش繮�� ����
			getcon();
			System.out.println(bd_NOP);
			Inop = Integer.parseInt(bd_NOP);
			System.out.println(Inop);
			Inop += 1;
			System.out.println(Inop);
			if(Inop<10) {
				nop = Integer.toString(Inop);
				nop = "0"+nop;
			}else {
				nop = Integer.toString(Inop);
			}
			bdn=bd_number;
			String sql = "update Board set bd_NOP =? where bd_number =?";
			// �Է½ÿ��� 'test'���� �ڹٻ󿡼� ������ ���� �Է��� test�� ����
			PreparedStatement psmt = conn.prepareStatement(sql);
			System.out.println(nop+"\t"+bdn);
			psmt.setString(1, nop);
			psmt.setString(2, bdn);
			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���漺��1");
			} else {
				System.out.println("��ɽ���1");
			}
			//������� ���带 �����ϴ� �κ�
		} catch (Exception e) { // ������ ���涧 ����
			e.printStackTrace(); // � ������ �ִ����� ���
		}
		try {// �ش繮�� ����
			sql = "select max(bm_number) from BoardManager";
			// �Է½ÿ��� 'test'���� �ڹٻ󿡼� ������ ���� �Է��� test�� ����
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {// �Ѱ��ִ� �ڷḦ �Ѱ��� �޾ƿ��ٰ� ������ �ڷᰡ������ false�� �Ѱ���
				d1 = rs.getString(1);
			}
		} catch (Exception e) { // ������ ���涧 ����
			e.printStackTrace(); // � ������ �ִ����� ���
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
				System.out.println("���漺��2");
			} else {
				System.out.println("��ɽ���2");
			}
		} catch (Exception e) { // ������ ���涧 ����
			e.printStackTrace(); // � ������ �ִ����� ���
		}
		
		return cnt;
	}

	public int bd_insert(String id,String bd_content) {
		try {// �ش繮�� ����
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
				System.out.println("���漺��1");
			} else {
				System.out.println("��ɽ���1");
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
		} catch (Exception e) { // ������ ���涧 ����
			e.printStackTrace(); // � ������ �ִ����� ���
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
				System.out.println("���漺��2");
			} else {
				System.out.println("��ɽ���2");
			}
		} catch (Exception e) { // ������ ���涧 ����
			e.printStackTrace(); // � ������ �ִ����� ���
		}

		return cnt;
	}
}
