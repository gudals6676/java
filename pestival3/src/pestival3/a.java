package pestival3;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
       System.out.print("Çà °³¼ö : ");
       int hang = sc.nextInt();
       
       for (int i = 0; i < hang; i++) {
		for (int j = hang; j > i;  j--) {
			System.out.print("*");
		}System.out.println();
	}
	}

}
