
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {2, 7, 0, 3, 8, 9, 15, 77, 4, 27};
      
      //arr�� ����մ� �� �� ���� ū �� ã��
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
		if(max<arr[i]) {
			max = arr[i];
		}
	}
      System.out.println(max);
	}

}
