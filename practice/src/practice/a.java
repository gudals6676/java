package practice;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = 1;
		System.out.print("��������� : ");
		int now = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();
		while(now > goal) {
			System.out.print(week+"���� ���� ������ : ");
			int num = sc.nextInt();
			now -= num;
		}
		System.out.println(now+"kg �޼�!! �����մϴ�!");
		
	}

}
