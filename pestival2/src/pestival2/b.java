package pestival2;

import java.util.ArrayList;
import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("N �Է�: ");
		int n = sc.nextInt();
		System.out.print("X �Է�: ");
		int x = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >> ");
			int num = sc.nextInt();
			if (num < x) {
				list.add(num);
			}
		}
		System.out.print("���>> ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
