import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 12:
		case 1:
		case 2:
			System.out.println(num + "���� �ܿ��Դϴ�!");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num + "���� ���Դϴ�!");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "���� �����Դϴ�!");
			break;
		default:
			System.out.println(num + "���� �����Դϴ�!");
			break;
		}

	}

}
