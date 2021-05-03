import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 시급 5000원 8시간 초과근무 1.5배
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("총 임금은 ");
		System.out.print(num > 8 ? 40000+(int)((num-8)*5000*1.5):num*5000);
		System.out.print("입니다.");

	}

}
