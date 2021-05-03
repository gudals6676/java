package pestival1;

import java.util.Scanner;

public class r11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      while(true) {
    	  System.out.print("A 입력 >> ");
    	  int num1 = sc.nextInt();
    	  System.out.print("B 입력 >> ");
    	  int num2 = sc.nextInt();
    	  if(num1 == 0 && num2 == 0) {
    		 break;
    	  }else {
    		  System.out.println("결과 : "+ (num1 - num2));
    	  }
      }
	}

}
