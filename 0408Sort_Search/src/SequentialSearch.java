import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };				
		
		// 위에 숫자 다 출력해주는 거랑 아래 78 찾는거 ! 
		// 그리고 6번째 숫자라는건 i의 값이랑 똑같으니까 따로 변수에 안담아줘도 돼용
		// 스캐너 안써도 되고 그냥 for문으로 arr[i] 전체 출력 !하고
		// 78찾고 -> i번째 
		int search = 78;
		for (int i = 0; i < arr.length; i++) {			
			if (arr[i] == search) {
				System.out.println(search+"는 "+i+"번째 숫자 입니다.");
				break;
			}
		}
	}

}
