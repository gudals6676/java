package m;

public class Vo {
	String Studentnumber; // 기본 키는 _없이 선언
	String Student_id;
	String Student_pw;
	String Student_name;
	String Student_age;
	String Student_tel;
	String Student_address;
	String Student_email;
	String Student_data;
	String Student_claas_Number; // 외래는 _2중 형식 선언
	String Student_tacher_Tachernumber;

	String Teachernumber;
	String teacher_id;
	String teacher_pw;
	String teacher_name;
	String teacher_subject;

	String Student_Studentnumber;
	String Score_JavaScore;
	String Score_JavaTestScore;
	String Score_PythonScore;
	String Score_PythonTestScore;

	String classNumber;
	String class_className;
	String class_startDate;
	String class_endDate;
	String class_branch;
	String class_tacher_Tachernumber;// 외래는 _2중 형식 선언

	String Boardnumber;
	String board_date;
	String board_time;
	String board_place;
	String board_peoplenumber;
	String board_Student_Studentnumber;// 외래는 _2중 형식 선언
	public Vo(String studentnumber, String student_id, String student_pw, String student_name, String student_age,
			String student_tel, String student_address, String student_email, String student_data,
			String student_claas_Number, String student_tacher_Tachernumber, String teachernumber, String teacher_id,
			String teacher_pw, String teacher_name, String teacher_subject, String student_Studentnumber,
			String score_JavaScore, String score_JavaTestScore, String score_PythonScore, String score_PythonTestScore,
			String classNumber, String class_className, String class_startDate, String class_endDate,
			String class_branch, String class_tacher_Tachernumber, String boardnumber, String board_date,
			String board_time, String board_place, String board_peoplenumber, String board_Student_Studentnumber) {
		super();
		Studentnumber = studentnumber;
		Student_id = student_id;
		Student_pw = student_pw;
		Student_name = student_name;
		Student_age = student_age;
		Student_tel = student_tel;
		Student_address = student_address;
		Student_email = student_email;
		Student_data = student_data;
		Student_claas_Number = student_claas_Number;
		Student_tacher_Tachernumber = student_tacher_Tachernumber;
		Teachernumber = teachernumber;
		this.teacher_id = teacher_id;
		this.teacher_pw = teacher_pw;
		this.teacher_name = teacher_name;
		this.teacher_subject = teacher_subject;
		Student_Studentnumber = student_Studentnumber;
		Score_JavaScore = score_JavaScore;
		Score_JavaTestScore = score_JavaTestScore;
		Score_PythonScore = score_PythonScore;
		Score_PythonTestScore = score_PythonTestScore;
		this.classNumber = classNumber;
		this.class_className = class_className;
		this.class_startDate = class_startDate;
		this.class_endDate = class_endDate;
		this.class_branch = class_branch;
		this.class_tacher_Tachernumber = class_tacher_Tachernumber;
		Boardnumber = boardnumber;
		this.board_date = board_date;
		this.board_time = board_time;
		this.board_place = board_place;
		this.board_peoplenumber = board_peoplenumber;
		this.board_Student_Studentnumber = board_Student_Studentnumber;
	}
	public String getStudentnumber() {
		return Studentnumber;
	}
	public String getStudent_id() {
		return Student_id;
	}
	public String getStudent_pw() {
		return Student_pw;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public String getStudent_age() {
		return Student_age;
	}
	public String getStudent_tel() {
		return Student_tel;
	}
	public String getStudent_address() {
		return Student_address;
	}
	public String getStudent_email() {
		return Student_email;
	}
	public String getStudent_data() {
		return Student_data;
	}
	public String getStudent_claas_Number() {
		return Student_claas_Number;
	}
	public String getStudent_tacher_Tachernumber() {
		return Student_tacher_Tachernumber;
	}
	public String getTeachernumber() {
		return Teachernumber;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public String getTeacher_pw() {
		return teacher_pw;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public String getTeacher_subject() {
		return teacher_subject;
	}
	public String getStudent_Studentnumber() {
		return Student_Studentnumber;
	}
	public String getScore_JavaScore() {
		return Score_JavaScore;
	}
	public String getScore_JavaTestScore() {
		return Score_JavaTestScore;
	}
	public String getScore_PythonScore() {
		return Score_PythonScore;
	}
	public String getScore_PythonTestScore() {
		return Score_PythonTestScore;
	}
	public String getClassNumber() {
		return classNumber;
	}
	public String getClass_className() {
		return class_className;
	}
	public String getClass_startDate() {
		return class_startDate;
	}
	public String getClass_endDate() {
		return class_endDate;
	}
	public String getClass_branch() {
		return class_branch;
	}
	public String getClass_tacher_Tachernumber() {
		return class_tacher_Tachernumber;
	}
	public String getBoardnumber() {
		return Boardnumber;
	}
	public String getBoard_date() {
		return board_date;
	}
	public String getBoard_time() {
		return board_time;
	}
	public String getBoard_place() {
		return board_place;
	}
	public String getBoard_peoplenumber() {
		return board_peoplenumber;
	}
	public String getBoard_Student_Studentnumber() {
		return board_Student_Studentnumber;
	}

}
