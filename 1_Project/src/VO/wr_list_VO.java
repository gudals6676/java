package VO;


public class wr_list_VO {
	private int num;
	private String team; 
	private String B_title;
	private String content;
	
	public wr_list_VO(int num, String team, String B_title, String content) {
		super();
		this.num = num;
		this.team = team;
		this.B_title = B_title;
		this.content = content;
	}
	public wr_list_VO(String team, String B_title, String content) {
		
		this.team = team;
		this.B_title = B_title;
		this.content = content;
		
	}
	public int getNum() {
		return num;
	}
	public String getTeam() {
		return team;
	}
	public String getB_title() {
		return B_title;
	}
	public String getContent() {
		return content;
	}
	
	
	

	
	
	
}
