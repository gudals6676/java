
public class Teacher extends Person {
//
//	 private String name;
//	 private String job;
//	 private int age;
	private int pay; // teacher�� �������ִ� �׸�

	public Teacher(String name, int age, int pay) {
		super(name, "������", age);
		this.pay = pay;
	}

	public int getPay() {
		return pay;
	}

	public void teach() {
		System.out.println("����ġ��!");
	}
}
