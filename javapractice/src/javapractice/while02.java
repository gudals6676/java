package javapractice;

import java.util.Random;
import java.util.Scanner;

public class while02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();

		while (true) {
			int num1 = rd.nextInt(6) + 1;
			int num2 = rd.nextInt(6) + 1;
			System.out.printf("(%d,%d)%n", num1, num2);
			if (num1 + num2 == 5) {
				break;
			}
		}
	}

}
