package breakAndContinue;

public class Break {
	
	public static void main(String[]args) {
		for(int x=0; x<=10;  x++) {
			System.out.println("x value :" +x);
			if (x==5)
			break;
		}
	System.out.println("loop breaks");
	}

}
