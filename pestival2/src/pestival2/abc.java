package pestival2;

import java.awt.Frame;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"��° �� �Է�: ");
			arr[i] = sc.nextInt();
		}
		int min = 0;
		for (int i = 0; i < arr.length-1; i++) {
			min = i;
			for (int j = i+ 1; j < arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println("���� ��");
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}