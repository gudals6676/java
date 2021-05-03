package VO;

import java.sql.Date;

public class GameVO {

	private int num;
	private String team;
	private String oppose;
	private String g_time;
	private String g_place;
	private String g_date;
	private String status;
	
	//이미 승인된 경기 불러오는 용
	public GameVO(int num, String team, String oppose, String g_time, String g_place, String g_date) {
		super();
		this.num = num;
		this.team = team;
		this.oppose = oppose;
		this.g_time = g_time;
		this.g_place = g_place;
		this.g_date = g_date;
	}
	
	//경기 조회 및 참가용
	public GameVO(int num, String team, String oppose, String g_time, String g_place, String g_date, String status) {
		super();
		this.num = num;
		this.team = team;
		this.oppose = oppose;
		this.g_time = g_time;
		this.g_place = g_place;
		this.g_date = g_date;
		this.status = status;
	}
	public int getNum() {
		return num;
	}
	public String getTeam() {
		return team;
	}
	public String getOppose() {
		return oppose;
	}
	public String getG_time() {
		return g_time;
	}
	public String getG_place() {
		return g_place;
	}
	public String getG_date() {
		return g_date;
	}
	public String getStatus() {
		return status;
	}

}
