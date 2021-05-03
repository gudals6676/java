package practice2;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("총금액 입력 : ");
        int money = sc.nextInt();
        
        System.out.println("잔돈 : "+money);
        System.out.println("10000원 : "+money/10000+"개");
        System.out.println("5000원 : "+money%10000/5000+"개");
        System.out.println("1000원 : "+money%10000%5000/1000+"개");
        System.out.println("500원 : "+money%10000%5000%1000/500+"개");
        System.out.println("100원 : "+money%10000%5000%1000%500/100+"개");
	}

}
