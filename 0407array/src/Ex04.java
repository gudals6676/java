
public class Ex04 {

	public static void main(String[] args) {
		// foreach 문
        int[]arr= {4, 3, 2, 1, 9, 8, 6, 1, 0, 15};
        int num = 0;
        System.out.print("arr에 들어있는 홀수는");
        for (int i : arr) {
            if(i % 2== 1) {
            	System.out.print(i+" ");
            	num++;
            }
		}System.out.print("이며, 총"+num+"개 입니다.");
	}

}
