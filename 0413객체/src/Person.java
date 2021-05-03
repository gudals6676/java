
public class Person {//Value Object Class
  //생성자의 특징
  //- 생성자는 메소드이다, 리턴 타입을 지정x,클래스 이름과 동일,하나 이상 선언
	private String name;
	private int age;
	                        
	
	public Person(String name, int age) {		
		this.name = name;
		this.age = age;
	}
	public Person() {
		// 가장 먼저 객체 생성시 실행되어야 하는 기능을 작성
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
