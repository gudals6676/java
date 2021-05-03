package DaoVo;

public class ClassVO {
	private String class_number;
	public String getClass_number() {
		return class_number;
	}
	public void setClass_number(String class_number) {
		this.class_number = class_number;
	}
	public String getTea_id() {
		return tea_id;
	}
	public void setTea_id(String tea_id) {
		this.tea_id = tea_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_branch() {
		return class_branch;
	}
	public void setClass_branch(String class_branch) {
		this.class_branch = class_branch;
	}
	private String tea_id;
	private String class_name;
	private String class_branch;
	
}
