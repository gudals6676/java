
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {2, 7, 0, 3, 8, 9, 15, 77, 4, 27};
      
      //arr에 들어잇는 값 중 가장 큰 값 찾기
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
		if(max<arr[i]) {
			max = arr[i];
		}
	}
      System.out.println(max);
	}

}
