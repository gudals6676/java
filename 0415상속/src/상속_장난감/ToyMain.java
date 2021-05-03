package 상속_장난감;

public class ToyMain {

	public static void main(String[] args) {
		
		RandomToyMachine rtm = new RandomToyMachine();
		
		//ball, train, gun 장난감 1개씩 추가(3)
		rtm.addToy(new Ball()); //Toy 타입으로 자동 형변환(업캐스팅)
		rtm.addToy(new Train());
		rtm.addToy(new Gun());
		 
		//2. 랜덤으로 장난감 하나 반환받아서 해당 장난감의 play메소드 호출
         Toy random_toy = rtm.getToy();
         random_toy.play();
	}

}
