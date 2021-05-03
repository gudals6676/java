package pestival1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("n ют╥б: ");
        int num = sc.nextInt();
        int[][]arr = new int[num][num];
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=cnt++;
			}
		}
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
	}

}
