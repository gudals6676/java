package ���_�峭��;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine {
   
	ArrayList<Toy> toylist = new ArrayList<Toy>();
	Random r = new Random();
	//�޼��� ����
	//1 . addToy():�峭�� ��ü�� toyList �߰�
	public void addToy(Toy toy) {
		toylist.add(toy);
	}
	//2 . getToy():�������� ���� �峭���� ����
	public Toy getToy() {
		//toyList���� �������� �峭���ϳ� �̾Ƽ� ����
		int random = r.nextInt(toylist.size());
		return toylist.get(random);
		
	}
	
	
}
