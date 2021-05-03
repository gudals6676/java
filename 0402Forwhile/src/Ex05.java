import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//정수를 입력 받아 1 부터 입력 받은 정수까지 차례대로 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			System.out.print(i+" ");
		}
        System.out.println();
	}

}
