
public class Ex02 {

	public static void main(String[] args) {
		//래퍼런스 변수는 주소값을 복사(대입)
        int[] intArray1 = new int[5];
        int[] intArray2 = intArray1;
        
        intArray1[1] = 3;
        System.out.println("intArray1의 1번째 값 : "+ intArray1[1]);
        
        
        intArray2[0] = 15;
        System.out.println("intArray2의 0번째 값 : "+ intArray2[0]);
        System.out.println("intArray1의 0번째 값 : "+ intArray1[0]);
        //기본데이터 타입 변수는 값을 복사(대입)
        int num = 3 ;
        int temp = num;
        
        num =  7;
        System.out.println(temp);
        temp = 8;
        System.out.println(num);
        //배열 크기 확인  length
        System.out.println(intArray1.length);
        
	}

}
