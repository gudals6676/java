package practice2;

import java.util.Scanner;

public class h {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n ют╥б : ");
		int n = sc.nextInt();
		int j = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(j + " ");
			j += i;
		}
	}
}
