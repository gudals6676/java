import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// �ñ� 5000�� 8�ð� �ʰ��ٹ� 1.5��
		Scanner sc = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.print("�� �ӱ��� ");
		System.out.print(num > 8 ? 40000+(int)((num-8)*5000*1.5):num*5000);
		System.out.print("�Դϴ�.");

	}

}
