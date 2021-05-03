import java.util.Scanner;

public class Ex03a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   int num1 = 26;
   int num2 = 24;
   int result = LargeNumbers(num1, num2);
   System.out.println("큰 수 확인: "+result);
		
		
	}
  public static int LargeNumbers(int num1, int num2) {
	  
	  if(num1>num2) {
		   return num1;
		  
	  }else {
		  return num2;
		  
	  }
	 
	 
			  
  }
}
