
public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,7,16,25,30,33,41,66,78,90};
		int low = 0;
		int high = arr.length-1;
		int search = 7;
		
		while (true) {
			int mid = (low+high)/2;
			if(search == arr[mid]) {
				System.out.print(search+"�� "+mid+"��° ���� �Դϴ�.");
				break;
			}else if(search > arr[mid]) {
				low = mid+1;
			}else if(search < arr[mid]) {
				high = mid-1;
			}
		}
	}

}
