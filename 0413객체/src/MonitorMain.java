import java.util.Random;

public class MonitorMain {

	public static void main(String[] args) {
	    
		Math.pow(2, 3);//staric o
		
		
		
		Monitor.lightup();  //static -> ��ü ���� ���ص� ȣ�� ����
//		Monitor.on();       //static x -> ��ü ������ �ؾ����� ȣ�� ����
		
		//Monitor ��ü ����
		Monitor m = new Monitor();
		
		m.on();
		m.lightup();
	}

}
