package javapractice;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// 10개 정수를 입력하고 짝수,홀수 개수 구하기
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
		
	}System.out.println("짝수 개수: "+j);
	System.out.println("홀수 개수: "+k);
	}

}
