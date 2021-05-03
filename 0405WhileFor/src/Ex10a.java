
public class Ex10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// @@@@@*
		// @@@@**
		// @@@***
		// @@****
		// @*****
		for (int i = 0; i < 5; i++) {
			// @ 출력 반복문
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			// * 출력 반복문
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			// 개행문자 추가
			System.out.println();
		}
	}

}
