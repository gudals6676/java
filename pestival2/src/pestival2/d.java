package pestival2;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("N ют╥б : ");
       int n = sc.nextInt();
       int[][]arr = new int[n][n];
       int cnt = 1;
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] =cnt++;
		}
	}
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[j][i]+"\t");
		}System.out.println();
	}
	}

}
