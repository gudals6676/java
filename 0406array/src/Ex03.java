
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �����͸� ���� �� �մ� ���۷���
        int[] array ;
        // ������ ������ 5���� ���� �� �ֵ��� �迭�� �����ؼ� array�� ����
        array = new int[5];    // -? 0���� �ʱ�ȭ
        array[0] = 15;
        array[1] = 10;
        array[2] = 2;
        array[3] = 7;
        array[4] = 18;
        
        // �迭 array�� ����ִ� ��� �����͸� ���
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
        
        //1��° ���� 4���� �� ���ؼ� ����ϱ�
        System.out.println(array[1]+array[4]);
        //�迭 array �� ����ִ� ��� ������ ���ؼ� ��� ���
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
			sum += array[i];			
		}
        System.out.println(sum);
        
        //��հ� ���
        System.out.println(sum/array.length);
	}

}
