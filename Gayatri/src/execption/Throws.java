package execption;

public class Throws {
	
	public static void main(String[]args) throws InterruptedException{
		
		for(int a=0; a<=10; a++ ) {
		if(a<5) {
			System.out.println("less then five :" +a);
		}
		Thread.sleep(5000);
		 
		if (a>5) {
			System.out.println("Greater then five :" +a);
		}
	}
  }
}
