package constructorInheritance;

public class Child3 extends Child2 {
	
	public Child3(int d) {
		super('a');
		System.out.println("child 3");
	}
	
	public static void main(String[]args) {
		new Child3(60);
	}

}
