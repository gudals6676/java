package 상속_생성자;

public class C extends B{
	public C() {
		System.out.println("C실행!");
	}
	
	public C(int x) {
		super(x);     //슈퍼클래스 생성자를 명시적으로 선택
		System.out.println("C(x)실행!");
	}
	public C(int x ,int y) {
		super(x,y);
		System.out.println("C(x,y)실행!");
	}
}
