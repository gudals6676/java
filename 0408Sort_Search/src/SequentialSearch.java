import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };				
		
		// ���� ���� �� ������ִ� �Ŷ� �Ʒ� 78 ã�°� ! 
		// �׸��� 6��° ���ڶ�°� i�� ���̶� �Ȱ����ϱ� ���� ������ �ȴ���൵ �ſ�
		// ��ĳ�� �Ƚᵵ �ǰ� �׳� for������ arr[i] ��ü ��� !�ϰ�
		// 78ã�� -> i��° 
		int search = 78;
		for (int i = 0; i < arr.length; i++) {			
			if (arr[i] == search) {
				System.out.println(search+"�� "+i+"��° ���� �Դϴ�.");
				break;
			}
		}
	}

}
