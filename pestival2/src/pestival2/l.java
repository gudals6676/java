package pestival2;

import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int[]arr = new int[5];
      
     for (int i = 0; i < arr.length; i++) {
		System.out.print((i+1)+"번째 수 입력: ");
		arr[i] = sc.nextInt();
		
	}
     
     for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1-i; j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
     System.out.println("정렬 후");
     for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	}

}
