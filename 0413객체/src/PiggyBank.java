
public class PiggyBank {

	//�Ӽ�
	//ĸ��ȭ (��������)
	private int money;
	//����������(public, protected, default , private)
	//public : ��𼭵� ���� ����
	//protected : ���� ��Ű��, ��Ӱ��迡 ������ ���� ����
	//default : ���� ��Ű���� ������ ���� ����(���������ڸ� �Ⱦ��� default)    
	//private : ���� ��ü������ ���� ����
	
	public void deposit(int money) {
		this.money += money; //�Ա�  this. �ڱ��ڽ� �Ӽ���
	}
	public void withdraw(int n) {
		money -= n; //���
	}
	public int showMoney() {
		return money;
	}
}
