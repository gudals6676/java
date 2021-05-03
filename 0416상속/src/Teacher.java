
public class Teacher extends Person {
//
//	 private String name;
//	 private String job;
//	 private int age;
	private int pay; // teacher만 가지고있는 항목

	public Teacher(String name, int age, int pay) {
		super(name, "선생님", age);
		this.pay = pay;
	}

	public int getPay() {
		return pay;
	}

	public void teach() {
		System.out.println("가르치기!");
	}
}
