import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   System.out.print("연산을 입력 : ");
		   String opr =sc.next();
	       System.out.print("첫번째 정수 : ");
		   int num = sc.nextInt();
		   System.out.print("두번째 정수 : ");
	       int num1 = sc.nextInt();		
			
		    if (opr.equals  ("+")) {
		    System.out.println(num+"과 "+ num1+"의 합은"+(num+num1)+"입니다");
		   }else if (opr.equals ("-")) {	   
			System.out.println(num+"과 "+ num1+"의 뺄셈은"+(num-num1)+"입니다");
		   }else if (opr.equals ("*")) {	
			System.out.println(num+"과 "+ num1+"의 곱셈은"+(num*num1)+"입니다");
		   }else {
			System.out.println(num+"과 "+ num1+"의 나누기는"+(num/num1)+"입니다");
			
		    switch (opr) {
			case "+":
				System.out.println(num+num1);	
				break;
			case "-":
				System.out.println(num-num1);
				break;
			case "*":
				System.out.println(num*num1);
				break;
			case "/":
				System.out.println(num/num1);
				break;

			default:
				break;
			}
/*		switch(num) {
		
		case 1:
			System.out.println("입력한 값은 숫자 1 입니다.");
			break;
		case 2 :
			System.out.println("입력한 값은 숫자 2 입니다.");
			break;
		
	    default :
	    	System.out.println("입력한 값은 1, 2가 아닙니다.");
	    	break;
		//if문과 switch의 차이점
		//if문 : 조건을 순차적으로 하나하나 비교(범위1~100)
        //switch : 조건을 보고 해당 조건에 실행문 진입
*/	    	
	    	
	}

 }
}