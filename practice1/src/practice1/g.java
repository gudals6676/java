package practice1;

import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
        
        System.out.print("����1�Է�>> ");
        int num = sc.nextInt();
        System.out.print("����2�Է�>> ");
        int num1 = sc.nextInt();
        int max = 0;
        for (int i = 1; i <= num; i++) {
        	if (num % i == 0 && num1 % i ==0) {
        		max = i;
        	}
			
		}
        System.out.println("�ִ�����: "+max);
        System.out.println("�ּҰ����: "+num*num1/max);
	}

}
