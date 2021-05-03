package pestival3;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][]arr = new int[7][7];
     int cnt = 1;
     
    for (int i = 0; i < arr.length; i++) {
		if( i <= 3) {
			for (int j = 3-i; j <= 3+i; j++) {
				arr[i][j] = cnt++;
			}
		}else {
			for (int j = i-3; j <= 9-i; j++) {
				arr[i][j] = cnt++;
			}
		}
	}
    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j]+"\t");
		}System.out.println();
	}
	}

}
