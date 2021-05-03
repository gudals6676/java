package practice2;

import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.print("소인수분해 할 수를 입력하세요.: ");
         int num = sc.nextInt();
         System.out.print(num+" = ");
         for (int i = 2; 1 < num;) {
			if(num % i == 0) {
				System.out.print(i+"");
				if(num != i) {
					System.out.print("*");
				}
				num /= i;
			}else {
				i++;
			}
			
		}
	}

}
