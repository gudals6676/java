package VO;

public class StudentVO {
	public StudentVO(String id, String pw, String name) {
		// TODO Auto-generated constructor stub
	}
	String Tea_Number;
	String tea_id;
	String tea_pw;
	String tea_name;
	String tea_subject;
	
	String Class_Number;
	//String Tea_number;// 외래는 _2중 형식 선언
	String class_className;
	String class_branch;
	
	String Stu_Number; // 기본 키는 _없이 선언
	String Class_number;
	//String Tea_number;
	String stu_id;
	String stu_pw;
	String stu_name;
	String stu_birthday;
	String stu_address;
	String stu_email;
	String stu_meet;
    String stu_tel;
	String Sco_Number;
	//String Stu_number;
	String sco_date;
	String sco_subject;
	String sco_score;

	String Bd_number;
	//String Stu_number;
	//String Tea_number;
	String bd_peoplenumber;
	String bd_content;
	
	public StudentVO(String stu_name, String stu_address, String stu_email, String stu_tel) {
		super();
		this.stu_name = stu_name;
		this.stu_address = stu_address;
		this.stu_email = stu_email;
		this.stu_tel = stu_tel;
	}
	public StudentVO(String tea_Number, String tea_id, String tea_pw, String tea_name, String tea_subject,
			String class_Number, String class_className, String class_branch, String stu_Number, String class_number2,
			String stu_id, String stu_pw, String stu_name, String stu_birthday, String stu_address, String stu_email,
			String stu_meet, String sco_Number, String sco_date, String sco_subject, String sco_score, String bd_number,
			String bd_peoplenumber, String bd_content, String stu_tel) {
		super();
		Tea_Number = tea_Number;
		this.tea_id = tea_id;
		this.tea_pw = tea_pw;
		this.tea_name = tea_name;
		this.tea_subject = tea_subject;
		Class_Number = class_Number;
		this.class_className = class_className;
		this.class_branch = class_branch;
		Stu_Number = stu_Number;
		Class_number = class_number2;
		this.stu_id = stu_id;
		this.stu_pw = stu_pw;
		this.stu_name = stu_name;
		this.stu_tel = stu_tel;
		this.stu_birthday = stu_birthday;
		this.stu_address = stu_address;
		this.stu_email = stu_email;
		this.stu_meet = stu_meet;
		Sco_Number = sco_Number;
		this.sco_date = sco_date;
		this.sco_subject = sco_subject;
		this.sco_score = sco_score;
		Bd_number = bd_number;
		this.bd_peoplenumber = bd_peoplenumber;
		this.bd_content = bd_content;
	}
	public String getTea_Number() {
		return Tea_Number;
	}
	public String getTea_id() {
		return tea_id;
	}
	public String getTea_pw() {
		return tea_pw;
	}
	public String getTea_name() {
		return tea_name;
	}
	public String getTea_subject() {
		return tea_subject;
	}
	public String getClass_Number() {
		return Class_Number;
	}
	public String getClass_className() {
		return class_className;
	}
	public String getClass_branch() {
		return class_branch;
	}
	public String getStu_Number() {
		return Stu_Number;
	}
	public String getClass_number() {
		return Class_number;
	}
	public String getStu_tel() {
		return stu_tel;
	}
	public String getStu_id() {
		return stu_id;
	}
	public String getStu_pw() {
		return stu_pw;
	}
	public String getStu_name() {
		return stu_name;
	}
	public String getStu_birthday() {
		return stu_birthday;
	}
	public String getStu_address() {
		return stu_address;
	}
	public String getStu_email() {
		return stu_email;
	}
	public String getStu_meet() {
		return stu_meet;
	}
	public String getSco_Number() {
		return Sco_Number;
	}
	public String getSco_date() {
		return sco_date;
	}
	public String getSco_subject() {
		return sco_subject;
	}
	public String getSco_score() {
		return sco_score;
	}
	public String getBd_number() {
		return Bd_number;
	}
	public String getBd_peoplenumber() {
		return bd_peoplenumber;
	}
	public String getBd_content() {
		return bd_content;
	}
	
	
}
