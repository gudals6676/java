package practie3;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
      System.out.print("n>>");
      int n = sc.nextInt();
      int cnt = 1;
      int[][]arr = new int[n][n];
      for (int i = 0; i < arr.length; i++) {
		if(i % 2 == 0) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]= cnt++;
			}
		}else {
			for (int j = arr.length-1; j >= 0; j--) {
				arr[i][j] = cnt++;
			}
		}
	}
      for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j]+"\t");
		}System.out.println();
	}
	}

}
