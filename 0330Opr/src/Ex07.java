import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("노동시간을 입력하새요 : ");
		int num1 = sc.nextInt();
		int pay = 5000;
		

		System.out.print("총 임금은 ");
		System.out.print(num1 > 8 ? 40000 +(int)((num1-8)*5000*1.5) : num1 * 5000 );
		System.out.print("원 입니다.");
		
		
		
		
		

	}

}
