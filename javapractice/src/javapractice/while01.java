package javapractice;

public class while01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int sum = 0;
		   int num = 1;
          while (true) {
        	  sum += num; //누적
        	if(sum > 1000) {
        		break;
        	}
        	num++;
          }
          System.out.printf("1부터 %d까지 총 합: %d", num, sum);
          
	}

}
