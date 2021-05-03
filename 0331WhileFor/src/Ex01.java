import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 반복문
		// 1. 범위 반복(배열, 리스트등) For
		// 2. 특정 시점까지 반복(무한반복) While
		Scanner sc = new Scanner(System.in);
		while (true) {
			// while :조건식 true였을 때 반복
			// 사용자에게 0이라는 값을 입력 받았을 때 종료
			int num = sc.nextInt();
			System.out.println("사용자가 입력한 값 :" + num);
			if (num == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
