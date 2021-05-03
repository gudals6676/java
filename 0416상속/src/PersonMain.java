import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Student 객체 생성
		Student s = new Student("김남진", 23);
		// Teacher 객체 생성
		Teacher t = new Teacher("김미희", 25, 5000);

		// 배열생성 (길이 2)
		Person[] arr = new Person[2];
		//Student 객체와 Teacher객체 자동형변환 ->Person타입이 됨
		arr[0] = s;
		arr[1] = t;

		for (Person p : arr) {
			System.out.println("이름: " + p.getName());
			System.out.println("직업: " + p.getJob());
			System.out.println("나이: " + p.getAge());
		}
		// Student study() 호출
		Student s2 = (Student) arr[0];// Person으로 업캐스팅된 스튜던트를 다운캐스팅(강제형변환)
		s2.study();
		Teacher t2 = (Teacher) arr[1];
		System.out.println();
		System.out.println(t2.getPay());		
		t2.teach();
	}

}
