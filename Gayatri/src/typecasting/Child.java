package typecasting;

public class Child extends Parent{

	public void M2() {
		System.out.println("M2 is Child Class");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.M1();
		obj.M2();
		
		Parent obj2 = (Parent)obj;
		obj2.M1(); 
	}
}
