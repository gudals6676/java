package 상속_장난감;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine {
   
	ArrayList<Toy> toylist = new ArrayList<Toy>();
	Random r = new Random();
	//메서드 정의
	//1 . addToy():장난감 객체를 toyList 추가
	public void addToy(Toy toy) {
		toylist.add(toy);
	}
	//2 . getToy():랜덤으로 뽑은 장난감을 리턴
	public Toy getToy() {
		//toyList에서 랜덤으로 장난감하나 뽑아서 리턴
		int random = r.nextInt(toylist.size());
		return toylist.get(random);
		
	}
	
	
}
