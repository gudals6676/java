
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {1,3,4,6,2};
    int[] sb = strikeBallCounting(array1, array2);
    arrayToString(sb);
	}

	private static int[] strikeBallCounting(int[] array1, int[] array2) {
		int[] arr = new int[2];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					if(i == j) {
						arr[0]++;
					}else {
						arr[1]++;
					}
				}
			}
		}
		return arr;
			
	}

	private static void arrayToString(int[] sb) {
		for (int i = 0; i < sb.length; i++) {
			System.out.print(sb[i]+" ");
		}
		
	}

}
