import java.util.Scanner;

public class Ex05f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		while(true) {
			System.out.println("숫자를 입력하세요 ");
			int num = sc.nextInt();
			if (num > 0 && num <= 100) {
				sum += num;
				cnt++; // cnt+=1; 
			}else {
				break;
			}
			
		}
		System.out.println("합계:"+ sum);
		System.out.println("평균:"+ ((float)sum / cnt));

	}

}
