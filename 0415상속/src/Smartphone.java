
public class Smartphone extends Telephone{

	//기능(메서드) 정의
	//1. 인터넷 사용
	public void internet() {
		System.out.println("인터넷 사용");
	}
	//2. 터치 가능
	public void touch() {
		System.out.println("화면터치");
	}
	//3. 전화걸기
	public void call() {
		System.out.println("통화연결음.....");//오버라이딩
		System.out.println("전화걸기");
	}
	//4. 전화받기
	public void answerCall() {
		System.out.println("전화받기");
	}
}
