import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookData[] a = new BookData[5];
		a[0] = new BookData("Java",21000,"ȫ�浿");
		a[1] = new BookData("C++",29000,"�ڹ���");
		a[2] = new BookData("Database", 31000, "���嵶");
		a[3] = new BookData("Android", 18000, "�̼���");
		a[4] = new BookData("Web",26000, "��ö��");
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		System.out.println("���� ������ å ���");
		for (int i = 0; i < a.length; i++) {
			if(money > a[i].getPrice()) {
				System.out.println("["+a[i].getTitle()+","+a[i].getWriter()+","+a[i].getPrice()+"�� ]");
			}
		}
		
	}

}
