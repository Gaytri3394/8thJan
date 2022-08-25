package breakAndContinue;

public class Continue {
	
	public static void main(String[]args) {
		for(int Q=0; Q<5; Q++) {
		if (Q==3)
		continue;
		System.out.println("value of Q " + Q);
	}
	System.out.println("loop ends");
}
}
