
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {2, 7, 5, 6, 15, 23, 78, 40, 20};
       
       //¦��  �����͸� ���
       int num = 0;
       System.out.print("array �� ����ִ� Ȧ���� ");
      for (int i = 0; i < arr.length; i++) {
		if(arr[i] % 2 ==1) {
			System.out.print(arr[i]+ " ");
			num++;
		}
	}
      System.out.print("�̸�, �� "+ num +"�� �Դϴ�.");
      
      
	}

}
