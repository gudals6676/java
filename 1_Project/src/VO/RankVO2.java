package VO;

public class RankVO2 {

	private String team;
	private int sumGoal;
	private int sumLost;
	private int countWin;
	
	public RankVO2(String team, int sumGoal, int sumLost, int countWin) {
		super();
		this.team = team;
		this.sumGoal = sumGoal;
		this.sumLost = sumLost;
		this.countWin = countWin;
	}

	public String getTeam() {
		return team;
	}

	public int getSumGoal() {
		return sumGoal;
	}

	public int getSumLost() {
		return sumLost;
	}

	public int getCountWin() {
		return countWin;
	}
	
}
