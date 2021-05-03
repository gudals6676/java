import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("제시어 >> ");
		String num = sc.next();
		
		
     while(true) {   	 
    	 System.out.print("입력 단어를 입력해 주세요>> ");
    	 String num2 = sc.next(); 
    	 
    	 if(!num.substring(num.length()-1).equals(num2.substring(0,1)) ) { 
    		 
    		 System.out.println("틀렸습니다.");
    		 System.out.print("게속하시겠습니까? (Y/N) >> ");
    		 String opr = sc.next();
    		 if (opr.equals("Y")||opr.equals("y")) {
    			 System.out.print("제시어 >> ");
    			 num = sc.next();
    		     continue;
    		 }else {
    			 System.out.println("게임이 종료되었습니다.");
    			 break;
    		 }
    	  
    	 } 
    		 
    	 
    	 num = num2;
     }
     
	}

}
