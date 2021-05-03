package DaoVo;

public class TeacherVO {
	String tea_id;
	String tea_pw;
	String tea_name;
	String tea_subject;
	// ������
	String class_Number;
	String c_tea_id;
	String class_className;
	String class_branch;
	// ��
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
	// �л�
	String sco_Number;
	String sc_stu_id;
	String sco_date;
	String sco_subject;
	String sco_score;
	// ����
	String bd_number;

	public TeacherVO(String tea_id, String tea_pw) {
		super();
		this.tea_id = tea_id;
		this.tea_pw = tea_pw;
	}
	

	public TeacherVO(String stu_name, String sco_subject, String sco_score) {
		super();
		this.stu_name = stu_name;
		this.sco_subject = sco_subject;
		this.sco_score = sco_score;
	}


	// ���β�------------------------------------------------------
	public TeacherVO(String class_Number, String c_tea_id, String class_className, String class_branch) {
		super();
		this.class_Number = class_Number;
		this.c_tea_id = c_tea_id;
		this.class_className = class_className;
		this.class_branch = class_branch;
	}

	// ������ ----------------------------------------------------------
	public TeacherVO(String stu_id, String s_tea_id, String s_Class_number, String stu_pw, String stu_name,
			String stu_birthday, String stu_tel, String stu_address, String stu_email, String stu_meet,
			String stu_BMN) { 
		// �Ⱦ�
		super();
		this.stu_id = stu_id;
		this.s_tea_id = s_tea_id;
		this.s_Class_number = s_Class_number;
		this.stu_pw = stu_pw;
		this.stu_name = stu_name;
		this.stu_birthday = stu_birthday;
		this.stu_tel = stu_tel;
		this.stu_address = stu_address;
		this.stu_email = stu_email;
		this.stu_meet = stu_meet;
		this.stu_BMN = stu_BMN;
	}
	public TeacherVO(String stu_id, String s_tea_id, String s_Class_number, String stu_pw, String stu_name,
			String stu_birthday, String stu_tel, String stu_address, String stu_email, String stu_meet, String stu_BMN,
			String sco_Number, String sc_stu_id, String sco_date, String sco_subject, String sco_score) {
		// ��Ʃ��Ʈ ���ھ� ���� = Teacher_GUI_1 ,2���� ���
		super();
		this.stu_id = stu_id;
		this.s_tea_id = s_tea_id;
		this.s_Class_number = s_Class_number;
		this.stu_pw = stu_pw;
		this.stu_name = stu_name;
		this.stu_birthday = stu_birthday;
		this.stu_tel = stu_tel;
		this.stu_address = stu_address;
		this.stu_email = stu_email;
		this.stu_meet = stu_meet;
		this.stu_BMN = stu_BMN;
		this.sco_Number = sco_Number;
		this.sc_stu_id = sc_stu_id;
		this.sco_date = sco_date;
		this.sco_subject = sco_subject;
		this.sco_score = sco_score;
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
		return class_Number;
	}

	public String getC_tea_id() {
		return c_tea_id;
	}

	public String getClass_className() {
		return class_className;
	}

	public String getClass_branch() {
		return class_branch;
	}

	public String getStu_id() {
		return stu_id;
	}

	public String getS_tea_id() {
		return s_tea_id;
	}

	public String getS_Class_number() {
		return s_Class_number;
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

	public String getStu_tel() {
		return stu_tel;
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

	public String getStu_BMN() {
		return stu_BMN;
	}

	public String getSco_Number() {
		return sco_Number;
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

	public String getBd_number() {
		return bd_number;
	}

	public String getBd_stu_number() {
		return bd_stu_number;
	}

	public String getBd_tea_number() {
		return bd_tea_number;
	}

	public String getBd_content() {
		return bd_content;
	}

	public String getBd_NOP() {
		return bd_NOP;
	}

	public String getBm_number() {
		return bm_number;
	}

	public String getBm_stu_id() {
		return bm_stu_id;
	}

	public String getBm_bd_number() {
		return bm_bd_number;
	}

	String bd_stu_number;
	String bd_tea_number;
	String bd_content;
	String bd_NOP;// number of people
	// ����
	String bm_number;
	String bm_stu_id;
	String bm_bd_number;

}
