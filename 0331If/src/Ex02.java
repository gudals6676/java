import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력 : ");
		String opr = sc.next();
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num1 = sc.nextInt();

		if (opr.equals("+")) {
			System.out.println(num + "과 " + num1 + "의 합은" + (num + num1) + "입니다");
		} else if (opr.equals("-")) {
			System.out.println(num + "과 " + num1 + "의 뺄셈은" + (num - num1) + "입니다");
		} else if (opr.equals("*")) {
			System.out.println(num + "과 " + num1 + "의 곱셈은" + (num * num1) + "입니다");
		} else {
			System.out.println(num + "과 " + num1 + "의 나누기는" + (num / num1) + "입니다");
		}
	}

}
