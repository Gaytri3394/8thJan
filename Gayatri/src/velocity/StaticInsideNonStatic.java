package velocity;

public class StaticInsideNonStatic {
	
	
	public static void D1() {
		System.out.println("om");
	}
	public void D2() {
		D1();
	}
	public static void main(String[]args) {
		StaticInsideNonStatic objD = new StaticInsideNonStatic();
		objD.D2();
	}

}
