package pestival1;

public class r10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] arr = new int[5][5];
       int cnt = 1;
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			arr[i][j] = cnt++;
			
		}
	}
       System.out.println("����");
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j]+"\t");
		}System.out.println();
	}
       System.out.println();
       System.out.println("90�� ȸ��");
       for (int i = arr.length-1; i >=  0; i--) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j][i]+"\t");
		}
		System.out.println();
	}
	}

}
