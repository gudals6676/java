import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opr;
		do {
			System.out.print("ù ��° ������ �Է��ϼ���>> ");
			int num = sc.nextInt();
			System.out.print("�� ��° ������ �Է��ϼ���>> ");
			int num1 = sc.nextInt();
			System.out.print("[1]���ϱ� [2]����>> ");
			int num2 = sc.nextInt();
			if (num2 == 1) {
				System.out.println("���ϱ� ���� �����>>" + (num + num1));
			} else {
				System.out.println("���� ���� �����>>" + (num - num1));
			}

			System.out.print("�ٽ� �����Ͻðڽ��ϱ�? (Y/N)>> ");
			opr = sc.next();
		} while (opr.equals("n"));
		System.out.println("����Ǿ����ϴ�.");

	}

}
