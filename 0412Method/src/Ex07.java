
public class Ex07 {

	public static void main(String[] args) {
		// �� ���� ������ �Է¹޾� �� ���� ���� �����ϴ� addInteger()�޼ҵ� �����
		System.out.println(add(10, 20));
		// �� ���� �Ǽ��� �Է¹޾� �� ���� ���� �����ϴ� addDouble()�޼ҵ� �����
		System.out.println(add(10.3, 20.9));
		//�� ���� ����, �� ���� �Ǽ��� �Է¹޾� �� ���� ���� �����ϴ� addIntAndDouble()�޼ҵ� �����
		System.out.println(add(10.5, 20));
		//�� ���� ������ �Է¹޾� ���� ����ϴ� add3Integers()�޼ҵ� �����
		System.out.println(add(10, 20, 30));
		
	}
	public static int add(int n1, int n2, int n3) {
	    return n1 + n2 + n3;                               //�޼ҵ� �����ε� ���� �޼ҵ������ ��� �߰�
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	public static double add(double n1, double n2) {
		return n1 + n2;
	}
	public static double add(double n1, int n2) {
		return n1 + n2;
	}
	
}
