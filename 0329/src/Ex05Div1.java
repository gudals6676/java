import java.util.Scanner;

public class Ex05Div1 {

	public static void main(String[] args) {
		int num = 456;
		
		//�������� ��� �������� ���ؼ� ����Ͻÿ�.
		
		
		System.out.println("���Ȯ�� :" + (num/100)*100);
		
		System.out.println("���Ȯ�� :" + ((num/100)*10)+1);
		
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		//1�ð� : 3600 /1�� :60��
		
		System.out.print(num1/3600+"��");
		System.out.print((num1%3600)/60+"��");
		System.out.print((num1%3600)%60+"��");
		
		
		
		

	}

}
