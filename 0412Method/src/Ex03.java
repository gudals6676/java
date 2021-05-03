import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] array = createRandomNumber(3);
       arrayToString(array);
	}
    private static void arrayToString(int[] array) {
		
		
	}
	public static int[] createRandomNumber(int array) {
    	Random rd = new Random();
    	int[]arr = new int[3]; // 3개 만들겠다
    	for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(5)+1;
			for (int j = 1; j <= i; j++) {
				if(arr[i]==arr[j-1]) {
					i--;
					break;
				}
			}
		}
    	for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
    }
    public static boolean isDuplicate(int[] array) {//각 인덱스마다 중복 비교
        for (int i = 0; i < array.length-1; i++) {//0 부터 3 까지
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {// 하나라도 중복 되면 true
					return true;
				}
			}
		}
        return false;      // 반복문끝나는 시점에 false
			
		
    }
}
