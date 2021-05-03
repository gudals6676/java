import java.util.Random;
import java.util.Scanner;

public class Ex03plusgame {

	public static void main(String[] args) {
		// 랜덤 객체 생성
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        // 두 수를 합친 값을 저장할 변수를 선언.
       
        // 내가 입력할 정답 데이터를 저장할 변수 선언.
       
        // while문에서 조건식으로 사용할(y/n) 변수 선언.
        String opr ;
        int num1 = 0, num2 = 0, num3 = 0;
        // 반복문에 들어가지 전에 랜덤한 값 2개를 한 번 입력시켜 놓는다.
        num1 = r.nextInt( 10 )+1;
        num2 = r.nextInt( 10 )+1;        
        System.out.println( "==Plus Game==" );
        
        do {                    
           // result값을 맞추기 위해 answer변수에 생각한 정답 입력
          
          
           System.out.print( num1 + "+" + num2 + "=");
           num3 = sc.nextInt();
           // 만약 정답이 맞다면
           if( num3==(num1+num2) ) {
              // Success출력 후 랜덤숫자를 바꾸기
              System.out.println( "Success" );
              num1 = r.nextInt( 10 )+1;
              num2 = r.nextInt( 10 )+1;
              // 그렇지 않으면 Fail 출력
           } else {
              System.out.println( "Fail" );
           }
           
           // While문을 계속 반복할건지 선택하기.
           System.out.print( "계속 하시겠습니까(y/n) >> " );
           opr = sc.next();
           
           // 대소문자 구분 없이 y를 입력받으면 while문 재실행
        } while (opr.equals("y") );
        
        System.out.println( "Plus Game 종료" );


	}

}
