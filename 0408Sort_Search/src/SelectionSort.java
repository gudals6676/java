import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// Selection sort 선택정렬
        int[]arr = {7,98,13,70,24};
        
        for (int k = 0; k < 4; k++) {
        	 int maxIndex = k;//가장 큰 수의 인덱스를 찾는 알고리즘
        	 
        	 //가장 큰 수의 인덱스를 찾는 알고리즘
             for (int i = k+1; i < arr.length; i++) {
     			if(arr[maxIndex]<arr[i]) {
     				maxIndex = i;
     			}
     		}
             //큰 수를 찾은 후 0번째부터 마지막 인덱스까지 치환
             int temp = arr[k];
             arr[k] = arr[maxIndex];
             arr[maxIndex] = temp;
             System.out.println(Arrays.toString(arr));
		}
        
//        int maxIndex = 0;
//        for (int i = 1; i < arr.length; i++) {
//			if(arr[maxIndex]<arr[i]) {
//				maxIndex = i;
//			}
//		}
//        int temp = arr[0];
//        arr[0] = arr[maxIndex];
//        arr[maxIndex] = temp;
//        
//        maxIndex = 1;
//        for (int i = 2; i < arr.length; i++) {
//			if(arr[maxIndex]<arr[i] {
//				maxIndex = i;
//			}
//		}
//        temp = arr[1];
//        arr[1] = arr[maxIndex];
//        arr[maxIndex] = temp;
        
       
	}

}
