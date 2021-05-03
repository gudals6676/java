import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int num = sc.nextInt();
        System.out.println("잔돈 : "+ num+"원");
        int num_10000 = num/10000;
        int num_5000 = (num%10000)/5000;
        int num_1000 = ((num%10000)%5000)/1000;
        int num_500 = (((num%10000)%5000)%1000)/500;
        int num_100 = ((((num%10000)%5000)%1000)%500)/100;
        
        System.out.println("10000원 :"+ num_10000+"개");
        System.out.println("5000 :"+ num_5000+"개");
        System.out.println("1000원 :"+ num_1000+"개");
        System.out.println("500원 :"+ num_500+"개");
        System.out.println("100원 :"+ num_100+"개");
        
        
        
	}

}
