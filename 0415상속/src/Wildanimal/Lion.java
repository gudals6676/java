package Wildanimal;

public class Lion extends WildAnimal {
	String name = "����"; // �ʵ� �������̵��� ����
	// ���(�޼���) ����

	// (�޼���)�������̵�: �θ�Ŭ������ �ִ� ����� �ڽ�Ŭ�������� ������
	// �޼����̸� ����, �Ű����� Ÿ��, ����, ��ȯŸ�� ��� ����
	// ++ static, private, final �� ����� �޼���� �������̵� �� �� ����
    @Override //annotation(�ּ�): �����Ϸ����� �������̵��� ��Ȯ���� Ȯ���ϵ��� ����
	public void hunt() {
		System.out.println("�ܵ����!");
	}
}
