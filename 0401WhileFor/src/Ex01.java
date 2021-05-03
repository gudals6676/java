import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		do {
//			실행문장!
//		} while(조건식);
//		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 :");
        int now = sc.nextInt();
        System.out.print("목표몸무게 :");
		int goal = sc.nextInt();
		int i =1;
		
		do {

		System.out.print(i+"주차 감량 몸무게 : ");
		int num = sc.nextInt();
        now-=num;  // now = now-num
		i ++;  //i+=1 
		
		}while (now>goal);
		System.out.println(now+"kg 달성!! 축하합니다!");
		
		
		
		
		
		
		
		
		
		
		
	}

}
