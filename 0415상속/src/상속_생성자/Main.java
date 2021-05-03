package 상속_생성자;

public class Main {

	public static void main(String[] args) {
		
		new C(1);
		
		//서브클래스 생성자가 먼저 호출이 되지만 슈퍼클래스의 생성자 먼저 실행이됨
        //슈퍼클래스 먼저 초기화 된후 이를 활용하는 서브클래스가 초기화 되어야 하기 때문
		
		//슈퍼클래스에 생성자가 여러개일때는 - >
		//사용자가 따로 지정해주지않으면 자동으로 기본생성자 호출
		
		new C(3,5);
		//A클래스에도 매개변수 2개(정수형)들어가는 생성자
		//B클래스에도 매개변수 2개
		//C클래스에도 매개변수 2개
		// -> A(x,y)실행
		// -> B(x,y)실행
		// -> C(x,y)실행
		
	}

}
