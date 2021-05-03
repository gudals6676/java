package ClassMethod;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		//더하기, 빼기, 나누기, 곱하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요.");
		System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        System.out.println("1. 더하기 2.빼기 3.나누기 4.곱하기");
        int num3 = sc.nextInt();
        //호출+화면출력, 기능
        switch (num3) {
		case 1:
			Plus민호 p = new Plus민호();
			int r1 = p.plus(num1, num2);
			System.out.println(r1);
			break;
		case 2:
			Minus영주 m = new Minus영주();
			int r2 = m.minus(num1, num2);
			System.out.println(r2);
			break;
		default:
			break;
		}   
        
	}

}
