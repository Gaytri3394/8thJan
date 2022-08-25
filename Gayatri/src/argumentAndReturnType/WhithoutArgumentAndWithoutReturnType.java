package argumentAndReturnType;

public class WhithoutArgumentAndWithoutReturnType {
	
	public static void s1() {
		System.out.println("Whithout Argument And Without Return Type "+" Static");
	}
	public void s2() {
		System.out.println("Whithout Argument And Without Return Type "+" Non Static");
	}
	public static void main(String[]args) {
		s1();
		WhithoutArgumentAndWithoutReturnType ob = new WhithoutArgumentAndWithoutReturnType();
		ob.s2();
		
	}
}
