import java.util.Random;

public class MonitorMain {

	public static void main(String[] args) {
	    
		Math.pow(2, 3);//staric o
		
		
		
		Monitor.lightup();  //static -> 객체 생성 안해도 호출 가능
//		Monitor.on();       //static x -> 객체 생성을 해야지만 호출 가능
		
		//Monitor 객체 생성
		Monitor m = new Monitor();
		
		m.on();
		m.lightup();
	}

}
