package execption;

public class TryAndCatchWF {
	
	public static void main (String[]args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
			System.out.println(100/0);
		}
		catch( Exception c){
			System.out.println("If risky line");
		}
		System.out.println("4");
		System.out.println("5");
	 
		
	}

}
