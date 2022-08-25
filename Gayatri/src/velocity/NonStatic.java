package velocity;

public class NonStatic {

	public void M3() {
		System.out.println("nida is a girl");
	}
	public static void main(String[]args) {
		NonStatic objM = new NonStatic();
		objM.M3();
	}
}
