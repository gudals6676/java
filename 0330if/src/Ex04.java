import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱݾ� �Է� : ");
		int num = sc.nextInt();
        System.out.println("�ܵ� : "+ num+"��");
        int num_10000 = num/10000;
        int num_5000 = (num%10000)/5000;
        int num_1000 = ((num%10000)%5000)/1000;
        int num_500 = (((num%10000)%5000)%1000)/500;
        int num_100 = ((((num%10000)%5000)%1000)%500)/100;
        
        System.out.println("10000�� :"+ num_10000+"��");
        System.out.println("5000 :"+ num_5000+"��");
        System.out.println("1000�� :"+ num_1000+"��");
        System.out.println("500�� :"+ num_500+"��");
        System.out.println("100�� :"+ num_100+"��");
        
        
        
	}

}
