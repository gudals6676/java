package pestival2;

import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      while(true) {
    	  System.out.print("A �Է�>> ");
    	  int num1 = sc.nextInt();
    	  System.out.print("B �Է�>> ");
    	  int num2 = sc.nextInt();
    	  
    	  if(num1 == 0 && num2 ==0) {
    		 break;
    	  }else {
    		  System.out.println("���>> "+(num1 - num2));
    	  }
      }
	}

}
