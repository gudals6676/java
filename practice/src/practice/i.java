package practice;

import java.util.Scanner;

public class i {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("소인수분해 할 수 입력 : ");
	int num = sc.nextInt();
	System.out.print(num + "="); // num= 식
    for (int i = 2; i < num; i++) {
		while (num % i == 0) {
			System.out.print(i + "*");
			num /= i;
		}
	}
   System.out.println(num); //후에 num/i 
	}

}
