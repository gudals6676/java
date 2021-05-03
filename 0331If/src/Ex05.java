import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// * 스위칭변수
		boolean sw = true;

		while (sw) {
			System.out.println("금액을 입력하세요");
			int money = sc.nextInt();
			int money_after = 0;
			System.out.println("메뉴를 고르세요");
			System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원)");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("콜라를 선택하셨습니다!");
				money_after = money - 800;
				System.out.println("맛있게 드세요^^");
				break;
			case 2:
				System.out.println("생수를 선택하셨습니다!");
				money_after = money - 500;
				break;

			case 3:
				System.out.println("비타민워터를 선택하셨습니다!");
				money_after = money - 1500;

				break;
			case 4:
				System.out.println("프로그램 종료");
				sw = false;
				break;
			}
			if (money_after < 0) {
				System.out.println("돈이 부족합니다.");
			} else {
				System.out.println("잔돈:" + (money_after));
				System.out.println("천원:" + (money_after) / 1000);
				System.out.println("오백원:" + (money_after) % 1000 / 500);
				System.out.println("백원:" + (money_after) % 1000 % 500 / 100);
			}
		}

	}

}
