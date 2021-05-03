package practice1;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// 5000
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int work = sc.nextInt();
		
		System.out.print("총 임금은 ");
		System.out.print(work > 8 ? 40000+(int)((work - 8)*5000*1.5) : work * 5000);
        System.out.print("원 입니다.");
	}

}
