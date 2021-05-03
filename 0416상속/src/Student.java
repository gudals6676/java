
public class Student extends Person {
    //속성정의
//	private String name;
//	private String job;
//	private int age;
//	    
	public Student(String name, int age ) {
		super(name, "학생", age); //슈퍼클래스의 기본생성자 호출
		
	}	
	public void study() {
    	System.out.print("공부하기!");
    }
}
