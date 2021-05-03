package JDBC;

public class VO {
	
	String id;
	String pw;
	String tel;
	String email;
	String addr;
	
	public VO(String id, String pw, String tel, String email, String addr) {
		super();
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getAddr() {
		return addr;
	}
	
	
}
