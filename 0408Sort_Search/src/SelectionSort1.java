import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[]arr = {25,35,62,27,2,19};
		for (int j = 0; j < arr.length-1; j++) {
			int min = j;
			for (int i = j+1; i < arr.length; i++) {
				if(arr[min]>arr[i]) {
					min = i ;
				}
			}
			int temp = arr[j];
			arr[j]=arr[min];
			arr[min]=temp;
		}System.out.println(Arrays.toString(arr));
		
	}

}
