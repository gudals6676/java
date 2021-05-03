
public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("박형민");
		p1.setAge(20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = new Person("최성우", 21);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		Person p3 = new Person("헤으응", 19);
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		
		Person[] personArr = new Person[3]; //person 에 담겨있는값 배열에 옮기기.
		personArr[0] = new Person("박형민",20);  // = p1; 가능
		personArr[1] = new Person("최성우", 21); // = p2; 가능
		personArr[2] = new Person("헤으응", 19);
		System.out.println(personArr[0].getName());
		for (int i = 0; i < personArr.length; i++) {
			System.out.println(personArr[i].getName());
		}
//		p1.name = "박형민";
//		p1.age = 20;
//
//		Person p2 = new Person("최성우");
//      
		
		
	}
}
