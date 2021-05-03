package DaoVo;

public class BoardVO {
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
	public BoardVO(String bd_number, String bd_content, String bd_NOP) {
		super();
		this.bd_number = bd_number;
		this.bd_content = bd_content;
		this.bd_NOP = bd_NOP;
	}
	public String getBd_number() {
		return bd_number;
	}
	public String getBd_content() {
		return bd_content;
	}
	public String getBd_NOP() {
		return bd_NOP;
	}
	//보드
	String bm_number;
	String bm_stu_id;
	String bm_bd_number;

}
