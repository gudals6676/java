package pestival2;

import java.util.Random;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[8];
		Random rd = new Random();
	    System.out.print("�迭�� �ִ� ��� ��: ");
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
	    int max = arr[0];
	    int min = arr[0];
	    for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
	    System.out.println();
	    System.out.println("���� ū ��: "+max);
	    System.out.println("���� ���� ��: "+min);
    }
	    
}
