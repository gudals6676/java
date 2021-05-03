package Wildanimal;

public class WildMain {

	public static void main(String[] args) {
		WildAnimal w = new WildAnimal();
		Lion l = new Lion();
		// 업캐스팅 : 서브클랙스가 슈퍼클래스 타입으로 자동 타입변환하는것
		// 객체(lion)내 변수, 메소드 에 접근할 수 없고 상위클랙스(WildAnimal)의 변수 메소드에는 접근가능
		// ++ 메소드 오버라이딩 된경우에는 현재객체 메소드에 접근 가능
		WildAnimal l2 = new Lion();
		l2.hunt();
		// 필드 오버라이딩은 없음(부모꺼 출력)
		System.out.println(l2.name);

		// 다운 캐스팅: 업캐스팅 된 것을 강제(명시적) 형변환으로 원래 타입으로 다시 되돌리는것
		Lion l3 = (Lion)l2;
        System.out.println(l3.name);
		Eagle e = new Eagle();
		WildAnimal e2 = e;
		
		
		w.hunt();
		l.hunt();
		e.hunt();
		
		//업캐스팅을 한 경우 래퍼런스변수가 가리키는 객체의 진짜 클래스 타입이 구분 어려움
		//instanceof : 변수가 가리키는 객체가 어떤 클래스 타입인지 구분->(true/false)
		System.out.println(l2 instanceof WildAnimal);
		System.out.println(l2 instanceof Lion);
		System.out.println(e instanceof Eagle);
		System.out.println(e2 instanceof Lion);
	}

}
//instanceof연산자
//-업캐스팅을 한 경우, 래퍼런스 변수가 가리키는 실체 객체가 어떤 클래스의 타입인지 구분하기 위한 연산자