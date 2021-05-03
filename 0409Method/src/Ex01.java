import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String data = "여러분 잘 쉬셨나요?";
		   //indexOf("문자열") -> 매개변수로 넣은 문자의 위치 리턴
//          System.out.println("==indexOf==");
//          System.out.println(data.indexOf("여"));
//          System.out.println(data.indexOf("잘", 5)); // 찾고자 하는 위치부터
//          
//          // 문자열.contains("문자") -> 매개변수로 넣은 문자열이 포함되어있는지 판별
//          System.out.println("==contains==");
//          System.out.println(data.contains("?"));
//          Scanner sc = new Scanner(System.in);
//          String phone = "010-2407-1065";
//          
//          System.out.print("검색할 문자 입력: ");
//          String num = sc.next();
//          if(phone.contains(num)) {
//        	  System.out.println(num+"은 문자열에 포함되어있습니다.");
//          }else {
//        	  System.out.println(num+"은 문자열에 포함되어 있지 않습니다.");
//          }
//			
		// 문자열 . substring(start인덱스, end인덱스)->매개변수로 넣은 위치부터 문자열을 잘라서 리턴
		System.out.println(data.substring(data.length()/2,data.length()-1));
		System.out.println(data.substring(0));
		//문자열.charAt(인덱스)-> 문자열에서 매개변수로 넣은 인덱스번째 문자를 반환
		System.out.println("==charAt==");
		char s = data.charAt(0); // 캐릭터 타입은 문자 하나만
		System.out.println(s);
		System.out.println(data.charAt(data.length()-1));
		//문자열.split(문자열) -> 매개변수로 넣은 문자열을 기준으로 잘라 배열로 반환
		String phone2 = "010-2407-1465";
		String[] cut = phone2.split("");
		System.out.println(Arrays.toString(cut));
	}

}
