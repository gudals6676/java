import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Product> Productarr = new ArrayList<Product>();
		
		
		
		int sum =0;
		while(true) {
			System.out.print("[1]���� �߰� [2]���� �Ǹŷ� ��ȸ [3]���� >> ");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.print("�����̸� : ");
				String name = sc.next();
				System.out.print("�ܰ�: ");
				int money = sc.nextInt();
				System.out.print("���� : ");
				int cnt = sc.nextInt();
				 
				Productarr.add(new Product(name, money, cnt));
			}else if(num == 2) {
				System.out.println("��ǰ��\t�ܰ�\t����");
				for (int i = 0; i < Productarr.size(); i++) {					
					System.out.println(Productarr.get(i).getName()+"\t"+Productarr.get(i).getUnitprice()+"\t"
							+Productarr.get(i).getAmount());
					sum += Productarr.get(i).getUnitprice()*Productarr.get(i).getAmount();
				}
				System.out.println("�ǸŽ� ����: "+ sum);
			}else {
				System.out.println("���α׷� ����");
				break;
			}
			
		}
	}
			}