
public class Ex10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// @@@@@*
		// @@@@**
		// @@@***
		// @@****
		// @*****
		for (int i = 0; i < 5; i++) {
			// @ ��� �ݺ���
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			// * ��� �ݺ���
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			// ���๮�� �߰�
			System.out.println();
		}
	}

}
