import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// * ����Ī����
		boolean sw = true;

		while (sw) {
			System.out.println("�ݾ��� �Է��ϼ���");
			int money = sc.nextInt();
			int money_after = 0;
			System.out.println("�޴��� ������");
			System.out.println("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��)");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("�ݶ� �����ϼ̽��ϴ�!");
				money_after = money - 800;
				System.out.println("���ְ� �弼��^^");
				break;
			case 2:
				System.out.println("������ �����ϼ̽��ϴ�!");
				money_after = money - 500;
				break;

			case 3:
				System.out.println("��Ÿ�ο��͸� �����ϼ̽��ϴ�!");
				money_after = money - 1500;

				break;
			case 4:
				System.out.println("���α׷� ����");
				sw = false;
				break;
			}
			if (money_after < 0) {
				System.out.println("���� �����մϴ�.");
			} else {
				System.out.println("�ܵ�:" + (money_after));
				System.out.println("õ��:" + (money_after) / 1000);
				System.out.println("�����:" + (money_after) % 1000 / 500);
				System.out.println("���:" + (money_after) % 1000 % 500 / 100);
			}
		}

	}

}
