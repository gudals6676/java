package practice1;

import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
       int num = sc.nextInt();
       System.out.print(num + "=");
       for (int i = 2; i < num; i++) {
		while(num % i == 0) {
			System.out.print(i+"*");
			num /= i;
		}
	}
       System.out.println(num);
	}

}
