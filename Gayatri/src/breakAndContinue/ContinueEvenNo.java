package breakAndContinue;

public class ContinueEvenNo {
	public static void main(String[]args) {
		for(int a=0; a<=100; a++) {
			if(a%2==1)
			continue;
			System.out.println(" " +a);
		}
	}
}
