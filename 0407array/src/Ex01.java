import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] input = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("==ä���ϱ�==");
        System.out.println("���� �Է��ϼ���");
        for (int i = 0; i < input.length; i++) {
			System.out.print((i+1)+"�� �� >> ");
			input[i]=sc.nextInt();
		}
        System.out.print("�Է��� ���� : ");
        for (int j = 0; j < input.length; j++) {
			System.out.print(input[j]+" ");
		}
	}

}
