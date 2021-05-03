import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// Bubble sort 버블정렬
		int[] arr = { 5, 4, 3, 2, 1 };
		// 1step
//         System.out.println(Arrays.toString(arr));

		for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length-1-j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
