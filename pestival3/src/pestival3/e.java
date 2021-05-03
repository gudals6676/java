package pestival3;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1 = 10;
       int num2 = 3;
       System.out.println("결과 확인: "+ isDivide(num1,num2));
	}
    public static Boolean isDivide(int num1, int num2) {
    	if (num1 % num2 ==0) {
    		return true;
    	}else {
    		return false;
    	}
    }
}