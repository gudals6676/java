package VO;

public class PlayerVO {
	
	int num;
	String team;
	String name;
	int age;
	String elite;
	String title;
		
	public PlayerVO(int num, String team, String name, int age, String elite, String title) {
		
		super();
		this.num = num;
		this.team = team;
		this.name = name;
		this.age = age;
		this.elite = elite;
		this.title = title;
		
	}
	
	public PlayerVO() {
		
	}
	public int getNum() {
		return num;
	}
	
	public String getTeam() {
		return team;
	}
		
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getElite() {
		return elite;
	}
	public String getTitle() {
		return title;
	}
	
	

}
