
public class PiggyBankMain {

	public static void main(String[] args) {
		
	PiggyBank m	= new PiggyBank();
     
	m.deposit(1000);
	
	System.out.println("���� �ܾ� : "+m.showMoney());
	
	m.withdraw(500);
	System.out.println("���� �ܾ� : "+m.showMoney());
	
	 //m.money = 1000000; 
	}

}
