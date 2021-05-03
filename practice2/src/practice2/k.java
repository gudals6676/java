package practice2;

import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("숫자입력>> ");
         int num = sc.nextInt();
         int i = 0;
         int[]arr = new int[32];
         while(num != 1) {
        	 arr[i++] = num % 2;
        	 num /= 2;
         }
         arr[i]= num;
         for (int j = i; j >= 0; j--) {
			System.out.print(arr[j]+" ");
		}
	}

}
