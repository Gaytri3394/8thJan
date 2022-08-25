package velocity;

public class NonStaticInsideNonStatic {
	
	public void C1() {
		System.out.println("Krishika");
	}
	
	public void C2() {
		C1();
	}
	public static void main(String[]args) {
		NonStaticInsideNonStatic objC = new NonStaticInsideNonStatic();
		objC.C2();
	}
	
}
