package practice2;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("���ѽð��� �Է��ϼ��� : ");
        int work = sc.nextInt();
        
        System.out.print("�� �ӱ��� ");
        System.out.print(work > 8 ? 40000+(int)((work-8)*5000*1.5 ): work * 5000);
        System.out.print("�� �Դϴ�.");
	}

}
