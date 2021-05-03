package pestival3;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = new char[5][5];

	      char mora = 'A';

	      for (int i = 0; i < arr.length; i += 1) {
	         if (i <= 2) {
	            for (int j = i; j <5-i; j += 1) {
	               arr[i][j] = mora++;
	              
	            }

	         } else {
	            for (int j = 4 - i; j <= i; j += 1) {
	               arr[i][j] = mora++;
	              
	            }
	         }
	      }

	      for (int i = 0; i < arr.length; i += 1) {
	         for (int j = 0; j < arr.length; j += 1) {
	            System.out.print(arr[i][j] + " " + "\t");
	         }
	         System.out.println();
	      }
	}

}
