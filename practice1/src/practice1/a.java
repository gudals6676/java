package practice1;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������� : ");
		int now = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();
		int week = 1;
		while(now > goal) {
			System.out.print(week+"���� ���� ������ : ");
			int num = sc.nextInt();
			week++;
			now -= num;
			
		}
         System.out.println(now+"kg �޼�!! �����մϴ�!");
	}

}
