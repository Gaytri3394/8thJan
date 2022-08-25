package argumentAndReturnType;

public class WhithArgumentAndWithReturnType {
	
	public static boolean s1(int a , int b) {
		int c = a+b;
		
		if (c==20)
		return true;
		return false;
	}
		
	public boolean s2(boolean d) {
			return true;
				
	}
	public static void main(String[]args) {
		WhithArgumentAndWithReturnType ob = new WhithArgumentAndWithReturnType();
		System.out.println(s1(10,10));
		System.out.println(s1(13,10));
		System.out.println(ob.s2(false));
		
		
	}
}