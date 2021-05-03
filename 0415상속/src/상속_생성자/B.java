package 惑加_积己磊;

public class B extends A{
	public B() {
		System.out.println("B角青!");
	}
	public B(int x) {
		System.out.println("B(x)角青!");
	}
	public B(int x ,int y) {
		super(x,y);
		System.out.println("B(x,y)角青!");
	}
}
