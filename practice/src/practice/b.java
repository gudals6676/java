package practice;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//money = 5000
	System.out.print("���ѽð��� �Է��ϼ��� : ");
	int work = sc.nextInt();
	
	System.out.print("�� �ӱ���");
	System.out.print(work > 8 ? 40000+(int)((work-8)*5000*1.5) : work * 5000);
	System.out.print("�� �Դϴ�.");
	}

}
