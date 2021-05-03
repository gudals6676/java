import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[]arr= {1, 4, 3, 2, 1};
         Scanner sc = new Scanner(System.in);
         System.out.println("==채점하기==");
         System.out.println("답을 입력하세요");
         int[] arr1 = new int[5];
         int score = 0;
         for (int i = 0; i < arr1.length; i++) {
			System.out.print(i+1+"번답 >> ");
			arr1[i]=sc.nextInt();			   
		}
         System.out.println("정답확인");
         for (int i = 0; i < arr1.length; i++) {
			if(arr[i] == arr1[i]) {
				System.out.print("O"+" ");
				score += 20;
			}else {
				System.out.print("X"+" ");
			}
		}
         System.out.print("총점 :"+score);
         }
        
	}


