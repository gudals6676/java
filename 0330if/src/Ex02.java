import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextint();
		
		//age�� 20�� �̻��̸� "�����Դϴ�" ���
		//���ϸ�"�̼������Դϴ�" ���
		
		/*if(age>=20) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�̼����� �Դϴ�.");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		int num = sc.nextInt();
		
		if(num % 3 == 0&&num % 5 == 0){
			System.out.println("3�� 5�� ����Դϴ�.");
		}else {
			System.out.println("3�� 5�� ����� �ƴմϴ�.");
		}
			
		
		
		

	}

}
