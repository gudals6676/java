package practice2;

import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
       System.out.print("����1�Է�>> ");
       int num1 = sc.nextInt();
       System.out.print("����2�Է�>> ");
       int num2 = sc.nextInt();
       int max = 0;
       for (int i = 1; i < num1; i++) {
		if(num1 % i == 0 && num2 % i == 0 ) {
			max = i;
		}
	}
       System.out.println("�ִ����� : "+max);
       System.out.println("�ּҰ���� : "+ num1*num2/max);
	}

}
