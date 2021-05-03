package VO;

public class TeamVO {

	String team;
	String id;
	String pw;
	String area;



	public TeamVO(String id, String pw, String area, String team) {
		super();
		this.team = team;
		this.id = id;
		this.pw = pw;
		this.area = area;
	}
	
	public TeamVO(String id) {
		super();
		this.id = id;
	}

	public TeamVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public TeamVO(String id, String pw, String area) {

		this.id = id;
		this.pw = pw;
		this.area = area;
		
	}

	public String getTeam() {
		return team;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getArea() {
		return area;
	}

}
