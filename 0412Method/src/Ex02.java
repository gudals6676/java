
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[]array = {2, 7, 3, 5, 4};
	   boolean check = isDuplicate(array);
		System.out.println(check);
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
