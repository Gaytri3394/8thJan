package patterns;

public class Trianglepttern {
	public static void main(String[]args) {
		for(int a=1; a<=4; a++) {
		for(int b =4; b>=a; b--) {
			System.out.print(" * ");
		}
		System.out.println("");
		}
	}

}
