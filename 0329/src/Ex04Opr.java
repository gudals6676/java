
public class Ex04Opr {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;//4byte
		
		float num3 = 10.0f;
		float num4 = 7.0f;//4byte
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
        //*�ڵ�����ȯ : ������Ÿ���� ũ�Ⱑ ���� ������ ũ�Ⱑ ū ���� ������Ÿ������ ��ȯ
		
		System.out.println((float)num1/(float)num2);
		//��������ȯ : ������Ÿ���� ������ ����
		
		
		
		
		String a = 10 + 7 + ""; 
		String b = 8 + ""+ 2;
		String c = "" + 5 + 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
			
		
		
	}

}