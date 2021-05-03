
public class PiggyBankMain {

	public static void main(String[] args) {
		
	PiggyBank m	= new PiggyBank();
     
	m.deposit(1000);
	
	System.out.println("ÇöÀç ÀÜ¾× : "+m.showMoney());
	
	m.withdraw(500);
	System.out.println("ÇöÀç ÀÜ¾× : "+m.showMoney());
	
	 //m.money = 1000000; 
	}

}
