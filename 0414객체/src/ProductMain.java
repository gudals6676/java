import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Product> Productarr = new ArrayList<Product>();
		
		
		
		int sum =0;
		while(true) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.print("물건이름 : ");
				String name = sc.next();
				System.out.print("단가: ");
				int money = sc.nextInt();
				System.out.print("수량 : ");
				int cnt = sc.nextInt();
				 
				Productarr.add(new Product(name, money, cnt));
			}else if(num == 2) {
				System.out.println("제품명\t단가\t수량");
				for (int i = 0; i < Productarr.size(); i++) {					
					System.out.println(Productarr.get(i).getName()+"\t"+Productarr.get(i).getUnitprice()+"\t"
							+Productarr.get(i).getAmount());
					sum += Productarr.get(i).getUnitprice()*Productarr.get(i).getAmount();
				}
				System.out.println("판매시 매출: "+ sum);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
			}