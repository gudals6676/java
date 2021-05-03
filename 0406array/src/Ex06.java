import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] scoreArr = new int[5];
       Scanner sc = new Scanner(System.in);
       
       System.out.print("1번쨰 입력>> ");
       scoreArr[0] = sc.nextInt();
       System.out.print("2번쨰 입력>> ");
       scoreArr[1] = sc.nextInt();
       System.out.print("3번쨰 입력>> ");
       scoreArr[2] = sc.nextInt();
       System.out.print("4번쨰 입력>> ");
       scoreArr[3] = sc.nextInt();
       System.out.print("5번쨰 입력>> ");
       scoreArr[4] = sc.nextInt();
       System.out.print("입력된 점수 : ");
       for (int i = 0; i < scoreArr.length; i++) {
		System.out.print(scoreArr[i]+" ");
	}
	}

}
