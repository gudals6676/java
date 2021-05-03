
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  int[][]arr = new int[3][2];
        
//		int[] pythonScore = new int [25];
//        
//		int[][]bigdataScore = new int[3][25];
//	    System.out.println(bigdataScore.length);
//	    System.out.println(bigdataScore[0].length);
//	 
		int[][] arr = new int[5][5];
		int cnt = 1;
	   for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < 5; j++) {
			arr[i][j] = cnt;
			cnt++;
		}
	
	}
	   for(int i=0;i< arr.length;i++) {
	         for(int j=0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j]+"\t");
	         }System.out.println();
	      }
				
	}

} 
