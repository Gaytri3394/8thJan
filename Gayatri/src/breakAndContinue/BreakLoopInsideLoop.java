package breakAndContinue;

public class BreakLoopInsideLoop {
	public static void main(String[]args) {
		 for(int a=0; a<=0; a++) {
			
			for(int b=0; b<=2; b++) {
				if(b==3)
					break;
			System.out.println("value of b:" +b);
			}
			
			System.out.println("end");
		}
	}

}
