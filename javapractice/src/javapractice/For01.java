package javapractice;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// 10�� ������ �Է��ϰ� ¦��,Ȧ�� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
	int num;
	int j=0 ,k=0;
      for (int i = 1; i < 11; i++) {
		num = sc.nextInt();
		if(num % 2 ==0) {
			j++;
		}else {
			k++;
		}
		
	}System.out.println("¦�� ����: "+j);
	System.out.println("Ȧ�� ����: "+k);
	}

}
