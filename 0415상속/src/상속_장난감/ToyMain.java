package ���_�峭��;

public class ToyMain {

	public static void main(String[] args) {
		
		RandomToyMachine rtm = new RandomToyMachine();
		
		//ball, train, gun �峭�� 1���� �߰�(3)
		rtm.addToy(new Ball()); //Toy Ÿ������ �ڵ� ����ȯ(��ĳ����)
		rtm.addToy(new Train());
		rtm.addToy(new Gun());
		 
		//2. �������� �峭�� �ϳ� ��ȯ�޾Ƽ� �ش� �峭���� play�޼ҵ� ȣ��
         Toy random_toy = rtm.getToy();
         random_toy.play();
	}

}
