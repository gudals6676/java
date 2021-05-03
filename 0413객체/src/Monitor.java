
public class Monitor {
 //Monitor 객체를 생성할 수 있는 설계도 작성
	
	//1. 속성(필드)
	boolean onoff; //전원 on/off 여부
	int light;     //화면 밝기
	//2. 기능(메서드)
	public static void lightup() {
		System.out.println("밝기 올리기");
	}
	
	public void on() {
		System.out.println("전원 켜기");
	}
	
	
}
