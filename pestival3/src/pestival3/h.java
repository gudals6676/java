package pestival3;

public class h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1 = 50;
        int num2 = 15;
        char op ='*';
        System.out.println(cal(num1,num2,op));
	}
    public static int cal(int num1, int num2, char op) {
    	int result = 0;
    	if(op == '+') {
    		result = num1 +num2;
    	}else if(op == '-') {
    		result = num1 - num2;
    	}else if(op == '*') {
    		result = num1 * num2;
    	}else {
    		result = num1 / num2;
    	}
    	return result;
    }
}
