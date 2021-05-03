package practice;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.print("-" + i +" ");
				j -= i;
			}else {
				System.out.print(i + " ");
				j += i;
			}
		}
		System.out.println();
		System.out.print("°á°ú : "+ j);
	}

}
