package pestival2;

import java.util.ArrayList;
import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("N 입력: ");
		int n = sc.nextInt();
		System.out.print("X 입력: ");
		int x = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			int num = sc.nextInt();
			if (num < x) {
				list.add(num);
			}
		}
		System.out.print("결과>> ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
