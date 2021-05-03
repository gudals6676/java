import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextint();
		
		//age가 20세 이상이면 "성인입니다" 출력
		//이하면"미성년자입니다" 출력
		
		/*if(age>=20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자 입니다.");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		if(num % 3 == 0&&num % 5 == 0){
			System.out.println("3과 5의 배수입니다.");
		}else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}
			
		
		
		

	}

}
