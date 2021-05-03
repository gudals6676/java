import java.util.ArrayList;
import java.util.Scanner;

public class sd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2.
		ArrayList<String> musiclist = new ArrayList<String>();

		// 1. 노래 추가 삭제 조회 종료 메뉴가 보이고 종료를 누르면 종료가 되기.
		// 2. 1번을 선택했을 때 현재 재생목록이 나오고
		// 3. 노래를 어느 위치에 추가 시킬지 결정하기
		// 4.
		musiclist.add("NewFace!");
		musiclist.add("먹구름");
		musiclist.add("SIGNAL");

		while (true) {
			System.out.println("1]노래추가 2]노래삭제 3]노래조회 4]종료>> ");
			int menu = sc.nextInt();
			if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;

				// 2.
			} else if (menu == 1) {
				showmusicinfo(musiclist);
//						System.out.println("=====현재재생목록=====");
//				if (musiclist.size() == 0) {
//					System.out.println("재생목록이 없습니다.");
//				} else {
//					for (int i = 0; i < musiclist.size(); i++) {
//						System.out.println(musiclist.get(i));
//					}
//				} 
//				System.out.println("==================");

				// 3.
				System.out.println("1]마지막 위치에 추가 2]원하는 위치에 추가>> ");
				int loc = sc.nextInt();
				System.out.println("추가할 노래 입력>>");
				String temp = sc.next();
				if (loc == 2) {
					System.out.println("추가할 위치 입력>>");
					int in = sc.nextInt();
					musiclist.add(in - 1, temp); // 인덱스랑 조금있다 출력하는거 만들고 다시 수정해봅세
				} else {
					musiclist.add(temp);
				}
				System.out.println("추가가 완료되었습니다.");

			} else if (menu == 2) {
				showmusicinfo(musiclist);
				
				
				System.out.print("1]선택삭제 2]전체삭제>>");
				
				int removemenu = sc.nextInt();

				if (removemenu == 1) {
					System.out.print("삭제할 노래 선택>> ");
					int removeSong = sc.nextInt();
					musiclist.remove(removeSong);// 이래야 선택한 노래가 삭제
					System.out.println("노래가 삭제되었습니다.");
				} else {
					musiclist.clear();
					System.out.println("전체 리스트가 삭제되었습니다.");
				}

			}else if(menu == 3) {
				showmusicinfo(musiclist);
			}
		}
	}

	private static void showmusicinfo(ArrayList<String> musiclist) {
		System.out.println("=====현재재생목록=====");
		if (musiclist.size() == 0) {
			System.out.println("재생목록이 없습니다.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(musiclist.get(i));
			}
		} 
		System.out.println("==================");
	}

}
