import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]array = {1,2,3,4,5};
       
       sort_method(array);
       System.out.println(Arrays.toString(array));
	}

	public static int[] sort_method(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}
    
}
