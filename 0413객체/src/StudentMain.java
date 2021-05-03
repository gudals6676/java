
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Student student = new Student();
		student.name = "È«±æµ¿";
		student.number = "20150675";
		student.age = 22;
		student.scoreJava = 50;
		student.scoreWeb = 89;
		student.scoreAndroid = 77;
		
		Student student2 = new Student();
		student2.name = "±è¿µÈñ";
		student2.number = "20090541";
		student2.age = 29;
		student2.scoreJava = 90;
		student2.scoreWeb = 25;
		student2.scoreAndroid = 30;
		
		student.show();
		System.out.println("============================");
		student2.show();
		//Model
		//View
		//Controller
	}

}
