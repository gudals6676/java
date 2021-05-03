import java.util.Random;

public class Ex03a {

	public static void main(String[] args) {
		int[]array = createRandomNumber(3);
		arrayToString(array);

	}
	 public static void arrayToString(int[] arr) {
	    	for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");       // 출력포문
			}
	    	
	    }
	 public static int[] createRandomNumber(int num) {
		 //1.배열 새성
		  int[]array = new int[num];
		  //2. 랜덤 객체(도구) 생성
		  Random rd = new Random();
		  do {
			  for (int i = 0; i < array.length;i++) {
				  array[i] = rd.nextInt(5)+1;
			}
		} while (isDuplicate(array)); // 중복이 있을떄는 트루 반환
		  
		
		  return array;
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
