package pestival1;

import java.util.Random;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]arr = new int[8];
      Random rd = new Random();
      
      System.out.print("�迭�� �ִ� ��簪 : ");
      for (int i = 0; i < arr.length; i++) {
		int num = rd.nextInt(100)+1;
		
		arr[i]=num;
		System.out.print(arr[i]+" ");
	}
      System.out.println();
      int max = arr[0];
      int min = arr[0];
	  for (int i = 0; i < arr.length; i++) {
		if(max < arr[i]) {
			max = arr[i];
		}
		if(min > arr[i]) {
			min = arr[i];
		}
	}
	  System.out.println("���� ū �� : "+max);
	  System.out.println("���� ���� �� : "+min);
	}

}
