package 추상Employee;

public class TempEmployee extends Employee {

	private String empno;
	private String name;
	private int pay; // 연봉

	public TempEmployee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	@Override
	public int getMoneyPay() { // 월급여

		return pay / 12;
	}
	@Override
	public void print() {
		System.out.println(empno + ":" + name + ":" + pay);
	}

}
