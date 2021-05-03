import java.util.Scanner;

public class Ex05a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int num1 = sc.nextInt();
		if ((num <= 100 && num1 <= 100)) {
			if (num > num1) {
				for (int i = num1; i <= num; i++) {
					System.out.println(i);
				}
			}
		} else {

			for (int i = num; i <= num1; i++) {
				System.out.println(i);
			}

		}
//        치환방법
//        
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(num2<num1) {
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		for(int i = num1;i<=num2;i++) {
//			System.out.println(i+" ");
//		}
//		
	}
}