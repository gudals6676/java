
public class Ex01 {

	public static void main(String[] args) {
		// 래퍼런스 변수 선언 -> 주소를 저장
		int[] intArray;  // int intArray[];

		// 배열 생성
       intArray = new int[5];
        System.out.println(intArray);
        
        System.out.println(intArray[0]);
        intArray[0] = 15; // 0번쨰에 15를 담기
        System.out.println(intArray[0]);
        //배열 선언과 동시에 초기화
        int[] array = {4, 3, 2, 1, 0};
        System.out.println(array[2]);
        

}
}