package practice1;

import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("최대 공약수&최소 공배수 구하기");
        
        System.out.print("숫자1입력>> ");
        int num = sc.nextInt();
        System.out.print("숫자2입력>> ");
        int num1 = sc.nextInt();
        int max = 0;
        for (int i = 1; i <= num; i++) {
        	if (num % i == 0 && num1 % i ==0) {
        		max = i;
        	}
			
		}
        System.out.println("최대공약수: "+max);
        System.out.println("최소공배수: "+num*num1/max);
	}

}
