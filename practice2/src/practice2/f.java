package practice2;

import java.util.Scanner;

public class f {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if (num % 10 > 5) {
			System.out.println("�ݿø� �� : "+ (num/10*10+10));
		}else {
			System.out.println("�ݿø� �� : "+ (num - num%10));
		}
	}

}
