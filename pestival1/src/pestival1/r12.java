package pestival1;

import java.util.Scanner;

public class r12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
        for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length-1-j; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}System.out.println("정렬후");
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
