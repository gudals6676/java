import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
	    int num = sc.nextInt();
	    System.out.print("���ڰ��� ���� : ");
	    int num1 = sc.nextInt();
	    System.out.print("OS: ");
	    int num2 = sc.nextInt();
	    System.out.print("������ ��� : ");
	    int num3 = sc.nextInt();
		System.out.print("����Ʈ������� :");
		
		int num4 = sc.nextInt();
		
		int sum = num1+num+num2+num3+num4;
		if (num < 8 || num1<8||num2<8|| num3<8|| num4<8 || sum<60) {
		System.out.println("���հ��Դϴ�!");				
		}else  {
		System.out.println("�հ��Դϴ�!");	
		
		
	}

	}		
		
}
	
