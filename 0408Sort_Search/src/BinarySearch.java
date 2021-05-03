
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[]arr = {1,7,16,25,30,33,41,66,78,90};
		int search = 78;
		int lowIndex = 0;
		int highIndex = arr.length-1;
		while(true) {
		int middleIndex = (lowIndex+highIndex)/2;
		if(search == arr[middleIndex]) {
			System.out.println(search+"는 "+middleIndex+"번째 숫자 입니다.");
			break;
		}else if(search > arr[middleIndex]) {
			lowIndex = middleIndex+1;
		}else if(search < arr[middleIndex]) {
			highIndex = middleIndex-1;
		}
	}
	}
}
