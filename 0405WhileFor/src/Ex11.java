import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("���� �Է� : ");
       int num = sc.nextInt();
       System.out.print(num+"�� ��� : ");
      
       
       for (int i = 1; i <= num; i++) {
		   if(num % i == 0) {
			   System.out.print(i+" ");
		   }		   
	}      
	}

}
