import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int now = 0, goal =0, num = 0, week = 0;
		 System.out.print("현재 몸무게: ");
		 now = sc.nextInt();
		 System.out.print("목표 몸무게: ");
		 goal = sc.nextInt();
		 
		 while(now > goal) {
			 week++;
			 System.out.print(week+"주차 감량 몸무게 : ");
			 num = sc.nextInt();
			 now -= week;
		 }
		    System.out.println(now+"kg 달성!! 축하합니다!");
		 
		 
		 
		 
		 
		 
		 
	}

}
