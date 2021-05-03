import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> list = new ArrayList<String>();
      //추가
      list.add("Hello");
      list.add("Hi");
      list.add("Java");
      //데이터 가져오기
      System.out.println(list.get(0));
      //중간에 데이터 삽입
      list.add(1, "python");
      
      System.out.println(list.get(2));
      //데이터 개수
      System.out.println(list.size());
      //데이터 삭제 
      list.remove(0);
      System.out.println(list.get(0));
      //모든요소 삭제
      list.clear();
      System.out.println(list.size());
	}

}
