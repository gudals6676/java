import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Çà °³¼ö : ");
		int hang = sc.nextInt();
		
		for (int i = 0; i < hang ; i++) {
			for (int j = 0; j <=i; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}

	}

}
