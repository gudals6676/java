package pestival3;

public class i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int input = 8;
         for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
    public static int fibo(int i) {
    	if(i <= 1) {
    		return i;
    	}else {
    		return fibo(i-1) + fibo(i-2);
    	}
    }
}
