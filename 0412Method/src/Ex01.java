
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,3,4,8,7,9,10};
		arrayToString(array);
	}
    public static void arrayToString(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");       // 출력포문
		}
    	
    }
    // for(int num : arr){
//    System.out.print(num+" ");
//}
    
}
