
public class Ex07 {

	public static void main(String[] args) {
		// 두 개의 정수를 입력받아 두 수의 합을 리턴하는 addInteger()메소드 만들기
		System.out.println(add(10, 20));
		// 두 개의 실수를 입력받아 두 수의 합을 리턴하는 addDouble()메소드 만들기
		System.out.println(add(10.3, 20.9));
		//한 개의 정수, 한 개의 실수를 입력받아 두 수의 합을 리턴하는 addIntAndDouble()메소드 만들기
		System.out.println(add(10.5, 20));
		//세 개의 정수를 입력받아 합을 출력하는 add3Integers()메소드 만들기
		System.out.println(add(10, 20, 30));
		
	}
	public static int add(int n1, int n2, int n3) {
	    return n1 + n2 + n3;                               //메소드 오버로딩 같은 메소드명으로 기능 추가
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	public static double add(double n1, double n2) {
		return n1 + n2;
	}
	public static double add(double n1, int n2) {
		return n1 + n2;
	}
	
}
