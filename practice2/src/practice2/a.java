package practice2;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� : ");
		int now = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();
		int week = 1;
		while (now > goal) {
			System.out.print(week + "���� ���� ������ : ");
			int num = sc.nextInt();
			now -= num;

		}
		System.out.println(now + "kg �޼�!! �����մϴ�!");
	}

}
