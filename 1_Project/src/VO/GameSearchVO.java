package VO;

public class GameSearchVO {
	
	private int num;
	private String team;
	private String area;
	private String date;
	private String hour;
	private String oppose;
	private String check;
	public GameSearchVO(int num, String team, String oppose, String hour, String area, String date, String check) {
		super();
		this.num = num;
		this.team = team;
		this.area = area;
		this.date = date;
		this.hour = hour;
		this.oppose = oppose;
		this.check = check;
	}
	public GameSearchVO() {
		
	}
	public int getNum() {
		return num;
	}
	
	public String getTeam() {
		return team;
	}
	public String getArea() {
		return area;
	}
	public String getDate() {
		return date;
	}
	public String getHour() {
		return hour;
	}
	public String getOppose() {
		return oppose;
	}
	public String getCheck() {
		return check;
	}
	
	
	

}
