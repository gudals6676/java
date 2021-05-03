import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num%10>5) {
          System.out.print("반올림 수: "+(10-num%10+num));
	}else {
         System.out.println("반올림 수 : "+ (num-(num%10)));
}
}
}