import java.util.Random;

public class Ex03a {

	public static void main(String[] args) {
		int[]array = createRandomNumber(3);
		arrayToString(array);

	}
	 public static void arrayToString(int[] arr) {
	    	for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");       // �������
			}
	    	
	    }
	 public static int[] createRandomNumber(int num) {
		 //1.�迭 ����
		  int[]array = new int[num];
		  //2. ���� ��ü(����) ����
		  Random rd = new Random();
		  do {
			  for (int i = 0; i < array.length;i++) {
				  array[i] = rd.nextInt(5)+1;
			}
		} while (isDuplicate(array)); // �ߺ��� �������� Ʈ�� ��ȯ
		  
		
		  return array;
	 }
	 public static boolean isDuplicate(int[] array) {//�� �ε������� �ߺ� ��
	        for (int i = 0; i < array.length-1; i++) {//0 ���� 3 ����
				for (int j = i+1; j < array.length; j++) {
					if(array[i]==array[j]) {// �ϳ��� �ߺ� �Ǹ� true
						return true;
					}
				}
			}
	        return false;      // �ݺ��������� ������ false
				
			
	    }
}
