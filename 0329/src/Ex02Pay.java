import java.util.Scanner;

public class Ex02Pay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--더치페이 계산기--");
		System.out.println("몇 명인가요?");
		int num1 =sc.nextInt();
		
		System.out.println("총 금액은 얼마인가요?");
		int num2 =sc.nextInt();
		
	   
	    System.out.println("각 자 지불해야 할 금액 :" + (num2 / num1));
	    
	 
	    
	   	    
		

	}

}
