import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("�뵿�ð��� �Է��ϻ��� : ");
		int num1 = sc.nextInt();
		int pay = 5000;
		

		System.out.print("�� �ӱ��� ");
		System.out.print(num1 > 8 ? 40000 +(int)((num1-8)*5000*1.5) : num1 * 5000 );
		System.out.print("�� �Դϴ�.");
		
		
		
		
		

	}

}
