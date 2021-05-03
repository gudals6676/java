
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[]array = {2, 7, 3, 5, 4};
	   boolean check = isDuplicate(array);
		System.out.println(check);
	}
    public static boolean isDuplicate(int[] array) {//각 인덱스마다 중복 비교
        for (int i = 0; i < array.length-1; i++) {//0 부터 3 까지
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {// 하나라도 중복 되면 true
					return true;
				}
			}
		}
        return false;      // 반복문끝나는 시점에 false
			
		
    }
}
