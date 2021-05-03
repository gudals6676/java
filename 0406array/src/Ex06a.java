import java.util.Scanner;

public class Ex06a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] scoreArr = new int[5];
	       Scanner sc = new Scanner(System.in);
	       
	       for (int i = 0; i < scoreArr.length; i++) {
			System.out.print((i+1)+"번째 입력>> ");
			scoreArr[i]= sc.nextInt();			
		}
	       System.out.print("입력된 점수: ");     
		for (int j = 0; j < scoreArr.length; j++) {			
			System.out.print(scoreArr[j]+" ");			
		}
		

	}

}
