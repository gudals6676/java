package JDBC;
import java.util.Scanner;

public class Ex00Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===ȸ�������ý���===");
		System.out.println("1.ȸ������ 2.ȸ������ 3.ȸ������ 4.ȸ����ü�˻� 5.ȸ���˻�");
		
        boolean sw = true;//����Ī����
        Rule_inter inter = null;
		while (sw) {
			
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("ȸ�����Ա�ɽ���");
				inter = new Ex01Insert();
				inter.execute();
				break;
			case 2:
				System.out.println("ȸ��������ɽ���");
				inter = new Ex02Delete();
				inter.execute();
				break;
			case 3:
				System.out.println("ȸ��������ɽ���");
				inter = new Ex03Update();
				inter.execute();
				break;
			case 4:
				System.out.println("ȸ����ü�˻���ɽ���");
				inter = new Ex04Select();
				inter.execute();
				break;
			case 5:
				System.out.println("ȸ���˻���ɽ���");
				inter = new Ex05OneSelect();
				inter.execute();
				break;
			case 6:
				System.out.println("���α׷�����");
				sw = false;//����Ī����
				break;
			}
		}
		// ����� ��� �ݺ��ǰ� ��������

	}

}