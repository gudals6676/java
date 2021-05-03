package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Main.Main;
import Main.OkayGUI;
import VO.GameSearchVO;
import VO.GameVO;
import VO.PlayerVO;
import VO.RankVO;
import VO.ScoreVO;
import VO.TeamVO;
import VO.wr_list_VO;

public class DAO {

	private static final TeamVO TeamVO = null;
	private static final String team = null;
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

//	public int delete(String delete) {
//		int cnt = 0;
//		connect();
//		String sql = "delete from member where team = ?";
//		
//		try {
//			
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, delete);
//			cnt = pst.executeUpdate();
//		}catch(SQLException e) {
//		e.printStackTrace();	
//		}finally {
//			close();
//		}
//		return cnt;
//	}


	public int setset (int goal, int lost, String team) {
		int cnt = 0;
		connect();
		String sql = "update gameresult set goal = goal + ?, lost = lost + ? where team = ?";
		
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setInt(1, goal);
			pst.setInt(2, lost);
			pst.setString(3, team);
			cnt = pst.executeUpdate();
			
						
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
		
	}


	public TeamVO login(TeamVO vo) {
		TeamVO loginMember = null;
		connect();
		String sql = "select * from member where id =? and pw =? ";

		try {

			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getId());
			pst.setString(2, vo.getPw());
			rs = pst.executeQuery();

			if (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				loginMember = new TeamVO(id, pw);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return loginMember;
	}
	
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

	public int join(TeamVO teamvo) {
		int cnt = 0;

		connect();
		String sql = "insert into member values(?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, teamvo.getTeam());
			pst.setString(2, teamvo.getId());
			pst.setString(3, teamvo.getPw());
			pst.setString(4, teamvo.getArea());
			cnt = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close();
		}
		return cnt;
	}

	

	
	public ArrayList<GameSearchVO> search() {

		ArrayList<GameSearchVO> al = new ArrayList<GameSearchVO>();

		connect();
		String sql = "select * from game";
		try {

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				
				int num = rs.getInt(1);
				String team = rs.getString(2);
				String oppose = rs.getString(3);
				String hour = rs.getString(4);
				String area = rs.getString(5);
				String date = rs.getString(6);
				String check = rs.getString(7);

				GameSearchVO gsv = new GameSearchVO(num, team, oppose, hour, area, date, check);
				al.add(gsv);

			}

		} catch (Exception e) {
		} finally {

			close();
		}
		return al;
	}

	public int delete(TeamVO vo) {

		connect();
		String sql = "delete from member where id=? and pw=?";

		int cnt = 0;

		if (!vo.getId().equals("admin")) {
			try {
				pst = conn.prepareStatement(sql);
				pst.setString(1, vo.getId());
				pst.setString(2, vo.getPw());
				cnt = pst.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}

			return cnt;
		} else {
			return cnt;
		}

	}

	public int updateinfo(TeamVO vo) {
		int cnt = 0;
		connect();
		String sql = "update member set pw=?, area=? where id=?";
		try {
			
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getPw());
			pst.setString(2, vo.getArea());
			pst.setString(3, vo.getId());
			
			cnt = pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public boolean ookay(int okay) {

		boolean result = false;
		connect();
		String sql = "update game set status =? where gamenum = ?";

		try {

			pst = conn.prepareStatement(sql);

			pst.setString(1, "APPROVED");
			pst.setInt(2, okay);
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				result = true;
			} else {

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return result;

	}

	public boolean nopp(int okay) {

		boolean result = false;
		connect();
		String sql = "update game set status =? where gamenum = ?";

		try {

			pst = conn.prepareStatement(sql);

			pst.setString(1, "REJECTED");
			pst.setInt(2, okay);
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				result = true;
			} else {

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return result;
	}
	
	public void setTeam(String updateScore) {
		
	}
	
	public ArrayList<ScoreVO> setScore() {

		ArrayList<ScoreVO> al = new ArrayList();
		try {
			connect();

			String sql = "select * from gameresult";
			
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {

				String team = rs.getString(1);
				int goal = rs.getInt(2);
				int lost = rs.getInt(3);
				String result = rs.getString(4);
				String G_Date = rs.getString(5);

				ScoreVO vo = new ScoreVO(team, goal, lost, result, G_Date);
				al.add(vo);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			close();
		}
		return al;

	}
		
	public ArrayList<PlayerVO> seePlayer() {
	
		String where = Main.loginMember.getId();
		
		ArrayList<PlayerVO> al = new ArrayList<PlayerVO>();
		
		try {
			
			connect();
			
			String sql = "select * from player where team = ?";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, where);
			rs = pst.executeQuery();
	
			while(rs.next()) {
			
				int num = rs.getInt(1);
				String team = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				String elite = rs.getString(5);
				String title = rs.getString(6);
				
				
				PlayerVO vo = new PlayerVO(num, team, name, age, elite, title);
				al.add(vo);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				
				close();
			}
		return al;
		
		}
	
	
	public boolean updateScore(String updateScore, int win, int lose) {
		boolean result = false;
		
		connect();
		String sql = "update Test_Result1 set win = win + ?, lose = lose + ? where team = ?";
		           
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setInt(1, win);
			pst.setInt(2, lose);
			pst.setString(3, updateScore);
			
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) {
				result = true;
				
			}else{
			}
					
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			
			close();
		}
		return result;
	}
	
	public boolean updatePlayer(int num, String name, int age, String elite, String title) {
		
		String where = Main.loginMember.getId();
		boolean result = false;
		
		connect();
		String sql = "update Player set name = ?, age = ?, elite =?, title =? where playernum = ?";
		           
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, elite);
			pst.setString(4, title);
			pst.setInt(5, num);
			
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) {
				result = true;
				
			}else{
			}
					
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			
			close();
		}
		return result;
	}
		
		
	

	public int addPlayer(String team, String name, int age, String elite, String title) {
		
		int cnt = 0;
		connect();
		String sql = "Insert into Player values(playernum_seq.nextval, ?,?,?,?,?)";
	
		try {
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, team);
			pst.setString(2, name);
			pst.setInt(3, age);
			pst.setString(4, elite);
			pst.setString(5, title);
			
			cnt = pst.executeUpdate();
			

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			close();
		}
		return cnt;
	}
	
	public ArrayList<RankVO> score_List() {
		ArrayList<RankVO> score_List = new ArrayList<RankVO>();
		
		connect();
		String sql = "select * from GAMERESULT order by goal-lost desc";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {

				String team = rs.getString(1);
				score_List.add(new RankVO(team));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return score_List;
	}
	
	public ArrayList<wr_list_VO> WritingList() {
		ArrayList<wr_list_VO> al = new ArrayList<wr_list_VO>();
		
		connect();
		String sql = "select TITLENUM, team, B_title, content from Board";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				
				int num = rs.getInt(1);
				String team = rs.getString(2);
				String B_title = rs.getString(3);
				String content = rs.getString(4);
				
				wr_list_VO wlv = new wr_list_VO(num, team, B_title, content);
				al.add(wlv);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return al;
	}
	
	public int PostInsert(wr_list_VO vo) {
		
		int cnt = 0;
		connect();
		String sql = "insert into Board values(TITLENUM_seq.nextval,?,?,?,SYSDATE)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getTeam());
			pst.setString(2, vo.getB_title());
			pst.setString(3, vo.getContent());
			cnt = pst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;
	}
	
	
	public int postSelect(String B_title) {
		int cnt = 0;
		connect();
		String sql = "select TITLENUM, team, B_title, content from Board";
		try {
			
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				
				cnt = pst.executeUpdate();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	public int postDelete(int num){
		
		int cnt = 0;
		connect();
		String sql = "DELETE FROM Board WHERE TITLENUM = ? ";
		
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, num);
			cnt = pst.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return cnt;
	}
	
	
	public ArrayList<TeamVO> TeamList() {
		
		ArrayList<TeamVO> al = new ArrayList<TeamVO>();
		connect();
		String sql = "select * from Member where id != 'admin'";
		
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String team = rs.getString(1);
				String id = rs.getString(2);
				String pw = rs.getString(3);
				String area = rs.getString(4);
				TeamVO tv = new TeamVO(team, id, pw, area);
				al.add(tv);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return al; 
	}
	
	public int teamDelete(String team){
			int cnt = 0;
			connect();
			String sql = "DELETE FROM MEMBER WHERE TEAM = ? ";
			
			try {
				pst = conn.prepareStatement(sql);
				pst.setString(1, team);
				cnt = pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}
			
			
			return cnt;
		}

	public int deletePlayer(int click) {
		int cnt = 0;
		
		connect();
		
		String sql = "delete from player where playernum = ?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, click);
			cnt = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return cnt;
		
	}
}

