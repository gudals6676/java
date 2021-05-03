package practice;

import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n ют╥б : ");
	    int n = sc.nextInt();
	    int num = 1;
	    for (int i = 1; i <=n; i++) {
	    	
			System.out.print(num + " ");
			num += i;
		}
	}

}
