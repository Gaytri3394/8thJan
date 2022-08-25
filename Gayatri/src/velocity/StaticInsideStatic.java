package velocity;

public class StaticInsideStatic {
	
	public static void A1() {
		System.out.println("Gayatri");		
	}
	
	public static void A2() {
	A1();
    }

    public  static void main(String[]args) {
    	A2();
    }
}
