import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���þ� >> ");
		String num = sc.next();
		
		
     while(true) {   	 
    	 System.out.print("�Է� �ܾ �Է��� �ּ���>> ");
    	 String num2 = sc.next(); 
    	 
    	 if(!num.substring(num.length()-1).equals(num2.substring(0,1)) ) { 
    		 
    		 System.out.println("Ʋ�Ƚ��ϴ�.");
    		 System.out.print("�Լ��Ͻðڽ��ϱ�? (Y/N) >> ");
    		 String opr = sc.next();
    		 if (opr.equals("Y")||opr.equals("y")) {
    			 System.out.print("���þ� >> ");
    			 num = sc.next();
    		     continue;
    		 }else {
    			 System.out.println("������ ����Ǿ����ϴ�.");
    			 break;
    		 }
    	  
    	 } 
    		 
    	 
    	 num = num2;
     }
     
	}

}
