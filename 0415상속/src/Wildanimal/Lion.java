package Wildanimal;

public class Lion extends WildAnimal {
	String name = "사자"; // 필드 오버라이딩은 없음
	// 기능(메서드) 정의

	// (메서드)오버라이딩: 부모클래스에 있는 기능을 자식클래스에서 재정의
	// 메서드이름 동일, 매개변수 타입, 개수, 반환타입 모두 동일
	// ++ static, private, final 로 선언된 메서드는 오버라이딩 할 수 없음
    @Override //annotation(주석): 컴파일러에게 오버라이딩이 정확한지 확인하도록 지시
	public void hunt() {
		System.out.println("단독사냥!");
	}
}
