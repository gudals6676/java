
public class Ex04 {

	public static void main(String[] args) {
		// foreach ��
        int[]arr= {4, 3, 2, 1, 9, 8, 6, 1, 0, 15};
        int num = 0;
        System.out.print("arr�� ����ִ� Ȧ����");
        for (int i : arr) {
            if(i % 2== 1) {
            	System.out.print(i+" ");
            	num++;
            }
		}System.out.print("�̸�, ��"+num+"�� �Դϴ�.");
	}

}
