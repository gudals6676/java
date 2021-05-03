package javapractice;

import java.util.Random;

public class while03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
	int num1,num2;
	
		
	do {
		num1 = rd.nextInt(6)+1;
		num2 = rd.nextInt(6)+1;
		System.out.printf("(%d,%d)%n", num1, num2);
		
		
		
		
	}while(num1 + num2 !=5);

	}

}
