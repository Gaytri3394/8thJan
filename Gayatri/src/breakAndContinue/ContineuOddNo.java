package breakAndContinue;

public class ContineuOddNo {
	public static void main(String[]args) {
		
		for(int B=0; B<=100; B++) {
			if(B%2==0)
				continue;
			System.out.println(" " +B);
		}
	}

}
