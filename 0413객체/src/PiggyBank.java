
public class PiggyBank {

	//속성
	//캡슐화 (정보은닉)
	private int money;
	//접근제한자(public, protected, default , private)
	//public : 어디서든 접근 가능
	//protected : 같은 패키지, 상속관계에 있을때 접근 가능
	//default : 같은 패키지에 있을때 접근 가능(접근제한자를 안쓰면 default)    
	//private : 현재 객체에서만 접근 가능
	
	public void deposit(int money) {
		this.money += money; //입급  this. 자기자신 속성값
	}
	public void withdraw(int n) {
		money -= n; //출금
	}
	public int showMoney() {
		return money;
	}
}
