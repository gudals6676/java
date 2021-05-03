import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 12:
		case 1:
		case 2:
			System.out.println(num + "월은 겨울입니다!");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다!");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다!");
			break;
		default:
			System.out.println(num + "월은 가을입니다!");
			break;
		}

	}

}
