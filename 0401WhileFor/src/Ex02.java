import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opr;
		do {
			System.out.print("첫 번째 정수를 입력하세요>> ");
			int num = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요>> ");
			int num1 = sc.nextInt();
			System.out.print("[1]더하기 [2]빼기>> ");
			int num2 = sc.nextInt();
			if (num2 == 1) {
				System.out.println("더하기 연산 결과는>>" + (num + num1));
			} else {
				System.out.println("빼기 연산 결과는>>" + (num - num1));
			}

			System.out.print("다시 실행하시겠습니까? (Y/N)>> ");
			opr = sc.next();
		} while (opr.equals("n"));
		System.out.println("종료되었습니다.");

	}

}
