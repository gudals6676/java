import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// Selection sort ��������
        int[]arr = {7,98,13,70,24};
        
        for (int k = 0; k < 4; k++) {
        	 int maxIndex = k;//���� ū ���� �ε����� ã�� �˰���
        	 
        	 //���� ū ���� �ε����� ã�� �˰���
             for (int i = k+1; i < arr.length; i++) {
     			if(arr[maxIndex]<arr[i]) {
     				maxIndex = i;
     			}
     		}
             //ū ���� ã�� �� 0��°���� ������ �ε������� ġȯ
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
