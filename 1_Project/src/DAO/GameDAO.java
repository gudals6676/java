package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import VO.GameVO;
import VO.RankVO2;
import VO.ScoreVO;

public class GameDAO {
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//MatchGUI에서 경기를 등록할 시
	//testest 임시 테이블, 실제로 연동할때는 이름 바꿔줄 것
	public int matchInsert(GameVO vo) {
		int cnt = 0;
		
		connect();
		
		String sql = "insert into game values(gamenum_seq.nextval,?,?,?,?,?,?)";
		try {
			
			//java.sql.Date d = java.sql.Date.valueOf(vo.getG_date());
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getTeam());
			pst.setString(2, vo.getOppose());
			pst.setString(3, vo.getG_time());
			pst.setString(4, vo.getG_place());
			pst.setString(5, vo.getG_date());
			pst.setString(6, vo.getStatus());
			cnt = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return cnt;
	}

	public ArrayList<GameVO> Select() {
		
		ArrayList<GameVO> al = new ArrayList<GameVO>();
		
		connect();
		
		String sql = "select * from game where oppose IS NULL";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
					int num = rs.getInt(1);
					String team = rs.getString(2);
					String oppose = rs.getString(3);
					String time = rs.getString(4);
					String place = rs.getString(5);
					String date = rs.getString(6);
					
					GameVO vo = new GameVO(num, team, oppose, time, place, date);
					al.add(vo);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return al;
	}

	public int OppInsert(int num, String opp) {
		int cnt = 0;
		
		connect();
		
		//상대팀 정보를 수정해주는 sql 구문
		String sql="update game set oppose = ? where gamenum = ?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, opp);
			pst.setInt(2, num);
			cnt = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return cnt;
		
		
	}

	
	//사용자-랭킹조회 위해 만든 뷰 team_rank를 테이블에 뿌려줌
	public ArrayList<RankVO2> rankView() {
		
		ArrayList<RankVO2> al = new ArrayList<RankVO2>();
		
		connect();
		
		String sql="select * from team_rank";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String team = rs.getString(1);
				int sumGoal = rs.getInt(2);
				int sumLost = rs.getInt(3);
				int countWin = rs.getInt(4);
				
				RankVO2 vo = new RankVO2(team, sumGoal, sumLost, countWin);
				al.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return al;
	}

	//관리자 결과입력 페이지, 승인된 경기만 테이블에 뿌려주기
	public ArrayList<GameVO> blankResult() {
		
		ArrayList<GameVO> al = new ArrayList<GameVO>();
		
		connect();
		String sql="select * from game where status = 'APPROVED'";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
					int num = rs.getInt(1);
					String team = rs.getString(2);
					String oppose = rs.getString(3);
					String time = rs.getString(4);
					String place = rs.getString(5);
					String date = rs.getString(6);
					//String status = rs.getString(7);
				
					GameVO vo = new GameVO(num, team, oppose, time, place, date);
					al.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return al;
	}

	public int InputScore(ScoreVO vo) {
		int cnt = 0;
		
		connect();
		String sql = "insert into gameresult values(?,?,?,?,?)";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getTeam());
			pst.setInt(2, vo.getGoal());
			pst.setInt(3, vo.getLost());
			pst.setString(4, vo.getResult());
			pst.setString(5, vo.getG_Date());
			cnt = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return cnt;
	}
	
}
