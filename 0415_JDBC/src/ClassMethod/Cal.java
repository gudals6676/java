package ClassMethod;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		//���ϱ�, ����, ������, ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.print("����1 : ");
        int num1 = sc.nextInt();
        System.out.print("����2 : ");
        int num2 = sc.nextInt();
        System.out.println("1. ���ϱ� 2.���� 3.������ 4.���ϱ�");
        int num3 = sc.nextInt();
        //ȣ��+ȭ�����, ���
        switch (num3) {
		case 1:
			Plus��ȣ p = new Plus��ȣ();
			int r1 = p.plus(num1, num2);
			System.out.println(r1);
			break;
		case 2:
			Minus���� m = new Minus����();
			int r2 = m.minus(num1, num2);
			System.out.println(r2);
			break;
		default:
			break;
		}   
        
	}

}
