package javapractice;

public class while01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int sum = 0;
		   int num = 1;
          while (true) {
        	  sum += num; //����
        	if(sum > 1000) {
        		break;
        	}
        	num++;
          }
          System.out.printf("1���� %d���� �� ��: %d", num, sum);
          
	}

}
