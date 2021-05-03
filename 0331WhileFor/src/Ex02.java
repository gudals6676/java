import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {			
			System.out.print("정수입력 : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}

}
