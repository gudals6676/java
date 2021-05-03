
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 데이터를 담을 수 잇는 레퍼런스
        int[] array ;
        // 정수형 데이터 5개를 담을 수 있도록 배열을 생성해서 array에 대입
        array = new int[5];    // -? 0으로 초기화
        array[0] = 15;
        array[1] = 10;
        array[2] = 2;
        array[3] = 7;
        array[4] = 18;
        
        // 배열 array에 들어있는 모든 데이터를 출력
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
        
        //1번째 값과 4번쨰 값 더해서 출력하기
        System.out.println(array[1]+array[4]);
        //배열 array 에 들어있는 모든 데이터 더해서 결과 출력
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
			sum += array[i];			
		}
        System.out.println(sum);
        
        //평균값 출력
        System.out.println(sum/array.length);
	}

}
