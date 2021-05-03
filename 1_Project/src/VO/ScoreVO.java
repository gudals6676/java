package VO;

public class ScoreVO {

	String team;
	int goal;
	int lost;
	String result;
	String G_Date;
	
	public ScoreVO(String team, int goal, int lost, String result, String G_Date) {
		super();
		this.team = team;
		this.goal = goal;
		this.lost = lost;
		this.result = result;
		this.G_Date = G_Date;
	}
	public String getTeam() {
		return team;
	}
	public int getGoal() {
		return goal;
	}
	public int getLost() {
		return lost;
	}
	public String getResult() {
		return result;
	}
	public String getG_Date() {
		return G_Date;
	}
	
	
}
