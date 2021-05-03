package DaoVo;
//// T_S_007 사용자 성적 조회
public class StudentVO {
	String tea_id;
	String tea_pw;
	String tea_name;
	String tea_subject;
	//선생님
	String class_Number;
	String c_tea_id;
	String class_className;
	String class_branch;
	//반
	String stu_id;
	String s_tea_id;
	String s_Class_number;
	String stu_pw;
	String stu_name;
	String stu_birthday;
	String stu_tel;
	String stu_address;
	String stu_email;
	String stu_meet;
	String stu_BMN;
	//학생
	String sco_Number;
	String sc_stu_id;
	String sco_date;
	String sco_subject;
	String sco_score;
	//성적
	String bd_number;
	String bd_stu_number;
	String bd_tea_number;
	String bd_content;
	String bd_NOP;//number of people
	//보드
	String bm_number;
	String bm_stu_id;
	String bm_bd_number;
	public StudentVO(String stu_id, String stu_pw, String stu_name, String stu_birthday, String stu_address,
			String stu_email) {
		super();
		this.stu_id = stu_id;
		this.stu_pw = stu_pw;
		this.stu_name = stu_name;
		this.stu_birthday = stu_birthday;
		this.stu_address = stu_address;
		this.stu_email = stu_email;
	}
	
// 여기 추가.
	public StudentVO(String sc_stu_id, String sco_date, String sco_subject, String sco_score) {
		super();
		this.sc_stu_id = sc_stu_id;
		this.sco_date = sco_date;
		this.sco_subject = sco_subject;
		this.sco_score = sco_score;	
	}

	public String getSc_stu_id() {
		return sc_stu_id;
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
	
// 여기까지.
	
}
