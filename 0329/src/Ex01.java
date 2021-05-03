import java.util.Scanner;

public class Ex01 { //현재 작업하고 있는 파일이 Java파일
       //Java파일에서 단위를 중괄호로{} 구분
	public static void main(String[] args) {
		    //Java파일이 시작됐을 때 가장 먼저 실행되눈 영역
		
            //출력과 입력
		    //문자출력
             System.out.print("hello world~!");
             System.out.println("hello world~!");
             System.out.println("hello world~!");
            //숫자 출력
             System.out.println(1+1);
             System.out.println(1-1);
             System.out.println(1*1);
             System.out.println(1/1);
            //문자+숫자=문자 출력 
             System.out.println("1+1="+(1+1));
             System.out.println("1-1="+(1-1));
             System.out.println("1*1="+(1*1));
             System.out.println("1/1="+(1/1));
             
            //입력 
             Scanner sc = new Scanner(System.in);
             System.out.print("정수 값1 입력 : ");
             int num1 = sc.nextInt();
            //어떤 데이터타입(정수, 문자, 실수 등)의 변수인지 미리 정해놔야 함
             System.out.print("정수 값2 입력 : ");
             int num2 = sc.nextInt();
             System.out.println("사용자가 입력한 정수 값: " + num1);
             System.out.println("사용자가 입력한 정수 값: " + num2);
             System.out.println("정수 값1 + 정수 값2 =  "+ (num1+num2));
             
             
	}

}

//1. Java는 대소문자를 정확하게 구분해줘야함
//2. 문자를 입력할 때 ''는 안되고 ""로 입력
//3. 하나의 코드 문장이 끝날 때 꼭 뒤에; (세미콜론) 붙여줘야 함
//4. Java에서 ctr1+space가 자동 완성
//5. 문자와 숫자를 혼합해서 출력할 때 + 기호를 사용
//6. 숫자를 문자로 바꿀 때 문자와 혼합해서 사용
// python : Runtime Eroor런타임오류(실행을 해야지만 에러를 알 수 있음)
// java : Statement Error(코드를 입력할 때 바로 에러를 출력)
// Java파일의 실행과정
//.Java(개발자가 개발하는 파일) -> .class(기계가 읽을 수 있는 파일)