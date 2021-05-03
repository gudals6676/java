
public class Student {

	String name ;
	String number ;
	int age ;
	int scoreJava ;
	int scoreWeb ;
	int scoreAndroid ;
	
	
	public void show() {
		System.out.println(name+"님 안녕하세요.");
		System.out.println("["+number+"," + age+"살"+"]");
		System.out.println(name+"님의 Java 점수는 "+ scoreJava+"점 입니다.");
		System.out.println(name+"님의 Web 점수는 "+ scoreWeb+"점 입니다.");
		System.out.println(name+"님의 Android 점수는 "+ scoreAndroid+"점 입니다.");
	}
}
