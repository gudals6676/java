import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] input = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("==채점하기==");
        System.out.println("답을 입력하세요");
        for (int i = 0; i < input.length; i++) {
			System.out.print((i+1)+"번 답 >> ");
			input[i]=sc.nextInt();
		}
        System.out.print("입력한 답은 : ");
        for (int j = 0; j < input.length; j++) {
			System.out.print(input[j]+" ");
		}
	}

}
