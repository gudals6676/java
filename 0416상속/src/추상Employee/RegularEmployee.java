package 추상Employee;

public class RegularEmployee extends Employee {
	private String empno;
	private String name;
	private int pay; // 연봉
	private int bonus; // 한달에 일한 날

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() { // 월급여

		return (pay + bonus) / 12;
	}

	@Override
	public void print() {
		System.out.println(empno + ":" + name + ":" + pay);
	}

}
