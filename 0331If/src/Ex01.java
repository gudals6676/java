import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("점수 입력 : ");
		int num = sc.nextInt();
        //if문 : 순차적으로 조건을 비교하면서 코드가 진행		
	    if (num >=90) {
        System.out.println("A학점입니다.");
	   }else if (num >=80) {
		System.out.println("B학점입니다.");
        
       }else if (num >=70) {
	    System.out.println("C학점입니다.");
       }else {   
	    System.out.println("D학점입니다."); 
}	    
	    
	
	    
	    
	    
	}	    
	    
}	    
	    