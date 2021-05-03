import java.util.Scanner;

public class Ex051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0, cnt = 0;
		do {
			System.out.println("숫자를 입력하세요 >>");
			num = sc.nextInt();
			
			if (num >= 0 && num <=100) {
			sum += num; // sum= sum+num
			cnt++; //cnt+=1
			}
		} while (num >= 0 && num <=100);
          System.out.println("합계 : "+sum);
          System.out.println("평균 : "+ ((float)sum/cnt));
	}

}
