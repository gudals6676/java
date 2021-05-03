import java.util.Scanner;

public class Ex05Div1 {

	public static void main(String[] args) {
		int num = 456;
		
		//나누기의 몫과 나머지를 통해서 계산하시오.
		
		
		System.out.println("결과확인 :" + (num/100)*100);
		
		System.out.println("결과확인 :" + ((num/100)*10)+1);
		
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		//1시간 : 3600 /1분 :60초
		
		System.out.print(num1/3600+"시");
		System.out.print((num1%3600)/60+"분");
		System.out.print((num1%3600)%60+"초");
		
		
		
		

	}

}
