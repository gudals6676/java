package pestival3;

import java.util.Arrays;

public class n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] A = {1,3,5,7,9,11,13,15,17,19};
       int[] B = {2,4,6,8,10,12,14,16,18,20};
       
       int[] merge = mergeArray(A, B);

}

	public static int[] mergeArray(int[] A, int[] B) {
		int[] result = new int[A.length + B.length];
		//배열 A 값 추가
		for (int i = 0; i < A.length; i++) {
			result[i] = A[i];
		} 
		//배열 B 값 추가
		for (int i = A.length; i < result.length; i++) {
			result[i] = B[i - A.length];
		}
		//자동 정렬 해주기 -> sort()
		Arrays.sort(result);
		
		System.out.print("Merge : [");
		for (int i = 0; i < result.length; i++) {			
			if(i == result.length-1) {
				System.out.print(result[i]);
			}else {
				System.out.print(result[i]+", ");
			}
		}System.out.print("]");
		
		return result;
	}
}