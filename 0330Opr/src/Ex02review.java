import java.util.Scanner;

public class Ex02review {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("Java ���� �Է� : ");
		int num1 =sc.nextInt();
		System.out.print("Web ���� �Է� : ");
		int num2 =sc.nextInt();
		
		System.out.print("Android ���� �Է� : ");
		int num3 =sc.nextInt();
		int sum = num1+num2+num3;
		int avg = sum/3;
		
		System.out.println("�հ� : "+ sum);
		System.out.println("��� : "+ avg);
	   
	    
	    

	}

}
