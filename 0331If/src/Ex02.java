import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		String opr = sc.next();
		System.out.print("ù��° ���� : ");
		int num = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num1 = sc.nextInt();

		if (opr.equals("+")) {
			System.out.println(num + "�� " + num1 + "�� ����" + (num + num1) + "�Դϴ�");
		} else if (opr.equals("-")) {
			System.out.println(num + "�� " + num1 + "�� ������" + (num - num1) + "�Դϴ�");
		} else if (opr.equals("*")) {
			System.out.println(num + "�� " + num1 + "�� ������" + (num * num1) + "�Դϴ�");
		} else {
			System.out.println(num + "�� " + num1 + "�� �������" + (num / num1) + "�Դϴ�");
		}
	}

}
