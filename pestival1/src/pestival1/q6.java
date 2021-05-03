package pestival1;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("n ют╥б: ");
       int n = sc.nextInt();
       int[][]arr = new int[n][n];
       int cnt = 1;
      for (int i = 0; i < arr.length; i++) {
    	  if(i % 2 == 0) {
    		  for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
    	  }else {
    		  for (int j = arr.length-1; j >= 0; j--) {
				arr[i][j] = cnt++;
			}
    	  }
		
	}
      for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+"\t");
		}System.out.println();
	}
	}

}
