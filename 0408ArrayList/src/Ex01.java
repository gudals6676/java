import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> list = new ArrayList<String>();
      //�߰�
      list.add("Hello");
      list.add("Hi");
      list.add("Java");
      //������ ��������
      System.out.println(list.get(0));
      //�߰��� ������ ����
      list.add(1, "python");
      
      System.out.println(list.get(2));
      //������ ����
      System.out.println(list.size());
      //������ ���� 
      list.remove(0);
      System.out.println(list.get(0));
      //����� ����
      list.clear();
      System.out.println(list.size());
	}

}
