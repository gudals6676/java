package Wildanimal;

public class WildMain {

	public static void main(String[] args) {
		WildAnimal w = new WildAnimal();
		Lion l = new Lion();
		// ��ĳ���� : ����Ŭ������ ����Ŭ���� Ÿ������ �ڵ� Ÿ�Ժ�ȯ�ϴ°�
		// ��ü(lion)�� ����, �޼ҵ� �� ������ �� ���� ����Ŭ����(WildAnimal)�� ���� �޼ҵ忡�� ���ٰ���
		// ++ �޼ҵ� �������̵� �Ȱ�쿡�� ���簴ü �޼ҵ忡 ���� ����
		WildAnimal l2 = new Lion();
		l2.hunt();
		// �ʵ� �������̵��� ����(�θ� ���)
		System.out.println(l2.name);

		// �ٿ� ĳ����: ��ĳ���� �� ���� ����(�����) ����ȯ���� ���� Ÿ������ �ٽ� �ǵ����°�
		Lion l3 = (Lion)l2;
        System.out.println(l3.name);
		Eagle e = new Eagle();
		WildAnimal e2 = e;
		
		
		w.hunt();
		l.hunt();
		e.hunt();
		
		//��ĳ������ �� ��� ���۷��������� ����Ű�� ��ü�� ��¥ Ŭ���� Ÿ���� ���� �����
		//instanceof : ������ ����Ű�� ��ü�� � Ŭ���� Ÿ������ ����->(true/false)
		System.out.println(l2 instanceof WildAnimal);
		System.out.println(l2 instanceof Lion);
		System.out.println(e instanceof Eagle);
		System.out.println(e2 instanceof Lion);
	}

}
//instanceof������
//-��ĳ������ �� ���, ���۷��� ������ ����Ű�� ��ü ��ü�� � Ŭ������ Ÿ������ �����ϱ� ���� ������